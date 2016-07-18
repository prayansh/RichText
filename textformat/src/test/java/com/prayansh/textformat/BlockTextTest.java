package com.prayansh.textformat;

import com.prayansh.textformat.format.BlockText;
import com.prayansh.textformat.format.TextFormat;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created by Prayansh on 16-07-17.
 */
public class BlockTextTest {

    @Test
    public void testFormattingDefault() {
        TextFormat text = new BlockText().setText("123456789");
        assertEquals("123 456 789", text.getFormattedText());
    }

    @Test
    public void testFormattingCustom() {
        TextFormat text = new BlockText().blockWidth(3,3,4).delimiter("-")
                .setText("7803181058");
        assertEquals("780-318-1058", text.getFormattedText());
    }
}
