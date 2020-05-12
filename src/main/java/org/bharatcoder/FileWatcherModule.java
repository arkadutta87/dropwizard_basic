package org.bharatcoder;

import com.google.inject.name.Names;

import org.bharatcoder.service.GreetingGenerator;
import org.bharatcoder.service.impl.URLDrivenGreetingGenerator;

import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.dropwizard.DropwizardExports;
import io.prometheus.client.exporter.MetricsServlet;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

public class FileWatcherModule extends DropwizardAwareModule<FileWatcherConfiguration> {

  @Override
  protected void configure() {

    //bind the GreetingGenerator Instance
    environment().jersey().setUrlPattern("/*");
    bind(GreetingGenerator.class).annotatedWith(Names.named("urlGreetingGenerator")).toInstance(new URLDrivenGreetingGenerator(configuration()));

    CollectorRegistry collectorRegistry = new CollectorRegistry();
    collectorRegistry.register(new DropwizardExports(environment().metrics()));
    environment().admin()
               .addServlet("prometheusMetrics", new MetricsServlet(collectorRegistry))
               .addMapping("/prometheusMetrics");
  }
}
