// Collection: Aeromobile
db.aeromobile.insertMany([
{ _id: "I-DEIF", modello: "Airbus A320", compagnia: "Alitalia" },
{ _id: "I-DEIG", modello: "Boeing 737", compagnia: "Alitalia" }
]);

// Collection: Gate
db.gate.insertMany([
{ _id: "A1", terminal: "1", aeroporto: "Fiumicino" },
{ _id: "B2", terminal: "2", aeroporto: "Malpensa" }
]);

// Collection: Personale
db.personale.insertMany([
{ _id: "P001", nome: "Mario Rossi", ruolo: "Pilota" },
{ _id: "P002", nome: "Luigi Bianchi", ruolo: "Co-Pilota" },
{ _id: "P003", nome: "Anna Verdi", ruolo: "Hostess" }
]);

// Collection: VoloProgrammato
db.voloProgrammato.insertMany([
{ _id: "AZ123", origine: "Roma", destinazione: "Milano", data: "2025-12-05" },
{ _id: "AZ124", origine: "Milano", destinazione: "Roma", data: "2025-12-05" }
]);

// Collection: VoloOperativo
db.voloOperativo.insertMany([
{
_id: "AZ123-2025-12-05",
voloProgrammatoId: "AZ123",
data: "2025-12-05",
stato: "schedulato",
gateId: "A1",
aeromobileId: "I-DEIF",
personale: [
{ id: "P001", ruolo: "Pilota" },
{ id: "P002", ruolo: "Co-Pilota" },
{ id: "P003", ruolo: "Hostess" }
]
},
{
_id: "AZ124-2025-12-05",
voloProgrammatoId: "AZ124",
data: "2025-12-05",
stato: "schedulato",
gateId: "B2",
aeromobileId: "I-DEIG",
personale: [
{ id: "P001", ruolo: "Pilota" },
{ id: "P002", ruolo: "Co-Pilota" },
{ id: "P003", ruolo: "Hostess" }
]
}
]);
