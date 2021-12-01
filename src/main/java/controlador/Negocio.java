package controlador;

import java.sql.*;
import util.Conexion;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;

public class Negocio {

    private static PreparedStatement st;
    private static ResultSet rs;
    private static CallableStatement cs;
    private static CallableStatement cs2;
    private static Conexion con;

    public Negocio(){
        con = Conexion.getInstance();
    }

//pasando un codigo de Cliente que devuelva si lo encontro o no
    public Cliente Busca(String id) {
        Cliente a = null;
        String sql = "SELECT cli_nom, cli_dir, cli_tel, cli_cor from Clientes where cli_cod=?";
        try {
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                a = new Cliente();
                a.setCli_nom(rs.getString(1));
                a.setCli_dire(rs.getString(2));
                a.setCli_telefono(rs.getString(3));
                a.setCli_cor(rs.getString(4));
                a.setCli_cod(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }

        return a;

    }

    //pasando un codigo de factura que devuelva articulo
    public List<Factura> ListDetaFac(String id) {
        List<Factura> lista = new ArrayList();

        try {
            String sql = "SELECT articulos.art_cod, articulos.art_nom, articulos.art_pre, fac_deta.art_can FROM articulos INNER JOIN fac_deta on articulos.art_cod=fac_deta.art_cod WHERE fac_deta.fac_num=?";
            st = con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            st.setString(1, id);
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Factura f = new Factura();
                f.setArt_cod(rs.getString(1));
                f.setArt_nom(rs.getString(2));
                f.setArt_pre(rs.getDouble(3));
                f.setArt_can(rs.getInt(4));
                lista.add(f);

            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    //pasando un codigo de factura que devuelva si lo encontro o no
    public Factura BuscaFac(String id) {
        Factura a = null;

        String sql = "SELECT fac_num from fac_deta where fac_num=?";
        try {
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                a = new Factura();
                a.setFac_num(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }

        return a;

    }

    //pasando un codigo de cliente que devuelva una factura
    public List<Cliente> ListDetClie(String id) {
        List<Cliente> lista = new ArrayList();

        try {
            // String sql="SELECT fac_cabe.fac_num, fac_cabe.fac_fec, fac_cabe.fac_igv FROM fac_cabe INNER JOIN clientes on fac_cabe.cli_cod=clientes.cli_cod WHERE fac_cabe.cli_cod=?";
            String sql = "SELECT fac_cabe.fac_num,fac_cabe.fac_fec,fac_cabe.fac_igv, articulos.art_pre, fac_deta.art_can FROM articulos INNER JOIN fac_deta on articulos.art_cod=fac_deta.art_cod INNER JOIN fac_cabe on fac_deta.fac_num=fac_cabe.fac_num WHERE fac_cabe.cli_cod=?";
            st = con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            st.setString(1, id);
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Cliente c = new Cliente();
                c.setFac_num(rs.getString(1));
                c.setFecha(rs.getString(2));
                c.setIgv(rs.getString(3));
                c.setArt_pre(rs.getDouble(4));
                c.setArt_can(rs.getInt(5));

                lista.add(c);

            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    //pasando un codigo de factura que devuelva si lo encontro o no
    public Cliente BuscaClie(String id) {
        Cliente a = null;

        String sql = "SELECT cli_nom from clientes where cli_cod=?";
        try {
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                a = new Cliente();
                a.setCli_nom(rs.getString(1));
                a.setFac_num(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }

        return a;

    }

    //filtrado por nombre
    public List<Cliente> filtraCliente(String id) {
        List<Cliente> lista = new ArrayList();

        try {
            String sql = "SELECT cli_cod, cli_nom, cli_cor FROM clientes WHERE cli_nom like ?";
            st = con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            st.setString(1, id + "%");
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Cliente cf = new Cliente();
                cf.setCli_cod(rs.getString(1));
                cf.setCli_nom(rs.getString(2));
                cf.setCli_cor(rs.getString(3));

                lista.add(cf);
            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    //Lista de clientes
    public List<Cliente> ListaCliente() {
        List<Cliente> lista = new ArrayList();

        try {
            String sql = "SELECT * from clientes";
            st = con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Cliente c = new Cliente();
                c.setCli_cod(rs.getString(1));
                c.setCli_nom(rs.getString(2));
                c.setCli_telefono(rs.getString(3));
                c.setCli_cor(rs.getString(4));
                c.setCli_dire(rs.getString(5));

                lista.add(c);

            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    //Lista de Facturas
    public List<Cliente> ListaFactura(String id) {
        List<Cliente> lista = new ArrayList();

        try {
            String sql = "SELECT * FROM fac_cabe WHERE fac_cabe.cli_cod=?";
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            //cuando se ejecute los datos de la tabla a memoria
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Cliente c = new Cliente();
                c.setFac_num(rs.getString(1));
                c.setFecha(rs.getString(2));
                c.setCli_cod(rs.getString(3));
                c.setIgv(rs.getString(4));
                c.setVen_cod(rs.getInt(5));
                lista.add(c);

            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    public Cliente BuscaConFac(String id) {
        Cliente a = null;

        String sql = "SELECT fac_cabe.fac_fec, fac_cabe.fac_igv, fac_cabe.fac_num, clientes.cli_nom from fac_cabe INNER JOIN clientes on fac_cabe.cli_cod=clientes.cli_cod where fac_num=?";
        try {
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                a = new Cliente();
                a.setFecha(rs.getString(1));
                a.setIgv(rs.getString(2));
                a.setCli_nom(rs.getString(4));
                a.setFac_num(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }

        return a;

    }

    public List<Cliente> spinner(String id) {
        List<Cliente> lista = new ArrayList();

        try {
            String sql = "SELECT articulos.art_cod, articulos.art_nom, fac_deta.art_can, fac_cabe.fac_fec FROM articulos INNER JOIN fac_deta on articulos.art_cod=fac_deta.art_cod INNER JOIN fac_cabe on fac_deta.fac_num=fac_cabe.fac_num WHERE fac_cabe.fac_fec LIKE ?";
            st = con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            st.setString(1, id + "%");
            rs = st.executeQuery();
            while (rs.next()) {//leer fila por fila
                Cliente cf = new Cliente();
                cf.setArt_cod(rs.getString(1));
                cf.setArt_nom(rs.getString(2));
                cf.setArt_can(rs.getInt(3));

                lista.add(cf);
            }
        } catch (Exception ex) {
            ex.printStackTrace();//mostrar el error
        } finally {
            close();
        }
        return lista;
    }

    //DESDE AQUI ME MANDO BRESCIA
    //AÑADIR LA NUEVA FACTURA
    public String adicion(String codc, String igv, int codv, List<Detalle> lista) {
        String fac = "";

        try {
            String sql = "{call adicionc(?,?,?)}";
            cs = con.getCon().prepareCall(sql);
            cs.setString(1, codc);
            cs.setString(2, igv);
            cs.setInt(3, codv);
            rs = cs.executeQuery();
            rs.next();
            fac = rs.getString(1);
            sql = "{call adiciond(?,?,?)}";
            cs2 = con.getCon().prepareCall(sql);
            for (Detalle x : lista) {
                cs2.setString(1, fac);
                cs2.setString(2, x.getCoda());
                cs2.setInt(3, x.getCanta());
                cs2.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return fac;
    }

    //GENERA LA NUEVA FACTURA
    public String numfac() {
        String num = "";

        try {
            String sql = "select concat('F', lpad(right(max(fac_num),4)+1,4,'0')) from fac_cabe";
            st = con.getCon().prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                num = rs.getString(1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return num;
    }

    //LISTA DE VENDEDOR
    public List<Vendedor> lisVen() {
        List<Vendedor> lista = new ArrayList();

        try {
            String sql = "select Ven_cod, Ven_nom from vendedor";
            st = con.getCon().prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Vendedor v = new Vendedor();
                v.setCodv(rs.getInt(1));
                v.setNomv(rs.getString(2));
                lista.add(v);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    //LISTA CLIENTE
    public List<Cliente> lisCli() {
        List<Cliente> lista = new ArrayList();

        try {
            String sql = "select * from clientes";
            st = con.getCon().prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setCli_cod(rs.getString(1));
                c.setCli_nom(rs.getString(2));
                c.setCli_telefono(rs.getString(3));
                c.setCli_cor(rs.getString(4));
                c.setCli_dire(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return lista;

    }

    //LISTA ARTICULOS
    public List<Articulo> lisArt() {
        List<Articulo> lista = new ArrayList();

        try {
            String sql = "select * from articulos";
            st = con.getCon().prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Articulo ac = new Articulo();
                ac.setArt_cod(rs.getString(1));
                ac.setArt_nom(rs.getString(2));
                ac.setArt_uni(rs.getString(3));
                ac.setArt_pre(rs.getDouble(4));
                ac.setArt_stock(rs.getInt(5));
                lista.add(ac);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    //BUSCA VENDEDOR
    public Vendedor Busven(int id) {
        Vendedor v = null;

        try {
            String sql = "select ven_nom from vendedor where ven_cod=?";
            st = con.getCon().prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                v = new Vendedor();
                v.setNomv(rs.getString(1));
                v.setCodv(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return v;
    }

    //BUSCA ARTICULO
    public Articulo Busart(String id) {
        Articulo a = null;

        try {
            String sql = "select art_nom, art_pre, art_stk from "
                    + "articulos where art_cod=?";
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                a = new Articulo();
                a.setArt_nom(rs.getString(1));
                a.setArt_pre(rs.getDouble(2));
                a.setArt_stock(rs.getInt(3));
                a.setArt_cod(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return a;
    }

    //BORRA LA FACTURA 
    public void borrafc(String id) {
        try {
            String sql = "{call anulac(?)}";
            cs = con.getCon().prepareCall(sql);
            cs.setString(1, id);
            cs.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            close();
        }
    }

    public void borrafd(String id) {
        try {
            String sql = "{call anulad(?)}";
            cs = con.getCon().prepareCall(sql);
            cs.setString(1, id);
            cs.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            close();
        }
    }

    public Factura Detalles(String id) {
        Factura f = null;

        try {
            String sql = "select fac_fec, cli_cod, fac_igv, ven_cod"
                    + " from fac_cabe where fac_num=?";
            st = con.getCon().prepareStatement(sql);
            st.setString(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                f = new Factura();
                f.setFecha(rs.getString(1));
                f.setCli_cod(rs.getString(2));
                f.setIgv(rs.getString(3));
                f.setVen_cod(rs.getInt(4));
                f.setFac_num(id);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            close();
        }
        return f;
    }
    
//REGISTRO DE USUARIOS
    public boolean registrar(Usuarios usr){
        String sql="insert into usuario(usuario,email,contraseña) values(?,?,?)";

        try {
             st = con.getCon().prepareStatement(sql);
             st.setString(1,usr.getUsuario());
             st.setString(2,usr.getEmail());
             st.setString(3,usr.getContraseña());
             st.execute();
        return true;             
        }catch (SQLException ex) {
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //LOGIN DE USUARIOS
    public boolean login(Usuarios usr){
        st=null;
        rs=null;
        String sql="select id_usuario,usuario,email,contraseña from usuario where usuario = ?";
        try{
            st=con.getCon().prepareStatement(sql);
            st.setString(1,usr.getUsuario());
            rs=st.executeQuery();
            if(rs.next()){
                if(usr.getContraseña().equals(rs.getString(4))){
                    usr.setId(rs.getInt(1));
                    usr.setUsuario(rs.getString(2));
                    return true;
                }else{
                    return false;
                }
                
            }
            return false;
        }catch(SQLException ex){
            Logger.getLogger(Negocio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    //FILTRADO POR NOMBRE DEL PRODUCTO
     
    public List<Articulo> filtraArticulo(String id){
        List<Articulo> lista=new ArrayList();
        
        try{
            String sql="SELECT art_cod, art_nom, art_pre, art_stk FROM articulos WHERE art_nom LIKE ?";
            st=con.getCon().prepareStatement(sql);
            //cuando se ejecute los datos de la tabla a memoria
            st.setString(1, id+"%");
            rs=st.executeQuery();
            while(rs.next()){//leer fila por fila
                Articulo ar =new Cliente();
                ar.setArt_cod(rs.getString(1));
                ar.setArt_nom(rs.getString(2));
                ar.setArt_pre(rs.getDouble(3));
                ar.setArt_stock(rs.getInt(4));
                   
                lista.add(ar);
              }
          }catch(Exception ex){
              ex.printStackTrace();//mostrar el error
          }
          return lista;
      }
    
    public List<Ventas> lisven(int an){
        List<Ventas> lista=new ArrayList();

          try{
              String sql= "{call spanio(?)}";
              cs=con.getCon().prepareCall(sql);
              cs.setInt(1, an);
              rs=cs.executeQuery();
              while(rs.next()){
                  Ventas v=new Ventas();
                  v.setMes(rs.getInt(1));
                  v.setCantidad(rs.getInt(2));
                  v.setTotal(rs.getDouble(3));
                  lista.add(v);
              }
          }catch(Exception ex){
              ex.printStackTrace();
          }
        return lista;
    }    

    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
            if (cs != null) {
                cs.close();
            }
            if (cs2 != null) {
                cs2.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar");
        }
    }
}
