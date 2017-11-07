package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Caja.java
 * Author:  Sebastian
 * Purpose: Defines the Class Caja
 ***********************************************************************/

import java.util.*;

/** @pdOid 8b971c24-2771-4a2f-b512-7a89573a9947 */
public class Caja {
   /** @pdOid 505784cb-2388-41e0-89da-fb2dd004719d */
   private java.lang.String codigo;
   /** @pdOid 4d52684d-16a3-4acf-b701-64d6d195d14c */
   private java.lang.String nombre;
   /** @pdOid ed2ef6fa-5b94-4e0f-bfb5-0b1b289bc243 */
   private java.lang.String usuarioCajero;
   /** @pdOid a92e6227-10b1-4a37-9b9a-24b0458497b1 */
   private java.util.Date fechaRegistro;
   /** @pdOid 11e86089-c5e2-4a4f-b22f-ea4212c8b5d7 */
   private java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=Impresoras assc=impresoraDeLaCaja mult=0..1 side=A */
   private Impresoras impresoras;
   
   /** @pdOid cedef314-e829-4dac-a5ed-f2687e6bf06f */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 23501cae-4707-40d4-9341-6917e3b0dc63 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid f1cf6e79-17f4-4cd1-bb4e-7a73dbc4feac */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 6bf7e139-6fea-4775-925a-c4b94a9ea4e0 */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid ae2eae4a-4728-41d2-99e4-74de0b0de694 */
   public java.lang.String getUsuarioCajero() {
      return usuarioCajero;
   }
   
   /** @param newUsuarioCajero
    * @pdOid 6e99a5b5-d835-44c1-b94b-bf0b0d776561 */
   public void setUsuarioCajero(java.lang.String newUsuarioCajero) {
      usuarioCajero = newUsuarioCajero;
   }
   
   /** @pdOid ea4e9931-3419-44bf-89d7-e6ef3dd85271 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid d2604d2d-d6be-4550-beee-201b6fb77c10 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid b736c0cd-df79-496f-9137-fb15b9d72fe5 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 9e0cd93b-c235-4a7e-afd3-f66d79b906f9 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}