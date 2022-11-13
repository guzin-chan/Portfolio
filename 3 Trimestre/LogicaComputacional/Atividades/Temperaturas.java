import java.util.*;

public class Main {

    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        // Escreva um programa em java, em que o usuário converta temperatura de Celsius para Fahrenheit
        // e vice versa (ele decide qual será a conversão efetuada através de uma estrutura de decisão e Scanner)
        System.out.println("Olá, está é uma calculadora de temperatura! Escolha entre as opções a seguir: ");
        menu();
    }

    public static void menu(){
        System.out.println("1- Celsius para Fahrenheit" +
                "\n2- Fahrenheit para Celsius" +
                "\n3- Fechar programa");
        int opcao = -1;
        do {
            System.out.printf("Insira a opção -> ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1:
                    celsiusParaFahrenheit();
                    break;
                case 2:
                    fahrenheitParaCelsius();
                    break;
                case 3:
                    System.out.println("Adeus! =D");
                    break;
                default:
                    System.out.println("Opção não existe!");
            }
        } while(opcao < 1 || opcao > 3);
    }

    public static void celsiusParaFahrenheit(){
        System.out.println("\n--------CELSIUS PARA FAHRENHEIT--------");
        System.out.printf("Insira a temperatura em celsius: ");
        int celsius = leitor.nextInt();
        System.out.println("A temperatura em fahrenheit é de: " + (celsius*1.8+32));
        System.out.println("---------------------------------------\n");
        menu();
    }

    public static void fahrenheitParaCelsius(){
        System.out.println("\n--------FAHRENHEIT PARA CELSIUS--------");
        System.out.printf("Insira a temperatura em fahrenheit: ");
        int fahrenheit = leitor.nextInt();
        System.out.println("A temperatura em celsius é de: " + ((fahrenheit-32)/1.8));
        System.out.println("---------------------------------------\n");
        menu();
    }
}