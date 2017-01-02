package com.prayansh.textformat.utils;

/**
 * Created by Prayansh on 16-07-24.
 */
public enum DateUnit {
    DAY(2), MONTH(2), YEAR(4);

    public final int width;

    DateUnit(int width) {
        this.width = width;
    }
}
