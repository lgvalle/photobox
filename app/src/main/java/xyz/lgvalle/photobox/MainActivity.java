package xyz.lgvalle.photobox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
