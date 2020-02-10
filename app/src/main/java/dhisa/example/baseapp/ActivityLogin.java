package dhisa.example.baseapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class ActivityLogin extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //To Remove Toolbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        setContentView(R.layout.activity_login);

        //AppCompatButton btnLogin = findViewById(R.id.btn_login);
        //btnLogin.setOnClickListener(this);

        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                handleLoginClick();
            }            
        });
    }

    private void handleLoginClick() {
        Intent i =  new Intent();
        i.setClass(this, ActivityDashboard.class);
        startActivity(i);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }



}
