const database = 'AdminUser';
const collection = 'users';
use(database);

//creo la collezione di dati di dj
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
db.users.insertMany(
    {id: 1, nomeUtente: "pippo", password: "pippo"},
    {id: 2, nomeUtente: "pluto", password: "pluto"}
); 


