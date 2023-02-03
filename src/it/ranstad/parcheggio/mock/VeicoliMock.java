package it.ranstad.parcheggio.mock;

import it.ranstad.parcheggio.entity.Parcheggio;
import it.ranstad.parcheggio.entity.Veicolo;
import it.ranstad.parcheggio.entity.veicoli.Auto;
import it.ranstad.parcheggio.entity.veicoli.Moto;
import it.ranstad.parcheggio.entity.veicoli.Pullman;

public class VeicoliMock {

    public static void addVeicoli(Parcheggio parcheggio) {
        // Funzione non necessaria alla logica dell'applicazione ma che funge da riempitivo
        Veicolo temp = new Moto("AD954BP");
        temp = new Pullman("ED234TY");
        parcheggio.cercaPostoLibero(temp);
        temp = new Auto("UT985WE");
        parcheggio.cercaPostoLibero(temp);
        temp = new Pullman("HJ814QW");
        parcheggio.cercaPostoLibero(temp);
        temp = new Moto("ER123QW");
        parcheggio.cercaPostoLibero(temp);
        temp = new Moto("GH567TY");
        parcheggio.cercaPostoLibero(temp);
        temp = new Pullman("WE345TY");
        parcheggio.cercaPostoLibero(temp);
        temp = new Auto("BG567WE", true);
        parcheggio.cercaPostoLibero(temp);
        temp = new Auto("TY987JK");
        parcheggio.cercaPostoLibero(temp);
        temp = new Auto("QW222ER", true);
        parcheggio.cercaPostoLibero(temp);
        temp = new Auto("ER911ER");
        parcheggio.cercaPostoLibero(temp);
    }

}
