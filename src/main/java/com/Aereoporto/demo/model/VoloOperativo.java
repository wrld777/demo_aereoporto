package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "voliOperativi")
public class VoloOperativo {

    @Id
    private String id; // univoco per ogni volo operativo

    private String numeroVolo; // riferimento a VoloProgrammato

    private LocalDate data; // data specifica del volo
    private String stato;   // schedulato, boarding, partito, in volo, atterrato, cancellato

    private String gateAssegnato; // codice gate
    private String aeromobile;    // numero registrazione aeromobile

    private List<PersonaleRuolo> personaleABordo; // lista di personale con ruolo

    public VoloOperativo() {}

    public VoloOperativo(String id, String numeroVolo, LocalDate data, String stato,
                         String gateAssegnato, String aeromobile,
                         List<PersonaleRuolo> personaleABordo) {
        this.id = id;
        this.numeroVolo = numeroVolo;
        this.data = data;
        this.stato = stato;
        this.gateAssegnato = gateAssegnato;
        this.aeromobile = aeromobile;
        this.personaleABordo = personaleABordo;
    }

    // Getter e Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroVolo() {
        return numeroVolo;
    }

    public void setNumeroVolo(String numeroVolo) {
        this.numeroVolo = numeroVolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getGateAssegnato() {
        return gateAssegnato;
    }

    public void setGateAssegnato(String gateAssegnato) {
        this.gateAssegnato = gateAssegnato;
    }

    public String getAeromobile() {
        return aeromobile;
    }

    public void setAeromobile(String aeromobile) {
        this.aeromobile = aeromobile;
    }

    public List<PersonaleRuolo> getPersonaleABordo() {
        return personaleABordo;
    }

    public void setPersonaleABordo(List<PersonaleRuolo> personaleABordo) {
        this.personaleABordo = personaleABordo;
    }

    // Classe interna per il personale con ruolo
    public static class PersonaleRuolo {
        private String matricola;
        private String ruolo;

        public PersonaleRuolo() {}

        public PersonaleRuolo(String matricola, String ruolo) {
            this.matricola = matricola;
            this.ruolo = ruolo;
        }

        public String getMatricola() {
            return matricola;
        }

        public void setMatricola(String matricola) {
            this.matricola = matricola;
        }

        public String getRuolo() {
            return ruolo;
        }

        public void setRuolo(String ruolo) {
            this.ruolo = ruolo;
        }
    }
}
