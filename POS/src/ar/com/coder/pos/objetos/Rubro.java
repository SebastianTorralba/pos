package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Rubro.java
 * Author:  Sebastian
 * Purpose: Defines the Class Rubro
 ***********************************************************************/

import java.util.*;

/** @pdOid 5de94f25-5e4a-4165-856d-8c2026e22718 */
public class Rubro {
   /** @pdOid ddd31639-00ab-4268-82a4-cf061fa2d736 */
   private java.lang.String codigo;
   /** @pdOid a20a2752-70af-4de5-8585-16750afc5279 */
   private java.lang.String nombre;
   /** @pdOid 767defc6-4391-4d10-9d2f-bf4717d01501 */
   private java.util.Date fechaRegistro;
   /** @pdOid cf28435d-6a81-412d-bf43-6b5345951846 */
   private java.lang.String usuario;
   
   /** @pdOid d1cf6c10-1d14-4088-a733-a9fe07493da1 */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 81238e1d-d949-4930-a344-b6a9a76cb2e8 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 90cb53f7-c912-480f-8fd0-e5a185111e77 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 38cd8df8-6e94-416a-a20c-a072f5d594f7 */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid b451c942-c576-410a-88e5-c6503e0eba7a */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid f0407c4c-bf3e-45c2-a473-1cb8566b360e */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 6730d863-d3de-4e3b-8f77-4e95e3048250 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid ba3bf022-c493-4d2a-84b7-2a94a1dc9ed0 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}