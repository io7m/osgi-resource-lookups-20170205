package com.io7m.cltest.loader;

import java.net.URL;

public final class ExampleLoader
{
  private ExampleLoader()
  {

  }

  public static URL loadFromLoaderClass(
    final String name)
  {
    return ExampleLoader.class.getResource("/" + name);
  }

  public static URL loadFromLoaderClassloader(
    final String name)
  {
    return ExampleLoader.class.getClassLoader().getResource("/" + name);
  }

  public static URL loadFromGivenClass(
    final Class<?> c,
    final String name)
  {
    return c.getResource("/" + name);
  }

  public static URL loadFromGivenClassloader(
    final ClassLoader cl,
    final String name)
  {
    return cl.getResource("/" + name);
  }
}
