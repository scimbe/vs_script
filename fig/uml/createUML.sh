#!/bin/bash
export PLANTUML_JAR="/Users/martin/lib/plantuml.jar"
export GRAPHVIZ_DOT="/opt/homebrew/bin/dot"
for file in src/*.pluml
do
    java -Djava.awt.headless=true -jar /Users/martin/lib/plantuml.jar -charset UTF-8 "${file}"
done
mv src/*.png ./
