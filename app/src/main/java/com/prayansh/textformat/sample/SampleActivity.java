package com.prayansh.textformat.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        final TextView nameLabel = (TextView) findViewById(R.id.name_label);

        final EditText name = (EditText) findViewById(R.id.name);
//
//        final Subscription editTextSub =
//                RxTextView.textChanges(name)
//                        .map(new Func1<CharSequence, String>() {
//                            @Override
//                            public String call(CharSequence charSequence) {
//                                String res = "";
//                                for (int i = 0; i < charSequence.length(); i++) {
//                                    if (Character.isLetter(charSequence.charAt(i)))
//                                        res += charSequence.charAt(i);
//                                }
//                                return res;
//                            }
//                        })
//                        .subscribe(new Action1<String>() {
//                            @Override
//                            public void call(String value) {
//                                nameLabel.setText(value);
//                            }
//                        });
        name.addTextChangedListener(new FourDigitCardFormatWatcher());

    }

    /**
     * Formats the watched EditText to a credit card number
     */
    public static class FourDigitCardFormatWatcher implements TextWatcher {

        // Change this to what you want... ' ', '-' etc..
        private static final char DELIMITER = ' ';

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            // Remove spacing char
            if (s.length() > 0 && (s.length() % 5) == 0) {
                final char c = s.charAt(s.length() - 1);
                if (DELIMITER == c) {
                    s.delete(s.length() - 1, s.length());
                }
            }
            // Insert char where needed.
            if (s.length() > 0 && (s.length() % 5) == 0) {
                char c = s.charAt(s.length() - 1);
                // Only if its a digit where there should be a DELIMITER we insert a DELIMITER
                if (Character.isDigit(c) && TextUtils.split(s.toString(), String.valueOf(DELIMITER)).length <= 3) {
                    s.insert(s.length() - 1, String.valueOf(DELIMITER));
                }
            }
            for (char i = 'a'; i < 'z'; i++) {
                String s1 = s.toString();
                s1.replace(i, ' ');
                s.replace(0, s.length(), s1);
            }
        }
    }
}
