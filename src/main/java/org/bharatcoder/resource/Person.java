package org.bharatcoder.resource;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Person {

  private long id;
  private String fullName;
  private String jobTitle;
  private int yearBorn;

}
