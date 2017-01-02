package com.prayansh.textformat.utils;

/**
 * Created by Prayansh on 2017-01-01.
 */

public enum NumberFormat {
    THOUSAND(3, 3), LAKH(3, 2), WAN(4, 4);
    private int firstBlock, otherBlock;

    NumberFormat(int firstBlock, int otherBlock) {
        this.firstBlock = firstBlock;
        this.otherBlock = otherBlock;
    }

    public int getFirstBlock() {
        return firstBlock;
    }

    public int getOtherBlock() {
        return otherBlock;
    }
}
