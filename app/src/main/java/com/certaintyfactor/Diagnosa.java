package com.certaintyfactor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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
                    && cb6.isChecked() && cb7.isChecked() && cb8.isChecked()
                    && cb10.isChecked() && cb15.isChecked()  && cb17.isChecked()){

                double nilaig1 = 0.4;
                double nilaig3 = 1;
                double nilaig4 = 0.6;
                double nilaig5 = 0.2;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig10 = 0.4;
                double nilaig15 = 0.2;
                double nilaig17 = 0.6;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala5 = Double.parseDouble(txt5.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala10 = Double.parseDouble(txt10.getText().toString());
                double dblgejala15 = Double.parseDouble(txt15.getText().toString());
                double dblgejala17 = Double.parseDouble(txt17.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg5 = nilaig5 * dblgejala5;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg10 = nilaig10 * dblgejala10;
                double hasilg15 = nilaig15 * dblgejala15;
                double hasilg17 = nilaig17 * dblgejala17;

                double cf1_cf3 = hasilg1 + hasilg3 * (1 - hasilg1);
                double cfold_cf4 = cf1_cf3 + hasilg4 * (1 - cf1_cf3);
                double cfold_cf5 = cfold_cf4 + hasilg5 * (1 - cfold_cf4);
                double cfold_cf6 = cfold_cf5 + hasilg6 * (1 - cfold_cf5);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf10 = cfold_cf8 + hasilg10 * (1 - cfold_cf8);
                double cfold_cf15 = cfold_cf10 + hasilg15 * (1 - cfold_cf10);
                double cfold_cf17 = cfold_cf15 + hasilg17 * (1 - cfold_cf15);

                String hasilhitungA = String.valueOf((cfold_cf17 * 100));

                penyakit += "\nPenyakit Periodontitis";
                persentase += "\n"+hasilhitungA;
            }

            if (cb1.isChecked() && cb3.isChecked() && cb4.isChecked() && cb6.isChecked()
                    && cb7.isChecked() && cb8.isChecked() && cb11.isChecked() && cb12.isChecked()
                    && cb13.isChecked() && cb17.isChecked()){

                double nilaig1 = 0.4;
                double nilaig3 = 1;
                double nilaig4 = 0.6;
                double nilaig6 = 0.8;
                double nilaig7 = 0.4;
                double nilaig8 = 0.4;
                double nilaig11 = 0.2;
                double nilaig12 = 0.4;
                double nilaig13 = 1;
                double nilaig17 = 0.6;

                double dblgejala1 = Double.parseDouble(txt1.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala4 = Double.parseDouble(txt4.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala7 = Double.parseDouble(txt7.getText().toString());
                double dblgejala8 = Double.parseDouble(txt8.getText().toString());
                double dblgejala11 = Double.parseDouble(txt11.getText().toString());
                double dblgejala12 = Double.parseDouble(txt12.getText().toString());
                double dblgejala13 = Double.parseDouble(txt13.getText().toString());
                double dblgejala17 = Double.parseDouble(txt17.getText().toString());

                double hasilg1 = nilaig1 * dblgejala1;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg4 = nilaig4 * dblgejala4;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg7 = nilaig7 * dblgejala7;
                double hasilg8 = nilaig8 * dblgejala8;
                double hasilg11 = nilaig11 * dblgejala11;
                double hasilg12 = nilaig12 * dblgejala12;
                double hasilg13 = nilaig13 * dblgejala13;
                double hasilg17 = nilaig17 * dblgejala17;

                double cf1_cf3_ = hasilg1 + hasilg3 * (1 - hasilg1);
                double cfold_cf4 = cf1_cf3_ + hasilg4 * (1 - cf1_cf3_);
                double cfold_cf6 = cfold_cf4 + hasilg6 * (1 - cfold_cf4);
                double cfold_cf7 = cfold_cf6 + hasilg7 * (1 - cfold_cf6);
                double cfold_cf8 = cfold_cf7 + hasilg8 * (1 - cfold_cf7);
                double cfold_cf11 = cfold_cf8 + hasilg11 * (1 - cfold_cf8);
                double cfold_cf12 = cfold_cf11 + hasilg12 * (1 - cfold_cf11);
                double cfold_cf13 = cfold_cf12 + hasilg13 * (1 - cfold_cf12);
                double cfold_cf17 = cfold_cf13 + hasilg17 * (1 - cfold_cf13);

                String hasilhitungB = String.valueOf((cfold_cf17 * 100));

                penyakit += "\nPenyakit Gingivitis";
                persentase += "\n"+hasilhitungB;
            }

            if (cb2.isChecked() && cb3.isChecked() && cb6.isChecked() && cb9.isChecked()
                    && cb13.isChecked() && cb14.isChecked() && cb16.isChecked()){

                double nilaig2 = 0.2;
                double nilaig3 = 1;
                double nilaig6 = 0.8;
                double nilaig9 = 0.2;
                double nilaig13 = 1;
                double nilaig14 = 0.2;
                double nilaig16 = 0.4;

                double dblgejala2 = Double.parseDouble(txt2.getText().toString());
                double dblgejala3 = Double.parseDouble(txt3.getText().toString());
                double dblgejala6 = Double.parseDouble(txt6.getText().toString());
                double dblgejala9 = Double.parseDouble(txt9.getText().toString());
                double dblgejala13 = Double.parseDouble(txt13.getText().toString());
                double dblgejala14 = Double.parseDouble(txt14.getText().toString());
                double dblgejala16 = Double.parseDouble(txt16.getText().toString());

                double hasilg2 = nilaig2 * dblgejala2;
                double hasilg3 = nilaig3 * dblgejala3;
                double hasilg6 = nilaig6 * dblgejala6;
                double hasilg9 = nilaig9 * dblgejala9;
                double hasilg13 = nilaig13 * dblgejala13;
                double hasilg14 = nilaig14 * dblgejala14;
                double hasilg16 = nilaig16 * dblgejala16;

                double cf1_cf3_1 = hasilg2 + hasilg3 * (1 - hasilg2);
                double cfold_cf6 = cf1_cf3_1 + hasilg6 * (1 - cf1_cf3_1);
                double cfold_cf9 = cfold_cf6 + hasilg9 * (1 - cfold_cf6);
                double cfold_cf13 = cfold_cf9 + hasilg13 * (1 - cfold_cf9);
                double cfold_cf14 = cfold_cf13 + hasilg14 * (1 - cfold_cf13);
                double cfold_cf16 = cfold_cf14 + hasilg16 * (1 - cfold_cf14);

                String hasilhitungC = String.valueOf((cfold_cf16 * 100));

                penyakit += "\nPenyakit Abses Gusi";
                persentase += "\n"+hasilhitungC;
            }

            txtHasil.setText(""+penyakit+"\n"+persentase+" %\n\n");
        });

    }
}