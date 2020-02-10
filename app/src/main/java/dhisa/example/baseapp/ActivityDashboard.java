package dhisa.example.baseapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActivityDashboard extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        @SuppressLint("InflateParams")
        View contentView = inflater.inflate(R.layout.activity_dashboard, null, false);
        drawer.addView(contentView, 0);

        navigationView.setCheckedItem(R.id.nav_activity1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Add Data baru
                Intent i = new Intent(ActivityDashboard.this, ActivityTambahData.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.logout, menu);

        return true;

    }

    //CLEAR STACK BACK TO LOG IN ACTIVITY
    public boolean onOptionsItemSelected(MenuItem item){
       int id = item.getItemId();

        if (id == R.id.btn_logout){
            Intent j = new Intent(ActivityDashboard.this, ActivityLogin.class);
            j.setFlags(j.FLAG_ACTIVITY_NEW_TASK | j.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(j);
            finish();

        }
        return super.onOptionsItemSelected(item);


    }

    @Override
    public void onBackPressed(){
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
                finishAffinity();
        } else {
                super.onBackPressed();
        }
        }
    }
}


