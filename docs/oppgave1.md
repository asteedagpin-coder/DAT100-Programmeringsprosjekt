## Oppgave 1: Daglig strømforbruk og pris - 1-dimensjonale tabeller

Start-koden for denne oppgaven finnes i pakken `no.hvl.dat100.javel.oppgave1` og fokuserer på å beregne strømforbruk og strømpris for en enkelt dag.

For en strømkunde registeres strømforbruk (målt i kWh) typisk hver time i døgnet og tilsvarende vil vi ha en spot-pris i NOK per kWh for hver time i døgnet.

Dette betyr at vi for eksempel kan representere strømprisen som en tabell med flyttall - et tall for hver time:

```java
public static double[] powerprices_day = {

            0.1, 0.2, 0.3, 0.4, 0.5, 0.6,
            0.7, 0.8, 1.9, 1.0, 1.1, 1.2,
            1.3, 1.4, 1.5, 1.6, 1.7, 1.8,
            1.9, 2.0, 1.5, 1.0, 0.5, 0.1
    };
```

og tilsvarende kan vi representere strømforbruk  for hver time på dagen med en tabell med 24 elementer:

```java
public static double[] powerusage_day = {

            0.34, 0.29, 0.31, 0.45, 0.41, 0.38,
            2.12, 1.87, 2.03, 1.01, 0.95, 0.89,
            1.11, 0.84, 0.93, 1.08, 2.45, 2.78,
            2.36, 2.19, 0.91, 0.73, 0.66, 0.59
    };
```

Filen `DayPowerData.java` inneholder de to tabellene ovenfor.

Metodene som skal implementers i denne oppgaven finnes i klassen `DailyPower.java`. 

I klassen `DayMain.java` skal dere skrive kode som tester ut de metodene som dere implementere nedenfor. Her kan dere bruke eksempeldata fra filen `DayPowerData.java`. 

Husk at for å referere til tabellene må dere bruke formen `DayPowerData.powerusage_day`og `DayPowerData.powerprices_day`. 

For å refere til metodene i klassen `DailyPower` skal klassenavnet skrives foran metoden som kalles. 

Det er god praksis (**viktigt**) å skrive kode som tester metodene dere implementerer etterhvert. Dette gjelder også for de etterfølgende oppgaver i prosjektet.

### a) Skrive ut strømpriser

Implementer metoden:

```java
public static void printPowerPrices(double[] prices)
```

som bruker en for-løkke til å skrive ut strømpriser utfra tabellen `prices` gitt med som parameter. Utskriften kan eksempelvis se slik ut:

```
0.10 NOK 0.20 NOK 0.30 NOK 0.40 NOK 0.50 NOK 0.60 NOK 0.70 NOK 0.80 NOK 1.90 NOK 1.00 NOK 1.10 NOK 1.20 NOK 1.30 NOK 1.40 NOK 1.50 NOK 1.60 NOK 1.70 NOK 1.80 NOK 1.90 NOK 2.00 NOK 1.50 NOK 1.00 NOK 0.50 NOK 0.10 NOK
```

For å få skrevet flyttall ut med 2 desimaler kan for eksempel følgende setning brukes: 

```java
System.out.printf("%.2f NOK ", verdi/variabel som skal skrives ut);
```

### b) Skrive ut strømforbruk

Implementer metoden:

```java
public static void printPowerUsage(double[] usage)
```
som skriver ut strømforbruk utfra tabellen `usage` gitt med som parameter. Utskriften kan eksempelvis se slik ut:

```
0.34 kWh 0.29 kWh 0.31 kWh 0.45 kWh 0.41 kWh 0.38 kWh 2.12 kWh 1.87 kWh 2.03 kWh 1.01 kWh 0.95 kWh 0.89 kWh 1.11 kWh 0.84 kWh 0.93 kWh 1.08 kWh 2.45 kWh 2.78 kWh 2.36 kWh 2.19 kWh 0.91 kWh 0.73 kWh 0.66 kWh 0.59 kWh
```

### c) Total strømforbruk for en dag

Implementer metoden:

```java
public static double computePowerUsage(double[] usage)
```

som beregner det totale strømforbruk for hele dagen ved å legge sammen strømforbruk for de enkelte timene. **Hint** se tilbake på `summer` metoden for Java innlevering 2 eller Mini-Excel eksemplet fra forelesninger.

### d) Strømpris med spotpris

Implementer metoden:

```java
public static double computeSpotPrice(double[] usage, double[] prices)
```

som utfra strømforbruk time for time (`usage`) og spotpris per kWh time for hver time (`prices`) beregner den totale strømpris for dagen. Strømprisen for en gitt time fås ved å multiplisere strømforbruket for timen med den tilsvarende spotpris for timen.

### e) Strømpris med strømstøtte

Når en kunde har en strømstøtteavtale, dekkes 90 % av prisen som er over 93,75 øre.

Implementer hjelpe-metoden:

```java
private static double getSupport(double usage, double price)
```

som gitt forbruk og strømpris for en enkelt time beregner og returnerer hvor mye kunden vil få i strømstøtte denne timen.

### f) Strømpris med strømstøtte

Implementer metoden:

```java
public static double computePowerSupport(double[] usage, double[] prices)
```

som basert på forbruk og strømpriser for en enkelt dag beregner strømstøtten for kunden på denne dagen.

### g) Norgespris

Med Norges pris betaler kunden en fast pris på 50 øre per kWh. 

Implementer metoden:
```java
public static double computeNorgesPrice(double[] usage)
```

som gitt forbruk time for time (`usage`) beregner og returnerer hva kunden skal betale i pris for strømmen denne dagen.

### h) Størst strømforbruk

Implementer metoden:

```java
public static double findPeakUsage(double[] usage)
```

som basert på time for time forbruket (`usage`) beregner og returnerer det største strømforbruket som kunden har hatt på en time i løpet av dagen.

### i) Gjennomsnitt strømforbruk

Implementer metoden:

```java
public static double findAvgPower(double[] usage)
```

som beregner og returnerer det gjennomsnitlige strømforbruk som kunden har hatt per time i løpet av dagen.




