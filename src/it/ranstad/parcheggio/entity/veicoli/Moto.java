package it.ranstad.parcheggio.entity.veicoli;

import it.ranstad.parcheggio.entity.Veicolo;

/*
 Moto -> 1 posto auto -> 0.5/h
 */
public class Moto extends Veicolo {
    public Moto(String targa){
        super(targa);
        setTipologia("Moto");
    }

    public Moto(String targa, boolean particolare) {
        super(targa, particolare);
        setTipologia("Moto");
    }

    @Override
    public int getSlotOccupati() {
        return 1;
    }
    @Override
    public double getTariffaOraria(){
        // Il numero rappresenta gli €/h
        return 0.5d;
    }
}
