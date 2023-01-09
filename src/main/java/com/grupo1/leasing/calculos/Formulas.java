/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.leasing.calculos;

/**
 *
 * @author hiros
 */
public class Formulas {
    private double tInteres;
    private double valorBien;
    private double cuota;
    private double tResidual;
    private int n;
    private double tDescuento;
    private static final double RENTA = 0.295;
    
    public Formulas(double tInteres, double valorBien, double cuota, double tResidual, int n, double tDescuento){
        this.tInteres = tInteres;
        this.valorBien=valorBien;
        this.cuota = cuota;
        this.tResidual = tResidual;
        this.n = n;
        this.tDescuento = tDescuento;
    }
    
    public double hallarCuota(){
        double numerador =((valorBien*tInteres*Math.pow(1+tInteres, (double)n))-hallarValorDeCompra()*tInteres);
        double denominador = (Math.pow(1+tInteres,(double)n)-1);
        return numerador/denominador;
    }
    
    public double hallarCuotaFinal(){
        return this.hallarCuota()+tResidual;
    }
    
    public double hallarValorDeCompra(){
        return this.valorBien*tResidual;
    }
    
    public double amortizacion(){
        return 0.0d;
    }
    
    public double ahorroFiscalXAño(){
        return this.hallarCuota()*RENTA;
    }
    
    public double ahorroFiscalAñoFinal(){
        return this.hallarCuotaFinal()*RENTA;
    }
    
    public double valorPresente(){
        double cuotasAPresente = ((hallarCuota()-ahorroFiscalXAño())*(Math.pow(1+tDescuento, (double)(n-1))-1))/(Math.pow(1+tDescuento, (double)(n-1))*tDescuento);
        double cuotaFinalAPresente = (hallarCuotaFinal()-ahorroFiscalAñoFinal())*(1/Math.pow(1+tDescuento,(double)n));
        
        return cuotasAPresente + cuotaFinalAPresente;
    }
    
    public double hallarAhorroFinal(){
        return valorBien - valorPresente();
    }
}
