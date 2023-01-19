/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.leasing.helpers;

/**
 *
 * @author hiros
 */
public class Helper {
    
    private static double getDias(int index){
        double dias=0;
        switch(index){
            case 0: dias=360;break;
            case 1: dias=180;break;
            case 2: dias=120;break;
            case 3: dias=90;break;
            case 4: dias=30;break;
        }
        
        return dias;
    }
    
    public static double convertirInteres(double i, int n, int ixCuota, int ixOrigen){
        return Math.pow(1+i, getDias(ixCuota)/getDias(ixOrigen))-1;
    }
    
}
