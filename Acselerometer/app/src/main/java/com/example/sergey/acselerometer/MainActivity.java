package com.example.sergey.acselerometer;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;




public class MainActivity extends Activity implements SensorEventListener {
    private Sensor sensor1;
    private  SensorManager sensorManager1;
    private TextView t1,t2,t3;
    private Button b1;
    private double x;
    private double y;
    private double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager1 = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor1 = sensorManager1.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageBitmap(BitmapFactory.decodeResource(this.getResources(), R.drawable.angry_bird));

        t1 = (TextView) findViewById(R.id.tv1);
        t2 = (TextView) findViewById(R.id.tv2);
        t3 = (TextView) findViewById(R.id.tv3);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(eventXYZ);
}
    @Override
    public final void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Do something here if sensor accuracy changes.
    }
    @Override
    public void onSensorChanged(SensorEvent event) {
        // Many sensors return 3 values, one for each axis.
        x = event.values[0];
        y = event.values[1];
        z = event.values[2];
        // Do something with this sensor value.

        t1.setText(""+x);
        t2.setText(""+y);
        t3.setText(""+z);
    }

    public View.OnClickListener eventXYZ = new View.OnClickListener() {
        public void onClick(View v) {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }
    };
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager1.registerListener(this, sensor1, SensorManager.SENSOR_DELAY_NORMAL);
    }


}
