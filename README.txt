CSV tabellieren
Function Kata �CSV tabellieren�

Schreibe eine Funktion, die CSV Zeilen tabelliert.
IEnumerable<string>  Tabelliere(IEnumerable<string> CSV_zeilen);
	
IEnumerable<string>  Tabelliere(IEnumerable<string> CSV_zeilen);

Als Eingabe erh�lt die Funktion eine Aufz�hlung von Strings. 
Jeder dieser Strings ist eine CSV-Zeile, die beispielsweise aus einer Datei stammen k�nnte.

Beispiel f�r eine m�gliche Eingabe:
Name;Strasse;Ort;Alter
Peter Pan;Am Hang 5;12345 Einsam;42
Maria Schmitz;K�lner Stra�e 45;50123 K�ln;43
Paul Meier;M�nchener Weg 1;87654 M�nchen;65

In den Eingabedaten trennt ein Semikolon innerhalb der Zeilen die einzelnen Werte voneinander. 
Kompliziertere CSV Mechanismen (beispielsweise ein Semikolon in den Daten), m�ssen nicht ber�cksichtigt werden. 
Die Eingabedaten sind immer korrekt aufgebaut, es ist keine Fehlerbehandlung erforderlich.

Als Ausgabe liefert die Funktion eine formatierte Tabelle der Eingangsdaten. 
Dabei wird die erste Zeile der Eingangsdaten als �berschrift verwendet. 
Die �berschrift wird von den Daten durch eine Trennzeile getrennt. 
Die Spaltenbreite richtet sich nach dem breitesten Wert in den Daten. 
Dabei wird auch die �berschrift ber�cksichtigt.

Ausgabe f�r das obige Beispiel:
Name         |Strasse         |Ort          |Alter|
-------------+----------------+-------------+-----+
Peter Pan    |Am Hang 5       |12345 Einsam |42   |
Maria Schmitz|K�lner Stra�e 45|50123 K�ln   |43   |
Paul Meier   |M�nchener Weg 1 |87654 M�nchen|65   |
