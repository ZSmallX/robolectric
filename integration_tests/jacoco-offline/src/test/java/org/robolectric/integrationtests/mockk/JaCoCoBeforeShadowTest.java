package org.robolectric.integrationtests.mockk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.integrationtests.jacoco.UnderShadow;

@RunWith(RobolectricTestRunner.class)
public class JaCoCoBeforeShadowTest {
  @Test
  public void testGetValueBeforeShadow() {
    Assert.assertEquals(new UnderShadow().getValue(), UnderShadow.VALUE_BEFORE_SHADOW);
  }
}
