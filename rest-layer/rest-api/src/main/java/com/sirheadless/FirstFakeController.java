import org.springframework.hateoas.Resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("fakePath")
public interface FirstFakeController {

    @GET
    public Resources<FirstFakeResource> loadAllFirstFakes();

}
