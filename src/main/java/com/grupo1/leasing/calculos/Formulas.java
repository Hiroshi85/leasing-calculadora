/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.leasing.calculos;

import java.util.ArrayList;

/**
 *
 * @author hiros
 */
public class Formulas {
    private double tInteres;
    private double valorBien;
    private double cuota;
    private int n;
    private double tResidual;
    private double tDescuento;
    private boolean tieneOpcionCompra;
    private static final double RENTA = 0.295;
    
    public Formulas(double tInteres, double valorBien, double cuota, int n, double tResidual, double tDescuento, boolean tieneOpcionCompra){
        this.tInteres = tInteres;
        this.valorBien=valorBien;
        this.cuota = cuota;
        this.tResidual = tResidual;
        this.n = n;
        this.tDescuento = tDescuento;
        this.tieneOpcionCompra = tieneOpcionCompra;
    }

    public double gettInteres() {
        return tInteres;
    }

    public double getValorBien() {
        return valorBien;
    }

    public double gettResidual() {
        return tResidual;
    }

    public int getN() {
        return n;
    }

    public double gettDescuento() {
        return tDescuento;
    }

    public boolean isTieneOpcionCompra() {
        return tieneOpcionCompra;
    }

    public static double getRENTA() {
        return RENTA;
    }
    
    public double getCuota(){
        if(tieneOpcionCompra){
            double numerador =((valorBien*tInteres*Math.pow(1+tInteres, (double)n))-getValorDeCompra()*tInteres);
            double denominador = (Math.pow(1+tInteres,(double)n)-1);
            
            this.cuota = numerador/denominador;
        }
        
        return this.cuota;
    }
    
    public double getCuotaFinal(){
        return this.getCuota()+getValorDeCompra();
    }
    
    public double getFlujoNetoPeriodo(){
        return this.getCuota()-getEscudoFiscalXAño();
    }
    
    public double getValorDeCompra(){
        return this.valorBien*tResidual;
    }
    
    public double[][] getTablaInteres_Amort_Saldo(){
        double [][] tabla = new  double[n][3];
        double saldoAnterior = this.valorBien;
        for(int i=0; i<n;i++){
            double interes = tInteres*saldoAnterior;
            tabla[i][0] = interes;
            double cuotaT = getCuota();
            if(i==(n-1)) cuotaT = getCuotaFinal();
            double amortizacion = cuotaT-interes;
            tabla[i][1] = amortizacion;
            double saldo = saldoAnterior - amortizacion;
            tabla[i][2] = saldo;
            
            saldoAnterior = saldo;
        }
        
        return tabla;
    }
    
    public double getEscudoFiscalXAño(){
        return this.getCuota()*RENTA;
    }
    
    public double getValorPresente(){
        double cuotasAPresente;
        double cuotaFinalAPresente =0.0d;
        if(tieneOpcionCompra){
            cuotasAPresente = (getCuota()*(Math.pow(1+tDescuento, (double)(n-1))-1))/(Math.pow(1+tDescuento, (double)(n-1))*tDescuento);
            cuotaFinalAPresente = getCuotaFinal()*(1/Math.pow(1+tDescuento,(double)n));
        }else{
            cuotasAPresente = ((getCuota()-getEscudoFiscalXAño())*(Math.pow(1+tDescuento, (double)(n))-1))/(Math.pow(1+tDescuento, (double)(n))*tDescuento);
        }
        
        return cuotasAPresente + cuotaFinalAPresente;
    }
    
    public double getAhorroFinal(){
        //true = financiero
        return valorBien - getValorPresente();
    }
    
    public double getDesembolso(){
        double total;
        if(tieneOpcionCompra){
            total=getCuota()*(n-1)+getCuotaFinal();    
        }else{
            total = getFlujoNetoPeriodo()*n;
        }
        
        
        return total;
    }
}
