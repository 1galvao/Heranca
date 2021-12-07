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
public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setCor("amarelo");
        carro.setNumPlaca("23ASD9");
        carro.setNumPortas(4);
        carro.setNumR(4);
        carro.setCap(5);
        
        moto.setCor("azul");
        moto.setNumPlaca("23ASE7");
        moto.setNumPortas(0);
        moto.setNumR(2);
        moto.setCap(2);
        
        moto.imprimeDados();
        carro.imprimeDados();
    }
}
