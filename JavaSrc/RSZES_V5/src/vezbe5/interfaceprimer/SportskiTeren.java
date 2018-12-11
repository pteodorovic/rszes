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
public class SportskiTeren implements Prostor {
    private double sirina;
    private double duzina;
    private String podloga;
    
    public SportskiTeren(double sirina, double duzina, String podloga){
        this.sirina = sirina;
        this.duzina = duzina;
        this.podloga = podloga;
    }

    public String getPodloga() {
        return podloga;
    }

    public void setPodloga(String podloga) {
        this.podloga = podloga;
    }

    public double getSirina() {
        return sirina;
    }

    public void setSirina(double sirina) {
        this.sirina = sirina;
    }

    public double getDuzina() {
        return duzina;
    }

    public void setDuzina(double duzina) {
        this.duzina = duzina;
    }

    @Override
    public double izracunajPovrsinu() {
        return this.sirina * this.duzina;
    }
    
}
