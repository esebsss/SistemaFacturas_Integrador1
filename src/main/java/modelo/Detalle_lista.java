
package modelo;
import java.util.*;


public class Detalle_lista {
    
    private ArrayList<Detalle> ob=new ArrayList();
    
    public Detalle_lista(){
    }
    
    public void adiciona(Detalle d){
        ob.add(d);
    }
    
     public void borra(int d){
        ob.remove(d);
    }
     
    public ArrayList<Detalle>listado(){
        return ob;
    }

}
