package by.kuchinsky.affirmation.Affirmation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import by.kuchinsky.affirmation.MainActivity;
import by.kuchinsky.affirmation.R;

public class Love extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);
        Button back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(Love.this, MainActivity.class);
                startActivity(back);
                finish();
            }
        });


    }
}
