package id.ac.id.telkomuniversity.tass.praktik_activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonPindah;
    EditText inputTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPindah = findViewById(R.id.buttonPindah);
        inputTeks = findViewById(R.id.input);
        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String teks = inputTeks.getText().toString();
                if (teks.isEmpty()){
                    Toast.makeText(getApplication(), "Input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }else {
                    alert();
                }
            }
        });
    }

            public void alert(){
                new AlertDialog.Builder(this)
                        .setMessage("Yakin ingin pindah?")
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        })
                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                String teks = inputTeks.getText().toString();
                                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                                intent.putExtra("diisi", teks);
                                startActivity(intent);
                            }
                        })
                        .show();
                }
            }
