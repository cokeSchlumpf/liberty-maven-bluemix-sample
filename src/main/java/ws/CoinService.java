package ws;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Stateless
@Path("coin")
public class CoinService {

    @GET
	public String flip() {
	  if (Math.random() > 0.5) {
	    return "Head";
	  } else {
	    return "Tail";
	  }
	}

}