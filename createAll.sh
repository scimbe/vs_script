#!/bin/bash

# Prüfen Sie, ob ein Argument übergeben wurde
if [ $# -eq 0 ]; then
    echo "Bitte geben Sie den Pfad zum Verzeichnis als Argument an."
    exit 1
fi

# Setzen Sie den Verzeichnispfad
dirpath=$1

# Prüfen Sie, ob das Verzeichnis existiert
if [ ! -d $dirpath ]; then
    echo "Das Verzeichnis $dirpath wurde nicht gefunden."
    exit 1
fi

# Iterieren Sie über alle .tex Dateien im Verzeichnis
for texfile in $dirpath/*.tex; do
    # Erhalten Sie den Dateinamen ohne Pfad und Endung
    filename=$(basename "$texfile" .tex)

    # Erstellen Sie die PDF-Datei
    pdflatex -output-directory=$dirpath $texfile

    # Prüfen Sie, ob die PDF-Erstellung erfolgreich war
    if [ $? -eq 0 ]; then
        echo "Die PDF-Datei $filename.pdf wurde erfolgreich erstellt."
    else
        echo "Es gab einen Fehler bei der Erstellung der PDF-Datei $filename.pdf."
	exit 1
    fi
done

