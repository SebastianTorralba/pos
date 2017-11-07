package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  RegistroStock.java
 * Author:  Sebastian
 * Purpose: Defines the Class RegistroStock
 ***********************************************************************/

import java.util.*;

/** @pdOid 6cd90c57-3775-4c14-a1df-afb3d9fafdf3 */
public class RegistroStock {
   /** @pdOid e7f7e16d-176f-444d-9ac4-d2deebc79fe7 */
   private java.util.Date fecha;
   /** @pdOid f8670a75-adbd-43e6-a037-dcde3f2b8b08 */
   private int idDocumento;
   /** @pdOid d42a5466-14e7-4422-a258-9853af38d376 */
   private java.lang.String codigoArticulo;
   /** @pdOid ca1066a6-8124-4c1a-ab36-bdee657272a6 */
   private java.lang.String codigoUnidadMedida;
   /** @pdOid a6282e79-4f30-4516-97d0-62dcd449118f */
   private double cantidad;
   /** @pdOid 90401dc6-43c1-4b75-a11b-bf8e2b0c4aff */
   private java.lang.String lote;
   /** @pdOid 024ad51c-2190-498d-bc31-294e2f7419b9 */
   private java.util.Date fechaVencimiento;
   /** @pdOid d99c65ae-7a23-4f1f-b46b-b6144efaa401 */
   private int signo;
   /** @pdOid 632267f2-aab3-40ff-8805-cda7ae0c07c0 */
   private java.util.Date fechaRegistro;
   /** @pdOid 917bad1f-86bc-4a0f-811b-4c5e5351c256 */
   private java.lang.String usuario;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getCodigoUnidadMedida() {
        return codigoUnidadMedida;
    }

    public void setCodigoUnidadMedida(String codigoUnidadMedida) {
        this.codigoUnidadMedida = codigoUnidadMedida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getSigno() {
        return signo;
    }

    public void setSigno(int signo) {
        this.signo = signo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
}
