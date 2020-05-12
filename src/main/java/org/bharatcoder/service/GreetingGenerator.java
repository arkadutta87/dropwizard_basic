package org.bharatcoder.service;

import com.google.common.base.Optional;

import org.bharatcoder.resource.Saying;

public interface GreetingGenerator {

  Saying generateGreeting(Optional<String> name);
}
