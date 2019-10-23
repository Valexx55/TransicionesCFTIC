package edu.val.transicionescftic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AndroidPequeActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_peque);

        iv = (ImageView)findViewById(R.id.miimagenp);

        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AndroidPequeActivity.this, AndroidGrandeActivity.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(AndroidPequeActivity.this, iv, "roboto");
                    startActivity(intent, options.toBundle());

                } else {

                    startActivity(intent);
                }


            }
        });
    }


}
