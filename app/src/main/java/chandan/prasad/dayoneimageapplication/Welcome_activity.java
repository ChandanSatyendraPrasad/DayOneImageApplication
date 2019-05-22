package chandan.prasad.dayoneimageapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Welcome_activity extends AppCompatActivity {
    Button show_images, show_sliders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activity);
        intialize();
        operation_on_welcome();
    }

    private void operation_on_welcome() {

        // go t the iamges activity
        show_images.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent images = new Intent(Welcome_activity.this, MainActivity.class);
                startActivity(images);
            }
        });


        // go to he sliders actvity
        show_sliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slider = new Intent(Welcome_activity.this, Second_activity.class);
                startActivity(slider);
            }
        });

    }

    private void intialize() {

        //define the Button in the Welcome Activity
        show_images = findViewById(R.id.show_images);
        show_sliders = findViewById(R.id.show_slider);
    }
}
