/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupo1.leasing;
import com.grupo1.leasing.calculos.Formulas;
import com.grupo1.leasing.presentacion.FrmPrincipal;
/**
 *
 * @author hiros
 */
public class LeasingCalculadora {

    public static void main(String[] args) {
        Formulas leasing = new Formulas(0.1, 100000, 0.0d, 10000, 8, 0.125);
        System.out.println(leasing.hallarCuota());
        System.out.println(leasing.hallarCuotaFinal());
        System.out.println(leasing.ahorroFiscalXAño());
        System.out.println(leasing.ahorroFiscalAñoFinal());
        System.out.println(leasing.valorPresente());
        System.out.println(leasing.hallarAhorroFinal());
        System.out.println("Hello World!");
    }
}
