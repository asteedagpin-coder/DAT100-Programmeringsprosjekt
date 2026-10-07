## Oppgave 3: Kunde - klasser og objekter

Strømleverandører trenger å holde informasjonen om kundene sine. 

Startkoden for denne oppgaven finnes i pakken `no.hvl.dat100.javel.oppgave3` og handler om å implementere en klasse for kunder slik at kunder kan representeres via objekt av klassen.

For strømkunder trenger leverandøren å ha informasjon om hvilken strømavtale kundene har. Dette kan representeres via oppramstypen som finnes i filen `PowerAgreementType.java`:

```java
public enum PowerAgreementType {

    SPOTPRICE,
    POWERSUPPORT,
    NORGESPRICE,
}
```

som inneholder en verdi svarende til hver av de ulike strømprisavtaler som vi tar hensyn til i denne oppgaven.

### a) Klassen Customer

Legg til kode i klassen `Customer.java` slik at klassen får følgende objektvariable: `name`  og `email` begge av typen `String`, `customer_id` heltall som unikt identifiserer en kunde, og `agreement` av typen `PowerAgreementType` som angir hvilken strømavtale kunder har. 

### b) Konstrukør

Implementer en konstruktør i klassen med paramtre slik den kan gi verdi til alle objektvariable i klassen.

### c) Get/set metoder

Implementer get- og set-metoder (hent- og sett-metoder) for alle objektvariable i klassen.

### d) toString metode

Implementer en `toString()` metode i klassen som returnerer en tekststreng med informasjon om verdien av objektvariable. Når strengen som returneres via metoden skrives ut for et Customer-objekt kan det for eksempel se slik ut:

```
Customer number 1001
Name  Alice Smith
Email alice@example.com
Agreement SPOTPRICE
```

### e) Test metodene i klassen

Om du ikke allerede har gjort det underveis, skriv kode i `CustomerMain.java` som oppretter et `Customer`-objekt og tester get/set-metodene samt `toString`-metoden.
