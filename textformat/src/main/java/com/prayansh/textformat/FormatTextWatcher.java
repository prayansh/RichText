package com.prayansh.textformat;

import android.text.Editable;
import android.text.TextWatcher;

import com.prayansh.textformat.format.LetterFormat;
import com.prayansh.textformat.format.TextFormat;

/**
 * Created by Prayansh on 16-07-16.
 */
public class FormatTextWatcher implements TextWatcher {

    LetterFormat letterFormat;
    TextFormat textFormat;

    @Override
    public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
