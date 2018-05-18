package com.soa.jesteban.soajuanhelados.utils;

/**
 * Created by jesteban on 26/04/18.
 */

public class HeladoFactory implements IHeladoFactory {

    public IHelado helado;
    public HeladoFactory(){

    }

    @Override
    public IHelado fabricar (Sabor sabor){
        switch (sabor){
            case COCO:
                helado = new CocoHelado();
                break;
            case MANI:
                helado = new ManiHelado();
                break;
            case FRESA:
                helado = new FresaHelado();
                break;
        }
        return helado;
    }


}
