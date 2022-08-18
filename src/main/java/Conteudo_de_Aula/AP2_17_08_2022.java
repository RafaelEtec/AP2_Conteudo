package Conteudo_de_Aula;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class AP2_17_08_2022 {
    
    public static Scanner inp = new Scanner(System.in);
    public static int es = 0;
    
    public static void main(String[] args) {
        System.out.println("Vai fazer oq?: "
                + "\n<0> "
                + "\n<1> "
                + "\n<2> "
                + "\n<3> "
                + "\n<4> "
                + "\n<5> "
                + "\n<6> "
                + "\n<7> "
                + "\n<8> "
                + "\n<9> ");
        do {
            es = inp.nextInt();
        } while (es < 0 || es > 9);
        
        switch (es) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        inp.close();
    }
}