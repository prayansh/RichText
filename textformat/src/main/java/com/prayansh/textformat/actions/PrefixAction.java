package com.prayansh.textformat.actions;

import com.prayansh.textformat.interfaces.StringTextAction;

/**
 * Created by Prayansh on 16-07-23.
 */
public class PrefixAction implements StringTextAction {
    private String prefix;

    public PrefixAction(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String applyFormat(String s) {
        return prefix + s;
    }
}
