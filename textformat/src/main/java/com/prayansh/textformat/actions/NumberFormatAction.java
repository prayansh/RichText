package com.prayansh.textformat.actions;

import com.prayansh.textformat.interfaces.StringTextAction;
import com.prayansh.textformat.utils.NumberFormat;

/**
 * Created by Prayansh on 2017-01-01.
 */

public class NumberFormatAction implements StringTextAction {
    private NumberFormat type;

    public NumberFormatAction(NumberFormat type) {
        this.type = type;
    }

    @Override
    public String applyFormat(String s) {
        validateString(s);
        boolean bool = false;
        StringBuilder builder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; ) {
            if (!bool) {
                for (int j = 0; j < type.getFirstBlock() && i >= 0; j++, i--)
                    builder.append(s.charAt(i));
                if (i >= 0)
                    builder.append(",");
                bool = true;
            } else {
                for (int j = 0; j < type.getOtherBlock() && i >= 0; j++, i--)
                    builder.append(s.charAt(i));
                if (i >= 0)
                    builder.append(",");
            }
        }
        return builder.reverse().toString();
    }

    private void validateString(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                throw new IllegalArgumentException("Only numbers allowed : " + s);
        }
    }
}
