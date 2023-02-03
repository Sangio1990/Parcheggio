package it.ranstad.parcheggio.entity;

/*
Veicolo
 Targa
 Biglietto

 Moto -> 1 posto auto -> 0.5/h
 Auto -> 1 posto auto -> 1/h
 Autobus -> 4 posti auto -> 3/h
 */

public abstract class Veicolo {
    // Classe astratta rappresentante un Veicolo generico che poi verrà specializzato
    private String targa;
    private Biglietto biglietto;
    private String tipologia;
    private boolean particolare; // Questa flag serve ad indicare quei veicoli che non possono
                                // parcheggiare in aree specifiche, tipo gli interrati


    public boolean isParticolare() {
        return particolare;
    }

    public void setParticolare(boolean particolare) {
        this.particolare = particolare;
    }
    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public Biglietto getBiglietto() {
        return biglietto;
    }

    public void setBiglietto(Biglietto biglietto) {
        this.biglietto = biglietto;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public Veicolo(String targa){
        this(targa, false);
    }

    public Veicolo(String targa, boolean particolare){
        setTarga(targa);
        setParticolare(particolare);
        biglietto = new Biglietto();
    }

    public abstract int getSlotOccupati();

    public abstract double getTariffaOraria();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veicolo veicolo = (Veicolo) o;

        return targa.equals(veicolo.targa);
    }
}
