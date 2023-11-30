/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maber;

/**
 *
 * @author othma
 */
public class Ulasan {
    //private Kelas id;
    //private Kelas namaKelas;
    private Menti pengirim;
    private double rating;
    private String komentar;

    public Ulasan(Menti pengirim, double rating, String komentar) {
        this.pengirim = pengirim;
        this.rating = rating;
        this.komentar = komentar;
    }

    public void setPengirim(Menti pengirim) {
        this.pengirim = pengirim;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public Menti getPengirim() {
        
        return pengirim;
    }

    public double getRating() {
        return rating;
    }

    public String getKomentar() {
        return komentar;
    }

    
}
