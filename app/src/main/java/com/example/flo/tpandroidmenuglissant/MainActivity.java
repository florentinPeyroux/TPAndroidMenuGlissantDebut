package com.example.flo.tpandroidmenuglissant;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
  //  private DrawerLayout drawerLayout;
  //  private ListView mListView;
/*    private String[] actualité = new String[]{

            " UNE PREMIÈRE BANDE ANNONCE POUR LE FILM DE GUERRE 12 STRONG AVEC CHRIS HEMSWORTH \n\n   Le studio Warner Bors. vient de dévoiler la première bande annonce de 12 Strong, un film de guerre produit par Jerry Bruckheimer \n",
            " UNE NOUVELLE SÉRIE DC COMICS EN DÉVELOPPEMENT POUR LA CHAÎNE CW \n\n La chaîne américaine CW (The Flash, Arrow, Supergirl) prépare actuellement une sixième série DC Comics intitulée Project 13 ! \n",
            " ON A VU THOR : RAGNAROK \n\n Plus de deux ans après sa dernière apparition à l'écran, Thor sera enfin de retour ce mois-ci au cinéma dans Thor : Ragnarok. \n",
            " UNE NOUVELLE BANDE ANNONCE ET UNE DATE DE DIFFUSION POUR THE PUNISHER \n\n Netflix et Marvel Television viennent de dévoiler une nouvelle bande annonce de la série The Punisher ainsi que la date de diffusion \n",
            " STAR WARS : UN PREMIER SPOT TV POUR LES DERNIERS JEDI \n\n Lucasfilm a diffusé un premier spot TV de Star Wars : Les Derniers Jedi à la télévision américaine dévoilant plusieurs plans inédits \n",

    };*/

    //fonction qui lance l'activité Film
    public void lanceFilm(View v){
        Intent intent = new Intent(this, FilmActivity.class);
        startActivity(intent);
    }

    //fonction qui lance l'activité Serie
    public void lanceSeries(View v){
        Intent intent = new Intent(this, SeriesActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recupere le drawerLayout
      //  drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        // desactive un bouton non utilisé
/*        Button btn = (Button) findViewById(R.id.button7);
        btn.setEnabled(false);


        mListView = (ListView) findViewById(R.id.listView);

        //affiche les actualitées
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, actualité);
        mListView.setAdapter(adapter);*/
    }

    //fonction qui affiche le menu
/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    //fonction qui affiche le menu situé à gauche de l'écran si l'id de selectionné
    // est le meme que celui de l'item hamburger
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.hamburgerMenu:
                drawerLayout.openDrawer(Gravity.LEFT);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/
}
