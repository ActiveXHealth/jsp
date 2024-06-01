/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package logicaActivex.clasesLogica.clasesObjetivosLogic;

import java.sql.ResultSet;
import java.sql.SQLException;

import conexionBD.Conexion;
import conexionBD.clasesDAO.clasesObjetivosDAO.*;

public class Record {
    private int idRecord;
    private int idUsuario;
    private String tipoRecord;
    private float valor;
    private String fechaRecord;

    public Record() {
    }

    public Record(int idRecord) {
        this.idRecord = idRecord;
    }

    public Record(int idRecord, int idUsuario, String tipoRecord, float valor, String fechaRecord) {
        this.idRecord = idRecord;
        this.idUsuario = idUsuario;
        this.tipoRecord = tipoRecord;
        this.valor = valor;
        this.fechaRecord = fechaRecord;
    }

    public String insertar(){
        Conexion conexion = new Conexion();
        RecordDAO recordDAO = new RecordDAO(this.idRecord, this.idUsuario, this.tipoRecord, this.valor, this.fechaRecord);
        String resultado = conexion.ejecutar(recordDAO.insertar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String eliminar(){
        Conexion conexion = new Conexion();
        RecordDAO recordDAO = new RecordDAO(this.idRecord);
        String resultado = conexion.ejecutar(recordDAO.eliminar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public boolean consultar(){
        Conexion conexion = new Conexion();
        RecordDAO recordDAO = new RecordDAO(this.idRecord);
        ResultSet resultado = conexion.consultar(recordDAO.consultar());
        try{
            if(resultado.next()){
                this.idUsuario = resultado.getInt("idUsuario");
                this.tipoRecord = resultado.getString("tipoRecord");
                this.valor = resultado.getFloat("valor");
                this.fechaRecord = resultado.getString("fechaRecord");
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
        RecordDAO recordDAO = new RecordDAO(this.idRecord, this.idUsuario, this.tipoRecord, this.valor, this.fechaRecord);
        String resultado = conexion.ejecutar(recordDAO.actualizar());
        conexion.cerrarConexion();
        return resultado;
    }
    
    public String[][] buscar(String filtro){
        Conexion con = new Conexion();
        RecordDAO recordDAO = new RecordDAO();
        ResultSet resultado = con.consultar(recordDAO.buscar(filtro));
        String[][] datos = null;
        try{
            resultado.last();
            datos = new String[resultado.getRow()][5];
            resultado.beforeFirst();
            int i = 0;
            while(resultado.next()){
                datos[i][0] = resultado.getString("idRecord");
                datos[i][1] = resultado.getString("idUsuario");
                datos[i][2] = resultado.getString("tipoRecord");
                datos[i][3] = resultado.getString("valor");
                datos[i][4] = resultado.getString("fechaRecord");
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
