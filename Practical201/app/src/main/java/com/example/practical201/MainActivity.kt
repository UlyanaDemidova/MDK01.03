package com.example.practical201

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SensorEventListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var mSensorManager =  getSystemService(Context.SENSOR_SERVICE) as (SensorManager) // Получаем менеджер сенсоров
        var mOrientation = mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION); // Получаем датчик положения
    }

    override fun onSensorChanged(p0: SensorEvent?) {
        var xy_angle = p0!!.values[0]; //Плоскость XY
        var xz_angle = p0!!.values[1]; //Плоскость XZ
        var zy_angle = p0!!.values[2]

        xyValue.setText(xy_angle.toString());
        xzValue.setText(xz_angle.toString());
        zyValue.setText(zy_angle.toString());
    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
    }
}