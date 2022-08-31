package edu.senac.ap2;
import java.util.Scanner;
/**
Desenvolva um programa que a partir de uma única variável do tipo String obtenha o nome e sobrenome de um aluno,
* separe em duas Strings e efetue a concatenação com uma frase de boas vindas.
O programa deve verificar ser o usuário digitou uma String vazia ou nula
 */
public class exemplo {
    
    public static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        String nome = pegaNomeComp();
        String[] nomeSeparado = separaNome(nome);
        mostraNome(nomeSeparado);
    }
    
    public static String pegaNomeComp() {
        System.out.println("Me informe seu nome e sobrenome: ");
        String nome = inp.nextLine();
        while (nome.equals("") || nome.equals(" ") || nome.equals(null)) {
            System.out.println("Informe novamente o seu nome e sobrenome");
            nome = inp.nextLine();
        }
        return nome;
    }
    
    public static String[] separaNome(String nome) {
        String[] nomeSeparado = new String[2];
        String guarda = "";
        boolean prox = false;
        
        for (int pos = 0; pos < nome.length(); pos++) {
            char l = nome.charAt(pos);
            String letra = l + "";
            if (letra.equals(" ")) {
                prox = true;
                nomeSeparado[0] = guarda;
                guarda = "";
            } else {
                guarda = guarda + letra;
            }
            nomeSeparado[1] = guarda;
        }
        
        return nomeSeparado;
    }
    
    public static void mostraNome(String[] nomeSeparado) {
        System.out.println("Olá, "+nomeSeparado[0]+" "+nomeSeparado[1]+"\n\nNome: "+nomeSeparado[0]+"\nSobrenome: "+nomeSeparado[1]);
    }
}