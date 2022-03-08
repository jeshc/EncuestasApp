/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.bd;

import ico.fes.dp.Usuario;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author unam
 */
public class UsuarioDAO implements InterfazDAO{

    public UsuarioDAO() {
        BaseDeDatos.getInstance();
    }

    @Override
    public int insert(Object obj) throws SQLException {
       String sqlInsert ="INSERT INTO usuarios(nombre,apellidos,login,password) VALUES(?,?,?,?);";
       PreparedStatement pstm = BaseDeDatos.getInstance().getConexion().prepareStatement(sqlInsert);
       pstm.setString(1, ((Usuario)obj).getNombre());
       pstm.setString(2, ((Usuario)obj).getApellidos());
       pstm.setString(3, ((Usuario)obj).getLogin());
       pstm.setString(4, ((Usuario)obj).getPassword());
       
       return pstm.executeUpdate();
    }

    @Override
    public int update(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean createTable(String sql) throws SQLException {
        Statement stm=BaseDeDatos.getInstance().conexion.createStatement();
        String sqlCreate = "CREATE TABLE usuarios(id  INTEGER PRIMARY KEY AUTOINCREMENT,nombre varchar(30) ,apellidos varchar(60) ,login VARCHAR(12) ,password VARCHAR(50)  );";
        boolean res = stm.execute(sqlCreate);
        
        return !res;
       
    }

    @Override
    public ArrayList selectAll(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object selectOneById(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object selectOne(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
