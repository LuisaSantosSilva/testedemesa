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

        // Solicita ao usuário para inserir um número
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para calcular o cubo"));
            
        // Calcula o cubo do número
        double cubo = Math.pow(numero, 3);
            
        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O cubo do número " + numero + " é: " + cubo);
        
    }
}