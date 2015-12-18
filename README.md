This is a simple app that shows how to wire [Getdown] into a [Maven] build, as well as a few other
bits and bobs.

To build the app:

```
% mvn package
```

This creates a Getdown appdir with all the files in the right places in `target/testapp`. You can
do a test run of the app directly from there, like so:

```
java -jar target/testapp/getdown-new.jar target/testapp
```

That should show some Getdown stuff and then launch a simple Hello World JavaFX app.

[Getdown]: https://github.com/threerings/getdown
[Maven]: https://maven.apache.org/
