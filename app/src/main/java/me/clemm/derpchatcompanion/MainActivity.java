package me.clemm.derpchatcompanion;

import android.content.res.AssetFileDescriptor;
import android.media.Image;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sikinvoit);


        ImageButton btnSikInvoit = (ImageButton) findViewById(R.id.btn_sikinvoit);
        btnSikInvoit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // play sound file
//                    if(mp.isPlaying()) {
//                        mp.stop();
//                    }
//                    mp.reset();
                    mp.start();
                }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
