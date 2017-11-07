package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Item.java
 * Author:  Sebastian
 * Purpose: Defines the Class Item
 ***********************************************************************/

import java.util.*;

/** @pdOid f705822c-31c6-41e9-a56f-d84d85ee0276 */
public class Item {
   /** @pdOid f043d88f-26fd-4d4d-b3ac-7fe04e6c1de5 */
   public double cantidad;
   /** @pdOid 5ac9a627-ec2f-4741-aadf-8b286ebe7561 */
   public float montoBruto;
   /** @pdOid f08a2d6c-5be2-4136-bde9-1321c7bd612f */
   public float montoImpuestos;
   /** @pdOid 22a2d5bd-960c-401f-9c7a-c2dbf5ebee93 */
   public float montoDescuentos;
   /** @pdOid f056e577-6a90-4a4a-bc5a-183d53e96eb8 */
   public float montoNeto;
   /** @pdOid 37895155-3fe5-4dbb-a834-ccfd5c84ae55 */
   public java.lang.String lote;
   /** @pdOid d173c944-4d31-4e21-b086-3bdb64d4fd91 */
   public java.util.Date fechaVencimiento;
   /** @pdOid a93758ea-7553-4594-aff9-b72fd34f407b */
   public java.util.Date fechaRegistro;
   /** @pdOid f79844d5-3580-4417-8653-fcd3b35b49fb */
   public java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=RegistroCaja assc=registroEnCajaDeLosItems coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<RegistroCaja> registroCaja;
   /** @pdRoleInfo migr=no name=Documento assc=itemsDelDocumento mult=1..1 side=A */
   public Documento documento;
   /** @pdRoleInfo migr=no name=Articulo assc=itemsDeLosArticulos mult=1..1 side=A */
   public Articulo articulo;
   /** @pdRoleInfo migr=no name=UnidadMedida assc=medidasDeLosItems mult=0..1 side=A */
   public UnidadMedida unidadMedida;
   
   /** @pdOid 0226d39e-8d74-4482-bc9f-38ed64aa9791 */
   public double getCantidad() {
      return cantidad;
   }
   
   /** @param newCantidad
    * @pdOid ec18e67c-a64a-4e20-b321-968371a031e4 */
   public void setCantidad(double newCantidad) {
      cantidad = newCantidad;
   }
   
   /** @pdOid 79cf5a0c-ec79-4e9b-8657-903a23bcb322 */
   public float getMontoBruto() {
      return montoBruto;
   }
   
   /** @param newMontoBruto
    * @pdOid 1e09f467-aa6a-49bf-b284-5614230f18ef */
   public void setMontoBruto(float newMontoBruto) {
      montoBruto = newMontoBruto;
   }
   
   /** @pdOid ac144b8d-0959-41cb-83a8-ab4482157dbc */
   public float getMontoImpuestos() {
      return montoImpuestos;
   }
   
   /** @param newMontoImpuestos
    * @pdOid e09881d1-4117-4c8d-8bab-fa250b82e8e9 */
   public void setMontoImpuestos(float newMontoImpuestos) {
      montoImpuestos = newMontoImpuestos;
   }
   
   /** @pdOid 0994c56a-0070-4d84-993f-8f1e16520f2f */
   public float getMontoDescuentos() {
      return montoDescuentos;
   }
   
   /** @param newMontoDescuentos
    * @pdOid 56d0f341-b30b-47a7-81d4-c8032980a6c4 */
   public void setMontoDescuentos(float newMontoDescuentos) {
      montoDescuentos = newMontoDescuentos;
   }
   
   /** @pdOid bff23d26-3565-4204-92e0-0cd80380a0d3 */
   public float getMontoNeto() {
      return montoNeto;
   }
   
   /** @param newMontoNeto
    * @pdOid ea157672-21f0-457d-839c-042ae2e58a61 */
   public void setMontoNeto(float newMontoNeto) {
      montoNeto = newMontoNeto;
   }
   
   /** @pdOid 2c98f019-edc0-43ce-8b79-078341afdc90 */
   public java.lang.String getLote() {
      return lote;
   }
   
   /** @param newLote
    * @pdOid 65321915-5dd8-4ac2-a042-009ad6cf8673 */
   public void setLote(java.lang.String newLote) {
      lote = newLote;
   }
   
   /** @pdOid 53306f61-d510-4039-95bb-a46afc1f1c49 */
   public java.util.Date getFechaVencimiento() {
      return fechaVencimiento;
   }
   
   /** @param newFechaVencimiento
    * @pdOid 21a4d69c-bbd1-4533-9ab4-3b6cd1e1ffca */
   public void setFechaVencimiento(java.util.Date newFechaVencimiento) {
      fechaVencimiento = newFechaVencimiento;
   }
   
   /** @pdOid 72c2e377-fd4b-49b7-bf5c-7c286cde8c9f */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 276c848e-9d25-46d2-ab7f-6c7c06d1eb43 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid ad657b0c-7911-47fe-8b09-66fca21bc43e */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 8b928e1d-241b-428a-90ec-cdd5fc8283ef */
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
         newRegistroCaja.setItem(this);      
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
            oldRegistroCaja.setItem((Item)null);
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
            oldRegistroCaja.setItem((Item)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public Documento getDocumento() {
      return documento;
   }
   
   /** @pdGenerated default parent setter
     * @param newDocumento */
   public void setDocumento(Documento newDocumento) {
      if (this.documento == null || !this.documento.equals(newDocumento))
      {
         if (this.documento != null)
         {
            Documento oldDocumento = this.documento;
            this.documento = null;
            oldDocumento.removeItem(this);
         }
         if (newDocumento != null)
         {
            this.documento = newDocumento;
            this.documento.addItem(this);
         }
      }
   }

}