package com.io7m.cltest.module0;

import com.io7m.cltest.loader.ExampleLoader;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public final class Example implements BundleActivator
{
  public Example()
  {

  }

  private static void log(final String message)
  {
    System.out.printf("[%s]: %s%s", Example.class, message, System.lineSeparator());
  }

  @Override
  public void start(
    final BundleContext context)
    throws Exception
  {
    log("start");

    log(String.format(
      "loadFromLoaderClass(\"%s\") → %s",
      "loader.txt",
      ExampleLoader.loadFromLoaderClass("loader.txt")));
    log(String.format(
      "loadFromLoaderClass(\"%s\") → %s",
      "/loader.txt",
      ExampleLoader.loadFromLoaderClass("/loader.txt")));
    log(String.format(
      "loadFromLoaderClassloader(\"%s\") → %s",
      "loader.txt",
      ExampleLoader.loadFromLoaderClassloader("loader.txt")));
    log(String.format(
      "loadFromLoaderClassloader(\"%s\") → %s",
      "/loader.txt",
      ExampleLoader.loadFromLoaderClassloader("/loader.txt")));

    log(String.format(
      "loadFromLoaderClass(\"%s\") → %s",
      "module0.txt",
      ExampleLoader.loadFromLoaderClass("module0.txt")));
    log(String.format(
      "loadFromLoaderClass(\"%s\") → %s",
      "/module0.txt",
      ExampleLoader.loadFromLoaderClass("/module0.txt")));
    log(String.format(
      "loadFromLoaderClassloader(\"%s\") → %s",
      "module0.txt",
      ExampleLoader.loadFromLoaderClassloader("module0.txt")));
    log(String.format(
      "loadFromLoaderClassloader(\"%s\") → %s",
      "/module0.txt",
      ExampleLoader.loadFromLoaderClassloader("/module0.txt")));

    log(String.format(
      "loadFromGivenClass(%s, \"%s\") → %s",
      Example.class,
      "loader.txt",
      ExampleLoader.loadFromGivenClass(Example.class, "loader.txt")));
    log(String.format(
      "loadFromGivenClass(%s, \"%s\") → %s",
      Example.class,
      "/loader.txt",
      ExampleLoader.loadFromGivenClass(Example.class, "/loader.txt")));
    log(String.format(
      "loadFromGivenClassloader(%s, \"%s\") → %s",
      Example.class.getClassLoader(),
      "loader.txt",
      ExampleLoader.loadFromGivenClassloader(Example.class.getClassLoader(), "loader.txt")));
    log(String.format(
      "loadFromGivenClassloader(%s, \"%s\") → %s",
      Example.class.getClassLoader(),
      "/loader.txt",
      ExampleLoader.loadFromGivenClassloader(Example.class.getClassLoader(), "/loader.txt")));

    log(String.format(
      "loadFromGivenClass(%s, \"%s\") → %s",
      Example.class,
      "module0.txt",
      ExampleLoader.loadFromGivenClass(Example.class, "module0.txt")));
    log(String.format(
      "loadFromGivenClass(%s, \"%s\") → %s",
      Example.class,
      "/module0.txt",
      ExampleLoader.loadFromGivenClass(Example.class, "/module0.txt")));
    log(String.format(
      "loadFromGivenClassloader(%s, \"%s\") → %s",
      Example.class.getClassLoader(),
      "module0.txt",
      ExampleLoader.loadFromGivenClassloader(Example.class.getClassLoader(), "module0.txt")));
    log(String.format(
      "loadFromGivenClassloader(%s, \"%s\") → %s",
      Example.class.getClassLoader(),
      "/module0.txt",
      ExampleLoader.loadFromGivenClassloader(Example.class.getClassLoader(), "/module0.txt")));
  }

  @Override
  public void stop(
    final BundleContext context)
    throws Exception
  {
    log("stop");
  }
}
