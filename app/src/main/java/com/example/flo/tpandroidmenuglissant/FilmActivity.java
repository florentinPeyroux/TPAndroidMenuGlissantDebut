package com.example.flo.tpandroidmenuglissant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FilmActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] films = new String[]{
            " Geostorm\n" + "1 novembre 2017",
            "Thor : Ragnarok\n" +"25 octobre 2017",
            "Epouse-moi mon pote\n" +"25 octobre 2017",
            "Au revoir là-haut\n" +"25 octobre 2017",
            "Daddy Cool\n" +"1 novembre 2017",
            "Star Wars - Les Derniers Jedi\n" +"13 décembre 2017",
            "Logan Lucky\n" +"25 octobre 2017",
            "Justice League\n" +"15 novembre 2017",
            "Jigsaw\n" +"1 novembre 2017",
            "Opération casse-noisette 2\n" +"25 octobre 2017",
            "Black Panther\n" +"14 février 2018 ",
            "Leçon de classes\n" + "25 octobre 2017",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(FilmActivity.this,
                android.R.layout.simple_list_item_1, films);
        mListView.setAdapter(adapter);
    }

}
