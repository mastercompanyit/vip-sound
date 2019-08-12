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

public class informazioni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informazioni);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button home = findViewById(R.id.home);

        final MediaPlayer sound4 = MediaPlayer.create(this,R.raw.home4);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound4.start();
                Intent openH = new Intent(informazioni.this,MainActivity.class);
                startActivity(openH);
            }
        });

        ImageButton vipsoundicona = findViewById(R.id.vipsoundicona);
        final MediaPlayer soundvip = MediaPlayer.create(this,R.raw.vip_sound_by_the_master1);
        vipsoundicona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundvip.start();
            }
        });


    }

}
