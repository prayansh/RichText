package com.prayansh.textformat;

import com.prayansh.textformat.formats.TextFormat;
import com.prayansh.textformat.interfaces.AbstractTextAction;
import com.prayansh.textformat.utils.ActionPair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Prayansh on 16-07-19.
 */
public class RichText {

    public static String apply(TextFormat tf, String rawText) {
        List<AbstractTextAction> actions = getSortedActions(tf);
        String formattedText = rawText;
        for (AbstractTextAction action : actions) {
            formattedText = (String) action.applyFormat(formattedText);
        }
        return formattedText;
    }

    private static List<AbstractTextAction> getSortedActions(TextFormat tf) {
        List<ActionPair<Integer, AbstractTextAction>> actions = tf.getActions();
        Collections.sort(actions, new Comparator<ActionPair<Integer, AbstractTextAction>>() {
            @Override
            public int compare(ActionPair<Integer, AbstractTextAction> o1, ActionPair<Integer,
                    AbstractTextAction> o2) {
                if (o1.key.equals(o2.key))
                    return 0;
                return (o1.key > o2.key) ? 1 : -1;
            }
        });
        List<AbstractTextAction> result = new ArrayList<>();
        for (ActionPair<Integer, AbstractTextAction> action : actions) {
            result.add(action.value);
        }
        return result;
    }
}
