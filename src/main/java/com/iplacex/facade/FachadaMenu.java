package com.iplacex.facade;

//import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.SSLContext;
//import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import org.json.JSONOBject;
public class FachadaMenu {

    private  ConsumirAPI api;

    static class PreonlineService_JerseyClient {

        private final WebTarget webTarget;
        private final Client client;
        private static final String BASE_URI = "http://localhost:8080/RestExamen/rest";

        public PreonlineService_JerseyClient() {
            client = javax.ws.rs.client.ClientBuilder.newClient();
            webTarget = client.target(BASE_URI).path("preonline");
        }
          // Aqui La Lógica de consumir la API RESTFUL en JAVA
         //se hara la demostracion en postman .
       /*
          la Apirestful  fue creada en java con los conocimientos 
          adquiridos en el ramo WEB SERVICES EN Segundo Año
          la implementacion de esta CLASE JAVA no fue posible
          Hasta el momento me estuvo dando muchos errores,   
          es primera vez que intento crear un cliente para 
          consumir un a Api en JAVA... 
          para fines demostrativos se haran las pruebas en
          cliente POSTMAN ya que la Aplicacion escalo demasiado
          y por cuestiones de tiempo..... ;-)
          espero pueda entender que por ahora con mis conocimientos limitados
          llegue a un punto de considerarlo mas que nada por cuestiones de tiempo
          aún sigo aprendiendo saludos Profesor Atte Robinson Concha . 
        */
        
        public void close() {
            client.close();
        }
    }
    
}