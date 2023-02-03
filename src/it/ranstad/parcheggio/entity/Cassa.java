package it.ranstad.parcheggio.entity;

import it.ranstad.parcheggio.entity.Veicolo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/*
Cassa
 calcolaTariffa( Veicolo ) -> quanto paga per il parcheggio
 */
public class Cassa {
    public static double calcolaTariffa(Veicolo veicolo) {
        // Calcolo la differenza di tempo e arrotondo per eccesso le ore.
        double delta = ChronoUnit.MINUTES.between(veicolo.getBiglietto().getDateTime(), LocalDateTime.now());
        delta = Math.ceil(delta/60);
        return veicolo.getTariffaOraria()*(delta);
    }
}
