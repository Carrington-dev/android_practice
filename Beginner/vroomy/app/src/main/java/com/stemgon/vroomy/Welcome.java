package com.stemgon.vroomy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.stemgon.vroomy.adapters.CustomAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class Welcome extends AppCompatActivity {
    ListView listViewNow, listViewWel, listViewBel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);



        listViewBel = findViewById(R.id.list_item_bel);
        ArrayList<String> myListOfContacts = new ArrayList<>();
        myListOfContacts.addAll(
                Arrays.asList(
                        new String[]{"Carington", "Portia", "Chalmers", "Cornwel", "Rendani",
                "Sharona", "lOlugab", "kNthabic", "Ndivhud",  "Nda", "Nyathi", "Ndou", "Mpilo",
                                "Sesethu", "Hikhona"
        }));

        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});
        //        myListOfContacts.add(new String[]{"Mulalo", "0631634923"});
        //        myListOfContacts.add(new String[]{"Chalmers", "0631634923"});
        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});
        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});
        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});
        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});
        //        myListOfContacts.add(new String[]{"Carrington", "0631634923"});

//        ArrayAdapter<String> thirdAdapter = new ArrayAdapter<>(
//                this,
//                android.R.layout.simple_list_item_activated_1,
//                myListOfContacts
//        );

        CustomAdapter thirdAdapter = new CustomAdapter(this, myListOfContacts, myListOfContacts);

        listViewBel.setAdapter(thirdAdapter);
    }
}