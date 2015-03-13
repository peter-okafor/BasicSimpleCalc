package com.example.peterokafor.basiccalc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        EditText op1 = (EditText)findViewById(R.id.operand1);
        EditText op2 = (EditText)findViewById(R.id.operand1);
        TextView result = (TextView)findViewById(R.id.Result);

        String string1 = op1.getText().toString();
        String string2 = op2.getText().toString();

        double num1 = Double.parseDouble(string1);
        double num2 = Double.parseDouble(string2);

        double value =0;


        if (view.getId()==R.id.addButton){
            value = num1 + num2;
        }
        if (view.getId()==R.id.subtractButton){
            value = num1 - num2;
        }
        if (view.getId()==R.id.multiplyButton){
            value = num1 * num2;
        }
        if (view.getId()==R.id.divideButton){
            if (num2 == 0){
                value = num1 / num2;
            }


        }

        result.setText(""+ value);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
