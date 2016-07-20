package com.prayansh.textformat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 16-07-17.
 */
public class BasicTextFormat {

    @Test
    public void testPrefix() {
        TextFormat text = new TextFormat().prefix("pre").setRawText("123456789").build();
        assertEquals("pre123456789", text.getFormattedText());
    }

    @Test
    public void testSuffix() {
        TextFormat text = new TextFormat().suffix("end").setRawText("7803181058").build();
        assertEquals("7803181058end", text.getFormattedText());
    }

    @Test
    public void testAnchor() {
        TextFormat text = new TextFormat()
                .addAnchor(3, "mid")
                .setRawText("7803181058")
                .build();
        assertEquals("7803mid181058", text.getFormattedText());
    }

    @Test
    public void testAnchorMultiple() {
        TextFormat text = new TextFormat()
                .addAnchor(3, "mid")
                .addAnchor(5, "mid")
                .setRawText("7803181058")
                .build();
        assertEquals("7803mid18mid1058", text.getFormattedText());
    }
}
