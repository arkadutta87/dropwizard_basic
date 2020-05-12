package org.bharatcoder.service.impl;

import com.google.common.base.Optional;

import java.util.concurrent.atomic.AtomicLong;

import org.bharatcoder.FileWatcherConfiguration;
import org.bharatcoder.resource.Saying;
import org.bharatcoder.service.GreetingGenerator;

public class URLDrivenGreetingGenerator implements GreetingGenerator {

  private final FileWatcherConfiguration configuration;
  private final AtomicLong counter;

  public URLDrivenGreetingGenerator(FileWatcherConfiguration configuration){
    this.configuration = configuration;
    this.counter = new AtomicLong();
  }

  @Override
  public Saying generateGreeting(Optional<String> name) {
    final String value = String.format(configuration.getTemplate(), name.or(configuration.getDefaultName()));
    return new Saying(counter.incrementAndGet(), value);
  }
}
