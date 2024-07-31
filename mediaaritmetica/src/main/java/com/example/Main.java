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
      //declaração de variáveis
      double md=0, n1=0, n2=0, n3=0, n4=0;
      //entrada de dados
      n1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a primeira nota do aluno"));
      n2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a segunda nota do aluno"));
      n3 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a terceira nota do aluno"));
      n4 = Double.parseDouble(JOptionPane.showInputDialog ("Digite a quarta nota do aluno"));
      md = (n1 + n2 + n3 + n4) /4;
   
      JOptionPane.showMessageDialog(null," A média aritmética do aluno é: " + md);   
    }
}