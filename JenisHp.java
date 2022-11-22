/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jenishp;

import java.util.Scanner;

/**
 *
 * @author andreas
 */
public class JenisHp {

    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        String aksi; 
        int add ;
        
        // membuat objek HP
        Phone redmiNote8 = new Xiaomi();
        Phone xr = new Iphone();
        Phone reno = new Oppo();
        Phone jet = new Samsung();

        // membuat objek user
        PhoneUser dian = new PhoneUser(redmiNote8);
        PhoneUser ban = new PhoneUser(xr);
        PhoneUser reni = new PhoneUser(reno);
        PhoneUser dina = new PhoneUser(jet);
          

        // kita coba nyalakan HP-nya
        System.out.println("Jenis handphone :");
        System.out.println("1. Xiaomi");
        System.out.println("2. Iphone");
        System.out.println("3. Oppo");
        System.out.println("4. Samsung");
        System.out.println("Masukkan Pilihan ANDA");
        add= input.nextInt();
        
        if(add == 1){
          dian.turnOnThePhone() ;
          while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                dian.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } 
            
        }
        }
        else if (add == 2){
            ban.turnOnThePhone();
                while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Kecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if(aksi.equalsIgnoreCase("1")){
                    ban.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")){
                    ban.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")){
                    ban.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")){
                    ban.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")){
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }
            }
        }
         else if (add == 3){
            reni.turnOnThePhone();
             while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Kecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if(aksi.equalsIgnoreCase("1")){
                    reni.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")){
                    reni.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")){
                    reni.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")){
                    reni.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")){
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }
            }
        }
         else if (add == 4){
           dina.turnOnThePhone();
            while (true) {
                System.out.println("=== APLIKASI INTERFACE ===");
                System.out.println("[1] Nyalakan HP");
                System.out.println("[2] Matikan HP");
                System.out.println("[3] Perbesar Volume");
                System.out.println("[4] Kecilkan Volume");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if(aksi.equalsIgnoreCase("1")){
                    dina.turnOnThePhone();
                } else if (aksi.equalsIgnoreCase("2")){
                    dina.turnOffThePhone();
                } else if (aksi.equalsIgnoreCase("3")){
                    dina.makePhoneLouder();
                } else if (aksi.equalsIgnoreCase("4")){
                    dina.makePhoneSilent();
                } else if (aksi.equalsIgnoreCase("0")){
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }
            }
           
        }
        
        
        
        // biar enak, kita buat dalam program
       

        

    }
}
