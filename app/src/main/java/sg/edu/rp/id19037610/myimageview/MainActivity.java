package sg.edu.rp.id19037610.myimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay2.setImageResource(R.drawable.day2);
    }
}