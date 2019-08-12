package androidstudio.master.vipsound;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class giochi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giochi);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button home = findViewById(R.id.home);

        final MediaPlayer sound3 = MediaPlayer.create(this,R.raw.home3);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound3.start();
                Intent openH = new Intent(giochi.this,MainActivity.class);
                startActivity(openH);
            }
        });

        ImageButton trevor = findViewById(R.id.trevor);
        final MediaPlayer soundG1 = MediaPlayer.create(this,R.raw.trevor);
        trevor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG1.start();
            }
        });

        ImageButton michael = findViewById(R.id.michael);
        final MediaPlayer soundG2 = MediaPlayer.create(this,R.raw.michael);
        michael.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG2.start();
            }
        });

        ImageButton frankil = findViewById(R.id.frankil);
        final MediaPlayer soundG3 = MediaPlayer.create(this,R.raw.franklin);
        frankil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG3.start();
            }
        });

        ImageButton supermario = findViewById(R.id.supermario);
        final MediaPlayer soundG4 = MediaPlayer.create(this,R.raw.supermario);
        supermario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG4.start();
            }
        });

        ImageButton sonic = findViewById(R.id.sonic);
        final MediaPlayer soundG5 = MediaPlayer.create(this,R.raw.sonic);
        sonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG5.start();
            }
        });

        ImageButton jockerarkam = findViewById(R.id.jockerarkam);
        final MediaPlayer soundG6 = MediaPlayer.create(this,R.raw.jockerarkam);
        jockerarkam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG6.start();
            }
        });

        ImageButton pikachu = findViewById(R.id.pikachu);
        final MediaPlayer soundG7 = MediaPlayer.create(this,R.raw.pikachu);
        pikachu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG7.start();
            }
        });

        ImageButton squirtle = findViewById(R.id.squirtle);
        final MediaPlayer soundG8 = MediaPlayer.create(this,R.raw.squirtle);
        squirtle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG8.start();
            }
        });

        ImageButton ash = findViewById(R.id.ash);
        final MediaPlayer soundG9 = MediaPlayer.create(this,R.raw.ash);
        ash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG9.start();
            }
        });

        ImageButton pacman = findViewById(R.id.pacman);
        final MediaPlayer soundG10 = MediaPlayer.create(this,R.raw.pacman);
        pacman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG10.start();
            }
        });

        ImageButton luigi = findViewById(R.id.luigi);
        final MediaPlayer soundG11 = MediaPlayer.create(this,R.raw.luigi);
        luigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG11.start();
            }
        });

        ImageButton stellaluigi = findViewById(R.id.stellaluigi);
        final MediaPlayer soundG12 = MediaPlayer.create(this,R.raw.stellaluigi);
        stellaluigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundG12.start();
            }
        });


    }

}

