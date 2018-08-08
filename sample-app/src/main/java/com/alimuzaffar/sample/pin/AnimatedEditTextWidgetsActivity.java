package com.alimuzaffar.sample.pin;

import android.os.Bundle;
import android.widget.Toast;

import com.alimuzaffar.lib.pin.PinEntryEditText;

import androidx.appcompat.app.AppCompatActivity;

public class AnimatedEditTextWidgetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        final PinEntryEditText pinEntry = findViewById(R.id.txt_pin_entry);
        if (pinEntry != null) {
            pinEntry.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
                @Override
                public void onPinEntered(CharSequence str) {
                    if (str.toString().equals("1234")) {
                        Toast.makeText(AnimatedEditTextWidgetsActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                    } else {
                        pinEntry.setError(true);
                        Toast.makeText(AnimatedEditTextWidgetsActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
                        pinEntry.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                pinEntry.setText(null);
                            }
                        }, 1000);
                    }
                }
            });
        }

        final PinEntryEditText pinEntry2 = findViewById(R.id.txt_pin_entry2);
        if (pinEntry2 != null) {
            pinEntry2.setAnimateText(true);
            pinEntry2.setOnPinEnteredListener(new PinEntryEditText.OnPinEnteredListener() {
                @Override
                public void onPinEntered(CharSequence str) {
                    if (str.toString().equals("1234")) {
                        Toast.makeText(AnimatedEditTextWidgetsActivity.this, "SUCCESS", Toast.LENGTH_SHORT).show();
                    } else {
                        pinEntry2.setError(true);
                        Toast.makeText(AnimatedEditTextWidgetsActivity.this, "FAIL", Toast.LENGTH_SHORT).show();
                        pinEntry2.postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                pinEntry2.setText(null);
                            }
                        }, 1000);
                    }
                }
            });
        }

    }

}
