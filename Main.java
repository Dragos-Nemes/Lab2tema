package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int numarCarti = Integer.parseInt(JOptionPane.showInputDialog(null, "Cate Carti doriti sa introduceti?"));
        Books books[] = new Books[numarCarti];
        for (int i = 0; i < numarCarti; i++) {
            books[i] = new Books();
            books[i].setTitlu();
            books[i].setAutor();
            books[i].setAnLansare();
            books[i].setPret();

        }
        int alegere = Integer.parseInt(JOptionPane.showInputDialog(null, "Alegeti 1 pentru getter sau 2 pentru toString"));
        try {
            if (alegere == 1) {
                for (int i = 0; i < numarCarti; i++) {
                    JOptionPane.showMessageDialog(null, "Titlu:"+books[i].getTitlu());
                    JOptionPane.showMessageDialog(null, "Autor"+books[i].getAutor());
                    JOptionPane.showMessageDialog(null, "And Lansare: "+books[i].getAnLansare());
                    JOptionPane.showMessageDialog(null, "Pret: "+books[i].getPret());
                }
            } else if (alegere == 2) {
                for (int i = 0; i < numarCarti; i++)
                    JOptionPane.showMessageDialog(null, books[i].toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eroare");
        }
    }

}
