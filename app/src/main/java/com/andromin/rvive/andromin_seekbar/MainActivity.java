package com.andromin.rvive.andromin_seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekFunction();
    }

    public void seekFunction()
    {
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekbar);
        final TextView status = (TextView)findViewById(R.id.status);
        final TextView prog = (TextView)findViewById(R.id.progress) ;

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                prog.setText("Progress : "+ progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                status.setText("Started tracking...");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                status.setText("Done tracking.");

            }
        });


    }

}
