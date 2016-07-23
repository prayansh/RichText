package com.prayansh.textformat.utils;

import com.prayansh.textformat.interfaces.AbstractTextAction;

/**
 * Created by Prayansh on 16-07-23.
 */
public class ActionPair<P, A extends AbstractTextAction> {
    public P key;
    public A value;

    public ActionPair(P key, A value) {
        this.key = key;
        this.value = value;
    }
}
