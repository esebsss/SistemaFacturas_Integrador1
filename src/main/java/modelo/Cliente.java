
package modelo;


public class Cliente extends Factura{
    
    private String cli_cod;
    private String cli_nom;
    private String cli_dire;
    private String cli_telefono;
    private String cli_cor;
    
    public double monto1(){
        return getArt_can()*getArt_pre();
    }
  

    public String getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(String cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getCli_nom() {
        return cli_nom;
    }

    public void setCli_nom(String cli_nom) {
        this.cli_nom = cli_nom;
    }

    public String getCli_dire() {
        return cli_dire;
    }

    public void setCli_dire(String cli_dire) {
        this.cli_dire = cli_dire;
    }

    public String getCli_telefono() {
        return cli_telefono;
    }

    public void setCli_telefono(String cli_telefono) {
        this.cli_telefono = cli_telefono;
    }

    public String getCli_cor() {
        return cli_cor;
    }

    public void setCli_cor(String cli_cor) {
        this.cli_cor = cli_cor;
    }
    
    
    
    
}
