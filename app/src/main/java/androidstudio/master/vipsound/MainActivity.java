package androidstudio.master.vipsound;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final MediaPlayer tutorial1 = MediaPlayer.create(this,R.raw.tutorial1);
        final MediaPlayer tutorial2 = MediaPlayer.create(this,R.raw.tutorial2);
        final MediaPlayer tutorial3 = MediaPlayer.create(this,R.raw.tutorial3);

        ImageButton animali = findViewById(R.id.animali);
        animali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial1.start();
                Intent opena = new Intent(MainActivity.this,animali.class);
                startActivity(opena);
            }
        });

        ImageButton giochi = findViewById(R.id.giochi);
        giochi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial2.start();
                Intent openg = new Intent(MainActivity.this,giochi.class);
                startActivity(openg);
            }
        });

        ImageButton cartoni = findViewById(R.id.cartoni);
        cartoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tutorial3.start();
                Intent openc = new Intent(MainActivity.this,cartoni.class);
                startActivity(openc);
            }
        });


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
}
