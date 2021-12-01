
package modelo;


public class Articulo {
   
    private String art_cod;
    private String art_nom;
    private String art_uni;
    private double art_pre;
    private int art_stock;
    
    
    
    public String getArt_cod() {
        return art_cod;
    }

    public void setArt_cod(String art_cod) {
        this.art_cod = art_cod;
    }

    public String getArt_nom() {
        return art_nom;
    }

    public void setArt_nom(String art_nom) {
        this.art_nom = art_nom;
    }

    public double getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(double art_pre) {
        this.art_pre = art_pre;
    }

    public String getArt_uni() {
        return art_uni;
    }

    public void setArt_uni(String art_uni) {
        this.art_uni = art_uni;
    }

    public int getArt_stock() {
        return art_stock;
    }

    public void setArt_stock(int art_stock) {
        this.art_stock = art_stock;
    }
    
    
    
    
    
}
