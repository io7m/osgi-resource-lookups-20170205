Example output:

```
START LEVEL 5
   ID|State      |Level|Name
    0|Active     |    0|System Bundle (5.4.0)|5.4.0
    1|Active     |    1|Apache Felix Gogo Shell (0.10.0)|0.10.0
    2|Active     |    1|Apache Felix Gogo Runtime (0.16.2)|0.16.2
    3|Active     |    1|Apache Felix Gogo Command (0.16.0)|0.16.0
    4|Active     |    1|Apache Felix Metatype Service (1.1.2)|1.1.2
    5|Active     |    1|Apache Felix Configuration Admin Service (1.8.10)|1.8.10
    6|Active     |    1|Apache Felix File Install (3.5.4)|3.5.4
    7|Active     |    1|Apache Felix Bundle Repository (2.0.6)|2.0.6
    8|Active     |    1|loader (0.1.0)|0.1.0
    9|Active     |    1|Apache Felix Log Service (1.0.1)|1.0.1
   10|Active     |    1|module0 (0.1.0)|0.1.0
   11|Active     |    1|Apache Felix Declarative Services (2.0.4)|2.0.4

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

Bundle identifiers appear in URLs and classloader references: `com.io7m.experimental.module0 [10]` refers to
the classloader for bundle `10` - `module0 0.1.0`.

