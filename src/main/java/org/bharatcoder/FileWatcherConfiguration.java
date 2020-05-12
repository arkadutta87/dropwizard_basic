package org.bharatcoder;

import javax.validation.constraints.NotEmpty;

import io.dropwizard.Configuration;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FileWatcherConfiguration extends Configuration {

  @NotEmpty
  private String template;
  @NotEmpty
  private String defaultName = "Stranger";

}
