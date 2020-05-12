package org.bharatcoder;

import java.util.Properties;

import org.bharatcoder.utils.BuildInfo;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class FileWatcherApplication extends Application<FileWatcherConfiguration> {

  @Override
  public void run(FileWatcherConfiguration configuration, Environment environment) throws Exception {
  }

  public static void main(String[] args) throws Exception {
    new FileWatcherApplication().run(args);
    Properties buildInfo = BuildInfo.getBuildInfo();
    System.out.println(
        String.format("Started File Watcher Application (v): %s (%s)", buildInfo.getProperty("build.version"), buildInfo.getProperty("build.date")));
  }

  @Override
  public void initialize(Bootstrap<FileWatcherConfiguration> bootstrap) {
    bootstrap.setConfigurationSourceProvider(
        new SubstitutingSourceProvider(bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));
    bootstrap.addBundle(GuiceBundle.builder()
                                   .enableAutoConfig(getClass().getPackage().getName())
                                   .modules(new FileWatcherModule())
                                   .build());

  }

  @Override
  public String getName() {
    return "FileWatcherApplication";
  }

}
