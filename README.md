### What is the code in this branch

This is an example where we have used java module system. Few learnings:

1. If you use jackson then you will have to open packages which you want to serialize with following

```java
module com.harish {
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires lombok;

    // This is needed for Jackson to work with your Pojo
    opens org.example to com.fasterxml.jackson.databind;
}
```

2. POM compiler must have annotation processor for lombok
```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <configuration>
        <annotationProcessorPaths>
            <path>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>1.18.24</version>
            </path>
        </annotationProcessorPaths>
    </configuration>
</plugin>
```
