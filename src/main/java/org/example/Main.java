package org.example;

import java.util.Scanner;
import MyCalculator.Calculadora;


public class Main {

    static Scanner lector = new Scanner(System.in);
    static int op;
    static int result = 0;

    public static void main(String[] args) {

        Calculadora clc = new Calculadora();

        System.out.println("Digite el primer numero (a): ");
        int a = lector.nextInt();
        System.out.println("Digite el segundo numero (b): ");
        int b = lector.nextInt();

        try{
            Thread.sleep(1000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        menu();
        op = lector.nextInt();

        switch (op){

            case 1:
                System.out.println("SUMA");

                result=clc.sumar(a,b);
                System.out.println("El resultado de la operación es: "+result);
              break;

            case 2:
                System.out.println("RESTA");
                result=clc.restar(a,b);
                System.out.println("Els resultado de la operación es: "+result);

               break;

            case 3:
                System.out.println("MULTIPLICACION");
                result=clc.multiplicar(a,b);
                System.out.println("El resultado de la operación es: "+result);

                break;

            case 4:

                System.out.println("DIVISION");
                result=clc.dividir(a,b);
                System.out.println("El resultado de la operación es: "+result);
                break;
        }

    }

    public static void menu(){

        System.out.println("Menu de operaciones");

        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
    }
}