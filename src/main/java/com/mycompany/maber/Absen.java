/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maber;

/**
 *
 * @author othma
 */
public class Absen {
    //private Menti namaMenti;
    private boolean kehadiran;
    //private int jumlahMenti;
    //private Menti[] absenMenti = new Menti [100];
    private Menti menti;

    public Absen(Menti menti) {
        this.menti = menti;
    }
    
    //public void simpanKehadiran(Menti menti) {
    //    absenMenti[jumlahMenti] = menti;
    //    jumlahMenti++;
    //}

    //public void showDaftarMenti() {
    //    for (int i = 0; i < jumlahMenti; i++) {
    //        System.out.println(i + 1 + ". " + absenMenti[i].getName());
    //    }
    //}

    //public void setNamaMenti(Menti menti) {
    //    this.namaMenti = menti;
    //}

    //public Menti getNamaMenti() {
    //    return namaMenti;
    //}

    public void setKehadiran(boolean kehadiran) {
        this.kehadiran = kehadiran;
    }

    public boolean isKehadiran() {
        return kehadiran;
    }

    //public int getJumlahMenti() {
    //    return jumlahMenti;
    //}

    //public Menti[] getDaftarMenti() {
    //    return daftarMenti;
    //}

    //public void printInfoKehadiran() {
    //    System.out.println("Data Kehadiran Menti:\n"
    //            + "Nama Menti: " + getNamaMenti() + "\n"
    //            + "Kehadiran : " + (kehadiran ? "Ya" : "Tidak"));
    //    showDaftarMenti();
    //}
}

