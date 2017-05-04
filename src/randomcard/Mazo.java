/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author INTEL-COREi7
 */
public class Mazo {
    ArrayList <Carta> cartas = new ArrayList<>();
    
    String[] palo = {"CorazonN", "Trebol", "Diamante", "CorazonR"};
    String[] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    public void llenar(){
        for (int i = 0; i < palo.length; i++) {
            for(int j = 0; j < valor.length; j++){
                this.cartas.add(new Carta(palo[i],valor[j]));
            }
            
        }
         Collections.shuffle(this.cartas);
    }
    
     public ArrayList<Carta> getMazo(){
        return cartas;
    }
     
     public void mostrar(){
         System.out.println(getMazo());
     }

    
}
