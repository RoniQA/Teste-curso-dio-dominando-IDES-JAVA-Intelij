package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();

        float somar = somar(a, b);
        float subtracao = subtracao(a, b);
        float multiplicacao = multiplicacao(a, b);
        float divisao = divisao(a, b);

        System.out.println("soma de " + a + " + " + b + " = " + somar);
        System.out.println("subtracao de " + a + " - " + b + " = " + subtracao);
        System.out.println("multiplicacao de " + a + " * " + b + " = " + multiplicacao);
        System.out.println("divisao de " + a + " / " + b + " = " + divisao);


    }
    public static float somar(float a, float b){
        return a + b;
    }
    public static float subtracao(float a, float b){
        return a - b;
    }
    public static float multiplicacao(float a, float b){
        return a * b;
    }
    public static float divisao(float a, float b){
        return a / b;
    }
}
