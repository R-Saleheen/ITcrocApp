package com.itcroc.itcroc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);


        TeamAdapter adapter = new TeamAdapter(this, generateData());

        ListView listView = (ListView) findViewById(R.id.team_listview);
        listView.setAdapter(adapter);

    }

    private ArrayList<TeamModel> generateData(){ArrayList<TeamModel> models = new ArrayList<TeamModel>();
        models.add(new TeamModel("Our Team"));

        models.add(new TeamModel(R.drawable.ad,"Md. Adnan Islam Majumder", "Founder & CEO"));
        models.add(new TeamModel(R.drawable.sourav, "Sourav Das", "Co-Founder & Managing Director"));
        models.add(new TeamModel(R.drawable.sam, "Ahmad Sayem", " Head of Management"));
        models.add(new TeamModel(R.drawable.samir,"Samir Chandra Barma", " Junior Graphic Designer"));
        models.add(new TeamModel(R.drawable.shamim, "Shamim Ahmed", " Junior Graphic Designer"));
        models.add(new TeamModel(R.drawable.arnob, "Arnob Odrib",  "Graphic Designer"));
        models.add(new TeamModel(R.drawable.mamun, "Mamun Morshed", " Web Engineer"));
        models.add(new TeamModel(R.drawable.el, "Elias Chowdhury", "Intern Web Engineer"));
        models.add(new TeamModel(R.drawable.ananta, "Ananta Raj", "Junior Graphic Designer"));


        return models;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_team, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
