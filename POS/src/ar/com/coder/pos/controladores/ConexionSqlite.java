/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.pos.controladores;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class ConexionSqlite {

    /**
     *
     */
    public static final String URL_DB="DB\\db_pos.db";
    private Connection conexionDB=null;
    public Connection conectarse(){
           try {
        Class.forName("org.sqlite.JDBC").newInstance();
            conexionDB = DriverManager.getConnection(URL_DB, "inet", "inet2017");
            return conexionDB;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSqlite.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No encuentra Driver");
        } catch (InstantiationException ex) {
            Logger.getLogger(ConexionSqlite.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No Instacia Driver");

        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConexionSqlite.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No tiene acceso Driver");

        } catch (SQLException ex) {
            Logger.getLogger(ConexionSqlite.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("No Me Conecte");
        }
        return null;

    }
}
