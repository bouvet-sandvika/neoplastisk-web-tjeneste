# Oppgavesett 2

### Oppgaver

#### Oppgave 2.1 Konfigurer REST-tjenesten
Applikasjonen skal kjøres på port `8081`

#### Oppgave 2.2 Opprett og konfigurer endepunkt
Opprett en klasse som implementer kontrakten `NeoplastikkApi`.

Endepunktet `klassifiserCelle()` skal motta POST-request hvor lasten er en liste av beregnede celledata ( total lengde 30 ) og 
skal nås via følgende url

```
http://localhost:8081/neoplastikk
```

Medietypen er JSON for request og respons.

#### Oppgave 2.3 Last opp nevralt nettverk
Nå som endepunktet er konfigurert med nødvendig metadata er satt er vi klare til å gjenopprette 
det nevrale nettverket vi trente i oppgavesett 1.

* Benytt den statiske metoden `ModelSerializer.restoreMultiLayerNetwork()` til dette. 
* Metoden returner et objekt av klassen `MultiLayerNetwork`. Kall metoden `init()` på dette opbjektet. Det nevrale nettverket er nå aktivert og klart til bruk.


#### Oppgave 2.4 Forutsi resultat av nye data.
Nå er tiden kommet til å opprette logikk som gjør modellen vår kan analysere data den aldri før har sett.

Kall metoden `predict(DataSet)` på objektet av klassen `MultLayerNetwork`. Start REST-tjenesten

#### Oppgave 2.5 Siste oppgave
Klone prosjektet web applikasjonen `neoplastisk-klassifiseringstjeneste-web`.
Naviger til mappen og gjør følgende:
* Installer avhengigheter `npm install`
* Åpne filen `environment.prod.ts` og sett feltet `biopsiServiceUrl` til `http://ec2-3-124-6-215.eu-central-1.compute.amazonaws.com:8080`
* Bygg applikasjonen `npm run-script build`
* Start applikasjonen i produksjonsmodus ved å kjøre `npm run-script prod`.

Følg prosedyrene

* Start den REST-tjenesten 



