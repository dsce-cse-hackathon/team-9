package com.example.ashish.auto;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoggedIn2 extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 0;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in2);
        button1 = (Button) findViewById(R.id.button1);


    }

    public void BlueCall(View v){
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(mBluetoothAdapter == null){
            Toast.makeText(this, "No Bluetooth", Toast.LENGTH_SHORT).show();
        }
        else {

              final Intent intent = new Intent(Intent.ACTION_MAIN,null);
              intent.addCategory(Intent.CATEGORY_LAUNCHER);
              ComponentName cn = new ComponentName("com.android.settings","com.android.settings.bluetooth.BluetoothSettings");
              intent.setComponent(cn);
              intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              startActivity(intent);

            }
        }
    }
