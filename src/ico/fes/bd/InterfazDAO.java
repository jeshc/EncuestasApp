/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ico.fes.bd;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author unam
 */
public interface InterfazDAO {

    public int insert(Object obj) throws SQLException;

    public int update(Object obj) throws SQLException;

    public int delete(Object obj) throws SQLException;
    
    public boolean createTable(String sql) throws SQLException;

    public ArrayList selectAll(Object obj) throws SQLException;

    public Object selectOneById(Object obj) throws SQLException;

    public Object selectOne(Object obj) throws SQLException;

}
