package com.prayansh.textformat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 16-07-17.
 */
public class BlockTextTest {

    @Test
    public void testFormattingDefault() {
        TextFormat text = new BlockText().setRawText("123456789").build();
        assertEquals("123 456 789", text.getFormattedText());
    }

    @Test
    public void testFormattingCustom() {
        TextFormat text = new BlockText().blocks(3, 3, 4).delimiter("-")
                .setRawText("7803181058").build();
        assertEquals("780-318-1058", text.getFormattedText());
    }
}
