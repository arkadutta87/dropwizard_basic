package org.bharatcoder;

import java.util.Collections;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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

  @NotNull
  private Map<String, Map<String, String>> viewRendererConfiguration = Collections.emptyMap();

}
