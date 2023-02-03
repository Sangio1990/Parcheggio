package it.ranstad.parcheggio.entity;
/*
Biglietto
 attributi:
  oraIngresso
 */

import java.time.LocalDateTime;

public class Biglietto {

    private LocalDateTime dateTime;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    //  Il metodo set al momento non serve all'esterno della classe quindi è settato a private
    private void setDateTime(LocalDateTime dateTime) {

        this.dateTime = dateTime;
    }

    // Il biglietto viene salvato con 90 minuti rispetto ad ora per simulare il tempo passato
    public Biglietto(){
        setDateTime(LocalDateTime.now().minusMinutes(90));
    }
}
