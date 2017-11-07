package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  CodigoBarra.java
 * Author:  Sebastian
 * Purpose: Defines the Class CodigoBarra
 ***********************************************************************/

import java.util.*;

/** @pdOid d7c421b4-f300-4555-a821-486f5fe31431 */
public class CodigoBarra {
   /** @pdOid ea8add30-628d-422c-bfcf-34472f20a06a */
   public java.lang.String tipo;
   /** @pdOid 1c26ab7c-b87a-4f18-96a5-986799151a99 */
   public java.lang.String codigoBarra;
   /** @pdOid b54f07bf-609d-43ad-b552-88c0c52f0d25 */
   public java.util.Date fechaRegistro;
   /** @pdOid 165a4f00-f9ff-46bd-afe7-e8e2e9de30d8 */
   public java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=Articulo assc=codigoDeBarraDeLosArticulos mult=1..1 side=A */
   public Articulo articulo;
   
   /** @pdOid 7476a10d-af0a-42d5-a4db-075a00850f28 */
   public java.lang.String getTipo() {
      return tipo;
   }
   
   /** @param newTipo
    * @pdOid fde402a2-eeff-41c6-be8a-f5e37bd83955 */
   public void setTipo(java.lang.String newTipo) {
      tipo = newTipo;
   }
   
   /** @pdOid 06101b1e-c7b3-41df-ad7f-f703ce1cbded */
   public java.lang.String getCodigoBarra() {
      return codigoBarra;
   }
   
   /** @param newCodigoBarra
    * @pdOid 470c838b-573e-4dcc-97b3-a4ca187ab84c */
   public void setCodigoBarra(java.lang.String newCodigoBarra) {
      codigoBarra = newCodigoBarra;
   }
   
   /** @pdOid 5cce3fd0-6e64-40f1-97f7-b041cf363c00 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid c1ae51f8-227e-4869-9ecb-812ca9ee96bb */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 76be0e30-7804-4916-94d0-ebaf9cd2554e */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid ee3a9113-b7b7-4f0c-9a4a-baa9681cb620 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   
   /** @pdGenerated default parent getter */
   public Articulo getArticulo() {
      return articulo;
   }
   
   /** @pdGenerated default parent setter
     * @param newArticulo */
   public void setArticulo(Articulo newArticulo) {
      if (this.articulo == null || !this.articulo.equals(newArticulo))
      {
         if (this.articulo != null)
         {
            Articulo oldArticulo = this.articulo;
            this.articulo = null;
            oldArticulo.removeCodigoBarra(this);
         }
         if (newArticulo != null)
         {
            this.articulo = newArticulo;
            this.articulo.addCodigoBarra(this);
         }
      }
   }

}