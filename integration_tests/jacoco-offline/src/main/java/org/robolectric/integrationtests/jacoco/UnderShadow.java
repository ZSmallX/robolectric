package org.robolectric.integrationtests.jacoco;

public class UnderShadow {
  public static final int VALUE_BEFORE_SHADOW = 1;

  public int getValue() {
    return VALUE_BEFORE_SHADOW;
  }
}
