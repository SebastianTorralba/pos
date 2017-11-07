package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Articulo.java
 * Author:  Sebastian
 * Purpose: Defines the Class Articulo
 ***********************************************************************/

import java.util.*;

/** @pdOid 895d1cf7-9451-4267-bd59-800c56e1b226 */
public class Articulo {
   /** @pdOid cbdd206f-5bb4-423e-856f-6048f4369755 */
   private java.lang.String codigo;
   /** @pdOid d6818987-f8e3-47dc-a83e-2e7db7d8e2f7 */
   private java.lang.String nombre;
   /** @pdOid 534c3e64-ebe3-401c-8ea9-8a6d1933f405 */
   private double precioCosto;
   /** @pdOid dbb4df92-c71e-4251-b4ec-590640ff9ced */
   private double precioVenta;
   /** @pdOid 2fe42145-39a5-4a23-bb51-35e5ef9d6edc */
   private double porcentajeGanancia;
   /** @pdOid 99230893-04e3-41ad-9e0e-ffd4be6a190c */
   private double iva;
   /** @pdOid cdb8b3af-8742-432d-86f5-3fa96abbbfec */
   private short usaLote;
   /** @pdOid d556f507-53b9-49dc-b106-c20f0840bdd0 */
   private short esServicio;
   /** @pdOid 38f829d0-8ace-417a-9d5d-bb2587fe24c5 */
   private int tieneFechaVencimiento;
   /** @pdOid ba46e11c-6a19-4348-b405-4080a5006440 */
   private java.util.Date fechaRegistro;
   /** @pdOid 030b0d81-618e-45eb-98a7-4366e57fb086 */
   private java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=CodigoBarra assc=codigoDeBarraDeLosArticulos coll=java.util.List mult=0..* type=Composition */
   private java.util.List<CodigoBarra> codigoBarra;
   /** @pdRoleInfo migr=no name=Rubro assc=rubrosDeLosArticulos mult=0..1 side=A */
   private Rubro rubro;
   /** @pdRoleInfo migr=no name=UnidadMedida assc=unidadesDelArticulo mult=0..1 side=A */
   private UnidadMedida unidadMedida;
   
   /**
     * @return  *  @pdOid ecb861f5-2fc4-4e79-818b-98c29ceb41cb */
   public java.lang.String getCodigo() {
      return codigo;
   }
   
   /** @param newCodigo
    * @pdOid 4db474d9-58f6-494c-a7bc-bda31b707c34 */
   public void setCodigo(java.lang.String newCodigo) {
      codigo = newCodigo;
   }
   
   /** @pdOid 228d1256-25bc-4bbc-9849-c160f73d47f2 */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid d4dcbae8-d823-42e9-a5e4-1d1bcd9a28f4 */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid d493cf4a-acfa-4e29-9794-35262b7404b2 */
   public double getPrecioCosto() {
      return precioCosto;
   }
   
   /** @param newPrecioCosto
    * @pdOid 98fd8034-3be3-43aa-ae44-ac037dc1c178 */
   public void setPrecioCosto(double newPrecioCosto) {
      precioCosto = newPrecioCosto;
   }
   
   /** @pdOid af2e1ae6-c1cd-4e2d-b04e-cd69de4aee28 */
   public double getPrecioVenta() {
      return precioVenta;
   }
   
   /** @param newPrecioVenta
    * @pdOid 6bf7804a-4758-43b4-af93-8921d268a2ee */
   public void setPrecioVenta(double newPrecioVenta) {
      precioVenta = newPrecioVenta;
   }
   
   /** @pdOid 3aaf8c84-fe17-48f3-b342-ddffe231a7bd */
   public double getPorcentajeGanancia() {
      return porcentajeGanancia;
   }
   
   /** @param newPorcentajeGanancia
    * @pdOid 62ba915d-455f-4c84-8136-701e4bd933c1 */
   public void setPorcentajeGanancia(double newPorcentajeGanancia) {
      porcentajeGanancia = newPorcentajeGanancia;
   }
   
   /** @pdOid e16ccb83-7502-499e-9862-11dd342633fd */
   public double getIva() {
      return iva;
   }
   
   /** @param newIva
    * @pdOid 9c7d1719-9a6c-4a01-8a72-a0683869f572 */
   public void setIva(double newIva) {
      iva = newIva;
   }
   
   /** @pdOid 5638ae45-b738-4efb-92eb-021d408f8003 */
   public short getUsaLote() {
      return usaLote;
   }
   
   /** @param newUsaLote
    * @pdOid dec8fd69-39a2-4fd5-a140-dace13d63a74 */
   public void setUsaLote(short newUsaLote) {
      usaLote = newUsaLote;
   }
   
   /** @pdOid 8c219f60-9720-4abe-a313-c9695c5dea61 */
   public short getEsServicio() {
      return esServicio;
   }
   
   /** @param newEsServicio
    * @pdOid 18c7be8e-c1d7-40b6-9149-ed0b18dde668 */
   public void setEsServicio(short newEsServicio) {
      esServicio = newEsServicio;
   }
   
   /** @pdOid 30d68a36-6d96-417c-b61f-c5a7b7c7e710 */
   public int getTieneFechaVencimiento() {
      return tieneFechaVencimiento;
   }
   
   /** @param newTieneFechaVencimiento
    * @pdOid 2eb0bab9-ee0d-4659-9e3e-27ed02bd641b */
   public void setTieneFechaVencimiento(int newTieneFechaVencimiento) {
      tieneFechaVencimiento = newTieneFechaVencimiento;
   }
   
   /** @pdOid 09d3f179-0433-4dcb-874c-0ada66ec926b */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid d33fbfdb-3245-439d-92fb-73c18b3afadc */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid f7640f04-74c8-420f-8927-0c61d7035f61 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid c77f8d66-d540-4e9c-a035-2411e08a381b */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<CodigoBarra> getCodigoBarra() {
      if (codigoBarra == null)
         codigoBarra = new java.util.Vector<CodigoBarra>();
      return codigoBarra;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCodigoBarra() {
      if (codigoBarra == null)
         codigoBarra = new java.util.Vector<CodigoBarra>();
      return codigoBarra.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCodigoBarra */
   public void setCodigoBarra(java.util.List<CodigoBarra> newCodigoBarra) {
      removeAllCodigoBarra();
      for (java.util.Iterator iter = newCodigoBarra.iterator(); iter.hasNext();)
         addCodigoBarra((CodigoBarra)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCodigoBarra */
   public void addCodigoBarra(CodigoBarra newCodigoBarra) {
      if (newCodigoBarra == null)
         return;
      if (this.codigoBarra == null)
         this.codigoBarra = new java.util.Vector<CodigoBarra>();
      if (!this.codigoBarra.contains(newCodigoBarra))
      {
         this.codigoBarra.add(newCodigoBarra);
         newCodigoBarra.setArticulo(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldCodigoBarra */
   public void removeCodigoBarra(CodigoBarra oldCodigoBarra) {
      if (oldCodigoBarra == null)
         return;
      if (this.codigoBarra != null)
         if (this.codigoBarra.contains(oldCodigoBarra))
         {
            this.codigoBarra.remove(oldCodigoBarra);
            oldCodigoBarra.setArticulo((Articulo)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCodigoBarra() {
      if (codigoBarra != null)
      {
         CodigoBarra oldCodigoBarra;
         for (java.util.Iterator iter = getIteratorCodigoBarra(); iter.hasNext();)
         {
            oldCodigoBarra = (CodigoBarra)iter.next();
            iter.remove();
            oldCodigoBarra.setArticulo((Articulo)null);
         }
      }
   }

}