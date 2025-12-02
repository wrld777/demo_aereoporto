package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gate")
public class Gate {

    @Id
    private String numero; // es. "A12", unico per ogni aeroporto

    private String terminal; // es. "Check-in", "Imbarco", ecc.
    private String stato;    // "disponibile", "occupato", "in manutenzione"

    public Gate() {}

    public Gate(String numero, String terminal, String stato) {
        this.numero = numero;
        this.terminal = terminal;
        this.stato = stato;
    }

    // Getter e Setter
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }
}

