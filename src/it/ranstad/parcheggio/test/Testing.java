package it.ranstad.parcheggio.test;

import it.ranstad.parcheggio.entity.Parcheggio;
import it.ranstad.parcheggio.entity.Veicolo;
import it.ranstad.parcheggio.entity.Cassa;
import it.ranstad.parcheggio.entity.veicoli.Moto;

public class Testing {

    public static void test(Parcheggio parcheggio){
        System.out.println("Il veicolo HJ814QW esce pagando: "+ Cassa.calcolaTariffa(parcheggio.esceVeicolo("HJ814QW"))+"€");
        Veicolo temp = new Moto("ER123QW");
        parcheggio.cercaPostoLibero(temp);
        parcheggio.esceVeicolo("HJ814QW");
        System.out.println("Il veicolo HJ814QW esce pagando: "+ Cassa.calcolaTariffa(parcheggio.esceVeicolo("QW222ER"))+"€");
    }
}
