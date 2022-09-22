package Conteudo_de_Aula;
/** 
   por Rafael Ferreira Goulart
**/
import java.util.Scanner;

public class AP2_14_09_2022 {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Escolhe aí: ");
        int num = inp.nextInt();
        System.out.println("Valor do fatorial: " + fatorial(num));
        
        System.out.println("\nValor da potência: " + potencia(5,3));
        
        System.out.println();
    }
    
    public static int fatorial(int valor) {
        if (valor == 0) {
            return 1;
        } else {
            valor = (valor * fatorial(valor - 1));
            System.out.println(valor);
            return valor;
        }
    }
    
    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            int valor = base * potencia(base, expoente - 1);
            System.out.println(valor);
            return valor;
        }
    }
    
    public static int maximoVetor(int v[], int n) {
        if (n == 1) {
            return v[0];
        } else {
            int x;
            x = maximoVetor(v, n-1);
            if (x > v[n-1]) {
                return x;
            } else {
                return v[n-1];
            }
        }
    }
}