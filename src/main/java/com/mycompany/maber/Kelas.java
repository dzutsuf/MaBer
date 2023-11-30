/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maber;

/**
 *
 * @author othma
 */
public class Kelas {
    private String id;
    private String namaKelas;
    private String deskripsiKelas;
    private String jadwalKelas;
    private String linkZoom; 
    private int harga;
    private double rating;
    private Pelatih pelatih;
    private Menti [] menti = new Menti [100];
    private int jumlahMenti;
    private Absen [] absenMenti = new Absen [100];
    private Ulasan [] ulasan = new Ulasan [100];
    private int jumlahUlasan;
    
    
    public Kelas(String id, String namaKelas, String deskripsiKelas, String jadwalKelas, String linkZoom, int harga) {
        this.id = id;
        this.namaKelas = namaKelas;
        this.deskripsiKelas = deskripsiKelas;
        this.jadwalKelas = jadwalKelas;
        this.linkZoom = linkZoom;
        this.harga = harga;
    }

    

    
    
    public void setId(String id) {
        this.id = id;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public void setDeskripsiKelas(String deskripsiKelas) {
        this.deskripsiKelas = deskripsiKelas;
    }

    public void setJadwalKelas(String jadwalKelas) {
        this.jadwalKelas = jadwalKelas;
    }

    public void setLinkZoom(String linkZoom) {
        this.linkZoom = linkZoom;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void setPelatih(Pelatih pelatih){
        this.pelatih = pelatih;
    }

    public void setMenti(Absen absen, Menti menti) {
        this.absenMenti[jumlahMenti] = absen;
        this.menti [jumlahMenti] = menti;
        jumlahMenti++;
    }

    
    public String getId() {
        return id;
    }
    
    public String getNamaKelas() {
        return namaKelas;
    }

    public String getDeskripsiKelas() {
        return deskripsiKelas;
    }

    public String getJadwalKelas() {
        return jadwalKelas;
    }

    public String getLinkZoom() {
        return linkZoom;
    }

    public double getHarga() {
        return harga;
    }

    public double getRating() {
        return rating;
    }
    
    public void getPelatih (){
        System.out.println(pelatih.getNama());
    }

    public void showDaftarMenti() {
        for (int i = 0; i < jumlahMenti ; i++) {
            
        }
    }
    
    public void showUlasan()
   {
       for (int i = 0; i < jumlahUlasan; i++) {
           System.out.println("ULASAN\n" +
                   "==============================");
           System.out.println(ulasan[i].getPengirim() + "\n" +
                   "Rating : " + ulasan[i].getRating() + "\n" +
                   "Komentar : " + ulasan [i].getKomentar() + "\n");
       }
       System.out.println("==============================");
   }
   
   public void showInfoPelatih() {
        pelatih.displayBiodata();
    }

    public void showInfo() {
        System.out.println("Informasi Kelas");
        System.out.println("==============================");
        System.out.println("ID: " + id);
        System.out.println("Nama Kelas: " + namaKelas);
        System.out.println("Deskripsi Kelas: " + deskripsiKelas);
        System.out.println("Jadwal Kelas: " + jadwalKelas);
        System.out.println("Link Zoom: " + linkZoom);
        System.out.println("Harga: " + harga);
    
        System.out.println("==============================");
    }
    

    public void showDaftarAbsen() {
        
    }

    public void addUlasan(Ulasan ulasan) {
        this.ulasan[jumlahUlasan] = ulasan;
        if (jumlahUlasan < 1) {
            this.rating = ulasan.getRating();
        } else {
            this.rating = (this.rating * jumlahUlasan + ulasan.getRating()) / (jumlahUlasan + 1);
        }
        jumlahUlasan++;
    }
}
