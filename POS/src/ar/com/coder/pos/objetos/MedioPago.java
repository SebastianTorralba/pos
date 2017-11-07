package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  MedioPago.java
 * Author:  Sebastian
 * Purpose: Defines the Class MedioPago
 ***********************************************************************/

import java.util.*;

/** @pdOid dc083321-ee1a-4219-aded-db8ff2a556b1 */
public class MedioPago {
   /** @pdOid 77457862-1786-4d2c-81be-d3a6cf2fb9ac */
   private java.lang.String codigo;
   /** @pdOid 0f9139f1-ca05-4f52-8ce1-4ade0a6c9ba4 */
   private java.lang.String nombre;
   /** @pdOid 62b7c4b4-fe7b-4530-a63c-3175bdaf2b49 */
   private java.util.Date fechaRegistro;
   /** @pdOid d25d4f7e-5d97-4dc1-a03c-8c9e395d89c4 */
   private java.lang.String usuario;
   
   /** @pdOid 5a24783f-1499-4840-8d4f-04c661b40ffe */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 58fa6744-6da3-452f-9e2e-8be6ea1dbf05 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 39d50b1a-4f46-4798-bbc5-569479321551 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 68dadc41-3110-4ac1-a3a9-5b30a4a0d515 */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid fbbf2894-7a04-41cb-acf2-c8642edc51e1 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 375606c0-c576-4661-91fb-72b05e922ca0 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 6f1ed737-b956-4a04-b861-e97b0af278ce */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 4a79ddd4-4f3c-40f1-a8ee-2c58e89684c8 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}