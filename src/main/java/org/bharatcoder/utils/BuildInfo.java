package org.bharatcoder.utils;

import com.google.common.io.Resources;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class BuildInfo {

  private static final Properties buildInfo = loadBuildInfo();

  public static Properties getBuildInfo() {
    return buildInfo;
  }

  private static Properties loadBuildInfo() {
    URL resource = Resources.getResource("build-info.properties");
    if (resource != null) {
      try (InputStream inputStream = resource.openStream()) {
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
      }
      catch (Exception ignored) {
      }
    }
    return new Properties();
  }
}
