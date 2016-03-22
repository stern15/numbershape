package com.semasuka.numbershape;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void testNumber(View view){

        EditText usersNumber=(EditText)findViewById(R.id.usersNumber);

        Log.i("userNumber",usersNumber.getText().toString());



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
