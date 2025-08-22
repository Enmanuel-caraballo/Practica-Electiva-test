package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import MyCalculator.Calculadora;


public class Main {

    static Scanner lector = new Scanner(System.in);
    static int op, a = 0, b = 0;
    static int result = 0;


    public static void main(String[] args) {

        Calculadora clc = new Calculadora();
        boolean valueOk = false;

        while (!valueOk) {
        try{

            System.out.println("Digite el primer numero (a): ");
             a = lector.nextInt();
            System.out.println("Digite el segundo numero (b): ");
             b = lector.nextInt();
            valueOk = true;
        } catch (InputMismatchException e) {
            System.out.println("Ingrese una opcion valida");
            lector.nextLine();
        }

        }


        try{
            Thread.sleep(500);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        do {
            menu();

        try {

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



        } catch (InputMismatchException e) {
            if(Character.isDigit(op) || op > 4)
            System.out.println("Ingrese una opcion valida");
            lector.nextLine();
        }

        }while (op != 0);

    }

    public static void menu(){

        System.out.println("Menu de operaciones");

        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("0.Salir");
    }
}