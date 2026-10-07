## Oppgave 4: Kunder - referansetabeller

Ved å opprette objekt av klassen `Customer` fra oppgave 3 kan vi representere kunder for en strømleverandør.

Startkoden for denne oppgaven finnes i pakken `no.hvl.dat100.javael.oppgave4`. 

Målet med oppgaven er å implementere en klasse som ved å bruke en referanse-tabell kan lagre informasjon om kunder for et strømselskap.

Referanse-tabellen i oppgaven skal brukes til å lagre referanser/pekere til `Customer`-objekt. Innganger i tabellen kan enten peke på et `Customer`-objekt eller være `null`. Det siste betyr at den tilsvarende plassen i tabellen er ledig og at det kan settes inn et objekt på denne plassen i tabellen.

Husk å skrive kode i klassen `CustomersMain.java` som tester metodene som implementeres etterhvert. Kundeinformasjon for å teste med kan for eksempel se ut som:

```
Name  Alice Smith
Email alice@example.com
Agreement SPOTPRICE

Customer number 1002
Name  Bob Johnson
Email bob@example.com
Agreement NORGESPRICE

Customer number 1003
Name  Charlie Rose
Email charlie@example.com
Agreement POWERSUPPORT

Customer number 1004
Name  Diana Prince
Email diana@example.com
Agreement NORGESPRICE

Customer number 1005
Name  Ethan Hunt
Email ethan@example.com
Agreement POWERSUPPORT
```

### a) Konstruktør

Implementer konstruktøren i klassen `Customers`:

```java
public Customers(int size) 
```

som setter objekt-variablen `customers` til en tabell av lengde `size` som kan brukes til å lagre `Customer`-objekter.

### b) Telle antall kunder

Implementer metoden:

```java
public int countNonNull()
```

som teller opp hvor mange ikke-null pekere som der er i tabellen `customers`.

### c) Hente kunde

Implementer metoden:

```java
public Customer getCustomer(int customer_id)
```

som søker igjennom `customers`-tabellen etter et `Customer`-objekt med samme id som gitt ved parameteren `customer_id`. Hvis et slik objekt finnes, skal metoden returnere en peker til objektet. Ellers skal skal metoden returnere `null`.

### d) Sette inn kunde

Implementer metoden:

```java
public boolean addCustomer(Customer c) {
```

som gitt et `Customer`-objekt `c` som parameter, setter inn en peker til objektet `c` på første ledige plass i tabellen dvs. første plass i tabellen som er `null`. Om objektet ble satt inn, skal metoden returnere `true`. Hvis der ikke er plass i tabellen dvs. ingen ledige plasser skal metoden returnere `false`.

### e) Slette kunde

Implementer metoden:

```java
public Customer removeCustomer(int customer_id)
```

som søker igjennom tabellen etter en kunde med id gitt ved `customer_id`. Om en slik kunde finnes skal metoden sette det tilsvarende element i tabellen til `null` og returnere en peker til det `Customer`-objekt som ble funnet. Om der ikke finnes et slik objekt i tabellen skal metoden returnere `null`.

### f) Kunde referansetabell

Implementer metoden:

```java
public Customer[] getCustomers()
```

som teller opp hvor mange kunder som er lagret i tabellen, oppretter og returnerer en ny tabell med pekere til de kundene som finnes i `customers`-tabellen.
