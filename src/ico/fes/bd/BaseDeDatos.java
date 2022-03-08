/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.bd;

import java.sql.*;

/**
 *
 * @author unam
 */
public class BaseDeDatos {

    String dbPath;
    Connection conexion;
    private static BaseDeDatos instanciaUnica;

    private BaseDeDatos() {
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/encuestas.db";
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }

    private BaseDeDatos(String dbPath, Connection conexion) {
        this.dbPath = dbPath;
        this.conexion = conexion;
        try {
            String url = "jdbc:sqlite:" + this.dbPath;
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static BaseDeDatos getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new BaseDeDatos(); // llamada al constructor
        }else{
            System.out.println("El ejemplar ya existe!");
        }
        return instanciaUnica;
    }

    public Connection getConexion() {
        //System.out.println("regresando conexion");
        return conexion;
    }

    
    
    
    public static void main(String[] args) {
        BaseDeDatos db=new BaseDeDatos();
    }
}
