package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Usuario.java
 * Author:  Sebastian
 * Purpose: Defines the Class Usuario
 ***********************************************************************/

import java.util.*;

/** @pdOid 5b5d68c8-18f6-4d96-84b1-d1d8cdddf2e9 */
public class Usuario {
   /** @pdOid 55952bc2-1743-4724-a12a-b044c3eac382 */
   private java.lang.String usuario;
   /** @pdOid ecd2447c-5ab6-4a41-a67e-ebaef3b9aeb6 */
   private java.lang.String apellidonombre;
   /** @pdOid 06e83849-7276-4b47-ae45-d6fdbb893b53 */
   private java.lang.String clave;
   /** @pdOid d7d5bd4d-4ae4-411d-ac7c-f1d6a609e1ff */
   private java.lang.String perfil;
   /** @pdOid 0a632c03-5f02-40fc-b87e-0f0fbbaf6216 */
   private java.lang.String claveSupervisor;
   /** @pdOid 6fdd08a3-17dc-409b-810a-fbc7db37f005 */
   private java.util.Date fechaRegistro;
   /** @pdOid 4bc4a3c9-c2cf-4062-99c6-8e60d24b6a28 */
   private java.lang.String usuarioRegistro;
   
   /** @pdOid ae9a780c-d0fe-45bd-a280-1055b71f22ea */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 53d54d3a-07b1-4a36-81ce-129ac78830d5 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   /** @pdOid 6ffeaf45-53af-4215-a327-600da2647c49 */
   public java.lang.String getApellidonombre() {
      return apellidonombre;
   }
   
   /** @param newApellidonombre
    * @pdOid ed82637c-9707-453b-aafa-5611971036c0 */
   public void setApellidonombre(java.lang.String newApellidonombre) {
      apellidonombre = newApellidonombre;
   }
   
   /** @pdOid 85ce8a03-9920-47fd-8514-c7c6904d635d */
   public java.lang.String getClave() {
      return clave;
   }
   
   /** @param newClave
    * @pdOid ae967d7b-b03d-47b6-b7d4-d61492367058 */
   public void setClave(java.lang.String newClave) {
      clave = newClave;
   }
   
   /** @pdOid 071efde1-188e-4aae-bd8b-01ac980aae99 */
   public java.lang.String getPerfil() {
      return perfil;
   }
   
   /** @param newPerfil
    * @pdOid a3c27d05-e5e8-4f8f-82f4-2e53dcbacd28 */
   public void setPerfil(java.lang.String newPerfil) {
      perfil = newPerfil;
   }
   
   /** @pdOid 8e522bb3-72e4-41f2-b7bd-aa931ac8eb98 */
   public java.lang.String getClaveSupervisor() {
      return claveSupervisor;
   }
   
   /** @param newClaveSupervisor
    * @pdOid 6ea9c87f-dfe3-4db4-95b8-201987e44064 */
   public void setClaveSupervisor(java.lang.String newClaveSupervisor) {
      claveSupervisor = newClaveSupervisor;
   }
   
   /** @pdOid ba194292-8418-4218-8c3a-96e86f8b1527 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 19a65153-df12-41e1-9225-8232628eaf30 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid f7918ec7-e2dd-4b42-b103-c9429f58f4af */
   public java.lang.String getUsuarioRegistro() {
      return usuarioRegistro;
   }
   
   /** @param newUsuarioRegistro
    * @pdOid 9954f94c-687e-4cb1-863b-f19141e51dc6 */
   public void setUsuarioRegistro(java.lang.String newUsuarioRegistro) {
      usuarioRegistro = newUsuarioRegistro;
   }

}