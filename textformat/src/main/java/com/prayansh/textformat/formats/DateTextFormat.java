package com.prayansh.textformat.formats;

import com.prayansh.textformat.utils.DateUnit;

/**
 * Created by Prayansh on 16-07-24.
 */
public class DateTextFormat extends BlockTextFormat {
    public DateTextFormat() {
        super();
    }

    public DateTextFormat format(DateUnit u1, DateUnit u2, DateUnit u3, String delimiter) {
        return (DateTextFormat) blocks(delimiter, u1.width, u2.width, u3.width);
    }

    public DateTextFormat format(DateUnit u1, DateUnit u2, DateUnit u3) {
        return format(u1, u2, u3, "-");
    }
}
