/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    private Statement statement;
    private Connection connection;
    private String jdbc;
    private String ruta;
    private String usuario;
    private String contra;
    
    public Conexion(){
        this.connection = null;
        this.statement = null;
        this.jdbc = "com.mysql.jdbc.Driver";
        this.ruta = "jdbc:mysql://bcxxgydbthwkoujfqyny-mysql.services.clever-cloud.com:3306/bcxxgydbthwkoujfqyny";
        this.usuario = "ubg0alc0y2negpie";
        this.contra = "fTDY9B5DKF6ZR3CT622J";
    }
    
    private void abrirConexion(){
        try{
            Class.forName(this.jdbc);
            this.connection = DriverManager.getConnection(this.ruta, this.usuario, this.contra);
            // Crear Statement con ResultSet que permite desplazamiento
            this.statement = this.connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public String ejecutar(String sentencia){
        try{
            this.abrirConexion();
            this.statement.executeUpdate(sentencia);
            return "Op Exitosa";
        }catch(SQLException e){
            return e.toString();
        }
    }
    
    public ResultSet consultar(String sentencia){
        ResultSet resultado = null;
        try{
            this.abrirConexion();
            resultado = statement.executeQuery(sentencia);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return resultado;
    }
    
    // No olvidar cerrar la conexión
    public void cerrarConexion() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
