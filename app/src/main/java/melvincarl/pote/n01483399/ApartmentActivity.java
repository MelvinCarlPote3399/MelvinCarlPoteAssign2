package melvincarl.pote.n01483399;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ApartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartment_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}