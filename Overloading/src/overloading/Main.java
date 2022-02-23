/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Induk utama = new Induk();//membuat objek
        utama.Volume();//pemanggilan method Volume pada class induk
        utama.LuasPermukaan();//pemanggilan method LuasPermukaan pada class induk
        
        AnakPertama satu = new AnakPertama();//membuat objek
        AnakKedua dua = new AnakKedua();//membuat objek
        
        satu.Volume(20);//pemanggilan method Volume pada class AnakPertama
        dua.LuasPermukaan(20);//pemanggilan method LuasPermukaan pada class AnakPertama
        
        satu.Volume(15, 10, 20);//pemanggilan method Volume pada class AnakKedua
        dua.LuasPermukaan(15, 10, 20);//pemanggilan method LuasPermukaan pada class AnakKedua
    }
    
}
