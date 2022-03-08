/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuestasapp;

import ico.fes.bd.UsuarioDAO;
import ico.fes.dp.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author unam
 */
public class EncuestasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UsuarioDAO udao= new UsuarioDAO();
        try {
            System.out.println("Creada?:" + udao.createTable("na") );
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        Usuario userIU=new Usuario(0, "JEsus", "HC", "jesus", "dios1234");
        try {
            udao.insert(userIU);
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        
        System.out.println("Login? "+udao.login("root", "toor"));
        System.out.println("Login? "+udao.login("jesus", "dios1234"));
        
    }
    
}
