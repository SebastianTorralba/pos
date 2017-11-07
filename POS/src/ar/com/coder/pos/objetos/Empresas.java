package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Empresas.java
 * Author:  Sebastian
 * Purpose: Defines the Class Empresas
 ***********************************************************************/

import java.util.*;

/** @pdOid e43679e4-8d55-4d40-93ec-341cf3aa0b87 */
public class Empresas {
   /** @pdOid 1653f2e1-d9f1-4be4-82e1-c7f5a2933122 */
   private java.lang.String codigo;
   /** @pdOid 666ebd45-ea2d-4cfb-9c1c-b94a2ec79126 */
   private java.lang.String denominacion;
   /** @pdOid 6477af4d-dc34-44c5-b0c1-84eaa8e059b9 */
   private java.lang.String nombreFantasia;
   /** @pdOid 5a3fe3f3-bcf2-4785-9648-6b560330d333 */
   private java.lang.String cuit;
   /** @pdOid 4ab5cb1e-28d3-4b16-b3ea-8eef171df3bf */
   private java.lang.String ingresosBrutos;
   /** @pdOid 66d93bd2-cea7-4be2-a9f0-bfb51cb8f140 */
   private java.util.Date fechaAlta;
   /** @pdOid 2ffc74ea-372a-4a17-97c8-9c000b608a0e */
   private java.util.Date fechaInicioActividad;
   /** @pdOid 7a755e5a-833b-4acd-ba6a-c504f5e303e3 */
   private java.lang.String domicilioReal;
   /** @pdOid b0a8db68-2d7a-4de2-a735-e96f59e90e11 */
   private java.lang.String domicilioLegal;
   /** @pdOid 64f86827-7950-49c2-855c-5582fbdf8361 */
   private java.util.Date fechaRegistro;
   /** @pdOid a12ff1a3-2bf7-41fa-b966-8bac71bf3fa2 */
   private java.lang.String usuario;
   
   /** @pdOid 5664610f-e74a-427b-b517-270ab2c58183 */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid f4ccfb0a-080d-4c20-9dc6-fcb0e5795314 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 951b3bad-3ff8-4912-a06f-17e00613fccb */
   public java.lang.String getDenominacion() {
      return denominacion;
   }
   
   /** @param newDenominacion
    * @pdOid 37e838dd-1471-4495-9201-2fa2576afe40 */
   public void setDenominacion(java.lang.String newDenominacion) {
      denominacion = newDenominacion;
   }
   
   /** @pdOid 55637e4d-9b1b-4b97-9e23-4401184e3e2f */
   public java.lang.String getNombreFantasia() {
      return nombreFantasia;
   }
   
   /** @param newNombreFantasia
    * @pdOid 4bb97187-e191-4621-8674-2339486cc759 */
   public void setNombreFantasia(java.lang.String newNombreFantasia) {
      nombreFantasia = newNombreFantasia;
   }
   
   /** @pdOid 2f1c8790-cdfd-402c-bd48-0e8d86225a72 */
   public java.lang.String getCuit() {
      return cuit;
   }
   
   /** @param newCuit
    * @pdOid cb20c323-e882-4866-b2ca-44ab87a87efa */
   public void setCuit(java.lang.String newCuit) {
      cuit = newCuit;
   }
   
   /** @pdOid bf47b03a-e4b7-4d2f-bdde-65a9c1062024 */
   public java.lang.String getIngresosBrutos() {
      return ingresosBrutos;
   }
   
   /** @param newIngresosBrutos
    * @pdOid 5bade058-048c-454e-a85d-fc6730766e33 */
   public void setIngresosBrutos(java.lang.String newIngresosBrutos) {
      ingresosBrutos = newIngresosBrutos;
   }
   
   /** @pdOid 78eef559-d1c8-4cd1-9d45-9aa69ab75582 */
   public java.util.Date getFechaAlta() {
      return fechaAlta;
   }
   
   /** @param newFechaAlta
    * @pdOid 79e0bfbc-b3d3-43fb-98ab-128d5d1bfc01 */
   public void setFechaAlta(java.util.Date newFechaAlta) {
      fechaAlta = newFechaAlta;
   }
   
   /** @pdOid 5f73fb49-b913-47ab-9e07-88164c41be28 */
   public java.util.Date getFechaInicioActividad() {
      return fechaInicioActividad;
   }
   
   /** @param newFechaInicioActividad
    * @pdOid c86d2536-87eb-4f5a-8362-0e4046683285 */
   public void setFechaInicioActividad(java.util.Date newFechaInicioActividad) {
      fechaInicioActividad = newFechaInicioActividad;
   }
   
   /** @pdOid 3cfd26e7-4552-44e0-ab04-11191af89075 */
   public java.lang.String getDomicilioReal() {
      return domicilioReal;
   }
   
   /** @param newDomicilioReal
    * @pdOid 34a6d817-863e-469b-a2f2-4876a0b72367 */
   public void setDomicilioReal(java.lang.String newDomicilioReal) {
      domicilioReal = newDomicilioReal;
   }
   
   /** @pdOid 8ae2ad75-d716-42ff-a8f7-eeed6dd401d6 */
   public java.lang.String getDomicilioLegal() {
      return domicilioLegal;
   }
   
   /** @param newDomicilioLegal
    * @pdOid fcf7f291-b256-4f28-996e-9dbd551e0841 */
   public void setDomicilioLegal(java.lang.String newDomicilioLegal) {
      domicilioLegal = newDomicilioLegal;
   }
   
   /** @pdOid a8d56665-61b2-4df0-beeb-48912a1f1e09 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 745f0992-b4e0-48ee-b9e6-c727f99b933a */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 9205f93e-488c-484a-84d4-17c57c5dbaa2 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 943f6971-078a-40eb-a9dc-937a0aeb77eb */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}