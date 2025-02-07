#!/bin/bash
for file in src/*.pdf
do
	convert -trim -density 300 ${file}  -quality 90 ${file}.png
done
mv src/*.png .

