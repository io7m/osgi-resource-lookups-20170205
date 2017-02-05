Example output:

```
[class com.io7m.cltest.module0.Example]: start
[class com.io7m.cltest.module0.Example]: loadFromLoaderClass("loader.txt") → bundle://8.0:1/loader.txt
[class com.io7m.cltest.module0.Example]: loadFromLoaderClass("/loader.txt") → bundle://8.0:1/loader.txt
[class com.io7m.cltest.module0.Example]: loadFromLoaderClassloader("loader.txt") → bundle://8.0:1/loader.txt
[class com.io7m.cltest.module0.Example]: loadFromLoaderClassloader("/loader.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromLoaderClass("module0.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromLoaderClass("/module0.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromLoaderClassloader("module0.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromLoaderClassloader("/module0.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromGivenClass(class com.io7m.cltest.module0.Example, "loader.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromGivenClass(class com.io7m.cltest.module0.Example, "/loader.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromGivenClassloader(com.io7m.experimental.module0 [10], "loader.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromGivenClassloader(com.io7m.experimental.module0 [10], "/loader.txt") → null
[class com.io7m.cltest.module0.Example]: loadFromGivenClass(class com.io7m.cltest.module0.Example, "module0.txt") → bundle://10.0:1/module0.txt
[class com.io7m.cltest.module0.Example]: loadFromGivenClass(class com.io7m.cltest.module0.Example, "/module0.txt") → bundle://10.0:1/module0.txt
[class com.io7m.cltest.module0.Example]: loadFromGivenClassloader(com.io7m.experimental.module0 [10], "module0.txt") → bundle://10.0:1/module0.txt
[class com.io7m.cltest.module0.Example]: loadFromGivenClassloader(com.io7m.experimental.module0 [10], "/module0.txt") → null
```

