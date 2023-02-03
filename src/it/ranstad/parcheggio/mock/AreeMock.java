package it.ranstad.parcheggio.mock;

import it.ranstad.parcheggio.entity.Area;
import it.ranstad.parcheggio.entity.Parcheggio;

import java.util.ArrayList;
import java.util.List;

public class AreeMock {
    public static void addAree(Parcheggio parcheggio){
        // Funzione non necessaria alla logica dell'applicazione ma che funge da riempitivo
        System.out.println("\n" + "***********************************************************"+
                "\nInserimento nuove Aree");
        List<Area> list_aree = new ArrayList();
        System.out.println("Inserimento Area -1");;
        Area area = new Area("-1", 5, false);
        list_aree.add(area);
        System.out.println("Inserimento Area T");
        area = new Area("T", 4, true);
        list_aree.add(area);
        System.out.println("Inserimento Area +1");
        area = new Area("+1", 10, true);
        list_aree.add(area);
        parcheggio.setAree(list_aree);
        System.out.println("Fine inserimento Aree" +
                "\n***********************************************************\n");

    }


}
