package bofao;

import javax.swing.JOptionPane;

public class Bofao {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Bem vindo, " + nome);
        String idade = JOptionPane.showInputDialog("Digite sua idade");
        JOptionPane.showMessageDialog(null, "Você é " + nome + " e tem " + idade + " anos?");
        String resposta = JOptionPane.showInputDialog("Escreva sim se você é " + nome + " ou digite não se não for " + nome + ".");
        if (resposta.equals("sim")) {
            JOptionPane.showMessageDialog(null, ""+nome+".");
        } else {
            JOptionPane.showMessageDialog(null, "Infelizmente você não é "+nome+".");
            String nome_real = JOptionPane.showInputDialog(null, "Agora digite seu nome verdadeiro.");
            JOptionPane.showMessageDialog(null, "Bem vindo "+nome_real+".");
        }
    }

}
