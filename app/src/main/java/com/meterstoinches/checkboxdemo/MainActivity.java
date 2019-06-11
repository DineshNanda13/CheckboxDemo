package com.meterstoinches.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        final_text = findViewById(R.id.final_result);
        final_text.setVisibility(View.INVISIBLE);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.fruit_apple:
                if(checked) {
                    selection.add("Apple");
                }else {
                    selection.remove("Apple");
                }
                break;
            case R.id.fruit_orange:
                if(checked) {
                    selection.add("Orange");
                }else {
                    selection.remove("Orange");
                }
                break;
            case R.id.fruit_grapes:
                if(checked) {
                    selection.add("Grapes");
                }else {
                    selection.remove("Grapes");
                }
                break;

        }
    }

    public void finalSelection(View view) {
        String final_fruits = "";
        for (String Selections: selection){
            final_fruits = final_fruits + Selections + "\n";
        }
        final_text.setText(final_fruits);
        final_text.setVisibility(View.VISIBLE);

    }
}
