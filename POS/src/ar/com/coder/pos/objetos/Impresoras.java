package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Impresoras.java
 * Author:  Sebastian
 * Purpose: Defines the Class Impresoras
 ***********************************************************************/

import java.util.*;

/** @pdOid 815787d5-e36b-4dbf-9eff-c41c94c15ad6 */
public class Impresoras {
   /** @pdOid 6e12f23b-e9c6-430f-8842-3e402541ca41 */
   private java.lang.String codigo;
   /** @pdOid bb65c779-32d4-45ee-b379-5079b84f8c5c */
   private java.lang.String nombre;
   /** @pdOid a66d39bc-33d2-473f-8bb3-49e426f04f52 */
   private java.util.Date fechaRegistro;
   /** @pdOid b126588b-12cb-4f9f-b382-d8c1a41c5c40 */
   private java.lang.String usuario;
   
   /** @pdOid 27b0b370-6bd4-4407-9d93-fab64bffbfc8 */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 644b4a84-bd49-478e-819e-c1622334d512 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid d37b9c04-ace5-4b7f-be73-52973ae6e303 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid b81f67da-edfc-430a-bf46-69f07aae01cb */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 928e6093-5136-477a-82bd-c220ab8ddd3b */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 60f35831-06a7-47b9-9185-9d978730b1c7 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 8d584bc9-356f-4c0b-8912-44afa5c57fd8 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 6eb46d47-7db0-4faa-a8c3-fbcc789a058e */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}