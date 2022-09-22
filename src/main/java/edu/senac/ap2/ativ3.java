package edu.senac.ap2;
import java.util.Scanner;
/**
Entre com dois números, imprima a faixa de números e identifique quais são pares e impares.
Explique qual instrução de laço foi escolhida e o por que da escolha.
 */
public class ativ3 {
    
    public static Scanner inp = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] nums = pegaNums();
        mostraNums(nums);
        numsImparOuPar(nums);
    }
    
    public static int[] pegaNums() {
        int[] nums = new int[2];
        boolean passa = false, seg = false;
        
        while (!passa || !seg) {
            if (!seg) {
                System.out.println("Insira o primeiro número: ");
            } else {
                System.out.println("Insira o segundo número: ");
            }
            int num = inp.nextInt();
            while (num <= -1) {
                System.out.println("Insira novamente(Não pode ser menor que 0): ");
                num = inp.nextInt();
            }
            if (seg) {
                nums[1] = num;
                passa = true;
            } else {
                nums[0] = num;
                seg = true;
            }
        }
        
        return nums;
    }
    
    public static void mostraNums(int[] nums) {
        System.out.println(nums[0]+" - "+nums[1]);
    }
    
    public static String[] numsImparOuPar(int[] nums) {
        int a = nums[0], b = nums[1], tam;
        if (a > b) {
            tam = a - b;
        } else {
            tam = b - a;
        }
        String[] numsIP = new String[tam];
        if (a > b) {
                for (int pos = 0; pos < tam; pos++) {
                numsIP[pos] = b + "";
                b++;
            }
        } else {
            for (int pos = 0; pos < tam; pos++) {
                
            }
        }
        
        return numsIP;
    }
}