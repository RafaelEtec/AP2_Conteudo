package Conteudo_de_Aula;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class AP2_10_08_2022 {
    
    public static Scanner inp = new Scanner(System.in);
    public static int es = 0;
    
    public static void main(String[] args) {
        System.out.println("Vai fazer oq?: "
                + "\n<0> OlaMundo"
                + "\n<1> OlaMundo Erro"
                + "\n<2> ConcatTeste"
                + "\n<3> Wrapper"
                + "\n<4> Variaveis Cast"
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
                OlaMundo();
                break;
            case 1:
                OlaMundoErro();
                break;
            case 2:
                ConcatTeste();
                break;
            case 3:
                Wrapper();
                break;
            case 4:
                VarCast();
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
    
    public static void OlaMundo() {
        System.out.println("Olá Mundo!");
    }
    
    public static void OlaMundoErro() {
        System.err.println("Olá Mundo Errado!");
    }
    
    public static void ConcatTeste() {
        System.out.println("Me diga seu nome: ");
        final String nome = inp.next();
        System.out.println("Olá " + nome.concat(" Meu nome é Java."));
    }
    
    public static void Wrapper() {
        Integer idade = 19;
        Float salario = 2350.65f;
        Double numeroPi = 3.14159265358979323846264338327950;
        System.out.println(idade + "\n" + salario + "\n" + numeroPi);
    }
    
    public static void VarCast() {
        
    }
    
     
}