db.airports.insertMany([
  {
    iata: "FCO",
    name: "Aeroporto Leonardo da Vinci",
    city: "Roma",
    country: "Italia",
    timezone: "Europe/Rome",
    coordinates: { lat: 41.8003, lon: 12.2389 },
    terminals: [
      { name: "Check-in" },
      { name: "Imbarco" },
      { name: "Sbarco" },
      { name: "Ritiro Bagagli" }
    ]
  },
  {
    iata: "JFK",
    name: "John F. Kennedy International Airport",
    city: "New York",
    country: "USA",
    timezone: "America/New_York",
    coordinates: { lat: 40.6413, lon: -73.7781 },
    terminals: [
      { name: "Check-in" },
      { name: "Imbarco" },
      { name: "Sbarco" },
      { name: "Ritiro Bagagli" }
    ]
  }
]);
