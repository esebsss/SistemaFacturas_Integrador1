
package modelo;


public class Factura extends Articulo{
    
    private String fac_num;
    private int art_can;
    private String fecha;
    private String igv;
    private int ven_cod;
    private String cli_cod;
    
    
    
     public double monto(){
        return art_can*getArt_pre();
    }
     
    
     
    public String getFac_num() {
        return fac_num;
    }

    public void setFac_num(String fac_num) {
        this.fac_num = fac_num;
    }

    public int getArt_can() {
        return art_can;
    }

    public void setArt_can(int art_can) {
        this.art_can = art_can;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIgv() {
        return igv;
    }

    public void setIgv(String igv) {
        this.igv = igv;
    }

    public int getVen_cod() {
        return ven_cod;
    }

    public void setVen_cod(int ven_cod) {
        this.ven_cod = ven_cod;
    }

    public String getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(String cli_cod) {
        this.cli_cod = cli_cod;
    }
    
    
    
    
}
