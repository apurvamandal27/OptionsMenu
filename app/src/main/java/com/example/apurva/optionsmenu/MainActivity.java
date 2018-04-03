package com.example.apurva.optionsmenu;

import android.content.Intent;
import android.provider.Settings;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         fm=getSupportFragmentManager();
         ft=fm.beginTransaction();

        ft.replace(R.id.main_page,new HomeFragment());
        ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater mf=getMenuInflater();
        mf.inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();

        switch (id){
            case R.id.item1:


                fm=getSupportFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.main_page,new HomeFragment());
                ft.commit();
                break;
            case R.id.item2:

                fm=getSupportFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.main_page,new AboutFragment());
                ft.commit();
                break;

            case R.id.item3:

                fm=getSupportFragmentManager();
                ft=fm.beginTransaction();
                ft.replace(R.id.main_page,new ContactFragment());
                ft.commit();
                break;

        }


        return super.onOptionsItemSelected(item);
    }
}
