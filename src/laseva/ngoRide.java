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
public class ngoRide extends superClass{
    

    
    public ngoRide (String lokasi1,String tujuan1,int biaya1,int jarak1){
       this.lokasi = lokasi1;
       this.tujuan = tujuan1;
       this.biaya = biaya1;
       this.jarak =jarak1;
       total = (biaya*jarak)+ongkir;
    }

    void  tampilngoRide(){
       System.out.println("Lokasi anda    :"+lokasi);
       System.out.println("Lokasi tujuan  :"+tujuan);
       System.out.println("Biaya order    :"+total);
   }
}
