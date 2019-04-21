package com.example.myapplication;

import android.Manifest;
import android.location.Location;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button bt;
    TextView lat, lon, speedTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =(Button) findViewById(R.id.button);
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},123);
        lat=(TextView) findViewById(R.id.lat);
        lon=(TextView) findViewById(R.id.textView);
        speedTV =(TextView) findViewById(R.id.speed);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GPSTracker gps = new GPSTracker(getApplicationContext());
                LocAndSpeed temp = gps.getocAndSpeed();

                if(temp !=null){
                    lat.setText(String.valueOf(temp.loc.getLatitude()));
                    lon.setText(String.valueOf(temp.loc.getLongitude()));
                    speedTV.setText(String.valueOf(temp.speed));

                }
            }
        });
    }
}
