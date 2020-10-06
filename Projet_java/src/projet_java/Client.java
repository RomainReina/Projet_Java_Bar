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
public class Client extends Humains{
    
    //Varaible
    private String boissonFavo;
    private String boissonFavo2;
    private int degresAlco;

    public Client(String boissonFavo, String boissonFavo2, int degresAlco, String premon, String surnom, float porte_monnaie, int cote_de_popularité, String cri) {
        super(premon, surnom, porte_monnaie, cote_de_popularité, cri);
        this.boissonFavo = boissonFavo;
        this.boissonFavo2 = boissonFavo2;
        this.degresAlco = degresAlco;
    }
    
    
    //Fct 
    public void seFaireOffrirVerre(){
        
    }
    public void sePresenterClient(){}
            
    public void offrirTournee(){}
            
    public void commander() //Client,Boisson 
    {}  
    
    
}
