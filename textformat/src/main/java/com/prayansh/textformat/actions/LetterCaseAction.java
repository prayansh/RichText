package com.prayansh.textformat.actions;

import com.prayansh.textformat.interfaces.StringTextAction;

/**
 * Created by Prayansh on 2017-01-01.
 */

public class LetterCaseAction implements StringTextAction {
    public static final int UPPER = 0;
    public static final int LOWER = 1;
    private int textCase;

    public LetterCaseAction(int textCase) {
        this.textCase = textCase;
    }

    @Override
    public String applyFormat(String s) {
        if (textCase == 0)
            return s.toUpperCase();
        else
            return s.toLowerCase();
    }
}
