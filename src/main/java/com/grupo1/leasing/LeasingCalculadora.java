/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.grupo1.leasing;
import com.grupo1.leasing.calculos.Formulas;
import com.grupo1.leasing.presentacion.FrmOperativo;
/**
 *
 * @author hiros
 */
public class LeasingCalculadora {

    public static void main(String[] args) {
        System.out.println("----------Financiero----");
        Formulas leasing = new Formulas(0.1, 100000, 8,0.1, 0.125, true);
        System.out.println(leasing.getCuota());
        System.out.println(leasing.getCuotaFinal());
        System.out.println(leasing.getValorPresente());
        System.out.println(leasing.getTablaInteres_Amort_Saldo());
        System.out.println("--------Operativo------");
        Formulas leasingO = new Formulas(0.1, 100000, 8,0.1, 0.125, false);
        System.out.println(leasingO.getCuota());
        System.out.println(leasingO.getEscudoFiscalXAño());
        System.out.println(leasingO.getValorPresente());
        System.out.println(leasingO.getTablaInteres_Amort_Saldo());
//        FrmOperativo frm = new FrmOperativo();
//        frm.setVisible(true);
    }
}
