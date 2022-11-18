/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import javax.swing.JOptionPane;

/**
 *
 * @author gustavo_s_braga
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palavraDesejada = JOptionPane.showInputDialog(null, "Insira a palavra que você deseja verificar se é um palindromo");
        if(verificaPalindromo(palavraDesejada) == true){
            JOptionPane.showMessageDialog(null, "A palavra que você escreveu é um palindromo!");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra inserida não é um palindromo");
        }
    }
    
    public static boolean verificaPalindromo(String palavra){
        String palavraInvertida = "";
        boolean retorno = false;
        
        for(int i = palavra.length()-1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if(palavra.equals(palavraInvertida)){
            return true;
        }
        return retorno;
    }
}

