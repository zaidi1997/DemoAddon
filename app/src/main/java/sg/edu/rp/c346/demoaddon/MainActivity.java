package sg.edu.rp.c346.demoaddon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);

        String imageUrl = "https://i.imgur.com/tGbaZCY.jpg";
        Picasso.with(this).load(imageUrl).into(iv);
    }
}
