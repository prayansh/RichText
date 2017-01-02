package com.prayansh.textformat;

import com.prayansh.textformat.formats.BlockTextFormat;
import com.prayansh.textformat.formats.TextFormat;

import org.junit.Test;
import org.w3c.dom.Text;

import static junit.framework.Assert.*;

/**
 * Created by Prayansh on 16-07-17.
 */
public class BlockTextFormatTest {

  @Test
  public void testBlockDefault() {
    TextFormat text = new BlockTextFormat();
    assertEquals("123456789", RichText.apply(text, "123456789"));
  }

  @Test
  public void testBlockPhone() {
    TextFormat text = new BlockTextFormat()
            .blocks("-", 3, 3, 4);
    assertEquals("123-456-7890", RichText.apply(text, "1234567890"));
  }

  @Test
  public void testBlockDate() {
    TextFormat text = new BlockTextFormat()
            .blocks("/", 2, 2, 4);
    assertEquals("23/07/2016", RichText.apply(text, "23072016"));
  }

  @Test
  public void testBlockWithPrefix() {
    TextFormat text = new BlockTextFormat()
            .blocks("-", 3, 3, 4)
            .prefix("203");
    assertEquals("203-123-4567", RichText.apply(text, "1234567"));
  }

  @Test
  public void testBlockWithPrefixAdvanced() {
    TextFormat text = new BlockTextFormat()
            .blocks("-", 3, 3, 4)
            .prefix("203822");
    assertEquals("203-822-4567", RichText.apply(text, "4567"));
  }

  @Test
  public void testBlockWithSuffix() {
    TextFormat text = new BlockTextFormat()
            .blocks("-", 3, 3, 4)
            .suffix("900");
    assertEquals("203-123-4900", RichText.apply(text, "2031234900"));
  }
}
