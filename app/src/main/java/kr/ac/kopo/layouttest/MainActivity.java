package kr.ac.kopo.layouttest;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear_mint, linear_skyBlue;
    Button mint, skyBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main12);
        EdgeToEdge.enable(this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main12), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        linear_mint = findViewById(R.id.linear_mint);
        linear_skyBlue = findViewById(R.id.linear_skyBlue);
        mint = findViewById(R.id.mint);
        skyBlue = findViewById(R.id.skyBlue);

        mint.setOnClickListener(btnListener);
        skyBlue.setOnClickListener(btnListener);


//        LinearLayout linear = new LinearLayout(this);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        linear.setOrientation(LinearLayout.VERTICAL);
//        linear.setBackgroundColor(Color.rgb(210,255,230));
//        Button btn = new Button(this);
//        btn.setText("code button");
//        linear.addView(btn);
//        btn.setBackgroundColor(Color.rgb(255,200,210));
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),"헬롱",Toast.LENGTH_SHORT).show();
//            }
//        });
//        setContentView(linear,params);


    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            linear_mint.setVisibility(View.INVISIBLE);
            linear_skyBlue.setVisibility(View.INVISIBLE);
            Button ebtn = (Button) v;
            if(ebtn == mint){
                linear_mint.setVisibility(View.VISIBLE);
            } else {
                linear_skyBlue.setVisibility(View.VISIBLE);
            }
        }
    };
}