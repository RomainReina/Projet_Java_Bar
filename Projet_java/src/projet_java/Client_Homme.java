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
public class Client_Homme extends Client {
    
    //Varaible
   private String tshirtColor;
   
   //constructor
    public Client_Homme(String tshirtColor, String boissonFavo, String boissonFavo2, int degresAlco, String premon, String surnom, float porte_monnaie, int cote_de_popularité, String cri) {
        super(boissonFavo, boissonFavo2, degresAlco, premon, surnom, porte_monnaie, cote_de_popularité, cri);
        this.tshirtColor = tshirtColor;
    }
   
}
