package com.company;

import javax.swing.*;

public class Books {
    private String autor;
    private String Titlu;
    private int anLansare;
    private float pret;

    public void setAutor() {
        this.autor = JOptionPane.showInputDialog(null, "Dati Autorul cartii");
    }

    public void setTitlu() {
        this.Titlu = JOptionPane.showInputDialog(null, "Dati Titlul Cartii");
    }

    public void setAnLansare() {
        this.anLansare = Integer.parseInt(JOptionPane.showInputDialog(null, "Dati Anul Lansarii"));
    }

    public void setPret() {
        this.pret = Float.parseFloat(JOptionPane.showInputDialog(null, "Dati Pretul cartii"));
    }

    public String getAutor() {
        return autor;
    }

    public String getTitlu() {
        return Titlu;
    }

    public int getAnLansare() {

        return anLansare;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Books{" +
                "autor='" + autor + '\'' +
                ", Titlu='" + Titlu + '\'' +
                ", anLansare=" + anLansare +
                ", pret=" + pret +
                '}';
    }
}
