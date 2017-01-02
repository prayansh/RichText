package com.prayansh.textformat;

import com.prayansh.textformat.actions.NumberFormatAction;
import com.prayansh.textformat.formats.TextFormat;
import com.prayansh.textformat.utils.NumberFormat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 2017-01-02.
 */
public class NumberFormatTest {
    @Test
    public void testFormatThousand() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.THOUSAND));
        assertEquals("11,111,111", RichText.apply(text, "11111111"));
    }

    @Test
    public void testFormatThousand2() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.THOUSAND));
        assertEquals("111,111,111", RichText.apply(text, "111111111"));
    }

    @Test
    public void testFormatThousand3() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.THOUSAND));
        assertEquals("1", RichText.apply(text, "1"));
    }

    @Test
    public void testFormatThousand4() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.THOUSAND));
        assertEquals("111", RichText.apply(text, "111"));
    }

    @Test
    public void testFormatThousand5() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.THOUSAND));
        assertEquals("1,111", RichText.apply(text, "1111"));
    }

    @Test
    public void testFormatLakh() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.LAKH));
        assertEquals("1,11,11,11,111", RichText.apply(text, "1111111111"));
    }

    @Test
    public void testFormatLakh2() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.LAKH));
        assertEquals("11,11,11,111", RichText.apply(text, "111111111"));
    }

    @Test
    public void testFormatLakh3() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.LAKH));
        assertEquals("1", RichText.apply(text, "1"));
    }

    @Test
    public void testFormatLakh4() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.LAKH));
        assertEquals("111", RichText.apply(text, "111"));
    }

    @Test
    public void testFormatLakh5() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.LAKH));
        assertEquals("1,111", RichText.apply(text, "1111"));
    }

    @Test
    public void testFormatWan() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.WAN));
        assertEquals("1,1111", RichText.apply(text, "11111"));
    }

    @Test
    public void testFormatWan2() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.WAN));
        assertEquals("1,1111,1111", RichText.apply(text, "111111111"));
    }

    @Test
    public void testFormatWan3() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.WAN));
        assertEquals("1", RichText.apply(text, "1"));
    }

    @Test
    public void testFormatWan4() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.WAN));
        assertEquals("111", RichText.apply(text, "111"));
    }

    @Test
    public void testFormatWan5() {
        TextFormat text = new TextFormat();
        text.addAction(new NumberFormatAction(NumberFormat.WAN));
        assertEquals("1111", RichText.apply(text, "1111"));
    }
}
