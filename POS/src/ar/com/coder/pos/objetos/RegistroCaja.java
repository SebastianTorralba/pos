package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  RegistroCaja.java
 * Author:  Sebastian
 * Purpose: Defines the Class RegistroCaja
 ***********************************************************************/

import java.util.*;

/** @pdOid 99a24b02-0832-492d-9f8c-80620b0ed9f6 */
public class RegistroCaja {
   /** @pdOid bc3c54d1-79be-4252-b170-15ae4c3b4c6d */
   public java.util.Date fecha;
   /** @pdOid 42d3ff8c-47eb-46d5-a72b-b75a5dc3ece3 */
   public double cantidad;
   /** @pdOid eac12c67-b933-4ff6-a1af-86cb4de727b2 */
   public float montoBruto;
   /** @pdOid 094850a5-cbca-4ba6-b80b-435d41306789 */
   public float montoImpuestos;
   /** @pdOid 771eece8-de53-437f-b22d-10dc479f397e */
   public float montoDescuentos;
   /** @pdOid 25c44340-80cb-4d95-8fc5-59a18c4b94e8 */
   public float montoNeto;
   /** @pdOid cedd6cb2-c12f-4f75-bdd4-5c01bb33800d */
   public int signo;
   /** @pdOid d46b010c-eb06-4bf6-a56e-b26cab791776 */
   public java.util.Date fechaRegistro;
   /** @pdOid 23b4cf5f-5cc8-49e2-9ba4-2a76f51d2edd */
   public java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=Item assc=registroEnCajaDeLosItems mult=1..1 side=A */
   public Item item;
   /** @pdRoleInfo migr=no name=Caja assc=registroDeLaCaja mult=0..1 side=A */
   public Caja caja;
   /** @pdRoleInfo migr=no name=UnidadMedida assc=registroDeUnidades mult=0..1 side=A */
   public UnidadMedida unidadMedida;
   
   /** @pdOid a842edeb-9aa7-4240-940a-e1f87dbc00b7 */
   public java.util.Date getFecha() {
      return fecha;
   }
   
   /** @param newFecha
    * @pdOid 93ecebc9-d28f-41c6-b17c-4f7aab93569d */
   public void setFecha(java.util.Date newFecha) {
      fecha = newFecha;
   }
   
   /** @pdOid e8fd3966-e68b-44bb-818f-f1d2c6f3a379 */
   public double getCantidad() {
      return cantidad;
   }
   
   /** @param newCantidad
    * @pdOid c1da2752-dabe-43e1-abb4-3c0744e61087 */
   public void setCantidad(double newCantidad) {
      cantidad = newCantidad;
   }
   
   /** @pdOid c665113b-c59b-47da-a5f5-86f5b776c699 */
   public float getMontoBruto() {
      return montoBruto;
   }
   
   /** @param newMontoBruto
    * @pdOid 791b6011-df1c-4b92-a832-4880c39516cb */
   public void setMontoBruto(float newMontoBruto) {
      montoBruto = newMontoBruto;
   }
   
   /** @pdOid 43c99d02-a8d9-425b-8c67-aa4772ccd7be */
   public float getMontoImpuestos() {
      return montoImpuestos;
   }
   
   /** @param newMontoImpuestos
    * @pdOid 1bde8a11-aed5-4ea2-a25e-c529bc571ae7 */
   public void setMontoImpuestos(float newMontoImpuestos) {
      montoImpuestos = newMontoImpuestos;
   }
   
   /** @pdOid 4210d7fe-13a6-4397-ac1f-ff8f5aa2b212 */
   public float getMontoDescuentos() {
      return montoDescuentos;
   }
   
   /** @param newMontoDescuentos
    * @pdOid ed6a58fd-2c65-46e0-835c-a2d42915c089 */
   public void setMontoDescuentos(float newMontoDescuentos) {
      montoDescuentos = newMontoDescuentos;
   }
   
   /** @pdOid 0281fe4c-26c8-4062-9eec-60cd8b982255 */
   public float getMontoNeto() {
      return montoNeto;
   }
   
   /** @param newMontoNeto
    * @pdOid 3bd418c6-5f84-4155-9721-5a502881b071 */
   public void setMontoNeto(float newMontoNeto) {
      montoNeto = newMontoNeto;
   }
   
   /** @pdOid ccd38ed2-f355-40b3-944d-58edce5a8052 */
   public int getSigno() {
      return signo;
   }
   
   /** @param newSigno
    * @pdOid 3e574225-2bdf-4865-b9ce-6f9c38cd1e6b */
   public void setSigno(int newSigno) {
      signo = newSigno;
   }
   
   /** @pdOid e154ed36-8c22-457c-8c15-45faf8a6c481 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 4ce23e68-64a1-4286-8ed1-501937e18058 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 06528b51-d634-445f-bfc3-4fa654c72e85 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 244c8f73-73b0-4839-9588-7c035eed11f6 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   
   /** @pdGenerated default parent getter */
   public Item getItem() {
      return item;
   }
   
   /** @pdGenerated default parent setter
     * @param newItem */
   public void setItem(Item newItem) {
      if (this.item == null || !this.item.equals(newItem))
      {
         if (this.item != null)
         {
            Item oldItem = this.item;
            this.item = null;
            oldItem.removeRegistroCaja(this);
         }
         if (newItem != null)
         {
            this.item = newItem;
            this.item.addRegistroCaja(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public UnidadMedida getUnidadMedida() {
      return unidadMedida;
   }
   
   /** @pdGenerated default parent setter
     * @param newUnidadMedida */
   public void setUnidadMedida(UnidadMedida newUnidadMedida) {
      if (this.unidadMedida == null || !this.unidadMedida.equals(newUnidadMedida))
      {
         if (this.unidadMedida != null)
         {
            UnidadMedida oldUnidadMedida = this.unidadMedida;
            this.unidadMedida = null;
            oldUnidadMedida.removeRegistroCaja(this);
         }
         if (newUnidadMedida != null)
         {
            this.unidadMedida = newUnidadMedida;
            this.unidadMedida.addRegistroCaja(this);
         }
      }
   }

}