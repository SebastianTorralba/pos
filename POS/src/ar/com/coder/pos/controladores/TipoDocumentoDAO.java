/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.pos.controladores;

import ar.com.coder.pos.objetos.TipoDocumento;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author NYHKO
 */
public class TipoDocumentoDAO extends BaseControlador implements IControlador<TipoDocumento>{

    public TipoDocumentoDAO(Connection conexion) {
        super(conexion);
    }

    @Override
    public boolean agregar(TipoDocumento entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificar(TipoDocumento entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(TipoDocumento entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TipoDocumento extraer(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList extraerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList extraerTodoSinDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
