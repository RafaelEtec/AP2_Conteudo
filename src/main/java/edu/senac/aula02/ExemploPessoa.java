/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.senac.aula02;

/**
 *
 * @author rafael.fgoulart1
 */
public class ExemploPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Rafael Ferreira Goulart");
        pessoa.setIdade(19);
        pessoa.setAltura(1.82);
        pessoa.setPeso(68.20);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getPeso());
        
        System.out.println(pessoa.andar());
    }
}