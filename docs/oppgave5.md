## Oppgave 5: Fakturaer - Komplekse klasse- og objektstrukturer

På slutten av hvert måned sender strømselskaper ut en faktura (invoice) for kunder basert på strømforbruk og strømpriser i løpet av måneden.

Startkoden for denne oppgaven finnes i pakken `no.hvl.dat100.javel.oppgave5`. Målet for denne oppgaven er å kunne generere en faktura for kunder. For å forenkle problemet skal fakturaer kun inneholde informasjon om kunde samt pris for strømforbruket. Vi ser bort fra ulike typer påslag.

Klassen `CustomerPowerData.java` inneholder test data som sammen med test data fra de tidligere oppgaver kan brukes til å teste metodene som implementeres.

Koden som tester metodene som skal implementeres i denne oppgaven skrives i klassen `CustomersMain.java`. Utover dette skal der legges til kode i klassene `Invoice.java` og `Invoices.java`.

Objekter av klassen `Invoice.java` skal brukes til å representere fakturaer (invoices). Starten på klassen ser ut slik:

```java
public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month

```

Legg spesielt merke til at et `Invoice`-objekt vil ha en referanse til et `Customer`-objekt.

### a) Konstruktør

Implementer konstruktøren:

```java
public Invoice(Customer c, String month, double[][] usage, double[][] power_prices)
```

som kan gi verdi til alle objekt-variable med unntak av `amount` som skal settes til 0 i konstruktøren.

### b) Beregne strømpris

Implementer metoden:

```java
public void computeAmount()
```

som beregner og setter objekt-variablen `amount` lik det beløp som kunden skal betale for strømmen i måneden. Metoden skal ta hensyn til hvilken strømavtale kunder har og bruke informasjonen som er lagret i `usage` og `prices` objektvariablene.

### c) Generere fakture

Implementer metoden:

```java
public void printInvoice()
```

som skriver ut en faktura på skjermen. Output kan for eksempel se slik ut:

```
Customer number 1005
Name  Ethan Hunt
Email ethan@example.com
Agreement SPOTPRICE

Month: January
Usage:      933.27 kWh
Amount:    1709.22 NOK
```

### d) Flere fakturaer

Implementer metoden:

```java
public static void processInvoices(Invoice[] invoices)
```

i klassen `Invoices` som bruker `computeAmount`-metoden samt `printInvoice`-metoden til å generere og skrive ut flere fakturaer.

Output kan for eksempel se ut som:

```java
========================
Customer number 1003
Name  Charlie Rose
Email charlie@example.com
Agreement POWERSUPPORT

Month: January
Usage:      927.56 kWh
Amount:    1567.14 NOK
========================

========================
Customer number 1004
Name  Diana Prince
Email diana@example.com
Agreement NORGESPRICE

Month: January
Usage:      914.58 kWh
Amount:     457.29 NOK
========================

========================
Customer number 1005
Name  Ethan Hunt
Email ethan@example.com
Agreement SPOTPRICE

Month: January
Usage:      933.27 kWh
Amount:    3516.83 NOK
========================

```




