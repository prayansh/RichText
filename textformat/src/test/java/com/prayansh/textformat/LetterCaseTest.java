package com.prayansh.textformat;

import com.prayansh.textformat.actions.LetterCaseAction;
import com.prayansh.textformat.formats.TextFormat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 2017-01-02.
 */

public class LetterCaseTest {
    @Test
    public void testUpperCase() {
        TextFormat tf = new TextFormat();
        tf.addAction(new LetterCaseAction(LetterCaseAction.UPPER));
        assertEquals("TEXTFORMAT", RichText.apply(tf, "TextFormat"));
    }

    @Test
    public void testLowerCase() {
        TextFormat tf = new TextFormat();
        tf.addAction(new LetterCaseAction(LetterCaseAction.LOWER));
        assertEquals("textformat", RichText.apply(tf, "TextFormat"));
    }
}
