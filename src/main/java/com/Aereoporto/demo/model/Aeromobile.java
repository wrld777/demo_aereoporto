package com.Aereoporto.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aeromobili")
public class Aeromobile {

    @Id
    private String numeroRegistrazione; // unico, es. I-ABCD

    private String modello;
    private String produttore;
    private int annoProduzione;
    private int capacitaPasseggeri;

    public Aeromobile() {
    }

    public Aeromobile(String numeroRegistrazione, String modello, String produttore,
                      int annoProduzione, int capacitaPasseggeri) {
        this.numeroRegistrazione = numeroRegistrazione;
        this.modello = modello;
        this.produttore = produttore;
        this.annoProduzione = annoProduzione;
        this.capacitaPasseggeri = capacitaPasseggeri;
    }

    public String getNumeroRegistrazione() {
        return numeroRegistrazione;
    }

    public void setNumeroRegistrazione(String numeroRegistrazione) {
        this.numeroRegistrazione = numeroRegistrazione;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public int getAnnoProduzione() {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) {
        this.annoProduzione = annoProduzione;
    }

    public int getCapacitaPasseggeri() {
        return capacitaPasseggeri;
    }

    public void setCapacitaPasseggeri(int capacitaPasseggeri) {
        this.capacitaPasseggeri = capacitaPasseggeri;
    }
}

