package com.prayansh.textformat.formats;

import com.prayansh.textformat.actions.BlockFormatAction;
import com.prayansh.textformat.utils.ActionPriority;

/**
 * Created by Prayansh on 16-07-20.
 */
public class BlockTextFormat extends TextFormat {
    private String delimiter;
    private int[] blockWidths;

    public BlockTextFormat() {
        super();
    }

    protected BlockTextFormat delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    public BlockTextFormat blocks(int block1, int... blocks) {
        return blocks("", block1, blocks);
    }

    public BlockTextFormat blocks(String delimiter, int block1, int... blocks) {
        delimiter(delimiter);
        blockWidths = new int[1 + blocks.length];
        blockWidths[0] = block1;
        for (int i = 1; i < blockWidths.length; i++) {
            blockWidths[i] = blocks[i - 1];
        }
        addAction(new BlockFormatAction(blockWidths, delimiter), ActionPriority.AFTER);
        return this;
    }
}
