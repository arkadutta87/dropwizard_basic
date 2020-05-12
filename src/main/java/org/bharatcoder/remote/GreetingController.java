package org.bharatcoder.remote;

import com.codahale.metrics.annotation.Metered;
import com.codahale.metrics.annotation.ResponseMetered;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.google.inject.Inject;
import com.google.inject.name.Named;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.bharatcoder.resource.Saying;
import org.bharatcoder.service.GreetingGenerator;

@Path("/greeting")
public class GreetingController {

  @Inject
  @Named("urlGreetingGenerator")
  private GreetingGenerator greetingGenerator;

  @GET
  @Timed
  @Metered(name = "greetingMeter")
  @ResponseMetered(name= "greetingResponseMeter")
  @Produces(MediaType.APPLICATION_JSON)
  public Saying sayHello(@QueryParam("name") Optional<String> name){
    return greetingGenerator.generateGreeting(name);
  }

}
