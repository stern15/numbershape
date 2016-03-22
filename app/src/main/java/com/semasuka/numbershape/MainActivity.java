package com.semasuka.numbershape;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    class Number{
        int Number;
        public boolean isSquare(){
            int x=1;
            int Square=1;
            //this will generated all the square numbers up to our number
            while(Square<Number){
                x++;
                Square= x*x;
            }
            //if our number equal to the
            if(Square==Number){
                return true;
            }
            else{
                return false;
            }

        }
        public boolean isTriangular(){
            int x=1;
            int triangularNumber=1;

            while(triangularNumber < Number){
                x++;
                triangularNumber=triangularNumber+x;
            }
            if(triangularNumber==Number){
                return true;
            }
            else{
                return false;
            }

        }

    }

    public void testNumber(View view){

        EditText usersNumber=(EditText)findViewById(R.id.usersNumber);

        Log.i("userNumber",usersNumber.getText().toString());


        Number myNumber=new Number();
        myNumber.Number=Integer.parseInt(usersNumber.getText().toString());
        System.out.println("Is "+myNumber.Number+" a square number?Answer:"+myNumber.isSquare());
        System.out.println("Is " + myNumber.Number + " a triangular number?Answer:" + myNumber.isTriangular());




    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
