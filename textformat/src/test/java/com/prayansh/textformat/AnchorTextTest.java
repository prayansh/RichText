package com.prayansh.textformat;

import com.prayansh.textformat.format.AnchorText;
import com.prayansh.textformat.format.TextFormat;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Prayansh on 16-07-17.
 */
public class AnchorTextTest {
    @Test
    public void testFormattingDefault() {
        TextFormat text = new AnchorText().anchorText("pre").setText("123456789");
        assertEquals("pre123456789", text.getFormattedText());
    }

    @Test
    public void testFormattingCustom() {
        TextFormat text = new AnchorText().position(3).anchorText("mid").setText("7803181058");
        assertEquals("780mid3181058", text.getFormattedText());
    }
}
