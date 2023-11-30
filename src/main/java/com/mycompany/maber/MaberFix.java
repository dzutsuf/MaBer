/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maber;
import utils.BaseDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author othma
 */
public class MaberFix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BaseDAO BaseDAO = new BaseDAO("root","maber","QWERTYUI");
        // Initialize the ArrayList before using it
        ArrayList<User> users = new ArrayList<>();

        int role = 0;

        do {
            System.out.println("Masuk Sebagai: ");
            System.out.println("1. Pelatih");
            System.out.println("2. Menti");
            System.out.println("3. Keluar");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Pelatih pelatih = new Pelatih("email@contoh.com", "password","1234", "Nama Default", "Keahlian Default", "Lulusan Default");
                    pelatih.verifikasiAkun(users);
                    pelatih.displayMenuPelatih();
                    role = 1;
                    break;

                case 2:
                    

                    Menti menti = new Menti("emailMenti", "passwordMenti");
                    menti.verifikasiAkun(users);
                    menti.displayMenu();
                    role = 2;
                    break;
                case 3:
                  
                    role = 0;
                    break;

                default:
                    System.out.println("Nilai tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (role != 0);

        scanner.close();
    }
}
