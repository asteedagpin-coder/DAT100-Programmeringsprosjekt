## Oppgave 2: Månedlig strømforbruk og pris - 2-dimensjonale tabeller

Kunder får en strømregning hver måned basert på det daglige strømforbruk og den daglige strømpris i løpet av måneden. I oppgave 1 brukte vi en 1-dimensjonell tabell for å representere forbruk og priser time for time på en dag.

I denne oppgaven skal vi bruke en 2-dimensjonell tabell for å representere strømforbruk og priser for en måned. Tabellen vil på ytterste nivå ha innganger for hver dag i måneden som da peker på en 1-dimensjonell tabell med strømforbruk og priser for hver time for den dag som tabellen representerer.

Start-koden for denne oppgaven finnes i pakken `no.hvl.dat100.javel.oppgave2`. Klassen `MonthPowerData.java` inneholder to 2-dimensjonale tabeller med data som kan brukes til å teste metodene. **HUSK** å teste metodene etterhvert som de implementeres.

### a) Skrive ut månedlig strømforbruk

Implementer metoden: 

```java
public static void print_PowerUsage(double[][] usage)
```

som skriver ut strømforbruket for måneden basert på innholdet av den 2-dimensjonale tabellen som er gitt med som parameter. **Hint** bruk metoden for å skrive ut forbruk for en enkelt dag fra oppgave 1 som del av løsningen.

Utskriften kan eksempelvis se ut som:

```
Day 1:0.49 kWh 0.44 kWh 0.34 kWh 0.45 kWh 0.36 kWh 0.35 kWh 1.87 kWh 2.13 kWh 2.02 kWh 0.84 kWh 1.14 kWh 0.89 kWh 0.90 kWh 0.82 kWh 0.99 kWh 0.87 kWh 1.19 kWh 2.83 kWh 2.17 kWh 2.53 kWh 3.00 kWh 0.84 kWh 0.68 kWh 0.86 kWh 
Day 2:0.43 kWh 0.40 kWh 0.40 kWh 0.35 kWh 0.44 kWh 0.36 kWh 1.81 kWh 1.86 kWh 2.02 kWh 0.99 kWh 1.02 kWh 1.12 kWh 1.06 kWh 1.03 kWh 0.80 kWh 0.94 kWh 0.87 kWh 2.55 kWh 2.24 kWh 2.32 kWh 2.90 kWh 0.99 kWh 0.83 kWh 0.75 kWh 
Day 3:0.32 kWh 0.31 kWh 0.48 kWh 0.39 kWh 0.44 kWh 0.33 kWh 2.09 kWh 2.39 kWh 2.10 kWh 0.91 kWh 0.89 kWh 1.09 kWh 0.89 kWh 0.89 kWh 0.90 kWh 0.83 kWh 0.90 kWh 2.79 kWh 2.43 kWh 3.00 kWh 2.50 kWh 0.74 kWh 0.92 kWh 0.83 kWh 
Day 4:0.31 kWh 0.36 kWh 0.45 kWh 0.36 kWh 0.43 kWh 0.31 kWh 2.01 kWh 2.27 kWh 2.13 kWh 0.82 kWh 0.98 kWh 0.86 kWh 0.80 kWh 0.82 kWh 0.84 kWh 0.96 kWh 1.10 kWh 2.76 kWh 2.53 kWh 2.30 kWh 
[ ... ]
```

### b) Skrive ut månedlige strømpriser

Implementer metoden:

```java
public static void print_PowerPrices(double[][] prices)
```

som skriver ut strømpriser for måneden i et format tilsvarende som i oppgave a)

### c) Total månedlig forbruk 

Implementer metoden:

```java
public static double computePowerUsage(double[][] usage)
```

som beregner og returnerer totalt strømforbruk for en måned.

### d) Forbruksgrense

For Norgespris er der en øvre grense for støtte til månedlig forbruk for hytter og primærbolig på henholdsvis 1000 kWh og 5000 kWh. Implementer metoden:

```java
public static boolean exceedThreshold(double[][] powerusage, double threshold)
```

som finner ut om det månedlige forbruk (`powerusage`) er høyere enn en gitt grense (`threshold`). Bruk en while-løkke slik metoden kan returnere resultat såsnart det finnes ut at forbruk er over grensen.

###  e) Spotpris for måneden

```java
public static double computeSpotPrice(double[][] usage, double[][] prices)
```

som beregner strømpris for en måned basert på forbruk (`usage`) og priser (`prices`) for kunder som har spotprisavtale (dvs. pris uten strømstøtte).


### f) Strømstøtte for måneden

Implementer metoden:

```java
public static double computePowerSupport(double[][] usage, double[][] prices)
```

som beregner og returnerer hvor mye strømstøtte en kunde vil få med forbruk og priser gitt med som parametre.


### g) Norgespris for måneden

Implementer metoden:

```java
public static double computeNorgesPrice(double[][] usage)
```

som beregner og returnerer hva Norgepris er for kunden med forbruket som er gitt med som parameter. Prøv å bruke en utvidet for-løkke for å implementere metoden.


