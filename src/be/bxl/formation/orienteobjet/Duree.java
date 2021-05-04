package be.bxl.formation.orienteobjet;
import java.util.*;
public class Duree {
    int jours;
    int heures;
    int minutes;
    int secondes;
    String text;
    public Duree(int nbSecondes)
    {
        this.heures=nbSecondes/3600;
        this.minutes=((nbSecondes%3600)-heures)/60;
        this.secondes=(nbSecondes-heures*3600-minutes*60);
        this.text="Duree "+this.heures+"heure(s) "+this.minutes+" minute(s) "+this.secondes+ " secondes";
        System.out.println(text);
    }
    public Duree(int jour,int heure,int minute,int seconde)
    {   this.heures=(jour*24)+heure;
        this.minutes=minute;
        this.secondes=seconde;
        this.text="Duree "+this.heures+"heure(s) "+this.minutes+" minute(s) "+this.secondes +" secondes";
        System.out.println(text);
    }
    public String getDuree()
    {
        return this.text;
    }
    public int getTotalSeconde()
    {
        return (heures*3600)+(minutes*60)+secondes;
    }
    public void subDuree(Duree aSoustraire)
    {
        this.heures-=aSoustraire.heures;
        this.minutes-=aSoustraire.minutes;
        this.secondes-=aSoustraire.secondes;
    }
    public void addDuree(Duree aAjouter)
    {
        this.heures+=aAjouter.heures;
        this.minutes+=aAjouter.minutes;
        this.secondes+= aAjouter.secondes;
    }
    //test
    public static void main (String []args)
    {
        Duree period=new Duree(45896);
        System.out.println(period.getTotalSeconde());
        Duree period2=new Duree(2,28,45,5);
    }
}
