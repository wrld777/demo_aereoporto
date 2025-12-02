package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalTime;
import java.util.List;

@Document(collection = "voli_programmati")
public class VoloProgrammato {

    @Id
    private String numeroVolo; // AZ123, BA456

    private String aeroportoPartenza; // codice IATA
    private String aeroportoArrivo;   // codice IATA

    private List<String> giorniOperativi; // es. ["Lunedì", "Mercoledì"]

    private LocalTime orarioPartenzaPrevisto;
    private LocalTime orarioArrivoPrevisto;

    private int durataStimata; // in minuti

    public VoloProgrammato() {}

    public VoloProgrammato(String numeroVolo, String aeroportoPartenza, String aeroportoArrivo,
                           List<String> giorniOperativi, LocalTime orarioPartenzaPrevisto,
                           LocalTime orarioArrivoPrevisto, int durataStimata) {
        this.numeroVolo = numeroVolo;
        this.aeroportoPartenza = aeroportoPartenza;
        this.aeroportoArrivo = aeroportoArrivo;
        this.giorniOperativi = giorniOperativi;
        this.orarioPartenzaPrevisto = orarioPartenzaPrevisto;
        this.orarioArrivoPrevisto = orarioArrivoPrevisto;
        this.durataStimata = durataStimata;
    }

    // Getter e Setter

    public String getNumeroVolo() {
        return numeroVolo;
    }

    public void setNumeroVolo(String numeroVolo) {
        this.numeroVolo = numeroVolo;
    }

    public String getAeroportoPartenza() {
        return aeroportoPartenza;
    }

    public void setAeroportoPartenza(String aeroportoPartenza) {
        this.aeroportoPartenza = aeroportoPartenza;
    }

    public String getAeroportoArrivo() {
        return aeroportoArrivo;
    }

    public void setAeroportoArrivo(String aeroportoArrivo) {
        this.aeroportoArrivo = aeroportoArrivo;
    }

    public List<String> getGiorniOperativi() {
        return giorniOperativi;
    }

    public void setGiorniOperativi(List<String> giorniOperativi) {
        this.giorniOperativi = giorniOperativi;
    }

    public LocalTime getOrarioPartenzaPrevisto() {
        return orarioPartenzaPrevisto;
    }

    public void setOrarioPartenzaPrevisto(LocalTime orarioPartenzaPrevisto) {
        this.orarioPartenzaPrevisto = orarioPartenzaPrevisto;
    }

    public LocalTime getOrarioArrivoPrevisto() {
        return orarioArrivoPrevisto;
    }

    public void setOrarioArrivoPrevisto(LocalTime orarioArrivoPrevisto) {
        this.orarioArrivoPrevisto = orarioArrivoPrevisto;
    }

    public int getDurataStimata() {
        return durataStimata;
    }

    public void setDurataStimata(int durataStimata) {
        this.durataStimata = durataStimata;
    }
}
