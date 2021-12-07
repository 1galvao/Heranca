/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Automovel extends Terrestre{
    private String numPlaca;
    private String cor;
    private int numPortas;
    
    void imprimeDados(){
        System.out.println();
        System.out.println("---------Automovel---------");
        System.out.println("N° da placa: "+numPlaca);
        System.out.println("N° de portas: "+numPortas);
        System.out.println("N° de rodas: "+numR);
        System.out.println("Capacidade: "+cap);
        System.out.println("cor: "+cor);
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public Automovel(){
        
    }
}
