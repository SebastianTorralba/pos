package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  Documento.java
 * Author:  Sebastian
 * Purpose: Defines the Class Documento
 ***********************************************************************/

import java.util.*;

/** @pdOid bdbbcc56-7e02-422b-9744-7c341b28f4e7 */
public class Documento {
   /** @pdOid 6a9e81a5-7094-4e52-9f9c-caf1a571ac54 */
   public int id;
   /** @pdOid 1a3bcfe6-c0fd-4348-a173-cedbb5273de7 */
   public java.lang.String nombre;
   /** @pdOid 3a4b4838-c63a-49ae-8190-ead20b09d60e */
   public java.util.Date fecha;
   /** @pdOid afbd62c5-333f-433b-80c5-01e1401df69f */
   public int serie;
   /** @pdOid 1aac985b-31dd-4865-8cbd-1ab8861247de */
   public int numero;
   /** @pdOid 1f5c6d49-a30b-47d7-a6d3-f91bcfd3a511 */
   public java.lang.String observaciones;
   /** @pdOid 48412ee7-4c10-4907-9f8b-77d683458752 */
   public float montoBruto;
   /** @pdOid 8784c76f-c416-47d4-ba7f-65098c3440ca */
   public float montoImpuestos;
   /** @pdOid ae585fdb-4d59-43ae-954e-47532bda2e03 */
   public float montoDescuentos;
   /** @pdOid a436405f-6fbe-40fd-99bf-631b2d3c6eb5 */
   public float montoNeto;
   /** @pdOid 5ddbeff9-859f-4f39-baea-f4f0f95b49e6 */
   public java.util.Date fechaRegistro;
   /** @pdOid 998f67f2-1c42-4cab-ae5b-cf1a79ca3aac */
   public java.lang.String usuario;
   
   /** @pdRoleInfo migr=no name=Item assc=itemsDelDocumento coll=java.util.List mult=0..* type=Composition */
   public java.util.List<Item> item;
   /** @pdRoleInfo migr=no name=Empresas assc=empresaDelDocumento mult=0..1 side=A */
   public Empresas empresas;
   /** @pdRoleInfo migr=no name=Persona assc=documentosDePersonas mult=0..1 side=A */
   public Persona persona;
   /** @pdRoleInfo migr=no name=MedioPago assc=medioDelDocumento mult=0..1 side=A */
   public MedioPago medioPago;
   /** @pdRoleInfo migr=no name=TipoDocumento assc=tipoDocumento mult=0..1 side=A */
   public TipoDocumento tipoDocumento;
   
   /** @pdOid 92fcaa85-a0c6-49ff-a0a6-85f832596242 */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 5b1ee148-1223-479d-aff3-d8f80e239f00 */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid c62c7fb3-99f0-4d03-b4a4-eeaa547954bf */
   public java.lang.String getNombre() {
      return nombre;
   }
   
   /** @param newNombre
    * @pdOid 5a4a4f07-4b2b-4c91-8491-37a21f18ebc7 */
   public void setNombre(java.lang.String newNombre) {
      nombre = newNombre;
   }
   
   /** @pdOid ab44f6d0-390b-42de-ba06-886bece159a3 */
   public java.util.Date getFecha() {
      return fecha;
   }
   
   /** @param newFecha
    * @pdOid 90b4acd8-68ae-42b2-b91f-5d0fae4c7c48 */
   public void setFecha(java.util.Date newFecha) {
      fecha = newFecha;
   }
   
   /** @pdOid 5a4a4353-7f46-48cd-8fd5-08a84d9cf340 */
   public int getSerie() {
      return serie;
   }
   
   /** @param newSerie
    * @pdOid e7504e7d-e236-4451-adf8-a0dec256a248 */
   public void setSerie(int newSerie) {
      serie = newSerie;
   }
   
   /** @pdOid af05e455-b54c-4bcb-9a67-61febe7f7d88 */
   public int getNumero() {
      return numero;
   }
   
   /** @param newNumero
    * @pdOid c730bd56-444e-498c-89cf-9c7eefa072aa */
   public void setNumero(int newNumero) {
      numero = newNumero;
   }
   
   /** @pdOid 6eadf56f-b091-4020-afd4-fb7852c3a8b4 */
   public java.lang.String getObservaciones() {
      return observaciones;
   }
   
   /** @param newObservaciones
    * @pdOid 51ed7448-d8d6-4579-af13-59bc809241d9 */
   public void setObservaciones(java.lang.String newObservaciones) {
      observaciones = newObservaciones;
   }
   
   /** @pdOid 097b4adf-3941-4723-91ac-b98a73ada6a2 */
   public float getMontoBruto() {
      return montoBruto;
   }
   
   /** @param newMontoBruto
    * @pdOid 165de2e6-8273-4504-abe8-f4bbf91fdc49 */
   public void setMontoBruto(float newMontoBruto) {
      montoBruto = newMontoBruto;
   }
   
   /** @pdOid 1c08dbd4-9e94-4fe2-b635-4f96dc4d66a5 */
   public float getMontoImpuestos() {
      return montoImpuestos;
   }
   
   /** @param newMontoImpuestos
    * @pdOid 63382399-2f92-490f-8aa2-3f9fd149c8b4 */
   public void setMontoImpuestos(float newMontoImpuestos) {
      montoImpuestos = newMontoImpuestos;
   }
   
   /** @pdOid 07e0d91a-3d7a-4cb5-b475-666b0aba47a2 */
   public float getMontoDescuentos() {
      return montoDescuentos;
   }
   
   /** @param newMontoDescuentos
    * @pdOid 8d0e6a9d-7ec0-4a8f-8710-34ea8fabb72b */
   public void setMontoDescuentos(float newMontoDescuentos) {
      montoDescuentos = newMontoDescuentos;
   }
   
   /** @pdOid 0203671d-dd1d-4eaa-8000-79d6e3fafcca */
   public float getMontoNeto() {
      return montoNeto;
   }
   
   /** @param newMontoNeto
    * @pdOid a849b06d-3a1f-4960-afb6-741b695a1091 */
   public void setMontoNeto(float newMontoNeto) {
      montoNeto = newMontoNeto;
   }
   
   /** @pdOid d3f86336-204d-49f9-88e7-c6cd0c819d0e */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 06c36272-e19e-496b-8922-deab4202b188 */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 3660ed54-7cf0-4386-922a-46955723eb8c */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid 4bb6463e-68b3-4af1-b639-c064cbe1b805 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.List<Item> getItem() {
      if (item == null)
         item = new java.util.Vector<Item>();
      return item;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorItem() {
      if (item == null)
         item = new java.util.Vector<Item>();
      return item.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newItem */
   public void setItem(java.util.List<Item> newItem) {
      removeAllItem();
      for (java.util.Iterator iter = newItem.iterator(); iter.hasNext();)
         addItem((Item)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newItem */
   public void addItem(Item newItem) {
      if (newItem == null)
         return;
      if (this.item == null)
         this.item = new java.util.Vector<Item>();
      if (!this.item.contains(newItem))
      {
         this.item.add(newItem);
         newItem.setDocumento(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldItem */
   public void removeItem(Item oldItem) {
      if (oldItem == null)
         return;
      if (this.item != null)
         if (this.item.contains(oldItem))
         {
            this.item.remove(oldItem);
            oldItem.setDocumento((Documento)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllItem() {
      if (item != null)
      {
         Item oldItem;
         for (java.util.Iterator iter = getIteratorItem(); iter.hasNext();)
         {
            oldItem = (Item)iter.next();
            iter.remove();
            oldItem.setDocumento((Documento)null);
         }
      }
   }

}