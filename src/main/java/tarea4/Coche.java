/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author Usuario
 */
public class Coche {
    
    private int puertas;
    private int ruedas;
    private int plazas;

    public Coche(int puertas, int ruedas, int plazas) {
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.plazas = plazas;
    }

    public Coche() {
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Coche{" + "puertas=" + puertas + ", ruedas=" + ruedas + ", plazas=" + plazas + '}';
    }
}
