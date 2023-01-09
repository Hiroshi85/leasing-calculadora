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
    private double interes;
    private double valorBien;
    private double cuota;
    private double residual;
    private int n;
    private double descuento;
    private static final double RENTA = 0.295;
    
    public Formulas(double interes, double valorBien, double cuota, double residual, int n, double descuento){
        this.interes = interes;
        this.valorBien=valorBien;
        this.cuota = cuota;
        this.residual = residual;
        this.n = n;
        this.descuento = descuento;
    }
    
    public double hallarCuota(){
        double numerador =((valorBien*interes*Math.pow(1+interes, (double)n))-residual*interes);
        double denominador = (Math.pow(1+interes,(double)n)-1);
        return numerador/denominador;
    }
    
    public double hallarCuotaFinal(){
        return this.hallarCuota()+residual;
    }
    
    public double amortizacion(){
        return 0.0d;
    }
    
    public double ahorroFiscalXAño(){
        return this.hallarCuota()*RENTA;
    }
    
    public double ahorroFiscalXAñoFinal(){
        return this.hallarCuotaFinal()*RENTA;
    }
    
    public double valorPresente(){
        double cuotasAPresente = ((hallarCuota()-ahorroFiscalXAño())*(Math.pow(1+descuento, (double)(n-1))-1))/(Math.pow(1+descuento, (double)(n-1))*descuento);
        double cuotaFinalAPresente = (hallarCuotaFinal()-ahorroFiscalXAñoFinal())*(1/Math.pow(1+descuento,(double)n));
        
        return cuotasAPresente + cuotaFinalAPresente;
    }
}
