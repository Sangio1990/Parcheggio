package it.ranstad.parcheggio;

import it.ranstad.parcheggio.entity.Parcheggio;
import it.ranstad.parcheggio.mock.AreeMock;
import it.ranstad.parcheggio.mock.VeicoliMock;
import it.ranstad.parcheggio.test.Testing;

public class Main {
    public static void main(String[] args) {
        Parcheggio parcheggio = new Parcheggio();
        AreeMock.addAree(parcheggio);
        VeicoliMock.addVeicoli(parcheggio);
        Testing.test(parcheggio);


    }
}