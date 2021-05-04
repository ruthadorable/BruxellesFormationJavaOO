package be.bxl.formation.orienteobjet;

public class Personnage {
    String nom;
    String prenom;
    int force=46;
    int pointdevie=20;
    int jaugedeVie=500;
    boolean seFaitAttaquer=false;
    String destination[]={"ville","village","ferme","grotte"};

    public Personnage(String nom,String prenom,int force)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.force=force;
    }
    public void sePresenter()
    {
        System.out.println("Bonjour , je suis "+this.prenom+" "+this.nom+" .");
    }
    public void attaquer(Personnage cible)
    {
        cible.seFaitAttaquer=true;
        System.out.println( this.prenom+" "+this.nom+" attaque "+cible.prenom+" "+cible.nom);
        cible.jaugedeVie-=this.force;
        cible.seFaitAttaquer=false;

    }
    public void seDefendre(Personnage ennemi)
    {
        if(this.seFaitAttaquer==true)
        {
            this.jaugedeVie+= ennemi.force;
        }

    }
    public void realiserTrajet(Lieu lieu)
    {
        System.out.println(this.prenom+"est en route vers "+lieu.name());



    }
}
