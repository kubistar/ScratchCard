package com.example.scratchcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScratchView scratchview = findViewById(R.id.scratchView);
        scratchview.setRevealListener(new ScratchView.IRevealListener() {
            @Override
            public void onRevealed(ScratchView scratchView) {
                Toast.makeText(MainActivity.this, "Revealed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
                Log.d("Revealed", String.valueOf(percent));

            }
        });
    }
}
