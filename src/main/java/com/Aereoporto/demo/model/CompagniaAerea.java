package com.Aereoporto.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "compagnie_aeree")
public class CompagniaAerea {

    @Id
    private String codiceIata; // AZ, BA, LH

    private String nomeCompleto;
    private String paeseSedeLegale;
    private String alleanza; // Star Alliance, SkyTeam, Oneworld (può essere null)

    public CompagniaAerea() {
    }

    public CompagniaAerea(String codiceIata, String nomeCompleto, String paeseSedeLegale, String alleanza) {
        this.codiceIata = codiceIata;
        this.nomeCompleto = nomeCompleto;
        this.paeseSedeLegale = paeseSedeLegale;
        this.alleanza = alleanza;
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

    public String getPaeseSedeLegale() {
        return paeseSedeLegale;
    }

    public void setPaeseSedeLegale(String paeseSedeLegale) {
        this.paeseSedeLegale = paeseSedeLegale;
    }

    public String getAlleanza() {
        return alleanza;
    }

    public void setAlleanza(String alleanza) {
        this.alleanza = alleanza;
    }
}
