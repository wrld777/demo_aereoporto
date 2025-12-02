package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "personale")
public class Personale {

    @Id
    private String matricola; // numero di matricola unico

    private String nome;
    private String cognome;
    private String ruolo; // pilota, primo ufficiale, assistente di volo, personale di terra, tecnico di manutenzione

    public Personale() {}

    public Personale(String matricola, String nome, String cognome, String ruolo) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
    }

    // Getter e Setter
    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }
}
