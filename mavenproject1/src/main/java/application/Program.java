/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Calculadora;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);
             
        
        Calculadora calc = new Calculadora();
        double num1, num2;
        System.out.println("Digite seu primeiro número");
        num1 = sc.nextDouble();
        
        System.out.println("Digite seu segundo número");
        num2 = sc.nextDouble();
        
        double soma = calc.somar(num1, num2);
        double subtracao = calc.subtrair (num1, num2);
        double multiplicacao = calc.multiplicar(num1, num2);
        double divisao = calc.dividir(num1, num2);
        System.out.println("Resultado da soma: " +soma);
        System.out.println("Resultado da subtração: " + subtracao);
        System.out.println("Resultado da multiplicação: " + multiplicacao );
        System.out.println("Resultado da divisão : " + divisao );
        
        
        
        sc.close();
    }
}
