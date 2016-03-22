package com.semasuka.numbershape;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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
        Number myNumber=new Number();
        myNumber.Number=Integer.parseInt(usersNumber.getText().toString());

        String message="";
        if(myNumber.isSquare()){

            if (myNumber.isTriangular()){
                message= myNumber.Number + " is both triangular and square number!";

            }
            else{
                message=myNumber.Number + " it is square, but not triangular";
            }

        }
        else {
            if (myNumber.isTriangular()){
                message= myNumber.Number + " is triangular but not square";

            }
            else{
                message=myNumber.Number + " it is neither square nor triangular";
            }

        }
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
