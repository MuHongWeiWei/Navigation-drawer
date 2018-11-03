package com.fly.actiontest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        NavigationView navigationView  = findViewById(R.id.nav_view);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();//取得ActiomBar物件
        actionBar.setDisplayHomeAsUpEnabled(true);//顯示選單按鈕
        actionBar.setHomeAsUpIndicator(R.drawable.menu_list);//選單圖示

        //設定navigation裡的點擊事件
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setCheckable(true);
                int id = menuItem.getItemId();
                switch (id){
                    case R.id.nav_eye:
                        Toast.makeText(MainActivity.this,"眼睛",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_plane:
                        Toast.makeText(MainActivity.this,"飛機",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_bus:
                        Toast.makeText(MainActivity.this,"公車",Toast.LENGTH_SHORT).show();
                        break;
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    //選單被點擊
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
