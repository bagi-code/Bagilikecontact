package com.bagicode.www.bagilikecontact;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.amulyakhare.textdrawable.TextDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Manual add color
        TextDrawable drawable = TextDrawable.builder()
                .buildRect("A", Color.RED);
        ImageView image = (ImageView) findViewById(R.id.image_view);
        image.setImageDrawable(drawable);

        // add rounded
        TextDrawable drawableRounded = TextDrawable.builder()
                .buildRoundRect("A", Color.RED, 50); // <-- see 10 it round
        ImageView imageRound = (ImageView) findViewById(R.id.image_viewRound);
        imageRound.setImageDrawable(drawableRounded);

        // add rounded and border
        TextDrawable drawableRoundedBorder = TextDrawable.builder()
                .beginConfig()
                .withBorder(30) /* thickness in px */
                .endConfig()
                .buildRoundRect("A", Color.RED, 50);
        ImageView imageRoundBourder = (ImageView) findViewById(R.id.image_viewRoundBourder);
        imageRoundBourder.setImageDrawable(drawableRoundedBorder);

        // you can add modif style and buil color auto
        // next you can read tutorial github
        // https://github.com/amulyakhare/TextDrawable
        // cek my deskripsi :D
    }
}
