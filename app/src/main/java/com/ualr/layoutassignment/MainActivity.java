package com.ualr.layoutassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;


public class MainActivity extends AppCompatActivity {

    // TODO 02. Create a new method called "calculateTotal" for calculating the invoice's total amount of money

    // TODO 03. Bind the "calculateTotal" method to the button with the "CALCULATE TOTAL" label
    private EditText userInput;
    private TextView display_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        display_output = findViewById(R.id.display_output);

        final MaterialButton button = findViewById((R.id.calculate_button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTotal();
            }
        });
    }

    public void calculateTotal() {
        double total = 0.0;
        CheckBox product_1 = findViewById(R.id.product_01_checkbox);
        CheckBox product_2 = findViewById(R.id.product_02_checkbox);
        CheckBox product_3 = findViewById(R.id.product_03_checkbox);
        CheckBox product_4 = findViewById(R.id.product_04_checkbox);
        MaterialButton toggle = findViewById(R.id.toggle_discount);

        if(product_1.isChecked()) {
            userInput = findViewById(R.id.textInputEditText_product01);
            String Input = userInput.getText().toString();
            double x = Double.parseDouble(Input);
            total += x;
        }
        
        if (product_2.isChecked()) {
            userInput = findViewById(R.id.textInputEditText_product02);
            String Input = userInput.getText().toString();
            double x = Double.parseDouble(Input);
            total += x;
        }

        if (product_3.isChecked()) {
            userInput = findViewById(R.id.textInputEditText_product03);
            String Input = userInput.getText().toString();
            double x = Double.parseDouble(Input);
            total += x;
        }

        if (product_4.isChecked()) {
            userInput = findViewById(R.id.textInputEditText_product04);
            String Input = userInput.getText().toString();
            double x = Double.parseDouble(Input);
            total += x;
        }
        
        if(toggle.isChecked()) {
            total *= 0.75;
        }
        
        String output = String.valueOf(total);
        display_output.setText(output);
    }
}