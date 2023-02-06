package com.company;

import java.util.Scanner;

public class EjercicioFunciones {

    public  static double calcularIva(double p){

        double valorIva;
        valorIva = p * 0.19;

        return  valorIva;
    }
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double precioProducto, iva;

        System.out.println("Por favor ingrese el valor del producto");
        precioProducto = lector.nextDouble();
        System.out.println("El valor neto el producto es: " + precioProducto);
        System.out.println("Al valor se le cobrará el iva con valor del 19% del costo del producto");

        iva = calcularIva(precioProducto);
        System.out.println("El valor total del producto es: " +(precioProducto+iva));

    }
}
