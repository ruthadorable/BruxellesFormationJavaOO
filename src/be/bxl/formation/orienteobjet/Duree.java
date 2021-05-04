package be.bxl.formation.orienteobjet;
import java.util.*;
public class Duree {
    private int jours;
    private int heures;
    private int minutes;
    private int secondes;
    private String text;
    public Duree(int nbSecondes)
    {
        this.heures=nbSecondes/3600;
        this.minutes=((nbSecondes%3600)-heures)/60;
        this.secondes=(nbSecondes-heures*3600-minutes*60);
        System.out.println(this.getDuree());
    }
    public Duree(int jour,int heure,int minute,int seconde)
    {   this.heures=(jour*24)+heure;
        this.minutes=minute;
        this.secondes=seconde;
        System.out.println(this.getDuree());
    }
    public String getDuree()
    {
        return "Duree "+this.heures+"heure(s) "+this.minutes+" minute(s) "+this.secondes+ " secondes";
    }
    public int getTotalSeconde()
    {
        return (heures*3600)+(minutes*60)+secondes;
    }
    public void subDuree(Duree aSoustraire)
    {
        Duree d=new Duree(this.getTotalSeconde()-aSoustraire.getTotalSeconde());
        this.heures=d.heures;
        this.minutes=d.minutes;
        this.secondes=d.secondes;

    }
    public void addDuree(Duree aAjouter)
    {
        Duree d=new Duree(this.getTotalSeconde()+aAjouter.getTotalSeconde());
        this.heures=d.heures;
        this.minutes=d.minutes;
        this.secondes=d.secondes;
    }
    //test
    public static void main (String []args)
    {
        Duree period=new Duree(45896);
        System.out.println(period.getTotalSeconde());
        Duree period2=new Duree(2,28,45,5);
        Duree per=new Duree(1500);
        period.subDuree(per);
        System.out.println(period.getDuree());
    }
}
