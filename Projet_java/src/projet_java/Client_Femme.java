/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_java;

/**
 *
 * @author rreina
 */
public class Client_Femme extends Client {
    
    //Varaible
   private String bijoux[];
   
   //constructor
    public Client_Femme(String tshirtColor, String boissonFavo, String boissonFavo2, int degresAlco, String premon, String surnom, float porte_monnaie, int cote_de_popularité, String cri) {
        super(boissonFavo, boissonFavo2, degresAlco, premon, surnom, porte_monnaie, cote_de_popularité, cri);
        this.bijoux = bijoux;
    }
   
    
}
