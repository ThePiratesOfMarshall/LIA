const database = 'Eventi';
const collection = 'listaEventi';
use(database);

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

//inserimento di dati nel db (totalmente a caso)
db.users.insertMany(
    {id: 1, nome: "festa della birra", descrizione: "terza edizione della festa", data: "2023-05-27", luogo: "Manta"},
    {id: 2, nome: "festa del paese", descrizione: "trentaduesima edizione della festa", data: "2023-08-26", luogo: "Manta"}
); 


