package prisma;

import java.util.Scanner;

public class Prisma {

    static Scanner leitor = new Scanner(System.in);
    
    public static void main(String[] args) {
        lista1();
    }
    
    public static void lista1(){
        int opcao = 0;
        do{
	    System.out.println("\n----Menu de opções com a fórmula do volume----\n\n1 - Quero descobrir o volume\n2 - Quero descobrir a área da base\n3 - Quero descobrir a altura\n4 - Próxima lista\n5 - Sair do programa");
	    System.out.printf("Insira a opção desejada: ");
	    opcao = leitor.nextInt();
	    switch(opcao){
	        case 1:
	            volPrisma();
	            break;
	                
	        case 2:
	            abPrisma();
	            break;
	                
	        case 3:
	            hPrisma();
	            break;
	                
	        case 4:
                    lista2();
	            break;
	                
                case 5:
                    break;
                
	        default:
	            System.out.println("\nInsira uma opção válida");
	    }
	}while(opcao != 5);
	System.out.println("Adeus!");
    }
    
    public static void lista2(){
        int opcao = 0;
        do{
	    System.out.println("\n----Menu de opções com a fórmula da área total----\n\n1 - Quero descobrir a área total\n2 - Quero descobrir a área da base\n3 - Quero descobrir o número de faces laterais\n4 - Quero descobrir a área da face lateral\n5 - Lista anterior\n6 - Sair do programa");
	    System.out.printf("Insira a opção desejada: ");
	    opcao = leitor.nextInt();
	    switch(opcao){
	        case 1:
	            atPrisma();
	            break;
	                
	        case 2:
	            abPrisma_at();
	            break;
	                
	        case 3:
	            nPrisma();
	            break;
	                
	        case 4:
                    afPrisma();
	            break;
	                
                case 5:
                    lista1();
                    break;
                
                case 6:
                    break;
                    
	        default:
	            System.out.println("\nInsira uma opção válida");
	    }
	}while(opcao != 6);
	System.out.println("Adeus!");
    }
    
    public static void volPrisma(){
	double ab = 0;
	double h = 0;
	System.out.println("\nVolume selecionado!");
	System.out.printf("Insira o valor da área da base: ");
	ab = leitor.nextDouble();
	System.out.printf("Insira o valor da altura: ");
	h = leitor.nextDouble();
	System.out.println("\nO volume é: " + (ab*h));
    }
	
    public static void abPrisma(){
	double h = 0;
	double v = 0;
	System.out.println("\nÁrea da base selecionada!");
	System.out.printf("Insira o valor do volume: ");
	v = leitor.nextDouble();
	System.out.printf("Insira o valor da altura: ");
	h = leitor.nextDouble();
	System.out.println("\nA área da base é: " + (v/h));
    }
	
    public static void hPrisma(){
	double ab = 0;
	double v = 0;
	System.out.println("\nAltura selecionada!");
	System.out.printf("Insira o valor do volume: ");
	v = leitor.nextDouble();
	System.out.printf("Insira o valor da área da base: ");
	ab = leitor.nextDouble();
	System.out.println("\nA altura é: " + (v/ab));
    }
    
    public static void atPrisma(){
	double ab = 0;
	double n = 0;
        double af = 0;
	System.out.println("\nÁrea total selecionada!");
	System.out.printf("Insira o valor da área da base: ");
	ab = leitor.nextDouble();
	System.out.printf("Insira o número de faces laterais: ");
	n = leitor.nextDouble();
        System.out.printf("Insira o valor da área da face lateral: ");
	af = leitor.nextDouble();
	System.out.println("\nA área total é de: " + ((2*ab)+(n*af)));
    }
    
    public static void abPrisma_at(){
	double at = 0;
	double n = 0;
        double af = 0;
	System.out.println("\nÁrea da base selecionada!");
	System.out.printf("Insira o valor da área total: ");
	at = leitor.nextDouble();
	System.out.printf("Insira o número de faces laterais: ");
	n = leitor.nextDouble();
        System.out.printf("Insira o valor da área da face lateral: ");
	af = leitor.nextDouble();
	System.out.println("\nA área da base é de: " + ((at - n*af)/2));
    }
    
    public static void nPrisma(){
	double at = 0;
	double ab = 0;
        double af = 0;
	System.out.println("\nNúmero de faces laterais selecionada!");
	System.out.printf("Insira o valor da área total: ");
	at = leitor.nextDouble();
	System.out.printf("Insira a área da base: ");
	ab = leitor.nextDouble();
        System.out.printf("Insira o valor da área da face lateral: ");
	af = leitor.nextDouble();
	System.out.println("\nO número de faces laterais é: " + ((at - 2*ab)/af));
    }
    
    public static void afPrisma(){
	double at = 0;
	double ab = 0;
        double n = 0;
	System.out.println("\nÁrea da face lateral selecionada!");
	System.out.printf("Insira o valor da área total: ");
	at = leitor.nextDouble();
	System.out.printf("Insira a área da base: ");
	ab = leitor.nextDouble();
        System.out.printf("Insira o número de faces laterais: ");
	n = leitor.nextDouble();
	System.out.println("\nA área da face lateral é: " + ((at - 2*ab)/n));
    }
}
