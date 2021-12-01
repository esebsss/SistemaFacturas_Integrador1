/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Detalle extends Factura {
    
    
    private String coda;
    private String noma;
    private int canta;
    private double prea;

    public Detalle(String coda, String noma, int canta, double prea) {
        this.coda = coda;
        this.noma = noma;
        this.canta = canta;
        this.prea = prea;
    }
    
    public double total(){
        return(prea*canta);
    }
    public String getCoda() {
        return coda;
    }

    public void setCoda(String coda) {
        this.coda = coda;
    }

    public String getNoma() {
        return noma;
    }

    public void setNoma(String noma) {
        this.noma = noma;
    }

    public int getCanta() {
        return canta;
    }

    public void setCanta(int canta) {
        this.canta = canta;
    }

    public double getPrea() {
        return prea;
    }

    public void setPrea(double prea) {
        this.prea = prea;
    }
    
}


