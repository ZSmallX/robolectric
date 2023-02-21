package org.robolectric.integrationtests.mockk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.integrationtests.jacoco.UnderShadow;

@Config(
    shadows = {
      Shadow.class,
    })
@RunWith(RobolectricTestRunner.class)
public class JaCoCoCustomShadowTest {
  @Test
  public void testGetValueAfterShadow() {
    Assert.assertEquals(new UnderShadow().getValue(), Shadow.VALUE_AFTER_SHADOW);
  }
}
