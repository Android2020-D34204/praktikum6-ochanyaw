package id.ac.id.telkomuniversity.tass.praktik_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tampil = findViewById(R.id.hasil);

        Bundle bundle = getIntent().getExtras();
        String teks = bundle.getString("diisi");
        tampil.setText(teks);
    }
}