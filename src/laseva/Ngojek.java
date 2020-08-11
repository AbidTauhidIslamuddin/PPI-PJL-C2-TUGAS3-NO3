/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laseva;
import java.util.Scanner;
/**
 *
 * @author Night's Watch
 */
public class Ngojek {

    String username;
    int password;

    public static void main(String[] args) {
        String user="abid";
        int pass = 123;
        Scanner input = new Scanner(System.in);
        System.out.println("LOGIN");
        System.out.print("Masukkan user : ");
        String username=input.nextLine();
        System.out.print("Masukkan pass : ");
        int password=input.nextInt();
        
        if(username.equals(user)&&password==pass){
            System.out.println("Silahkan pilih menu :");
            System.out.println("1.Ngoride");
            System.out.println("2.Ngofood");
            System.out.println("3.Ngosend");
            System.out.print("Masukkan pilihan : ");

        int pilih = input.nextInt();

        switch(pilih){
            case 1:
            System.out.println("Anda memilih menu ngoride silahkan pilih");
            System.out.println("1.Unram - Ampenan");
            System.out.println("2.Unram - Gomong");
            System.out.println("3.Unram - Kekalik");
            System.out.print("Masukkan pilihan : ");

        int pilih1=input.nextInt();
        
            switch(pilih1){
            case 1:
                ngoRide a =new ngoRide("Unram","Ampenan",2000,7);
                a.tampilngoRide();
                break;
            case 2:
                ngoRide b =new ngoRide("Unram","Gomong",2000,5);
                b.tampilngoRide();
                break;
            case 3:
                ngoRide c =new ngoRide("Unram","Kekalik",2000,3);
                c.tampilngoRide();
                break;
            }
            break;
                
            case 2:
                System.out.println("Anda memilih menu ngofoodd silahkan pilih");
                System.out.println("1.Bakso");
                System.out.println("2.Soto");
                System.out.println("3.Nasi campur");
                System.out.print("Masukkan pilihan : ");
            
            int pilih2=input.nextInt();
            
            switch(pilih2){
            case 1:
                ngofood a =new ngofood("bakso",10000);
                a.tampilngofood();
                break;

            case 2:
                ngofood b =new ngofood("soto",12000);
                b.tampilngofood();
                break;
            case 3:
                ngofood c =new ngofood("Nasi campur",7000);
                c.tampilngofood();
                break;
            }

            case 3:
                System.out.println("Anda memilih menu ngoride silahkan pilih");
                System.out.println("1.Barang kain");
                System.out.println("2.Barang kaca");
                System.out.println("3.Barang plastik");
                System.out.print("Masukkan pilihan : ");

            int pilih3=input.nextInt();
            switch(pilih3){
            case 1:
                ngosend a =new ngosend("Barang kain",5.5,1.28);
                a.tampilngosend();
                break;
            case 2:
                ngosend b =new ngosend("Barang kaca",5.5,2);
                b.tampilngosend();
                break;
            case 3:
                ngosend c =new ngosend("Barang plastik",5.5,3.5);
                c.tampilngosend();
                break;
            }
        }
       } else {
            System.out.println("login anda salah");
        }
    }   
}


