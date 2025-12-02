package com.Aereoporto.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "aeroporti")
public class Aeroporto {

    @Id
    private String codiceIata;  // FCO, JFK

    private String nomeCompleto;
    private String citta;
    private String paese;

    private String fusoOrario;

    private double latitudine;
    private double longitudine;

    private List<String> terminal; // es. ["Check-in", "Imbarco", "Sbarco", "Ritiro Bagagli"]

    public Aeroporto() {   //costruttore vuoto.
    }

    public Aeroporto(String codiceIata, String nomeCompleto, String citta, String paese,
                     String fusoOrario, double latitudine, double longitudine,
                     List<String> terminal) {
        this.codiceIata = codiceIata;
        this.nomeCompleto = nomeCompleto;
        this.citta = citta;
        this.paese = paese;
        this.fusoOrario = fusoOrario;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
        this.terminal = terminal;
    }

    public String getCodiceIata() {
        return codiceIata;
    }

    public void setCodiceIata(String codiceIata) {
        this.codiceIata = codiceIata;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public String getFusoOrario() {
        return fusoOrario;
    }

    public void setFusoOrario(String fusoOrario) {
        this.fusoOrario = fusoOrario;
    }

    public double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(double latitudine) {
        this.latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(double longitudine) {
        this.longitudine = longitudine;
    }

    public List<String> getTerminal() {
        return terminal;
    }

    public void setTerminal(List<String> terminal) {
        this.terminal = terminal;
    }
}

