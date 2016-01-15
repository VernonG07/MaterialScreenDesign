package com.example.mattgriffin.materialscreendesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsingToolbarLayout;
    private RecyclerView recyclerView;
    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;

    private List<Flower> flowers;
    private CardAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);

        collapsingToolbarLayout.setTitle("Brackets");
        setSupportActionBar(toolbar);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

        initializeData();

        adapter = new CardAdapter(flowers);

        recyclerView.setAdapter(adapter);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "you pressed my button", Snackbar.LENGTH_SHORT).show();
            }
        });


    }

    private void initializeData() {
        flowers = new ArrayList<>();
        flowers.add(new Flower("Flower 1", R.drawable.pic));
        flowers.add(new Flower("Flower 2", R.drawable.pic));
        flowers.add(new Flower("Flower 3", R.drawable.pic));
        flowers.add(new Flower("Flower 4", R.drawable.pic));
        flowers.add(new Flower("Flower 5", R.drawable.pic));
        flowers.add(new Flower("Flower 6", R.drawable.pic));
        flowers.add(new Flower("Flower 7", R.drawable.pic));
        flowers.add(new Flower("Flower 8", R.drawable.pic));
        flowers.add(new Flower("Flower 9", R.drawable.pic));
        flowers.add(new Flower("Flower 10", R.drawable.pic));
        flowers.add(new Flower("Flower 11", R.drawable.pic));
        flowers.add(new Flower("Flower 12", R.drawable.pic));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
