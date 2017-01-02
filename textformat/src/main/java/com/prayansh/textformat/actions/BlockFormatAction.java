package com.prayansh.textformat.actions;

import com.prayansh.textformat.interfaces.StringTextAction;

/**
 * Created by Prayansh on 16-07-23.
 */
public class BlockFormatAction implements StringTextAction {
    private final String delimiter;
    private final int blockWidths[];

    public BlockFormatAction(int[] blocks, String d) {
        this.blockWidths = blocks;
        this.delimiter = d;
    }

    @Override
    public String applyFormat(String s) {
        StringBuilder result = new StringBuilder();
        int letter = 0;
        for (int i = 0; i < blockWidths.length; i++) {
            if (letter == s.length())
                break;
            for (int j = 0; j < blockWidths[i]; j++) {
                result.append(s.charAt(letter++));
            }
            if (i != (blockWidths.length - 1))
                result.append(delimiter);
        }
        return result.toString();
    }
}
