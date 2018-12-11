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
public class LeteciTanjir implements Prostor {

    private double poluprecnik;
    private String materijal;
    private int kapacitetPosade;
    
    public LeteciTanjir(double poluprecnik, String materijal, int kapacitet){
        this.poluprecnik = poluprecnik;
        this.materijal = materijal;
        this.kapacitetPosade = kapacitet;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public String getMaterijal() {
        return materijal;
    }

    public void setMaterijal(String materijal) {
        this.materijal = materijal;
    }

    public int getKapacitetPosade() {
        return kapacitetPosade;
    }

    public void setKapacitetPosade(int kapacitetPosade) {
        this.kapacitetPosade = kapacitetPosade;
    }
    
    
    @Override
    public double izracunajPovrsinu() {
        return Math.pow(this.poluprecnik, 2.0) * Math.PI;
    }
    
}
