package androidstudio.master.vipsound;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class informazioni extends AppCompatActivity {
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informazioni);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        int image[] = {R.drawable.mastercompany,R.drawable.infoc};

        v_flipper = findViewById(R.id.v_flipper);

        for (int images: image){
            flipperImage(images);

        }

        ImageButton vipsoundicona = findViewById(R.id.vipsoundicona);
        final MediaPlayer soundvip = MediaPlayer.create(this,R.raw.vip_sound_by_the_master1);
        vipsoundicona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundvip.start();
            }
        });


    }

    public void Info(View v) {

        AlertDialog.Builder alertinfo = new AlertDialog.Builder(this);
        alertinfo.setTitle("ATTENZIONE");
        alertinfo.setMessage("°AVVERTIAMO CHE NON SIAMO RESPONSABILI DI DANNI CAUSATI DAL VALUME DELL'APLICAZINE, SI CONSIGLIA PERTANTO DI MODERARE IL VOLUME PER NON RECARE DANNI ALL'UDITO\n" +
                "----------------------------------------------------------------\n" +
                "°L'USO DELL'APPLICAZIONE E' VIETATO AI BAMBINI INFERIORI A 3 ANNI");
        AlertDialog.Builder builder = alertinfo.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertinfo.create().show();

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
