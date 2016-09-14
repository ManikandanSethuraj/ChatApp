package com.manikandansethuraj.chatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ChatArrayAdapter adapter;
    private ListView list;
    private EditText chattext;
    private Button send;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent in = getIntent();
        send = (Button)findViewById(R.id.btn);
        list = (ListView)findViewById(R.id.listView);
        adapter = new ChatArrayAdapter(getApplicationContext(),R.layout.chat);


    }
}
