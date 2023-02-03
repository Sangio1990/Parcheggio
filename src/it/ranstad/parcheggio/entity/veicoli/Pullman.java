package it.ranstad.parcheggio.entity.veicoli;

import it.ranstad.parcheggio.entity.Veicolo;

/*
Auto -> 1 posto auto -> 1/h
*/
public class Pullman extends Veicolo {
    // I pullman vengono automaticamente flaggati come veicoli particolari
    public Pullman(String targa){
        super(targa, true);
        setTipologia("Pullman");
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
