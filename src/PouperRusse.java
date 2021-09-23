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

    public void Ouverte(){
        this.ouverte=true;
    }

    public void Fermer(){
        this.ouverte=false;
    }

    void PlacerDans(PouperRusse p){
        if (p.taille > this.taille) {
            System.out.println("Erreur");
        }

        else{
            this.p=p;
        }
    }


    public PouperRusse SortirDe(PouperRusse p){

        if (this.p ==  null) {
            System.out.println("Erreur");
            return null;
        }

        else{

            PouperRusse p2 = this.p;
            this.p = null ;
            return  p2;
        }

    }

}






