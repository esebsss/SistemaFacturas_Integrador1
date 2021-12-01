package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instance = null;

    private static Connection con = null;

    private static final String URL = "jdbc:mysql://localhost/bdabarrotes";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USR = "root";
    private static final String PSW = "";

    private Conexion() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USR, PSW);
            System.out.println("conexion ok");
        } catch (ClassNotFoundException ex) {
            System.out.println("No hay Driver!!");
        } catch (SQLException ex) {
            System.out.println("Error con la BD");
        }
    }

    public synchronized static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }

        return instance;
    }

    public Connection getCon() {
        return con;
    }

    public void close() {
        instance = null;
    }
}
