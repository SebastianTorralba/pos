package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  TipoDocumento.java
 * Author:  Sebastian
 * Purpose: Defines the Class TipoDocumento
 ***********************************************************************/

import java.util.*;

/** @pdOid a20c63ec-ad49-437e-9204-dbd343edde3c */
public class TipoDocumento {
   /** @pdOid 96252133-7b43-479a-9e8b-b0289e84a9a3 */
   public java.lang.String codigo;
   /** @pdOid 362ece31-b947-4244-9840-2069a99d1830 */
   public java.lang.String nombre;
   /** @pdOid 57777c2e-e30c-41ec-bd68-926c7003dfed */
   public java.lang.String tipo;
   
   /** @pdOid 5ef6fd8d-86db-4c00-a7b9-31df13f591f1 */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 23203828-744e-4389-a64a-73d4abb435d3 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 7b1bf9e8-e098-4246-887b-f9b264815992 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 223f7e92-b980-4240-a3d9-cf1bad18445f */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid 786b3670-342a-4f7a-93ac-aaf771de2a97 */
   public java.lang.String getTipo() {
      return tipo;
   }
   
   /** @param newTipo
    * @pdOid 1211511b-71ef-4dc8-9f94-e634949dcd6d */
   public void setTipo(java.lang.String newTipo) {
      tipo = newTipo;
   }

}