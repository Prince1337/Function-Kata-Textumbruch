Textumbruch
Function Kata „Textumbruch“
Implementiere eine Funktion zur Umformatierung eines Textes. Funktionssignatur:

string Umbrechen(string text, int maxZeilenlänge)
Ein potenziell mehrzeiliger Text soll an Wortgrenzen so umgebrochen werden, dass eine maximale Zeilenlänge nicht überschritten wird, z.B.

Ausgangstext (aus „Advent“ von Loriot):

Es blaut die Nacht,
die Sternlein blinken,
Schneeflöcklein leis hernieder sinken.
Mit einer max. Zeilenlänge von 9 würde die Funktion diesen Text produzieren:

Es blaut
die
Nacht,
die
Sternlein
blinken,
Schneeflö
cklein
leis
hernieder
sinken.
Und mit einer max. Zeilenlänge von 14 diesen:

Es blaut die
Nacht, die
Sternlein
blinken,
Schneeflöcklei
n leis
hernieder
sinken.
Worte des Ausgangstextes werden so lange mit einem Leerzeichen zwischen ihnen zu Zeilen zusammengesetzt, bis die max. Zeilenlänge erreicht ist. Passt ein Wort nicht mehr in eine Zeile, fließt es in die nächste. Worte, die länger als die max. Zeilenlänge sind, werden einfach abgeschnitten; der Rest fließt dann in die nächste Zeile (s.o. z.B. „Schneeflöcklein“).