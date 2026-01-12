package com.example.ex0606;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btn;
ImageView iVMain;
int randNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        iVMain = findViewById(R.id.iVMain);
    }

    public void changeimg(View view) {
        randNum = (int)(Math.random() * (3-1+1) + 1);
        btn.setText(""+randNum);
        if (randNum == 1)
        {
            iVMain.setImageResource(R.drawable.imgone);
        }
        else if (randNum == 2)
        {
            iVMain.setImageResource(R.drawable.imgtwo);
        }
        else
        {
            iVMain.setImageResource(R.drawable.imgthree);
        }
        }
}
