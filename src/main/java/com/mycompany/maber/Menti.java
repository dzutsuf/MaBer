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
public class Menti extends User {
    private String nama;
    private Object scanner;
    private String asal;
    private String tanggalLahir;
    private String jenisKelamin;
    private Pelatih kelasList;

    public Menti(String email, String password) {
        super(email, password);
        
    }

    public void verifikasiAkun(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sign Up");
        System.out.println("2. Sign in");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();

        if (option == 1) {
            signUp(users);
            System.out.println("Sign Up Berhasil");
            System.out.println("Lanjut Sign In");
            signIn(users);

        } else if (option == 2) {
            signIn(users);
        } else {
            System.out.println("Invalid option. Returning null.");
        }
    }

    private void signUp(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan email baru: ");
        String email = scanner.next();
        System.out.print("Masukkan password baru: ");
        String password = scanner.next();

        User newUser = new User(email, password);
        users.add(newUser);
    }

    private void signIn(ArrayList<User> users) {
        Scanner scanner = new Scanner(System.in);
        boolean signInSuccessful = false;
        int i = 0;

        while (i != 4) {
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

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Update Biodata");
            System.out.println("2. Lihat Biodata");
            System.out.println("3. Memilih Kelas");
            System.out.println("4. Absen");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    updateBiodata();
                    break;
                case 2:
                    displayBiodata();
                    break;
                case 3:
                    System.out.println("anda telah milih kelas");;
                    break;
                case 4:
                    absen();
                    break;
                case 5:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 4);
    }

    public void updateBiodata() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan biodata Anda:");
        System.out.print("Nama: ");
        this.nama = scanner.nextLine();
        System.out.print("Tanggal Lahir: ");
        this.tanggalLahir = scanner.nextLine();
        System.out.print("Jenis Kelamin: ");
        this.jenisKelamin = scanner.nextLine();
        System.out.print("Asal Daerah: ");
        this.asal = scanner.nextLine();
    }
    public void displayBiodata() {
        System.out.println("Biodata Menti:");
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Lahir: " + this.tanggalLahir);
        System.out.println("Jenis Kelamin: " + this.jenisKelamin);
        System.out.println("Asal Daerah: " + this.asal);
    }

    public Kelas pilihKelas(List<Kelas> kelasPelatih) {
    System.out.println("Menu Memilih Kelas dipilih.");
    System.out.println("Daftar Kelas yang Tersedia:");

    if (kelasPelatih.isEmpty()) {
        System.out.println("Pelatih ini belum membuat kelas.");
    } else {
        System.out.println("Daftar Kelas Pelatih:");
        for (int i = 0; i < kelasPelatih.size(); i++) {
            Kelas kelas = kelasPelatih.get(i);
            System.out.println((i + 1) + ". " + kelas.getNamaKelas());
        }

        System.out.print("Pilih kelas: ");
        Scanner scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();

        if (pilih >= 1 && pilih <= kelasPelatih.size()) {
            // Mengembalikan kelas yang dipilih oleh Menti
            return kelasPelatih.get(pilih - 1);
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    System.out.println("Menu Memilih Kelas dipilih.");
    return null; // Kembalikan null jika tidak ada kelas yang dipilih
}


    public void absen() {
        // Implement absen logic here
        System.out.println("Menu Absen dipilih.");
    }
}
