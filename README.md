# TestaCroce
programma che simula il lancio di un dado e di una moneta stampandone il risultato.

## Testo dell'esercizio
Implementare sia una soluzione senza ereditarietà sia una soluzione utilizzando l’ereditarietà.
Nel secondo caso occorre creare una superclasse chiamata OggettoLanciato, da cui estendere le classi
Dado e Moneta.
La classe OggettoLanciato deve avere un attributo privato per salvare il valore del lancio, un relativo
metodo get(), un metodo lancio() per simulare il lancio (ovviamente in questo caso si dovrà ritornare
un valore di default), ed un metodo per stampare a schermo il valore del lancio.
Le classi Dado e Moneta dovranno estendere questi metodi in base alle esigenze. Ovviamente il lancio
di un dado deve ritornare valori tra 1 e 6, mentre la moneta deve restituire “Testa” o “Croce”.
Si implementi un metodo main che testi l'utilizzo e il funzionamento delle classi sviluppate.
Le varie classi dovranno essere salvate in un package chiamato “oggetti”, mentre la classe contenente
il main dovrà essere posta nel package di default.

*nella repo è presente solamente la versione con l'eredità*
