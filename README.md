# JSweet 2 + Node.js simple http example

<img src="http://www.jsweet.org/wp-content/logos/powered-by-jsweet-simple.svg" width="150" alt="JSweet logo">

Simply runs a Node HTTP server, and prints a random message

## Build it
Just build it using the regular mvn command line:

```
> git clone https://github.com/lgrignon/jsweet-node-example.git
> cd jsweet-node-example
> npm install
> bower install
> mvn clean generate-sources
```

`gulp buildClientAndServer` executes behind the scene `gulp buildServer` and `gulp buildClient`, which runs respectively `mvn generate-sources -P server` and `mvn generate-sources -P client`.
`gulp static` launches static resources generation such as jade transpilation, resources copy, bower libs concat & minify.
The output folder is `build`.

## Run it
Once built: 
```
> cd build
> node server/module.js
```

Then, one could browse the chat by accessing [http://localhost:1337/](http://localhost:1337/) in a browser.

## Prerequisites

The `node` and `npm` executables must be in the path (https://nodejs.org). `bower` and `gulp` should be installed as well.
Install Maven (https://maven.apache.org/install.html).
