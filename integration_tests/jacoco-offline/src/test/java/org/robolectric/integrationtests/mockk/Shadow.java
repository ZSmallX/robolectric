package org.robolectric.integrationtests.mockk;

import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.integrationtests.jacoco.UnderShadow;

@Implements(UnderShadow.class)
public class Shadow {
  public static final int VALUE_AFTER_SHADOW = 0;

  @Implementation
  public int getValue() {
    return VALUE_AFTER_SHADOW;
  }
}
