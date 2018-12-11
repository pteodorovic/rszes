/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezbe5.interfaceprimer;

/**
 *
 * @author Frobas administrator
 */
public class Main {
    public static void main(String[] str){
        Prostor fudbalskiTeren = new SportskiTeren(30, 100, "Trava");
        Prostor interGalaktickiTransporter = new LeteciTanjir(10,"Metal",30);
        System.out.println("Povrsina fudbalskog terena je " + fudbalskiTeren.izracunajPovrsinu()+ " m^2");
        System.out.println("Povrsina leteceg tanjira je " + interGalaktickiTransporter.izracunajPovrsinu()+ " m^2");
    }
}
