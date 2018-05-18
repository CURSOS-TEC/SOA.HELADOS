package com.soa.jesteban.soajuanhelados.utils;

/**
 * Created by jesteban on 26/04/18.
 */

public class FresaHelado implements IHelado, IHeladoBuilder {

    String sabor;
    String ingredientes;
    public FresaHelado(){
        this.sabor = this.buildHelado();
    }

    @Override
    public void preparar(){
        this.ingredientes = obtenerIngredientes();
        System.out.println(" preparando helado de fresa");
    }

    @Override
    public String obtenerIngredientes() {
        return "ingredientes de fresa";
    }

    @Override
    public String buildHelado(){
        return " FRESA FRESA";
    };
}
