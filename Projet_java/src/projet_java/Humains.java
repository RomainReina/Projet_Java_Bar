package projet_java;

/**
 *
 * @author R
 */
public class Humains {

    //Varaible
   private String premon;
   private String surnom;
   private float porte_monnaie;
   private int cote_de_popularité;
   private String cri;

   
   //Constructeur
    public Humains(String premon, String surnom, float porte_monnaie, int cote_de_popularité, String cri) {
        this.premon = premon;
        this.surnom = surnom;
        this.porte_monnaie = porte_monnaie;
        this.cote_de_popularité = cote_de_popularité;
        this.cri = cri;
    }
    
    //Getter
    public String getPremon() {
        return premon;
    }

    public String getSurnom() {
        return surnom;
    }

    public float getPorte_monnaie() {
        return porte_monnaie;
    }

    public int getCote_de_popularité() {
        return cote_de_popularité;
    }

    public String getCri() {
        return cri;
    }
   
   // fonction parler: permet à une personne de parler et enregistrer les log dasn un fichier texte !
    
    public void parler(String nom,String phrase){
        System.out.println( nom + ": " + phrase );
        
        
    }
    
    
    
    
    
}
