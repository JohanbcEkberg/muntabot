package muntabot

lazy val terms = Seq[(Week, Concepts | Contrasts | Code)](
  Week(1) -> Concepts("funktion", "while-sats", "for-sats", "stränginterpolator", "tilldelning", "kompilator", "grundtyper", "booleskt värde"),
  Week(1) -> Contrasts("map" -> "foreach", "for-uttryck" -> "for-sats", "Vector" -> "Array", "while" -> "for-do", "typ" -> "värde", "if-uttryck" -> "if-sats"),
  Week(2) -> Concepts("for-uttryck", "samlingsmetoden map", "indexering", "kontrollstruktur", "huvudprogram"),
  Week(2) -> Code("en funktion som ger minsta heltalet i en heltalssekvens,\nutan att använda inbyggda min"),
  Week(2) -> Code("en funktion som ger största heltalet i en heltalssekvens,\nutan att använda inbyggda max"),
  Week(2) -> Code("två förändringsbara variabler som först initialiseras\nmed två olika helatal och sedan byter värde med varandra"),
  Week(2) -> Code("en funktion som summerar alla heltal i en sekvens,\nutan att använda inbyggda sum"),
  Week(2) -> Contrasts("pseudokod" -> "exekverbar implementation", "parameter" -> "argument", "returtyp" -> "parametertyp"),
  Week(3) -> Concepts("anonym funktion", "predikat", "äkta funktion", "aktiveringspost", "anropsstacken", "deafult-argument", "repeterade argument", "returtyp"),
  Week(4) -> Concepts("singelobjekt"),
  Week(5) -> Concepts("klass", "attribut", "fabriksmetod"),
  Week(5) -> Contrasts("funktion" -> "metod"),
  Week(6) -> Concepts("mönstermatchning", "undantag"),
  Week(7) -> Contrasts("ArrayBuffer" -> "Array", "förändringsbar samling" -> "oföränderlig samling"),
  Week(7) -> Code("söker efter en instans av klassen Person\nmed ett visst efternamn i en osorterad sekvens av personer\nmed hjälp av en while (och inte find/indexOf)"),
  Week(7) -> Code("registrerar 1000 tärningskast i en Array"),
  Week(8) -> Concepts("matris", "nästlad struktur", "typparameter", "generisk funktion"),
  Week(8) -> Code("en funktion som skriver ut en strängmatris rad för rad"),
  Week(9) -> Contrasts("mängd" -> "sekvens", "mängd" -> "nycke-värde-tabell"),
  Week(10) -> Concepts("arv", "subtypspolymorfism", "bastyp", "final medlem", "privat medlem", "kodgranskning"),
  Week(10) -> Contrasts("subtyp" -> "supertyp", "klass" -> "trait", "arv" -> "komposition"),
)