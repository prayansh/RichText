package com.prayansh.textformat;

import com.prayansh.textformat.formats.TextFormat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 16-07-17.
 */
public class BasicTextFormat {

    @Test
    public void testMoneyFormat() {
        TextFormat text = new TextFormat().prefix("$");
        assertEquals("$23.09", RichText.apply(text, "23.09"));
    }

    @Test
    public void testEmailFormat() {
        TextFormat text = new TextFormat().suffix("@gmail.com");
        assertEquals("xyz@gmail.com", RichText.apply(text, "xyz"));
    }

    @Test
    public void test() {
        TextFormat text = new TextFormat().prefix("pre").suffix("end");
        assertEquals("pre7803181058end", RichText.apply(text, "7803181058"));
    }


    @Test
    public void test2() {
        TextFormat text = new TextFormat().suffix("end").prefix("pre");
        assertEquals("pre7803181058end", RichText.apply(text, "7803181058"));
    }
}
