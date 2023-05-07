const database = 'lia';
const collectionUsers = 'users';
const collectionEventi = 'listaEventi';
const collectionSetting = 'settings';
use(database)

//creo la collezione di dati di users
db.createCollection('users', 
    { validator: 
        { $jsonSchema: 
            //colonne: id, nomeUtente, password
            { bsonType: 'object', required: [ 'id', 'nomeUtente', 'password' ], properties: 
                { 
                    id: { bsonType: 'int' }, 
                    nomeUtente: { bsonType: 'string' }, 
                    password: { bsonType: 'string' } 
                }
            } 
        } 
    }
);
//inserimento di dati nel db (nomi e psw a caso)
db.collectionUsers.insertMany(
    {id: 1, nomeUtente: "pippo", password: "pippo"},
    {id: 2, nomeUtente: "pluto", password: "pluto"}
); 



//creo la collezione di dati degli eventi
db.createCollection('listaEventi', 
    { validator: 
        { $jsonSchema: 
            //colonne: id, nome, descrizione, data, luogo
            { bsonType: 'object', required: [ 'id', 'nome', 'descrizione', 'data', 'luogo' ], properties: 
                { 
                    id: { bsonType: 'int' }, 
                    nome: { bsonType: 'string' }, 
                    descrizione: { bsonType: 'string' },
                    //in mongoDB esiste l'oggetto di tipo Date
                    data: { bsonType: Date }, 
                    luogo: { bsonType: 'string' }
                }
            } 
        } 
    }
);
//inserimento di dati nel db
db.collectionEventi.insertMany(
    {id: 1, nome: "festa della birra", descrizione: "terza edizione della festa", data: "2023-05-27", luogo: "Manta"},
    {id: 2, nome: "festa del paese", descrizione: "trentaduesima edizione della festa", data: "2023-08-26", luogo: "Manta"}
); 


//creo la collezione per i setting
db.createCollection('settings',
    { validator: 
        { $jsonSchema: 
            //colonne: id, nomeUtente, password
            { bsonType: 'object', required: [ 'id', 'position', 'lights', 'idEvento' ], properties: 
                { 
                    id: { bsonType: 'int' }, 
                    position: { bsonType: 'string' }, 
                    lights: { bsonType: 'string' },
                    idEvento: {bsonType: 'int'} 
                }
            } 
        } 
    }
);

db.collectionSetting.insertMany(
    {id: 1, position: "LEFT", lights: "COLOR", idEvento: 1},
    {id: 2, position: "CENTER", lights: "FLASH_ON", idEvento: 2},
    {id: 3, position: "RIGHT", lights: "ALTERNATE_FLASHING", idEvento: 3}
);
