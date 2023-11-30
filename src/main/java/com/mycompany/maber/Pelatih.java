/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author othma
 */
public class Pelatih extends User {
    private double rating;
    private int jumlahRating;
    private List<Kelas> kelasList;
    private String id;
    private String nama;
    private String keteranganKeahlian;
    private String lulusan;
    private static ArrayList<User> users = new ArrayList<>();

    public Pelatih(String email, String password, String id, String nama, String keteranganKeahlian, String lulusan) {
        super(email, password);
        this.id = id;
        this.nama = nama;
        this.keteranganKeahlian = keteranganKeahlian;
        this.lulusan = lulusan; 
        this.kelasList = new ArrayList<>();
    }

    public List<Kelas> getKelasList() {
        return kelasList;
    }
    
    
    public void verifikasiAkun(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sign Up");
        System.out.println("2. Sign in");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();

        if (option == 1) {
           signUp();            
           signIn();
            
        } else if (option == 2) {
           signIn();
        } else {
            System.out.println("Invalid option. Returning null.");
        }
    }

    private static void signUp() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan email baru: ");
        String email = scanner.next();
        System.out.print("Masukkan password baru: ");
        String password = scanner.next();

        
        User newUser = new User(email, password);
        users.add(newUser);
    }

   private static void signIn() {
    Scanner scanner = new Scanner(System.in);
    boolean signInSuccessful = false;
    int i=0;
    
    while (i!=4) {
        System.out.print("Masukkan email: ");
        String email = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        // Memeriksa keberadaan pengguna dengan email dan password yang sesuai
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Sign In berhasil!");
                 i = 3;
                 return;
            }
        }

        System.out.println("Sign In gagal. Email atau password salah. Silakan coba lagi.");
        i++;
        
        }     
    }
   
   public void displayMenuPelatih() {
    
    Scanner inputUser = new Scanner(System.in);
    int input = 0;
    
    do {
        System.out.println("Menu:");
        System.out.println("1. Update Biodata");
        System.out.println("2. Lihat Biodata");
        System.out.println("3. Buat Kelas Baru");
        System.out.println("4. Lihat Kelas Saya");
        System.out.println("5. keluar");
        System.out.print("Pilih Menu: ");
        input = inputUser.nextInt();

        switch (input) {
            case 1:
                updateBiodata();
                break;
            case 2:
                displayBiodata();                
                break;
            case 3:
                createKelas();                                
                break;
            case 4:
                displayKelasInfo();                               
                break;
            case 5:
                System.out.println("Keluar dari Menu");
                break;
            default:
                System.out.println("Pilihan Tidak Ada!!");
                break;
        }

    } while (input != 5);
}

    public void updateBiodata() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan biodata Anda:");
        System.out.print("Nama: ");
        this.nama = scanner.nextLine();
        System.out.print("Keterangan Keahlian: ");
        this.keteranganKeahlian = scanner.nextLine();
        System.out.print("Lulusan: ");
        this.lulusan = scanner.nextLine();
        System.out.println("Biodata Anda berhasil dibuat!");
    }
    
        public void displayBiodata() {
            System.out.println("Biodata Pelatih:");
            System.out.println("Nama: " + this.nama);
            System.out.println("Keterangan Keahlian: " + this.keteranganKeahlian);
            System.out.println("Lulusan: " + this.lulusan);
        }


    

    

    public void createKelas() {
        Scanner scanner = new Scanner(System.in);

        // Input atribut kelas
        System.out.println("Masukkan informasi kelas baru:");
        System.out.print("ID Kelas: ");
        String id = scanner.nextLine();
        scanner.nextLine(); 
        System.out.print("Nama Kelas: ");
        String namaKelas = scanner.nextLine();
        System.out.print("Deskripsi Kelas: ");
        String deskripsiKelas = scanner.nextLine();
        System.out.print("Jadwal Kelas: ");
        String jadwalKelas = scanner.nextLine();
        System.out.print("Link Zoom: ");
        String linkZoom = scanner.nextLine();
        System.out.print("Harga: ");
        int harga = scanner.nextInt();

        

        // Membuat objek kelas dan menambahkannya ke dalam kelasList
        Kelas kelas = new Kelas(id, namaKelas, deskripsiKelas, jadwalKelas, linkZoom, harga);
        kelasList.add(kelas);

        System.out.println("Kelas baru berhasil dibuat!");
    }

    
    public void displayKelasInfo() {
        System.out.println("Daftar Kelas yang Anda Buat:");
        if (kelasList.isEmpty()) {
            System.out.println("Belum ada kelas yang dibuat.");
        } else {
            for (Kelas kelas : kelasList) {
                kelas.showInfo();
            }
        }
    }

    public String getId() {
        return id;
    }

    public String getKeteranganKeahlian() {
        return keteranganKeahlian;
    }

    public String getLulusan() {
        return lulusan;
    }
    
    
    
    
    public String getNama() {
        return this.nama;
    }

}
