package com.prayansh.textformat;

import com.prayansh.textformat.formats.DateTextFormat;
import com.prayansh.textformat.formats.TextFormat;
import com.prayansh.textformat.utils.DateUnit;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Prayansh on 16-07-24.
 */
public class DateTextFormatTest {
    @Test
    public void testFormat_Y_M_D() {
        TextFormat text = new DateTextFormat().format(DateUnit.YEAR, DateUnit
                .MONTH, DateUnit.DAY);
        assertEquals("2016-07-24", RichText.apply(text, "20160724"));
    }

    @Test
    public void testFormat_D_M_Y() {
        TextFormat text = new DateTextFormat().format(DateUnit.DAY, DateUnit.MONTH, DateUnit
                .YEAR, "/");
        assertEquals("24/07/2016", RichText.apply(text, "24072016"));
    }

    @Test
    public void testFormat_M_D_Y() {
        TextFormat text = new DateTextFormat().format(DateUnit.MONTH, DateUnit.DAY,
                DateUnit.YEAR, "-");
        assertEquals("07-24-2016", RichText.apply(text, "07242016"));
    }
}
