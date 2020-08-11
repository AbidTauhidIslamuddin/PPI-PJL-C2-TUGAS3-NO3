/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laseva;

/**
 *
 * @author Night's Watch
 */
public class ngosend extends superClass{
    
    ngosend (String nama1,double jarak1,double berat1){
       this.nama = nama1;
       this.jaraks = jarak1;
       this.berat= berat1;
       biayajb=(berat*2000)+(jarak*1000)+2000;
    }
    
    void tampilngosend (){
       System.out.println("Nama barang   : "+nama);
       System.out.println("Berat barang  : "+berat+" kg");
       System.out.println("Jarak kirim   : "+jarak+" km");
       System.out.println("Biaya order   : "+biayajb);
   }
}
