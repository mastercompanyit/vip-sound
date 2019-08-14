package androidstudio.master.vipsound;


import android.util.Log;
import android.widget.TextView;

public class ThreadFrase implements  Runnable {
    contact contact;
    String[] frasi = {"pippo", "pluto", "paperino"};
    public ThreadFrase(contact contact){
        this.contact = contact;
    }


    @Override
    public void run() {
        try {
            int index = 0;
            do {
                TextView tw = contact.findViewById(R.id.textView2);

                String frase = frasi[index];

                tw.setText(frase);

                index++;

                if (index > frasi.length - 1)
                    index = 0;
                // thread to sleep for 1000 milliseconds
                try {
                    Thread.sleep(3L * 1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            while (true);
        } catch (Exception ex) {
            Log.e("ThreadFrase", ex.toString());
        }

    }
}
