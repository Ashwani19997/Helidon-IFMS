package com.pwc.helidon.ifms;
import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;

import io.helidon.common.http.MediaType;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;

@Path("/hello")
public class HelloResource {
  private final Client client;

  public HelloResource(Client client) {
    this.client = client;
  }

  @GET
//  @Produces(MediaType.APPLICATION_JSON)
  public String hello() {
    // Send a request to the backend API or service
    // and return the response
    return client.target("http://backend-api/hello").request().get(String.class);
  }
}






	
//	public static void main(String[] args) {
//    Gateway gateway = Gateway.create();
//
//    // Define routes for the gateway
//    Routing routing = Routing.builder()
//        .get("/hello", (req, res) -> res.send("Hello, World!"))
//        .build();
//
//    // Configure the gateway
//    ServerConfiguration config = ServerConfiguration.builder()
//        .port(8080)
//        .build();
//
//    // Start the gateway
//    gateway.start(config, routing);
//}
//
//	private static Gateway create() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private void start(ServerConfiguration config, Routing routing) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
