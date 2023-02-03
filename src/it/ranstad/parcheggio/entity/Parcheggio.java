package it.ranstad.parcheggio.entity;

import java.util.List;

/*
Parcheggio
 List<Area> aree
 */
public class Parcheggio {
    private List<Area> aree;

    public List<Area> getAree() {
        return aree;
    }

    public void setAree(List<Area> aree) {
        this.aree = aree;
    }

    public Veicolo esceVeicolo (String targa){
        // Ritorna null se il veicolo non è presente
        for(Area area : aree){
            Veicolo temp = area.esceVeicolo(targa);
            if (temp != null){
                return temp;
            }
        }
        System.out.println("Non ho trovato alcun veicolo parcheggiato con targa " + targa);
        return null;
    }

    private boolean parcheggiaVeicolo(Veicolo veicolo, Area area){
        // Parcheggia il veicolo nell'area in cui vi è posto
        area.parcheggiaVeicolo(veicolo);
        System.out.println(veicolo.getTipologia() + " "  + veicolo.getTarga() + " parcheggiato in area: " + area.getNome());
        return true;
    }
    public boolean cercaPostoLibero(Veicolo veicolo){
        // Controlla se il veicolo è già parcheggiato
        for(Area area: aree) {
            if (area.giaParcheggiato(veicolo)){
                System.out.println("Il veicolo " + veicolo.getTarga() + "è già presente nel parcheggio,");
                return true;
            }
        }
        // Controlla se un posto libero è preente nel parcheggio
        for (Area area : aree){
            if (area.isParcheggiabile(veicolo)){
                return parcheggiaVeicolo(veicolo, area);
            }
        }
        System.out.println("Non vi è alcun posto per " + veicolo.getTipologia());
        return false;
    }
}
