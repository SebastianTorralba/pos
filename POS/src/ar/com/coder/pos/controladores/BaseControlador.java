/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.pos.controladores;

import java.sql.Connection;

/**
 *
 * @author Sebastian
 */
public class BaseControlador {
    private Connection conexion;

    public Connection getConexion() {
        return conexion;
    }

    public BaseControlador(Connection conexion) {
        this.conexion = conexion;
    }
    
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
}
