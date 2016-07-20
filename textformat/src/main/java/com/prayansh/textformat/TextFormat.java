package com.prayansh.textformat;

import java.util.HashMap;

/**
 * Created by Prayansh on 16-07-19.
 */
public class TextFormat {
    protected static final String BLANK = "";
    protected String rawText, formattedText;
    private String prefix, suffix;
    private HashMap<Integer, String> anchors;

    public TextFormat() {
        setFormattedText(BLANK);
        setRawText(BLANK);
        setPrefix(BLANK);
        setSuffix(BLANK);
    }

    private void setFormattedText(String formattedText) {
        this.formattedText = formattedText;
    }

    private void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    private void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public TextFormat setRawText(String rawText) {
        this.rawText = rawText;
        return this;
    }

    public TextFormat prefix(String s) {
        setPrefix(s);
        return this;
    }

    public TextFormat suffix(String s) {
        setSuffix(s);
        return this;
    }

    public TextFormat addAnchor(int i, String s) {
        if (anchors == null)
            anchors = new HashMap<>();
        anchors.put(i, s);
        return this;
    }

    public String getRawText() {
        return rawText;
    }

    public String getFormattedText() {
        return formattedText;
    }

    public TextFormat build() {
        formattedText += prefix;
        boolean noAnchors = false;
        if (anchors == null)
            noAnchors = true;
        for (int i = 0; i < rawText.length(); i++) {
            formattedText += rawText.charAt(i);
            if (!noAnchors) {
                if (anchors.get(i) != null) {
                    formattedText += anchors.get(i);
                }
            }
        }
        formattedText += suffix;
        return this;
    }
}
