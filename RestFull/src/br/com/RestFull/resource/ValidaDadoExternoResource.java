package br.com.RestFull.resource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.RestFull.model.ValidaDadoExterno;

@Path("/validaDadoExterno")
public class ValidaDadoExternoResource {

	@GET
	@Path("/consultaExterna")
	@Produces("application/json")
	public String consultaExterna(String entrada) {
		ValidaDadoExterno vde = new ValidaDadoExterno();
		return vde.toString() + "----" + entrada +"-fim";
	}
	
	@POST
	@Path("/sendPost")
	@Produces("application/json")	
	public String sendPost(String json) {
		String solicita ="32";
	    
	        // Cria um objeto HttpURLConnection:
	    	solicita = json;
	        
		return this.consultaExterna(solicita);
	}

	private String readResponse(HttpURLConnection request) throws IOException {
	    ByteArrayOutputStream os;
	    try (InputStream is = request.getInputStream()) {
	        os = new ByteArrayOutputStream();
	        int b;
	        while ((b = is.read()) != -1) {
	            os.write(b);
	        }
	    }
	    return new String(os.toByteArray());
	}

	
}
