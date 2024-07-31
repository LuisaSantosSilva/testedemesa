package com.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @Luisa Santos Silva
 */
//import javax.swing
import javax.swing.JOptionPane;
//criando classe
public class Main {
    public static void main(String[] args) {
       // Declaração de variáveis
       int numero;
       
       // Entrada de dados
       numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificar se é ímpar ou par"));
       
       // Verificando se o número é ímpar ou par
       if (numero % 2 == 0) {
           // Exibindo o resultado
            JOptionPane.showMessageDialog(null, "O número " + numero + " é par");
       } else {
           // Exibindo o resultado
           JOptionPane.showMessageDialog(null, "O número " + numero + " é ímpar");
       }
       
    }
}