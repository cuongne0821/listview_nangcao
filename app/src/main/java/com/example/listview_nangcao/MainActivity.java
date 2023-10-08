package com.example.listview_nangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmonan;
    ArrayList<MonAn> array;
    monanAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        adapter=new monanAdapter(this   , R.layout.dongmonan, array);
        lvmonan.setAdapter(adapter);
    }

    private void anhxa() {
        lvmonan=(ListView) findViewById(R.id.listview);
        array=new ArrayList<>();
        array.add(new MonAn("Com chien", "dep trai", R.drawable.helo1));
        array.add(new MonAn("Thit luoc", "dep gai", R.drawable.helo2));
        array.add(new MonAn("Canh chua", "dep trai", R.drawable.helo3));
        array.add(new MonAn("KFC", "dep trai", R.drawable.helo4));
        array.add(new MonAn("Nuoc mam", "dep trai", R.drawable.helo5));
    }
}