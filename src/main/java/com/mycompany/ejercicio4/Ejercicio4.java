/* Una compañia de autos usados, paga a sus empleados un salario mensual de
$1000, mas una comision de $150 por carro vendido, mas el 5% del valor de la
venta por carro.
Hacer un programa que calcule el salario mensual de un empleado*/

package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double sm = 1000;// sueldo basico
        final double comision = 150;// comision
        double cv;// cantidad de carros vendidos
        double vv;// valor total de los carros vendidos
        double comision_c;// valor de la comision por carros vendidos
        double comision_v;// comision del 5% por carro vendido
        double sueldo_f;// sueldo mensual
        
        System.out.println("digite el numero de carros vendidos: ");
        cv = entrada.nextDouble();
        System.out.println("digite el valor total de las ventas: ");
        vv = entrada.nextDouble();
        
        comision_c = comision * cv;
        comision_v = vv * 0.05;
        sueldo_f = sm + comision_c + comision_v;
        
        System.out.println("el sueldo mensual del vendedor es: "+sueldo_f);
        
        
        // codificado por wilmar diaz soto
        
        
        
        
        
        
        
        
    }
}
