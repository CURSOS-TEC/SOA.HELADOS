package com.soa.jesteban.soajuanhelados.utils;

/**
 * Created by jesteban on 26/04/18.
 */

public class ManiHelado  implements  IHelado, IHeladoBuilder {
    String sabor;
    String ingredientes;
    public ManiHelado(){
        this.sabor = this.buildHelado();
    }

    @Override
    public void preparar(){
        this.ingredientes = obtenerIngredientes();
        System.out.println(" preparando helado de mani");
    }

    @Override
    public String obtenerIngredientes() {
        return "ingredientes de mani";
    }

    @Override
    public String buildHelado(){
        return " MANI MANI";
    };


}
