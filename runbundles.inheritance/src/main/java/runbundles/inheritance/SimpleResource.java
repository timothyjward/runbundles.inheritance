package runbundles.inheritance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

@Component(service=SimpleResource.class)
@JaxrsResource
@Path("respond")
public class SimpleResource {

	@Path("{name}")
	@GET
	public String sayHello(@PathParam("name") String name) {
		System.out.println("Received request for " + name);
		return "Hello " + name;
	}
	
}
