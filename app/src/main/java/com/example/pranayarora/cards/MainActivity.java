package com.example.pranayarora.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = (RecyclerView)findViewById(R.id.recyclerview);
                rv.setHasFixedSize(true);
        LinearLayoutManager lm = new LinearLayoutManager(getApplicationContext());
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(lm);
        ContactAdapter a = new ContactAdapter(createList(30));
        rv.setAdapter(a);
    }

    private List<ContactInfo> createList(int size) {
        List<ContactInfo> result = new ArrayList<ContactInfo>();
        int i;
        for(i = 1; i<= size; i++)
        {
            ContactInfo ci = new ContactInfo();
            ci.name = "Name" + i;
            ci.email = "email" + i;
            ci.surname = "Surname" + i;
            result.add(ci);
        }
        return  result;
        }
    }

