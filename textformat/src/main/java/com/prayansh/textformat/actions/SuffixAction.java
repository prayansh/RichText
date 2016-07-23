package com.prayansh.textformat.actions;

import com.prayansh.textformat.interfaces.StringTextAction;

/**
 * Created by Prayansh on 16-07-23.
 */
public class SuffixAction implements StringTextAction {
    private String suffix;

    public SuffixAction(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public String applyFormat(String s) {
        return s + suffix;
    }
}
