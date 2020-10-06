package projet_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

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

   // constructor
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
    
    // permet de se presenter suivant une phrase predefini
    public void sePresenter(String phrase, String nom){
        
    // si cote elever, on met une phrase de beau gosse, sinon phrase normal?
    // si deja bourré, phrase en consequence?
    System.out.println(nom + ": "+ "bonjours, je m'appel roger er vous ?");
    System.out.println(nom + ": "+ "salut la compagnie moi c'est ");
    System.out.println(nom + ": "+ "wesh tes qui, Marcel va te def le cul! ");
    }
   
   // fonction parler: permet à une personne de parler et enregistrer les log dasn un fichier texte !
    public void parler(String nom,String phrase){
        System.out.println( nom + ": " + phrase ); 
    }
    
    // fct pour boire, action qui permet de changer les variable cote_de_popularité et alcolemie
    public void boire(){
        
    }
    
    // 
    public void payer(){
    }
    
    //
    public void offirVerre(){
    }
    
}
