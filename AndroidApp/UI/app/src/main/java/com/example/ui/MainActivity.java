package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_create);

        checkAndroidPermissions();

    }

    private void checkAndroidPermissions() {
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) +
                ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_NETWORK_STATE) +
                ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {

            String[] permissions = {Manifest.permission.INTERNET,
                    Manifest.permission.ACCESS_NETWORK_STATE,
                    Manifest.permission.CAMERA};
            int idPermissionRequest = 1;
            ActivityCompat.requestPermissions(this, permissions, idPermissionRequest);
        } else {
            Toast.makeText(MainActivity.this, "Permission already granted", Toast.LENGTH_SHORT).show();
        }
    }
}