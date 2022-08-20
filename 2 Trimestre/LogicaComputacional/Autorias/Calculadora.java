package com.mycompany.ex5_calculadora;
import java.lang.Math;
import java.util.Scanner;

public class Ex5_calculadora {

    public static void main(String[] args) {
        
        // Código com número
        
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Insira o primeiro valor: ");
        int num1 = leitor.nextInt();
        System.out.printf("Insira o segundo valor: ");
        int num2 = leitor.nextInt();
        System.out.println(
                " Opção 1 - soma \n "
                + "Opção 2 - subtração \n "
                + "Opção 3 - multiplicação \n "
                + "Opção 4 - divisão \n "
                + "Opção 5 - resto da divisão \n "
                + "Opção 6 - exponencial");
        System.out.printf("Selecione um das opções acima: ");
        int selecao = leitor.nextInt();
        
        switch (selecao){
        
            case 1:
                System.out.println(num1+num2);
                break;
            
            case 2:
                System.out.println(num1-num2);
                break;
                
            case 3:
                System.out.println(num1*num2);
                break;
            
            case 4:
                System.out.println(num1/num2);
                break;
            
            case 5:
                System.out.println(num1%num2);
                break;
              
            case 6:
                int x = (int)(Math.pow(num1,num2));
                System.out.println(x);
                break;
                
            default:
                System.out.printf("Por favor, insira uma opção válida :D");
                
        }           
    }
}