/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;
/**
 *
 * @author Gael
 */
public class TestConexion {
    public static void main(String[] args) {
        System.out.println("holaa");
        Base base = new Base();
        base.conectar();
        System.out.println("Conexión exitosa");
        
            
    }
}
