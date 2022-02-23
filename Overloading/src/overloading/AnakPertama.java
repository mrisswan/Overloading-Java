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
public class AnakPertama {
    
    int Volume(int sisi){//method dengan parameter
        System.out.println("\nKubus");
        int volume = sisi * sisi * sisi;//rumus
        System.out.println("Volume Kubus\t\t: " + volume+" cm3");
        return volume;
    }

    int Volume(int p,int l, int t){//method dengan parameter
        System.out.println("\nBalok");
        int volume = p * l * t;//rumus
        System.out.println("Volume Balok\t\t: " + volume+" cm3");
        return volume;
    }
}
