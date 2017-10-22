package com.example.flo.tpandroidmenuglissant;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SeriesActivity extends AppCompatActivity {

    private ListView mListView;

    private String[] serie = new String[]{
            " Stranger Things - Saison 2 \n 1ère diffusion- 27 octobre 2017 sur Netflix (U.S.A.)",
            "Blindspot - Saison 3\n" + "1ère diffusion\t27 octobre 2017 sur NBC (U.S.A.)",
            "Andi Mack - Saison 2\n" +"1ère diffusion\t27 octobre 2017 sur Disney Channel US (U.S.A.)",
            "Superior Donuts - Saison 2\n" +"1ère diffusion\t30 octobre 2017 sur CBS (U.S.A.)",
            "Strike Back - Saison 6\n" +"1ère diffusion\t31 octobre 2017 sur Sky One (Grande-Bretagne)",
            "Major Crimes - Saison 6\n" +"1ère diffusion\t31 octobre 2017 sur TNT (U.S.A.)",
            "Fight Of The Living Dead - Saison 2\n" +"1ère diffusion\t31 octobre 2017 sur YouTube Red (U.S.A.)",
            "Stan Against Evil - Saison 2\n" +"1ère diffusion\t01 novembre 2017 sur IFC - Independent Film Channel (U.S.A.)",
            "Mom - Saison 5\n" +"1ère diffusion\t02 novembre 2017 sur CBS (U.S.A.)",
            "Life In Pieces - Saison 3\n" +"1ère diffusion\t02 novembre 2017 sur CBS (U.S.A.)",
            "CUT - Saison 5\n" +"1ère diffusion\t03 novembre 2017 sur France Ô",
            "Shameless (US) - Saison 8\n" + "1ère diffusion\t05 novembre 2017 sur Showtime (U.S.A.)",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);
        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(SeriesActivity.this,
                android.R.layout.simple_list_item_1, serie);
        mListView.setAdapter(adapter);
    }

}
