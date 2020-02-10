package dhisa.example.baseapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ActivityRelawan extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View contentView = inflater.inflate(R.layout.activity_relawan, null, false);
        drawer.addView(contentView, 0);

        navigationView.setCheckedItem(R.id.nav_activity3);
        //fab.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View view) {
             //   Snackbar.make(view, "Hello Second Activity", Snackbar.LENGTH_LONG)
               //         .setAction("Action", null).show();
            //}
        //});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.logout, menu);
        return true;
    }


    //CLEAR STACK BACK TO LOG IN ACTIVITY
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.btn_logout){
            Intent j = new Intent(ActivityRelawan.this, ActivityLogin.class);
            j.setFlags(j.FLAG_ACTIVITY_NEW_TASK | j.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(j);
            finish();

        }
        return super.onOptionsItemSelected(item);


    }

//    @Override
//    public void onBackPressed() {
//        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
//                finishAffinity();
//            } else {
//                super.onBackPressed();
//            }
//        }
//    }
}
