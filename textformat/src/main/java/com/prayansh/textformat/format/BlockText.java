package com.prayansh.textformat.format;

import java.util.ArrayList;

/**
 * Created by Prayansh on 16-07-16.
 */
public class BlockText extends TextFormat {
    protected int blockWidth[] = {3, 3, 3};
    protected String blockDelimiter = " ";

    @Override
    protected void initFormattedString() {
        int letter = 0;
        for (int i = 0; i < blockWidth.length; i++) {
            for (int j = 0; j < blockWidth[i]; j++) {
                formattedText += text.charAt(letter);
                letter++;
            }
            if (i != (blockWidth.length - 1))
                formattedText += blockDelimiter;
        }
    }

    public BlockText blockWidth(int width1,int... widths) {
        blockWidth = new int[1 + widths.length];
        blockWidth[0] = width1;
        for(int i=1;i<blockWidth.length;i++){
            blockWidth[i] = widths[i-1];
        }
        return this;
    }

    public BlockText delimiter(String delimiter) {
        this.blockDelimiter = delimiter;
        return this;
    }

}
