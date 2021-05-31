package com.certaintyfactor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
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

    String[] nilai = {"", "0", "0.2", "0.4", "0.6", "0.8", "1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);

        Proses = (Button)findViewById(R.id.btnProses);
        txtHasil = (TextView)findViewById(R.id.txHasil);
        cb1 = (CheckBox)findViewById(R.id.chk1); cb2 = (CheckBox)findViewById(R.id.chk2);
        cb3 = (CheckBox)findViewById(R.id.chk3); cb4 = (CheckBox)findViewById(R.id.chk4);
        cb5 = (CheckBox)findViewById(R.id.chk5); cb6 = (CheckBox)findViewById(R.id.chk6);
        cb7 = (CheckBox)findViewById(R.id.chk7); cb8 = (CheckBox)findViewById(R.id.chk8);
        cb9 = (CheckBox)findViewById(R.id.chk9); cb10 = (CheckBox)findViewById(R.id.chk10);
        cb11 = (CheckBox)findViewById(R.id.chk11); cb12 = (CheckBox)findViewById(R.id.chk12);
        cb13 = (CheckBox)findViewById(R.id.chk13); cb14 = (CheckBox)findViewById(R.id.chk14);
        cb15 = (CheckBox)findViewById(R.id.chk15); cb16 = (CheckBox)findViewById(R.id.chk16);
        cb17 = (CheckBox)findViewById(R.id.chk17);

        txt1 = (AutoCompleteTextView)findViewById(R.id.tx1);
        txt2 = (AutoCompleteTextView)findViewById(R.id.tx2);
        txt3 = (AutoCompleteTextView)findViewById(R.id.tx3);
        txt4 = (AutoCompleteTextView)findViewById(R.id.tx4);
        txt5 = (AutoCompleteTextView)findViewById(R.id.tx5);
        txt6 = (AutoCompleteTextView)findViewById(R.id.tx6);
        txt7 = (AutoCompleteTextView)findViewById(R.id.tx7);
        txt8 = (AutoCompleteTextView)findViewById(R.id.tx8);
        txt9 = (AutoCompleteTextView)findViewById(R.id.tx9);
        txt10 = (AutoCompleteTextView)findViewById(R.id.tx10);
        txt11 = (AutoCompleteTextView)findViewById(R.id.tx11);
        txt12 = (AutoCompleteTextView)findViewById(R.id.tx12);
        txt13 = (AutoCompleteTextView)findViewById(R.id.tx13);
        txt14 = (AutoCompleteTextView)findViewById(R.id.tx14);
        txt15 = (AutoCompleteTextView)findViewById(R.id.tx15);
        txt16 = (AutoCompleteTextView)findViewById(R.id.tx16);
        txt17 = (AutoCompleteTextView)findViewById(R.id.tx17);

        final ArrayAdapter<String> adapterNilai = new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, nilai);
        txt1.setThreshold(1); txt1.setAdapter(adapterNilai);
        txt2.setThreshold(1); txt2.setAdapter(adapterNilai);
        txt3.setThreshold(1); txt3.setAdapter(adapterNilai);
        txt4.setThreshold(1); txt4.setAdapter(adapterNilai);
        txt5.setThreshold(1); txt5.setAdapter(adapterNilai);
        txt6.setThreshold(1); txt6.setAdapter(adapterNilai);
        txt7.setThreshold(1); txt7.setAdapter(adapterNilai);
        txt8.setThreshold(1); txt8.setAdapter(adapterNilai);
        txt9.setThreshold(1); txt9.setAdapter(adapterNilai);
        txt10.setThreshold(1); txt10.setAdapter(adapterNilai);
        txt11.setThreshold(1); txt11.setAdapter(adapterNilai);
        txt12.setThreshold(1); txt12.setAdapter(adapterNilai);
        txt13.setThreshold(1); txt13.setAdapter(adapterNilai);
        txt14.setThreshold(1); txt14.setAdapter(adapterNilai);
        txt15.setThreshold(1); txt15.setAdapter(adapterNilai);
        txt16.setThreshold(1); txt16.setAdapter(adapterNilai);
        txt17.setThreshold(1); txt17.setAdapter(adapterNilai);

        txt1.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt1.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt2.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt2.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt3.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt3.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt4.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt4.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt5.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt5.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt6.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt6.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt7.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt7.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt8.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt8.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt9.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt9.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt10.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt10.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt11.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt11.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt12.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt12.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt13.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt13.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt14.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt14.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt15.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt15.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt16.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt16.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );
        txt17.setOnClickListener(
                v -> new AlertDialog.Builder(Diagnosa.this).setTitle("Pilih Nilai")
                        .setAdapter(adapterNilai, (dialog, which) -> {
                            txt17.setText(nilai[which].toString());
                            dialog.dismiss();
                        }).create().show()
        );

        Proses.setOnClickListener(v -> {
            String penyakit = "Anda menderita penyakit : ";
            String persentase = "Persentase kepercayaan : ";

            if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked() && cb5.isChecked()
            && cb6.isChecked() && cb7.isChecked() && cb8.isChecked() && cb10.isChecked() && cb15.isChecked()
            && cb17.isChecked()){

            }
        });

    }
}