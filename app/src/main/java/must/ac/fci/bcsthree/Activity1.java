package must.ac.fci.bcsthree;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        Toolbar toolbar=findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }


}
