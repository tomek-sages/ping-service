package pl.sages.system;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
public class SystemRestService
{
	@GET
	@Path(value = "/ping")
	@Produces(MediaType.APPLICATION_JSON)
	public Response ping()
	{
		return Response.ok().build();
	}
}
