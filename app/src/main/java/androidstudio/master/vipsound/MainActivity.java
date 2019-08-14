package androidstudio.master.vipsound;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button applyTextButton;
    private Button saveButton;
    private Switch switch1;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewFlipper = findViewById(R.id.view_flipper);

        final MediaPlayer soundtutorial = MediaPlayer.create(this,R.raw.tutorialstart);

        ImageButton animali = findViewById(R.id.animali);
        animali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent opena = new Intent(MainActivity.this,animali.class);
                startActivity(opena);
            }
        });

        ImageButton giochi = findViewById(R.id.giochi);
        giochi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openg = new Intent(MainActivity.this,giochi.class);
                startActivity(openg);
            }
        });


        ImageButton cartoni = findViewById(R.id.cartoni);
        cartoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openc = new Intent(MainActivity.this,cartoni.class);
                startActivity(openc);
            }
        });

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if(firstStart) {
                showStartDialog();
                soundtutorial.start();

    }
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
        if (id == R.id.infocc) {
            Intent info = new Intent(MainActivity.this,informazioni.class);
            startActivity(info);
            return false;
        }

        if (id == R.id.master) {
            final MediaPlayer master = MediaPlayer.create(this,R.raw.vip_sound_by_the_master2);
            master.start();
            return false;
        }

        if (id == R.id.contact) {
            Intent info = new Intent(MainActivity.this,contact.class);
            startActivity(info);
            return false;
        }

        if (id == R.id.sharecc) {
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            String shareBody = "Vuoi provare tutti i suoni più divertenti ?, allora scarica VIP SOUND: https://play.google.com/store/apps/details?id=androidstudio.master.vipsound";
            String shareSub = "bellaaaaa";
            share.putExtra(Intent.EXTRA_SUBJECT,shareBody);
            share.putExtra(Intent.EXTRA_TEXT,shareBody);
            startActivity(Intent.createChooser(share, "Share using"));

            return false;
        }

        return super.onOptionsItemSelected(item);

    }

    public void previousView(View v) {
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.showPrevious();
    }

    public void nextView(View v) {
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showNext();
    }

    private void showStartDialog() {
        new AlertDialog.Builder(this)
                .setTitle("ATTENZIONE")
                .setMessage("°AVVERTIAMO CHE NON SIAMO RESPONSABILI DI DANNI CAUSATI DAL VALUME DELL'APLICAZINE, SI CONSIGLIA PERTANTO DI MODERARE IL VOLUME PER NON RECARE DANNI ALL'UDITO\n" +
                        "----------------------------------------------------------------\n" +
                        "°L'USO DELL'APPLICAZIONE E' VIETATO AI BAMBINI INFERIORI A 3 ANNI")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create().show();

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();
    }
}
