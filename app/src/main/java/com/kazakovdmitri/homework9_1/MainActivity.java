package com.kazakovdmitri.homework9_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(this);
        setContentView(R.layout.activity_main);
        InitViews();
    }

    private void InitViews() {
        Button btnSetStyle = findViewById(R.id.button);
        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        btnSetStyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                switch (selectedId) {
                    case R.id.radioButtonGreen: {
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_GREEN);
                        break;
                    }
                    case R.id.radioButtonBlue: {
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLUE);
                        break;
                    }
                    case R.id.radioButtonBlack: {
                        Utils.changeToTheme(MainActivity.this, Utils.THEME_BLACK);
                        break;
                    }
                }
            }
        });

    }
}
