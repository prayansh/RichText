package com.prayansh.textformat.format;

/**
 * Created by Prayansh on 16-07-16.
 */
public class AnchorText extends TextFormat {
    protected int anchorPosition = 0;
    protected String anchorText = EMPTY_STRING;

    public AnchorText position(int pos) {
        anchorPosition = pos;
        return this;
    }

    public AnchorText anchorText(String txt) {
        anchorText = txt.trim();
        return this;
    }

    @Override
    protected void initFormattedString() {
        formattedText = text.substring(0, anchorPosition) + anchorText + text.substring
                (anchorPosition);
    }
}
