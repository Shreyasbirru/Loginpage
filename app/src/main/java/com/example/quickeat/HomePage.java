package com.example.quickeat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {

    ArrayList<ContactModel> arrContacts = new ArrayList<>();
   AutoCompleteTextView actxtView;
   ArrayList<String> arrDish = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        actxtView = findViewById(R.id.actxtView);
        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        arrDish.add("Pizza");
        arrDish.add("Burger");
        arrDish.add("Fries");
        arrDish.add("Cake");
        arrDish.add("Sandwhich");
        arrDish.add("Shawarma");
        arrDish.add("Rice");
        arrDish.add("Biryani");
        ArrayAdapter<String> actAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrDish);
        actxtView.setAdapter(actAdapter);

        actxtView.setThreshold(1);


        //Recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.guest,"A","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"B","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"C","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"D","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"E","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"F","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"G","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"H","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"I","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"J","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"K","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"L","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"M","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"N","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"O","8895846578"));
        arrContacts.add(new ContactModel(R.drawable.guest,"P","8895846578"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }
}