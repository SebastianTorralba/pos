/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.coder.pos.controladores;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public interface IControlador<T> {
       public boolean agregar(T entidad);
       public boolean modificar(T entidad);
       public boolean eliminar(T entidad);
       public T extraer(Object id);
       public ArrayList extraerTodo();
       public ArrayList extraerTodoSinDetalle();
}
