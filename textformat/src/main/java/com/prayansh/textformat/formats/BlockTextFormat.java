package com.prayansh.textformat.formats;

import com.prayansh.textformat.utils.ActionPriority;
import com.prayansh.textformat.actions.BlockFormatAction;

/**
 * Created by Prayansh on 16-07-20.
 */
public class BlockTextFormat extends TextFormat {
    private String delimiter;

    public BlockTextFormat() {
        super();
        delimiter = "";
    }

    public BlockTextFormat delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Setup block format
     * To add delimiter, use
     * {@link #delimiter(String) delimiter(String)} before calling {@link #blocks(int, int...) this}
     * function
     */
    public BlockTextFormat blocks(int block1, int... blocks) {
        int blockWidths[] = new int[1 + blocks.length];
        blockWidths[0] = block1;
        for (int i = 1; i < blockWidths.length; i++) {
            blockWidths[i] = blocks[i - 1];
        }
        addAction(new BlockFormatAction(blockWidths, delimiter), ActionPriority.AFTER);
        return this;
    }
}
