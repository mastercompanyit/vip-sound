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

public class animali extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animali);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button home = findViewById(R.id.home);

        final MediaPlayer sound1 = MediaPlayer.create(this,R.raw.home1);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound1.start();
                Intent openH = new Intent(animali.this,MainActivity.class);
                startActivity(openH);
            }
        });

        ImageButton gorilla = findViewById(R.id.gorilla);
        final MediaPlayer soundA1 = MediaPlayer.create(this,R.raw.gorilla);
        gorilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA1.start();
            }
        });

        ImageButton lama = findViewById(R.id.lama);
        final MediaPlayer soundA2 = MediaPlayer.create(this,R.raw.lama);
        lama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA2.start();
            }
        });

        ImageButton asino = findViewById(R.id.asino);
        final MediaPlayer soundA3 = MediaPlayer.create(this,R.raw.asinello);
        asino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA3.start();
            }
        });

        ImageButton cane = findViewById(R.id.cane);
        final MediaPlayer soundA4 = MediaPlayer.create(this,R.raw.cane);
        cane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA4.start();
            }
        });

        ImageButton gatto = findViewById(R.id.gatto);
        final MediaPlayer soundA5 = MediaPlayer.create(this,R.raw.gatto);
        gatto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA5.start();
            }
        });

        ImageButton cavallo = findViewById(R.id.cavallo);
        final MediaPlayer soundA6 = MediaPlayer.create(this,R.raw.cavallo);
        cavallo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA6.start();
            }
        });

        ImageButton leone = findViewById(R.id.leone);
        final MediaPlayer soundA7 = MediaPlayer.create(this,R.raw.leone);
        leone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA7.start();
            }
        });

        ImageButton tigre = findViewById(R.id.tigre);
        final MediaPlayer soundA8 = MediaPlayer.create(this,R.raw.tigre);
        tigre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA8.start();
            }
        });

        ImageButton scimmia = findViewById(R.id.scimmia);
        final MediaPlayer soundA9 = MediaPlayer.create(this,R.raw.scimmia);
        scimmia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA9.start();
            }
        });

        ImageButton balena = findViewById(R.id.balena);
        final MediaPlayer soundA10 = MediaPlayer.create(this,R.raw.balena);
        balena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA10.start();
            }
        });

        ImageButton usignolo = findViewById(R.id.usignolo);
        final MediaPlayer soundA11 = MediaPlayer.create(this,R.raw.usignolo);
        usignolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA11.start();
            }
        });

        ImageButton aquila = findViewById(R.id.aquila);
        final MediaPlayer soundA12 = MediaPlayer.create(this,R.raw.aquila);
        aquila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA12.start();
            }
        });

        ImageButton mucca = findViewById(R.id.mucca);
        final MediaPlayer soundA13 = MediaPlayer.create(this,R.raw.mucca);
        mucca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA13.start();
            }
        });

        ImageButton topo = findViewById(R.id.topo);
        final MediaPlayer soundA14 = MediaPlayer.create(this,R.raw.topo);
        topo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA14.start();
            }
        });

        ImageButton orso = findViewById(R.id.orso);
        final MediaPlayer soundA15 = MediaPlayer.create(this,R.raw.orso);
        orso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA15.start();
            }
        });

        ImageButton criceto = findViewById(R.id.criceto);
        final MediaPlayer soundA16 = MediaPlayer.create(this,R.raw.criceto);
        criceto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA16.start();
            }
        });

        ImageButton scogliattolo = findViewById(R.id.scogliattolo);
        final MediaPlayer soundA17 = MediaPlayer.create(this,R.raw.scogliattolo);
        scogliattolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA17.start();
            }
        });

        ImageButton cerbiatto = findViewById(R.id.cerbiatto);
        final MediaPlayer soundA18 = MediaPlayer.create(this,R.raw.capriolo);
        cerbiatto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA18.start();
            }
        });

        ImageButton maiale = findViewById(R.id.maiale);
        final MediaPlayer soundA19 = MediaPlayer.create(this,R.raw.maiale);
        maiale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA19.start();
            }
        });

        ImageButton volpe = findViewById(R.id.volpe);
        final MediaPlayer soundA20 = MediaPlayer.create(this,R.raw.volpe);
        volpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA20.start();
            }
        });

        ImageButton delfino = findViewById(R.id.delfino);
        final MediaPlayer soundA21 = MediaPlayer.create(this,R.raw.delfino);
        delfino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA21.start();
            }
        });


        ImageButton elefante = findViewById(R.id.elefante);
        final MediaPlayer soundA22 = MediaPlayer.create(this,R.raw.elefante);
        elefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA22.start();
            }
        });

        ImageButton foca = findViewById(R.id.foca);
        final MediaPlayer soundA23 = MediaPlayer.create(this,R.raw.foca);
        foca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA23.start();
            }
        });

        ImageButton serpente = findViewById(R.id.serpente);
        final MediaPlayer soundA24 = MediaPlayer.create(this,R.raw.serpente);
        serpente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA24.start();
            }
        });

        ImageButton capra = findViewById(R.id.capra);
        final MediaPlayer soundA25 = MediaPlayer.create(this,R.raw.capra);
        capra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA25.start();
            }
        });

        ImageButton pecora = findViewById(R.id.pecora);
        final MediaPlayer soundA26 = MediaPlayer.create(this,R.raw.pecora);
        pecora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA26.start();
            }
        });

        ImageButton zebra = findViewById(R.id.zebra);
        final MediaPlayer soundA27 = MediaPlayer.create(this,R.raw.zebra);
        zebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundA27.start();
            }
        });
    }

}
