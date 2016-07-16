package com.prayansh.textformat.format;

/**
 * Created by Prayansh on 16-07-16.
 */
public abstract class TextFormat {
    public static final String EMPTY_STRING = "";
    protected String text;
    protected String formattedText;

    public TextFormat() {
        this.text = this.formattedText = EMPTY_STRING;
    }

    public String getText() {
        return text;
    }

    /**
     * Sets Text for formatting
     * Should be setup last
     * @param text
     * @return
     */
    public TextFormat setText(String text) {
        this.text = text;
        initFormattedString();
        return this;
    }

    public String getFormattedText() {
        return formattedText;
    }

    protected abstract void initFormattedString();
}
