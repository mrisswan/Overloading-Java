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
public class AnakKedua {
    
    int LuasPermukaan(int sisi){//method dengan parameter
        int LuasPermukaan = 6 * sisi * sisi;//rumus
        System.out.println("Luas Permukaan Kubus\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
    int LuasPermukaan(int p, int l, int t){//method dengan parameter
        int LuasPermukaan = 2*(p*l + p*t + l*t);//rumus
        System.out.println("Luas Permukaan Balok\t: " + LuasPermukaan+" cm2");
        return LuasPermukaan;
    }
}
