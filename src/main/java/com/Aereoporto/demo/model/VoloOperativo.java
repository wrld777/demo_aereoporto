package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "voliOperativi")
public class VoloOperativo {

    @Id
    private String id;

    private String voloProgrammatoId;   // "AZ123"
    private String data;                // "2025-12-05"
    private String stato;               // "schedulato"

    private String gateId;              // "A1"
    private String aeromobileId;        // "I-DEIF"

    private List<String> personale;     // lista di ID del personale

    // GETTER & SETTER
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getVoloProgrammatoId() { return voloProgrammatoId; }
    public void setVoloProgrammatoId(String voloProgrammatoId) { this.voloProgrammatoId = voloProgrammatoId; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getStato() { return stato; }
    public void setStato(String stato) { this.stato = stato; }

    public String getGateId() { return gateId; }
    public void setGateId(String gateId) { this.gateId = gateId; }

    public String getAeromobileId() { return aeromobileId; }
    public void setAeromobileId(String aeromobileId) { this.aeromobileId = aeromobileId; }

    public List<String> getPersonale() { return personale; }
    public void setPersonale(List<String> personale) { this.personale = personale; }
}
