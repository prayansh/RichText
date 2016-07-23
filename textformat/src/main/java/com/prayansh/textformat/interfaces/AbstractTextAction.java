package com.prayansh.textformat.interfaces;

/**
 * Created by Prayansh on 16-07-23.
 * This is an abstract model for a TextAction
 * Generic Type <T> is used to specify the input type of the Text
 * Ideally <T> should be one of String, StringBuilder, CharSequence, Editable
 */
public interface AbstractTextAction<T> {
    T applyFormat(T s);
}
