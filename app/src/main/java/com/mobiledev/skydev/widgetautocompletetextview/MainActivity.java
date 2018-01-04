package com.mobiledev.skydev.widgetautocompletetextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] language ={"Anggur","Apel","Belimbing","Ceri","Durian","Jambu","Jeruk","Kecapi","Mangga","Nanas","Pisang"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Membuat  ArrayAdapter dari string nama language
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,language);
        //Mendapatkan instansi dari AutoCompleteTextView
        AutoCompleteTextView actv= (AutoCompleteTextView)findViewById(R.id.autocompletetextview1);
        actv.setThreshold(1);//Akan bekerja saat karakter pertama
        actv.setAdapter(adapter);//Mensetting data adapter ke dalam AutoCompleteTextView
        actv.setTextColor(Color.GREEN);
    }
}