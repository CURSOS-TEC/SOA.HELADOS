package com.soa.jesteban.soajuanhelados.utils;

/**
 * Created by jesteban on 26/04/18.
 */

public class CocoHelado implements IHelado, IHeladoBuilder {
    String sabor;
    String ingredientes;
    public CocoHelado(){
        this.sabor = this.buildHelado();
    }

    @Override
    public void preparar(){
        this.ingredientes = obtenerIngredientes();
        System.out.println(" preparando helado de coco");
    }

    @Override
    public String obtenerIngredientes() {
        return "ingredientes de coco";
    }

    @Override
    public String buildHelado(){
      return " COCO COCO";
    };
}
