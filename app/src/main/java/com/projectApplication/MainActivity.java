package com.projectApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Executing creator of mother class
        super.onCreate(savedInstanceState);

        // Loading the layout from xml file
        setContentView(R.layout.activity_main);

        // Testing messages in Logcat
        Log.e("DEVE304", "Testing error message.");
        Log.w("DEVE304", "Testing error message.");
        Log.i("DEVE304", "Testing error message.");
        Log.d("DEVE304", "Testing error message.");
        Log.v("DEVE304", "Testing error message.");

        Log.v("DEVE304", "onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v("DEVE304", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("DEVE304", "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("DEVE304", "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("DEVE304", "onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("DEVE304", "onDestroy()");
    }

    public void buttonClick1(View view) {

        int iVariable;
        iVariable = 4;
        iVariable --;
        iVariable --;
        iVariable --;
        iVariable --;

        // This will generate an exception
        Log.e("DEVE304", String.valueOf(12/iVariable));
    }

    public void buttonClick2(View view) {

        // Change color of button 1
        Button thisButton1 = (Button) findViewById(R.id.mybutton1);
        thisButton1.setBackgroundColor(Color.GREEN);

        //Change color of button 2
        Button thisButton2 = (Button) view;
        thisButton1.setBackgroundColor(Color.RED);

        try {
            int iVariable;
            iVariable = 4;
            iVariable --;
            iVariable --;
            iVariable --;
            iVariable --;

            // This will generate an exception
            Log.e("DEVE304", String.valueOf(12/iVariable));
        }
        catch (Exception e) {
            System.out.println("buttonClick2 : Exception :  " + e.getMessage());
        }
    }

}