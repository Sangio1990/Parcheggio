package it.ranstad.parcheggio.entity;

import java.util.ArrayList;
import java.util.List;

/*
Area
 attributi:
  numeroPosti
  accessibile
  List<Veicoli> posti

 isAccessibile
 calcolaDisponibilitaPosti

 parcheggiaVeicolo( Veicolo veicolo )
 Veicolo = esceVeicolo( Targa )

 */
public class Area {
    private String nome;

    private int numeroPosti;
    private boolean Accessibile; //Se falsa i veicoli particolari (esempio i Pullman) non possono parcheggiare
    private List<Veicolo> posti;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public boolean isAccessibile() {
        return Accessibile;
    }

    public void setAccessibile(boolean accessibile) {
        Accessibile = accessibile;
    }

    public List<Veicolo> getPosti() {
        return posti;
    }

    public void setPosti(List<Veicolo> posti) {
        this.posti = posti;
    }

    public Area(String nome, int numeroPosti, boolean accessibile) {
        setNome(nome);
        setNumeroPosti(numeroPosti);
        setAccessibile(accessibile);
        posti = new ArrayList();

    }
    public int calcolaDisponibilitaPosti(){
        return numeroPosti - posti.size();
    }

    public void parcheggiaVeicolo( Veicolo veicolo ){
        posti.add(veicolo);
        numeroPosti -= veicolo.getSlotOccupati();
    }

    public Veicolo esceVeicolo (String targa){
        // Ritorna null se non trova il veicolo
        for (Veicolo temp: posti){
            if (temp.getTarga().equals(targa)){
                numeroPosti += temp.getSlotOccupati();
                posti.remove(temp);
                return temp;
            }
        }
        return null;
    }

    public boolean giaParcheggiato(Veicolo veicolo){
        // Controlla se il veicolo è già presente nell'area
        for (Veicolo temp: posti){
            if (temp.equals(veicolo))
                return true;
        }
        return false;
    }
    public boolean isParcheggiabile(Veicolo veicolo){
        // Controlla se il veicolo è parcheggiabile all'interno dell'area
        return calcolaDisponibilitaPosti() >= veicolo.getSlotOccupati() && (isAccessibile()
                || !veicolo.isParticolare());
    }
}
