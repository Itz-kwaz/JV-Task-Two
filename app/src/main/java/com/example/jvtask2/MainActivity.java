package com.example.jvtask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.example.jvtask2.R;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //An array list to contain the hobbies,likes and dislikes.
        ArrayList<String> words = new ArrayList<>();
        words.add("Likes");
        words.add("Dislikes");
        words.add("Hobbies");
        words.add("Music");
        words.add("Boredom");
        words.add("Rapping");
        words.add("Video games");
        words.add("Nothing");
        words.add("Football");
        words.add("Hip/Hop");
        words.add("School");
        words.add("Flying");
        words.add("Likes");
        words.add("Dislikes");
        words.add("Hobbies");
        words.add("Music");
        words.add("Boredom");
        words.add("Rapping");
        words.add("Video games");
        words.add("Nothing");
        words.add("Football");
        words.add("Hip/Hop");
        words.add("School");
        words.add("Flying");
        words.add("Nothing");
        words.add("Football");
        words.add("Hip/Hop");
        words.add("School");
        words.add("Flying");

        ArrayAdapter<String> ItemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, words);

        GridView gridView = findViewById(R.id.simpleGridView);

        gridView.setAdapter(ItemsAdapter);
    }
}