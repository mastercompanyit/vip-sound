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
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class cartoni extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoni);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int image[] = {R.drawable.mastercompany,R.drawable.cartoni};

        v_flipper = findViewById(R.id.v_flipper1);

        for (int images: image){
            flipperImage(images);

        }

        ImageButton spongebob = findViewById(R.id.spongebob);
        final MediaPlayer soundC1 = MediaPlayer.create(this,R.raw.spongebob);
        spongebob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC1.start();
            }
        });

        ImageButton superman = findViewById(R.id.superman);
        final MediaPlayer soundC2 = MediaPlayer.create(this,R.raw.superman);
        superman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC2.start();
            }
        });

        ImageButton paperino = findViewById(R.id.paperino);
        final MediaPlayer soundC3 = MediaPlayer.create(this,R.raw.paperino);
        paperino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC3.start();
            }
        });

        ImageButton topolino = findViewById(R.id.topolino);
        final MediaPlayer soundC4 = MediaPlayer.create(this,R.raw.topolino);
        topolino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC4.start();
            }
        });

        ImageButton topolina = findViewById(R.id.topolina);
        final MediaPlayer soundC5 = MediaPlayer.create(this,R.raw.topolina);
        topolina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC5.start();
            }
        });

        ImageButton homer = findViewById(R.id.homer);
        final MediaPlayer soundC6 = MediaPlayer.create(this,R.raw.homer);
        homer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC6.start();
            }
        });

        ImageButton marge = findViewById(R.id.marge);
        final MediaPlayer soundC7 = MediaPlayer.create(this,R.raw.marge);
        marge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC7.start();
            }
        });

        ImageButton batman = findViewById(R.id.batman);
        final MediaPlayer soundC8 = MediaPlayer.create(this,R.raw.batman);
        batman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC8.start();
            }
        });

        ImageButton capitanamerica = findViewById(R.id.capitanamerica);
        final MediaPlayer soundC9 = MediaPlayer.create(this,R.raw.capitanamerica);
        capitanamerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC9.start();
            }
        });

        ImageButton lisa = findViewById(R.id.lisa);
        final MediaPlayer soundC10 = MediaPlayer.create(this,R.raw.lisa);
        lisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC10.start();
            }
        });

        ImageButton peter = findViewById(R.id.peter);
        final MediaPlayer soundC11 = MediaPlayer.create(this,R.raw.peter);
        peter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC11.start();
            }
        });

        ImageButton peterpan = findViewById(R.id.peterpan);
        final MediaPlayer soundC12 = MediaPlayer.create(this,R.raw.peterpan);
        peterpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC12.start();
            }
        });

        ImageButton cogu = findViewById(R.id.cogu);
        final MediaPlayer soundC13 = MediaPlayer.create(this,R.raw.cogu);
        cogu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC13.start();
            }
        });

        ImageButton scoobydoo = findViewById(R.id.scoobydoo);
        final MediaPlayer soundC14 = MediaPlayer.create(this,R.raw.scoobydoo);
        scoobydoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC14.start();
            }
        });

        ImageButton leoneilcanefifone = findViewById(R.id.leoneilcanefifone);
        final MediaPlayer soundC15 = MediaPlayer.create(this,R.raw.leoneilcanefifone);
        leoneilcanefifone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundC15.start();
            }
        });
    }

    public void flipperImage(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}