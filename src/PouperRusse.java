public class PouperRusse {

    public int taille;
    private PouperRusse p;
    public boolean ouverte;

    public PouperRusse(int taille, PouperRusse p) {
        this.taille = taille;
        this.p = p;
        this.ouverte=false;

    }

    private void PouperRusse(int taille) {
        this.taille=taille;
        this.p=null;
    }

    public boolean Ouverte(){
        this.ouverte=true;
    }

    public boolean Fermer(){
        this.ouverte=false;
        .
    }



}





