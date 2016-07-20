package com.prayansh.textformat;

/**
 * Created by Prayansh on 16-07-20.
 */
public class BlockText extends TextFormat {
    private static final String SPACE = " ";
    public int[] blockWidths;
    private String delimiter;

    public BlockText() {
        super();
        blockWidths = new int[]{3, 3, 3};
        delimiter(SPACE);
    }

    public BlockText blocks(int block1, int... blocks) {
        blockWidths = new int[1 + blocks.length];
        blockWidths[0] = block1;
        for (int i = 1; i < blockWidths.length; i++) {
            blockWidths[i] = blocks[i - 1];
        }
        return this;
    }

    public BlockText delimiter(String s) {
        this.delimiter = s;
        return this;
    }

    public BlockText build() {
        super.build();
        String result = getFormattedText();
        formattedText = BLANK;

        int letter = 0;
        for (int i = 0; i < blockWidths.length; i++) {
            for (int j = 0; j < blockWidths[i]; j++) {
                formattedText += result.charAt(letter);
                letter++;
            }
            if (i != (blockWidths.length - 1))
                formattedText += delimiter;
        }

        return this;
    }
}
