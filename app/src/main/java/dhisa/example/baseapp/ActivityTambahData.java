package dhisa.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class ActivityTambahData extends AppCompatActivity {

    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        add = (Button) findViewById(R.id.btn_add);

        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Snackbar.make(view, "Data berhasil ditambahkan!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

}
