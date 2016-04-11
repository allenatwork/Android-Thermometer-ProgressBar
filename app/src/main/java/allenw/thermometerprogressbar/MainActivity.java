package allenw.thermometerprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    CustomProgressBar customProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        customProgressBar = (CustomProgressBar) findViewById(R.id.custom_pb);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                                               @Override
                                               public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                                                   customProgressBar.setProgress(progress);
                                               }

                                               @Override
                                               public void onStartTrackingTouch(SeekBar seekBar) {
                                               }

                                               @Override
                                               public void onStopTrackingTouch(SeekBar seekBar) {
                                               }
                                           }
        );
    }
}
