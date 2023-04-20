![logo](Aspose.Words.79477fa6-84b9-4d5d-b6c0-8ac8fc98d262.001.png)
**
`          	`*LightItApp*

`	`Template project  management	**V 1.0**


**LightItApp**


<a name="_gjdgxs"></a>**Responsabilità**

|**Funzione**|**Nome**|**Data**|
| :- | :- | :- |
|Redatto da|<p>Scandone Michele</p><p>Sotan Davide Mattia</p><p>Sabadell Mattia</p><p>Moriondo Alessandro</p><p>Rostagno Greta</p>|24/03/2023|
|Controllato e Approvato da|<p>Alessandro Moriondo</p><p>Greta Rostagno</p><p>Mattia Sabadell</p><p>Scandone Michele </p><p>Davide Mattia Sotan</p>|31/03/2023|
|Emesso da||31/03/2023|


<a name="_30j0zll"></a>**Storia delle variazioni**

|**Versione**|**Data emissione**|**Parte modificata**|**Descrizione della variazione**|
| :- | :- | :- | :- |
|Bozza|24/03/2023|Documento completo|Inizio redazione del documento|
|Versione finale|31/03/2023|Documento completo|Versione finale del documento|


**SOMMARIO**



[1](#_gjdgxs)Responsabilità	

[1](#_30j0zll)[](#_gjdgxs)Storia delle variazioni	

1. [3](#_1fob9te)[](#_30j0zll)scopo e campo di applicazione	
   1. [3](#_3znysh7)[](#_1fob9te)Scopo	
   2. [3](#_2et92p0)[](#_3znysh7)Campo di applicazione	
2. [3](#_tyjcwt)[](#_2et92p0)riferimenti	
   1. [3](#_3dy6vkm)[](#_tyjcwt)Definizioni ed Acronimi	
3. [4](#_1t3h5sf)[](#_3dy6vkm)Analisi dei requisiti	
4. [4](#_4d34og8)[](#_1t3h5sf)Fornitura	
5. [4](#_2s8eyo1)[](#_4d34og8)Work Break Down Structure	
6. [5](#_17dp8vu)[](#_2s8eyo1)Stima delle risorse	
7. [5](#_3rdcrjn)[](#_17dp8vu)Earned Value e Burn Down Chart	

[](#_3rdcrjn)

1. <a name="_1fob9te"></a>**scopo e campo di applicazione**
   1. ## <a name="_3znysh7"></a>**Scopo**
Realizzazione di un applicativo Android e Web al fine di creare giochi di luce attraverso l’utilizzo degli smartphone degli utenti partecipanti all’evento.
1. ## <a name="_2et92p0"></a>**Campo di applicazione**
Il progetto è stato avviato per la progettazione di un applicativo Android e Web per la gestione di giochi di luci tramite i dispositivi mobili, all’interno di determinati eventi. 

Il campo di applicazione è completamente ludico ai fini di intrattenimento e a scopo non lucrativo.

Nello specifico il progetto viene realizzato per la Proloco di Cuneo.

2. <a name="_tyjcwt"></a>**riferimenti**

1. ## <a name="_3dy6vkm"></a>**Definizioni ed Acronimi**

|**DB**|Database|
| :- | - |
|**DBMS**|Database management system|
|**XML**|eXtensible Markup Language|
|**IDE**|Integrated Development Environment|
|**JSON**|JavaScript Object Notation|
|**BSON**|Binary JSON|
|||
|||








3. <a name="_1t3h5sf"></a>**Analisi dei requisiti**

Del problema si è compreso che saranno necessarie, per la sua risoluzione, un’applicazione Android, un’applicazione Web, un server su cui si appoggerà la web app e un database che andrà a contenere le impostazioni per i giochi di luce. In questo problema gli stakeholder sono gli sviluppatori, la proloco da cui è giunta l’idea per il progetto, i dj che si occuperanno di utilizzare l’applicazione come organizzatori di eventi e i partecipanti delle feste che utilizzeranno l’applicazione come ospiti.  

I problemi principali sono sorti a seguito della fase di creazione delle features: si è notato solo successivamente che ne mancavano alcune che sono state aggiunte come alert. Ne consegue che il progetto subirà dei notevoli ritardi rispetto alla tempistica stimata. 

Eventuali limiti risiedono nell’incapacità di gestire eventi che vedano la partecipazione di un numero elevato di utenti, questo perché potrebbero esserci dei rallentamenti sul traffico da e verso il server. 

3. <a name="_4d34og8"></a>**Fornitura**

Come prima cosa sono state discusse le tecnologie da utilizzare. Di seguito l’elenco e il loro utilizzo: 

- DBMS: come sistema per la gestione dei database è stato scelto MongoDB, un dbms non relazionale, che sfrutta invece documenti BSON (formato molto simile al JSON). Il DBMS sarà necessario in quanto le impostazioni per i giochi di luce dei singoli eventi verranno catalogati all’interno di un database. 
- Server per Web App: come server è stato scelto Apache 2.4, che verrà utilizzato per hostare l’applicazione web che si occuperà di gestire il database, oltre che funzionalità quali la creazione di un nuovo evento. 
- Linguaggi di programmazione: per l’applicazione Android si è scelto di usare come linguaggio Java e come IDE Android Studio, che prevede anche l’utilizzo di file in XML. Per l’applicazione web, invece, si usa PHP al quale si aggiunge poi il css per la gestione della grafica delle pagine html. 

Per l’applicazione si è pensato di sfruttare un’applicazione web collegata a un server verso il quale l’applicazione Android, dopo aver effettuato il collegamento attraverso scannerizzazione di un codice QR e ricevuta la posizione fisica nell’evento, richiederà le impostazioni dei giochi di luce. Una volta ricevuti i dati necessari, si procederà a fare in modo che l’applicazione operi sulla torcia del telefono per attivare il flash nella modalità scelta dal dj. Ovviamente si prevede che in principio

vi sia un organizzatore che, una volta eseguito l’accesso all’applicazione web, crei un nuovo evento nel quale andrà ad inserire le impostazioni dei giochi di luce.  






3. <a name="_2s8eyo1"></a>**Work Break Down Structure**

Epica: applicazione android per la visualizzazione di una timeline di effetti visivi

Stories

- accesso app con richiesta permessi 100 **A**
  - pop up con richiesta permessi: 2
    - fotocamera
    - flash
    - storage



- scansione QR code dell’evento (libreria ) 5 **B**
  - libreria per la scansione e gestione del QR 3
- selezione tramite bottone della posizione 13 **C**
  - bottoni selezione area 2
- UI 8 **D**
  - UI app 5
- Richiesta connessione verso il server 1 **E**
  - richiesta connessione server db 5

Epica: applicazione web server per la gestione delle richieste client verso il database

Stories:

- Gestione della coda di richieste dall’app 0 **F**
  - Conferma richiesta di collegamento dall’app 3
- Accessi al DB 1/2 **G**
  - Controlli sul QR per reindirizzare al DB 3
  - Controllo posizione utente per selezione gioco di luce 1
- Gestione delle lobbies 2 **H**
  - Generazione di codici QR (libreria qrcode.js) 1
  - Controlli sul QR per reindirizzare al DB 3
- Interfaccia utente per sito da cui scaricare l’app **I**
  - Upload in cloud file .apk con gestione aggiornamenti 3
  - Pagina web collegata al cloud  5

6. <a name="_17dp8vu"></a>**Stima delle risorse**

Il tempo per ogni feature è stato deciso da una votazione tra tutti gli sviluppatori utilizzando le scrum cards, carte adibite a tale scopo.

L’unità di misura del tempo usata è il pomodoro (corrispondente a 25 minuti) e, per ogni feature, ogni stakeholder ha votato attraverso la carta il quantitativo di pomodori giusto secondo lui.


Coloro che hanno proposto i valori più alti e più bassi di pomodori hanno espresso la motivazione della scelta.

6. <a name="_3rdcrjn"></a>**Earned Value e Burn Down Chart**

Preparare grafici e tabelle utili alla dirigenza, che saranno aggiornati durante le riunioni periodiche, per capire lo stato di salute del progetto.
**Uso interno ITIS Cuneo**                                             		Pagina /

