# JavEl Programmeringsprosjekt - Java og Elektrisitet

Strømpriser og støtteordninger er noe som mange personer i Norge er opptatt av for tiden. Prosjektet handler om å implementere et Java program som kan generere strømregninger (fakturaer) for kunder basert på strømforbruk og strømpriser. 

Informasjon om de ulike strømstøtteordninger og hva som inngår i beregning av strømpris kan for eksempel finnes via: 

- https://elhub.no/artikler/velge-norgespris 
- https://www.fjordkraft.no/strom/kundeservice/sporsmal-og-svar/hva-inngar-i-nettleien/
- https://www.hvakosterstrommen.no/ 

Denne oppbevaringsplassen inneholder start-kode i form av et IntelliJ/Maven-prosjekt som skal danne utgangspunkt for ulike Java programmer. I prosjektet skal dere jobbe i grupper med opptil 4 personer med å implementere de delene som mangler for at programmene blir komplett. 

Dere vil **ikke** få utlevert enhetstester (unit-tests) for automatisk å teste koden som dere implementerer. Istedet må dere selv skrive noen mindre Java-programmer som bruker den koden som dere skriver. Det er **viktig** å teste underveis og start-koden inneholder noe eksempel data for strømforbruk og strømpriser som kan brukes som testdata.

## Senk skuldrene

Java-programmeringen i prosjektet vil basere seg på det som er gjennomgått i faget frem til nå dvs. kapittel 1 til 6 i Java-boken. Det betyr at prosjektet også er tenkt som repetisjon og les gjerne i boken undervies og se på videoene som ble lagt ut i forkant av undervisningen for å få bedre kontroll på de tema som vi har vært igjennom i faget. 
 
Deler av prosjektet vil sannsynligvis oppleves som krevende for en del. Det gjelder i hovedsak om å jobbe seriøst med programmeringsoppgavene og få så mye til som dere klarer.

## Bruk av code completion og co-pilot

For å få best mulig utbytte av prosjektet anbefales det at dere ikke bruker inline code completions og co-pilot. 

Se på siden https://github.com/dat100hib/dat100public/blob/master/installasjon/intellij.md#inline-code-completion for hvordan inline code completions slås av i IntelliJ.

## Uke 41 og uke 42 - Jobbe med programmeringsoppgaver

På programmerings-lab i uke 41 opg 42 skal dere jobbe med prosjektet. Her vil lab-assistenter være til stede for å hjelpe og svare på spørsmål relatert til programmeringsprosjektet. I uke 41 er der **ikke** forelesning på torsdagen. Dette er for å gi mer tid til å jobbe med projektet.

## Uke 42 og uke 43 - Gruppemøter for å sammenligne løsninger

I uke 42 eller uke 43 (avhengig av hvor raskt gruppen kommer i mål med oppgavene) skal hver gruppe møtes med 1-2 andre grupper for å diskutere og sammenligne løsningene som dere er kommet frem til. Dere kan gå frem oppgave for oppgave. Om der er ting som gruppene ikke fikk til å fungere, kan dette også diskuteres som en del av møtet.

Informasjon om hvordan gruppemøtene organiseres finnes på Canvas.

## Oppgaver

- [**Oppgave 0:** Komme i gang](docs/oppgave0.md) - startkode og Github oppbevaringsplass
- [**Oppgave 1:** Daglig strømforbruk og pris](docs/oppgave1.md) - 1-dimensjonale tabeller
- [**Oppgave 2:** Månedlig strømforbruk og pris](docs/oppgave2.md) - 2-dimensjonale tabeller
- [**Oppgave 3:** Kunde](docs/oppgave3.md) - Klasser og objekter
- [**Oppgave 4:** Kunder](docs/oppgave4.md) - Referansetabeller
- [**Oppgave 5:** Fakturaer](docs/oppgave5.md) - Komplekse klasser og objektstrukturer

## Valgfri utfordring

De som ønsker det kan ta prosjektet videre kan utvikle en Java applikasjonen som gitt månedlig strømforbruk for 2-3 år tilbake, henter historiske strømpriser fra nettet: 

https://www.hvakosterstrommen.no/strompris-api

leser inn strømforbruk for en kunde for de tilsvarende årene og finner ut hva kunden vil spare ved å velge Norgespris fremfor strømstøtte med spotpris.

I prosjektet skal vi kun se på den delen av en strømregning som er relatert direkte til forbruk og strømpris. Det er mulig å utvide Java programmene slik de tar hensyn til flere elemeneter for eksempel kraftledd, påslag og gebyrer.








