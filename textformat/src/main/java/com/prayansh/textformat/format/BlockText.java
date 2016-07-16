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

    public BlockText blockWidth(int[] blockWidth) {
        this.blockWidth = blockWidth;
        return this;
    }

    public BlockText delimiter(String delimiter) {
        this.blockDelimiter = delimiter;
        return this;
    }

}
