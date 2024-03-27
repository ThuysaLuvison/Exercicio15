/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio15;

import javax.swing.JOptionPane;

public class Exercicio15 {

    public static void main(String[] args) {
        int x1, y1, x2, y2;
        double distanciaentrepontos;
        x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        y1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        y2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        distanciaentrepontos = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (distanciaentrepontos == 10 & distanciaentrepontos > 10) {
            JOptionPane.showMessageDialog(null, "Longe!");
        } else {
            JOptionPane.showMessageDialog(null, "Perto!.");
        }
    }
}
