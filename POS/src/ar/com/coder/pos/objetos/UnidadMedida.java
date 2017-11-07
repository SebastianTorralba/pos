package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  UnidadMedida.java
 * Author:  Sebastian
 * Purpose: Defines the Class UnidadMedida
 ***********************************************************************/

import java.util.*;

/** @pdOid 6923a5ab-281d-4324-971c-1624c984e260 */
public class UnidadMedida {
   /** @pdOid a38eb39c-014d-47f3-8c93-8916ca0bb465 */
   private java.lang.String codigo;
   /** @pdOid 21fe57c5-dfa1-4b60-82b0-73713ddeb388 */
   private java.lang.String nombre;
   /** @pdOid 7e2616b0-ffad-4a98-abb2-1217ced24d24 */
   private java.util.Date fechaRegistro;
   /** @pdOid cd8e2e25-5812-4c60-aba1-9fc7f1c88ad7 */
   private java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=RegistroCaja assc=registroDeUnidades coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<RegistroCaja> registroCaja;
   
   /** @pdOid 2e4de558-c252-4e41-975a-2774eb8c07ee */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 7b8c3dac-1b73-48f0-b981-f780826111ff */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 2271552e-064f-4e91-8020-fcbe71a2b731 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 92c5571d-0126-4eeb-ad83-597f32df53ff */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 5e4c8c27-9521-421f-acdc-44c5db0154d7 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 0fbd5857-e81a-4161-8c6d-429047f2ff80 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 8a299f52-6d7d-4528-a05a-b78f8bf1d51e */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid cdcdd42e-b9c9-4a97-93a9-b42c975b24f9 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<RegistroCaja> getRegistroCaja() {
      if (registroCaja == null)
         registroCaja = new java.util.HashSet<RegistroCaja>();
      return registroCaja;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRegistroCaja() {
      if (registroCaja == null)
         registroCaja = new java.util.HashSet<RegistroCaja>();
      return registroCaja.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRegistroCaja */
   public void setRegistroCaja(java.util.Collection<RegistroCaja> newRegistroCaja) {
      removeAllRegistroCaja();
      for (java.util.Iterator iter = newRegistroCaja.iterator(); iter.hasNext();)
         addRegistroCaja((RegistroCaja)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRegistroCaja */
   public void addRegistroCaja(RegistroCaja newRegistroCaja) {
      if (newRegistroCaja == null)
         return;
      if (this.registroCaja == null)
         this.registroCaja = new java.util.HashSet<RegistroCaja>();
      if (!this.registroCaja.contains(newRegistroCaja))
      {
         this.registroCaja.add(newRegistroCaja);
         newRegistroCaja.setUnidadMedida(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRegistroCaja */
   public void removeRegistroCaja(RegistroCaja oldRegistroCaja) {
      if (oldRegistroCaja == null)
         return;
      if (this.registroCaja != null)
         if (this.registroCaja.contains(oldRegistroCaja))
         {
            this.registroCaja.remove(oldRegistroCaja);
            oldRegistroCaja.setUnidadMedida((UnidadMedida)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRegistroCaja() {
      if (registroCaja != null)
      {
         RegistroCaja oldRegistroCaja;
         for (java.util.Iterator iter = getIteratorRegistroCaja(); iter.hasNext();)
         {
            oldRegistroCaja = (RegistroCaja)iter.next();
            iter.remove();
            oldRegistroCaja.setUnidadMedida((UnidadMedida)null);
         }
      }
   }

}