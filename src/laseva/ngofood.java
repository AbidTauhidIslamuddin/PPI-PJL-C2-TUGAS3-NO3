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
public class ngofood extends superClass{
    
    ngofood(String nama1,int harga1){
      this.nama =nama1;
      this.harga=harga1;
      total=harga+ongkir;
    }

    void tampilngofood(){
        System.out.println("Anda memilih "+nama);
        System.out.println("Total order  : "+total);
    }
}
