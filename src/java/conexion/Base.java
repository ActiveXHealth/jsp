/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Gael
 */
public class Base {
    
    private String usrBD;
    private String passBD;
    private String urlBD;
    private String driverClassName;
    private Connection conn = null;
    
    public Base(){
        //Agregar datos para conectarse
        this.usrBD = "ubg0alc0y2negpie";
        this.passBD = "fTDY9B5DKF6ZR3CT622J";
        this.urlBD = "jdbc:mysql://bcxxgydbthwkoujfqyny-mysql.services.clever-cloud.com:3306/bcxxgydbthwkoujfqyny?user=ubg0alc0y2negpie&password=fTDY9B5DKF6ZR3CT622J";
        this.driverClassName = "com.mysql.cj.jdbc.Driver";
    }
    
    //Métodos para establecer los valores de conexión a la BD

    public void setUsrBD(String usrBD) {
        this.usrBD = usrBD;
    }

    public void setPassBD(String passBD) {
        this.passBD = passBD;
    }

    public void setUrlBD(String urlBD) {
        this.urlBD = urlBD;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
    //Conexión a la BD
    public void conectar(){
        try {
            Class.forName(this.driverClassName).newInstance();
            this.conn = (Connection) DriverManager.getConnection(this.urlBD, this.usrBD, this.passBD);
        } catch (Exception err) {
            System.out.println("Error: "+err.getMessage());
        }
    }
    
    //Cerrar la conexión de BD
    public void cierraConexion() throws SQLException, IOException {
        this.conn.close();
    }
    
    //Métodos para ejecutar sentencias SQL
    public int insertar (String inserta) throws SQLException {
        Statement st = this.conn.createStatement();
        return st.executeUpdate(inserta);
    }
    
    public ResultSet consulta (String consulta) throws SQLException {
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery(consulta);
    }
}
