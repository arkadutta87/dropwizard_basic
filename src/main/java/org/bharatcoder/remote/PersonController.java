package org.bharatcoder.remote;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.bharatcoder.resource.Person;
import org.bharatcoder.views.PersonView;

@Path("/people/{personId}")
@Produces(MediaType.APPLICATION_JSON)
public class PersonController {

  @GET
  @Path("/view_freemarker")
  @Produces(MediaType.TEXT_HTML)
  public PersonView getPersonViewFreemarker(@PathParam("personId") long personId) {
    return new PersonView(PersonView.Template.FREEMARKER, new Person(personId, "Arka Dutta", "Prinicpal Engineer", 1987));
  }


}
