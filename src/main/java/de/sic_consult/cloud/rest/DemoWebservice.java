package de.sic_consult.cloud.rest;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

import de.sic_consult.cloud.data.Post;
import de.sic_consult.cloud.data.PostModel;

@Singleton
@Path("/json")
public class DemoWebservice {

	@GET
	@Path("get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Post> fetchPic() throws IOException {
		return PostModel.getInstance().getAll();
	}

	@POST
	@Path("post")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putPost(Post post) {
		PostModel.getInstance().putPost(post);
	}
}
