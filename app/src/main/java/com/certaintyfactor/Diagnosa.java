package com.certaintyfactor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Diagnosa extends AppCompatActivity {

    Button Proses;
    TextView txtHasil;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10, cb11,
            cb12, cb13, cb14, cb15, cb16, cb17;
    AutoCompleteTextView txt1, txt2, txt3, txt4, txt5, txt6, txt7,
            txt8, txt9, txt10, txt11, txt12, txt13, txt14, txt15, txt16, txt17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
    }
}