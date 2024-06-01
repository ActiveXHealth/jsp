/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesConfiguracionLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesConfiguracionDAO.PreferenciasDAO;

public class Preferencias {
    private int idPreferencias;
    private boolean iniciarSesionAutomaticamente;
    private boolean notificaciones;
    private String tema;

    public Preferencias() {
    }

    public Preferencias(int idPreferencias) {
        this.idPreferencias = idPreferencias;
    }

    public Preferencias(int idPreferencias, boolean iniciarSesionAutomaticamente, boolean notificaciones, String tema) {
        this.idPreferencias = idPreferencias;
        this.iniciarSesionAutomaticamente = iniciarSesionAutomaticamente;
        this.notificaciones = notificaciones;
        this.tema = tema;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        PreferenciasDAO preferenciasDAO = new PreferenciasDAO(this.idPreferencias, this.iniciarSesionAutomaticamente, this.notificaciones, this.tema);
        String resultado = conexion.ejecutar(preferenciasDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        PreferenciasDAO preferenciasDAO = new PreferenciasDAO(this.idPreferencias);
        String resultado = conexion.ejecutar(preferenciasDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        PreferenciasDAO preferenciasDAO = new PreferenciasDAO(this.idPreferencias);
        ResultSet resultado = conexion.consultar(preferenciasDAO.consultar());
        try{
            if(resultado.next()){
                this.iniciarSesionAutomaticamente = resultado.getBoolean("iniciarSesionAutomaticamente");
                this.notificaciones = resultado.getBoolean("notificaciones");
                this.tema = resultado.getString("tema");
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        } finally {
            conexion.cerrarConexion();
        }
    }
    
    public String actualizar(){
        Conexion conexion = new Conexion();
        PreferenciasDAO preferenciasDAO = new PreferenciasDAO(this.idPreferencias, this.iniciarSesionAutomaticamente, this.notificaciones, this.tema);
        String resultado = conexion.ejecutar(preferenciasDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        PreferenciasDAO preferenciasDAO = new PreferenciasDAO();
        ResultSet resultado = con.consultar(preferenciasDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][4];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idPreferencias");
                datos[i][1] = resultado.getString("iniciarSesionAutomaticamente");
                datos[i][2] = resultado.getString("notificaciones");
                datos[i][3] = resultado.getString("tema");
                i++;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        } finally {
            con.cerrarConexion();
        }
        return datos;
    }
}
