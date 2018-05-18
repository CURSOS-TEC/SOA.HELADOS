package com.soa.jesteban.soajuanhelados.utils;

/**
 * Created by jesteban on 26/04/18.
 */

public interface IHeladoFactory {
    public enum Sabor {COCO, FRESA, MANI}
    public IHelado fabricar (Sabor sabor);
}
