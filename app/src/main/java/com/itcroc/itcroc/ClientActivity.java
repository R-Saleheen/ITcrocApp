package com.itcroc.itcroc;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClientActivity extends Activity {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        ClientAdapter adapter = new ClientAdapter(this, generate());

        ListView listView = (ListView) findViewById(R.id.client_listview);
        listView.setAdapter(adapter);

    }

    private ArrayList<ClientModel> generate(){ArrayList<ClientModel> models = new ArrayList<ClientModel>();
        models.add(new ClientModel("Our Happy Clients"));

        models.add(new ClientModel(R.drawable.riya,"Great work, quick, fast, responsive and understands requirements easily.", "Riya Sharma", "Owner ,", "Riya Art Gallery"));
        models.add(new ClientModel(R.drawable.mirza, "Excellent job, great result and fast communications. definitely highly recommended.", " Mirza Abdul Khaled", "Chairman ,", "Crimson Cup Coffee"));
        models.add(new ClientModel(R.drawable.tom,"Great job! Very professional, good design skills and communicated very well throughout the project. Will definitely rehire.", "Thomas Bohinc", "Managing Principal ,", "Auorm"));
        //models.add(new ClientModel(R.drawable.portfolio,"Portfolio"));
        //models.add(new ClientModel(R.drawable.team, "Team"));
        //models.add(new ClientModel(R.drawable.client, "Client"));



        return models;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
