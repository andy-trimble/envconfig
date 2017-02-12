# envconfig
Inspired by the excellent Golang library https://github.com/kelseyhightower/envconfig

To use this facility, simply add annotations to desired configuration variables
in a class. Then call the ```EnvConfig.load()``` method to statically set the
variables. Variables can be any primitive type and strings. Note that arrays
and maps are not currently supported.

The ```name``` variable in the annotation specifies which environment variable
should be loaded into the field.

```Java
package com.example;

import com.sentinel.config.Config;
import com.sentinel.config.EnvConfig;

public class Configuration {
    @Config(name="INT_VAR", defaultValue="1")
    public static int intVar;
    
    @Config(name="DOUBLE_VAR", defaultValue="1.0")
    public static double doubleVar;
    
    @Config(name="STRING_VAR", defaultValue="Hello World!")
    public static String stringVar;
}

public static void main(String[] args) {
    EnvConfig.load(Configuration.class);
}
```

```Bash
#!/bin/bash
export INT_VAR="2"
export DOUBLE_VAR="3.14"
export STRING_VAR="Goodbye Cruel World!"
```

By sourcing the script prior to execution, the values in the ```Configuration```
class will be set according to the variables in the shell.
