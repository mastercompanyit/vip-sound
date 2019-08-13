package androidstudio.master.vipsound;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.service.chooser.ChooserTarget;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class contact extends AppCompatActivity {
    Dialog myDialogInstagram;
    Dialog myDialogYoutube;
    Dialog myDialogemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setContentView(R.layout.content_contact);
        myDialogInstagram = new Dialog(this);
        setContentView(R.layout.content_contact);
        myDialogYoutube = new Dialog(this);
        setContentView(R.layout.content_contact);
        myDialogemail = new Dialog(this);

        Button home = findViewById(R.id.home5);

        final MediaPlayer sound3 = MediaPlayer.create(this,R.raw.home5);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound3.start();
                Intent openH = new Intent(contact.this,MainActivity.class);
                startActivity(openH);
            }
        });
    }

    public void ShowPopup (View v) {
        Log.i("ShowPopup", "Begin");
        TextView textclose;
        Button btnFollow;
        myDialogInstagram.setContentView(R.layout.costumpop_insta);
        textclose =(TextView) myDialogInstagram.findViewById(R.id.txtclose);
        textclose.setText("X");
        btnFollow = (Button) myDialogInstagram.findViewById(R.id.btnfollow);
        textclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialogInstagram.dismiss();
            }
        });
        myDialogInstagram.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialogInstagram.show();
    }
    public void webinsta (View view) {
        Intent webintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mastercompani2019/?hl=it"));
        startActivity(webintent);
    }

    public void ShowPopupYoutube (View v) {
        Log.i("ShowPopupYoutube", "Begin");
        try {
            TextView textclose;
            Button btnFollow;
            myDialogYoutube.setContentView(R.layout.costumpop_yt);
            textclose = (TextView) myDialogYoutube.findViewById(R.id.textclose);
            textclose.setText("X");
            btnFollow = (Button) myDialogYoutube.findViewById(R.id.btnfollow1);
            textclose.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myDialogYoutube.dismiss();
                }
            });
            myDialogYoutube.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            myDialogYoutube.show();
            Log.i("ShowPopupYuoutube", "End");
        }
        catch (Exception ex)
        {
            Log.e("Showpopup", ex.toString());
            throw ex;
        }
    }
    public void webinsta1 (View view) {
        Intent webintent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCl374pwxDy15c6NQRRhTorg?view_as=subscriber"));
        startActivity(webintent1);
    }

    public void ShowPopupemail (View v) {
        TextView textclose2;
        Button btnFollow2;
        myDialogemail.setContentView(R.layout.costumpop_email);
        textclose2 =(TextView) myDialogemail.findViewById(R.id.textclose2);
        textclose2.setText("X");
        btnFollow2 = (Button) myDialogemail.findViewById(R.id.btnfollow2);
        textclose2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialogemail.dismiss();
            }
        });
        myDialogemail.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialogemail.show();
    }

    public void SendEmail (View view) {
        /*Intent openemail = new Intent(contact.this,email.class);
        startActivity(openemail);*/
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","mastercompani2019@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "motivazione dell'email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Messaggio: (idee, assistenza o problematiche)");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));
    }

}

