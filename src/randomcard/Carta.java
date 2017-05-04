/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcard;

/**
 *
 * @author INTEL-COREi7
 */
public class Carta {
    private String palo;
    private String valor;
    
    
    public Carta() {
        this.palo = " ";
        this.valor = " ";
    }

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", valor=" + valor + '}';
    }

   
}
