package it.ranstad.parcheggio.entity.veicoli;

import it.ranstad.parcheggio.entity.Veicolo;

/*
Auto -> 1 posto auto -> 1/h
*/
public class Auto extends Veicolo {
    public Auto(String targa){
        super(targa);
        setTipologia("Auto");
    }

    public Auto(String targa, boolean particolare){
        super(targa, particolare);
        setTipologia("Auto");
    }

    @Override
    public int getSlotOccupati() {
        return 1;
    }
    @Override
    public double getTariffaOraria(){
        // Il numero rappresenta gli €/h
        return 1d;
    }
}

