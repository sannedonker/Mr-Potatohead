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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      checks if the state isn't the beginning (first) state
        if (savedInstanceState != null) {

            // if saved_item is true (is checked in the previous state) make it visible
            int saved_arms = savedInstanceState.getInt("arms");
            if (saved_arms == 0) {
                ImageView arms = (ImageView) findViewById (R.id.arms);
                arms.setVisibility(View.VISIBLE);
            }
            int saved_ears = savedInstanceState.getInt("ears");
            if (saved_ears == 0) {
                ImageView ears = (ImageView) findViewById (R.id.ears);
                ears.setVisibility(View.VISIBLE);
            }
            int saved_eyes = savedInstanceState.getInt("eyes");
            if (saved_eyes == 0) {
                ImageView eyes = (ImageView) findViewById (R.id.eyes);
                eyes.setVisibility(View.VISIBLE);
            }
            int saved_eyebrows = savedInstanceState.getInt("eyebrows");
            if (saved_eyebrows == 0) {
                ImageView eyebrows = (ImageView) findViewById (R.id.eyebrows);
                eyebrows.setVisibility(View.VISIBLE);
            }
            int saved_glasses = savedInstanceState.getInt("glasses");
            if (saved_glasses == 0) {
                ImageView glasses = (ImageView) findViewById (R.id.glasses);
                glasses.setVisibility(View.VISIBLE);
            }
            int saved_hat = savedInstanceState.getInt("hat");
            if (saved_hat == 0) {
                ImageView hat = (ImageView) findViewById (R.id.hat);
                hat.setVisibility(View.VISIBLE);
            }
            int saved_mouth = savedInstanceState.getInt("mouth");
            if (saved_mouth == 0) {
                ImageView mouth = (ImageView) findViewById (R.id.mouth);
                mouth.setVisibility(View.VISIBLE);
            }
            int saved_mustache = savedInstanceState.getInt("mustache");
            if (saved_mustache == 0) {
                ImageView mustache = (ImageView) findViewById (R.id.mustache);
                mustache.setVisibility(View.VISIBLE);
            }
            int saved_nose = savedInstanceState.getInt("nose");
            if (saved_nose == 0) {
                ImageView nose = (ImageView) findViewById (R.id.nose);
                nose.setVisibility(View.VISIBLE);
            }
            int saved_shoes = savedInstanceState.getInt("shoes");
            if (saved_shoes == 0) {
                ImageView shoes = (ImageView) findViewById (R.id.shoes);
                shoes.setVisibility(View.VISIBLE);
            }
        }
    }

    public void checkClicked(View v) {
        Log.d("potato", "checkClicked: ");

        CheckBox checkbox = (CheckBox) v;
        String item = checkbox.getText().toString();

        // If the box is checked, change visibility to visible
        if (checkbox.isChecked()){
            switch(item) {
                case "Arms" :
                    ImageView arms = (ImageView) findViewById(R.id.arms);
                    arms.setVisibility(View.VISIBLE);
                    break;
                case "Ears" :
                    ImageView ears = (ImageView) findViewById(R.id.ears);
                    ears.setVisibility(View.VISIBLE);
                    break;
                case "Eyes" :
                    ImageView eyes = (ImageView) findViewById(R.id.eyes);
                    eyes.setVisibility(View.VISIBLE);
                    break;
                case "Eyebrows" :
                    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                    eyebrows.setVisibility(View.VISIBLE);
                    break;
                case "Glasses" :
                    ImageView glasses = (ImageView) findViewById(R.id.glasses);
                    glasses.setVisibility(View.VISIBLE);
                    break;
                case "Hat" :
                    ImageView hat = (ImageView) findViewById(R.id.hat);
                    hat.setVisibility(View.VISIBLE);
                    break;
                case "Mouth" :
                    ImageView mouth = (ImageView) findViewById(R.id.mouth);
                    mouth.setVisibility(View.VISIBLE);
                    break;
                case "Mustache" :
                    ImageView mustache = (ImageView) findViewById(R.id.mustache);
                    mustache.setVisibility(View.VISIBLE);
                    break;
                case "Nose" :
                    ImageView nose = (ImageView) findViewById(R.id.nose);
                    nose.setVisibility(View.VISIBLE);
                    break;
                case "Shoes" :
                    ImageView shoes = (ImageView) findViewById(R.id.shoes);
                    shoes.setVisibility(View.VISIBLE);
                    break;
            }
        }

        // If the box isn't checked change visibility to invisible
        else {
            switch(item) {
                case "Arms" :
                    ImageView arms = (ImageView) findViewById(R.id.arms);
                     if (arms.getVisibility() == View.VISIBLE){
                         arms.setVisibility(View.INVISIBLE);
                     break;
                }
                case "Ears" :
                    ImageView ears = (ImageView) findViewById(R.id.ears);
                    if (ears.getVisibility() == View.VISIBLE) {
                        ears.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Eyes" :
                    ImageView eyes = (ImageView) findViewById(R.id.eyes);
                    if (eyes.getVisibility() == View.VISIBLE) {
                        eyes.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Eyebrows" :
                    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                    if (eyebrows.getVisibility() == View.VISIBLE) {
                        eyebrows.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Glasses" :
                    ImageView glasses = (ImageView) findViewById(R.id.glasses);
                    if (glasses.getVisibility() == View.VISIBLE) {
                        glasses.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Hat" :
                    ImageView hat = (ImageView) findViewById(R.id.hat);
                    if (hat.getVisibility() == View.VISIBLE) {
                        hat.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Mouth" :
                    ImageView mouth = (ImageView) findViewById(R.id.mouth);
                    if (mouth.getVisibility() == View.VISIBLE) {
                        mouth.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Mustache" :
                    ImageView mustache = (ImageView) findViewById(R.id.mustache);
                    if (mustache.getVisibility() == View.VISIBLE) {
                        mustache.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Nose" :
                    ImageView nose = (ImageView) findViewById(R.id.nose);
                    if (nose.getVisibility() == View.VISIBLE) {
                        nose.setVisibility(View.INVISIBLE);
                    }
                    break;
                case "Shoes" :
                    ImageView shoes = (ImageView) findViewById(R.id.shoes);
                    if (shoes.getVisibility() == View.VISIBLE) {
                        shoes.setVisibility(View.INVISIBLE);
                    }
                    break;
            }

        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("arms", findViewById(R.id.arms).getVisibility());
        outState.putInt("ears", findViewById(R.id.ears).getVisibility());
        outState.putInt("eyes", findViewById(R.id.eyes).getVisibility());
        outState.putInt("eyebrows", findViewById(R.id.eyebrows).getVisibility());
        outState.putInt("glasses", findViewById(R.id.glasses).getVisibility());
        outState.putInt("hat", findViewById(R.id.hat).getVisibility());
        outState.putInt("mouth", findViewById(R.id.mouth).getVisibility());
        outState.putInt("mustache", findViewById(R.id.mustache).getVisibility());
        outState.putInt("nose", findViewById(R.id.nose).getVisibility());
        outState.putInt("shoes", findViewById(R.id.shoes).getVisibility());
    }
}
