/*
Sanne Donker
10780416
Mr. Potatohead

An app that lets you add and remove body parts of Toy Storys' Mr Potatohead.
*/

package com.example.gebruiker.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String item_names[] = {"arms", "ears", "eyes", "eyebrows", "glasses", "hat", "mouth",
                           "mustache", "nose", "shoes"};
    int item_ids[] = {R.id.arms, R.id.ears, R.id.eyes, R.id.eyebrows, R.id.glasses, R.id.hat,
                      R.id.mouth, R.id.mustache, R.id.nose, R.id.shoes};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // checks if the state isn't the beginning (first) state
        if (savedInstanceState != null) {

            // checks for all items if it's checked in the previous state, if so make it visible
            for (int i = 0; i < item_names.length; i++) {
                int saved_item = savedInstanceState.getInt(item_names[i]);
                if (saved_item == 0) {
                    ImageView item = (ImageView) findViewById(item_ids[i]);
                    item.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        String item = checkbox.getText().toString().toLowerCase();

        // if the box is checked, change visibility of that item to visible
        if (checkbox.isChecked()) {
            for (int i = 0; i < item_names.length; i++) {
                if (item.equals(item_names[i])) {
                    ImageView clicked_item = (ImageView) findViewById(item_ids[i]);
                    clicked_item.setVisibility(View.VISIBLE);
                    break;
                }
            }
        }

        // if the box isn't checked, change visibility of that item to invisible
        else {
            for (int i = 0; i < item_names.length; i++) {
                if (item.equals(item_names[i])) {
                    ImageView clicked_item = (ImageView) findViewById(item_ids[i]);
                    if (clicked_item.getVisibility() == View.VISIBLE) {
                        clicked_item.setVisibility(View.INVISIBLE);
                    }
                    break;
                }
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // saves the visibility state for every item, where the key is the name of the item
        for (int i = 0; i < item_names.length; i++) {
            outState.putInt(item_names[i], findViewById(item_ids[i]).getVisibility());
        }
    }
}
