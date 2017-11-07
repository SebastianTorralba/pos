package ar.com.coder.pos.objetos;

/***********************************************************************
 * Module:  CuentaCorriente.java
 * Author:  Sebastian
 * Purpose: Defines the Class CuentaCorriente
 ***********************************************************************/

import java.util.*;

/** @pdOid 4eb96661-fe78-4b8e-9e6e-00d453a07812 */
public class CuentaCorriente {
   /** @pdOid d739cdd3-598e-47d4-a27c-a6565e7b06e5 */
   public java.util.Date fecha;
   /** @pdOid a5237b6c-46d7-47bf-81b9-eb7eb23d3b48 */
   public int idDocumento;
   /** @pdOid 945c53b2-5a53-407f-a13e-464f455d3cc4 */
   public float montoBruto;
   /** @pdOid dc328a4f-d6b0-4cbe-8daa-5a686e57872e */
   public float montoImpuestos;
   /** @pdOid 1c4c3704-e084-4e2a-8f61-f9958e1a5d3e */
   public float montoDescuentos;
   /** @pdOid af05c573-fd76-4456-aeae-9af221d50f52 */
   public float montoNeto;
   /** @pdOid 5abbc031-1fa3-46ad-89f8-ad960bb523ad */
   public int signo;
   /** @pdOid ee707cba-f1d6-4c76-be56-bc6d5052048e */
   public java.util.Date fechaRegistro;
   /** @pdOid dd4e7fbd-4f0f-4920-a21b-dcfb05827198 */
   public java.lang.String usuario;
   
   /** @pdOid 83ae3101-2a05-4b68-9e91-c6047bef77f4 */
   public java.util.Date getFecha() {
      return fecha;
   }
   
   /** @param newFecha
    * @pdOid 1e7f6060-29cb-4553-8bd4-58f5b53cfed0 */
   public void setFecha(java.util.Date newFecha) {
      fecha = newFecha;
   }
   
   /** @pdOid 2486247c-9914-4e2c-b748-51a690436523 */
   public int getIdDocumento() {
      return idDocumento;
   }
   
   /** @param newIdDocumento
    * @pdOid 2e40965a-9562-4708-a49f-0ff9c1e5088f */
   public void setIdDocumento(int newIdDocumento) {
      idDocumento = newIdDocumento;
   }
   
   /** @pdOid 19e94c72-51f9-4463-8d8b-311e528a6357 */
   public float getMontoBruto() {
      return montoBruto;
   }
   
   /** @param newMontoBruto
    * @pdOid dc92eddb-f541-49c8-b205-7fb8ca6850de */
   public void setMontoBruto(float newMontoBruto) {
      montoBruto = newMontoBruto;
   }
   
   /** @pdOid f34c747b-bff7-494b-b5f8-2d9a19651e81 */
   public float getMontoImpuestos() {
      return montoImpuestos;
   }
   
   /** @param newMontoImpuestos
    * @pdOid 0dbe3b6c-09ee-48ba-8a3a-2787069555ac */
   public void setMontoImpuestos(float newMontoImpuestos) {
      montoImpuestos = newMontoImpuestos;
   }
   
   /** @pdOid b7c49d50-13bd-4ba3-a649-650fd12d718c */
   public float getMontoDescuentos() {
      return montoDescuentos;
   }
   
   /** @param newMontoDescuentos
    * @pdOid 6ccc29c5-4594-412f-8706-5b27f892e89a */
   public void setMontoDescuentos(float newMontoDescuentos) {
      montoDescuentos = newMontoDescuentos;
   }
   
   /** @pdOid bb568276-5206-4ea9-8d7e-ff7796054f44 */
   public float getMontoNeto() {
      return montoNeto;
   }
   
   /** @param newMontoNeto
    * @pdOid ebf00405-389a-4ef6-a57a-066a0a388547 */
   public void setMontoNeto(float newMontoNeto) {
      montoNeto = newMontoNeto;
   }
   
   /** @pdOid 19b7a309-15c3-48b1-88bb-4825f5a68dab */
   public int getSigno() {
      return signo;
   }
   
   /** @param newSigno
    * @pdOid 33345430-4f43-41c6-b2a6-506efb116467 */
   public void setSigno(int newSigno) {
      signo = newSigno;
   }
   
   /** @pdOid c398086c-a9b6-490a-8f40-7ae2aef63b49 */
   public java.util.Date getFechaRegistro() {
      return fechaRegistro;
   }
   
   /** @param newFechaRegistro
    * @pdOid 633bebcb-32f1-45fd-937c-5c40234d506f */
   public void setFechaRegistro(java.util.Date newFechaRegistro) {
      fechaRegistro = newFechaRegistro;
   }
   
   /** @pdOid 5782d8f6-fc9f-4f65-9d4f-47e4aa002520 */
   public java.lang.String getUsuario() {
      return usuario;
   }
   
   /** @param newUsuario
    * @pdOid cd41f331-ccce-4707-86ea-57d4dc1f5105 */
   public void setUsuario(java.lang.String newUsuario) {
      usuario = newUsuario;
   }

}