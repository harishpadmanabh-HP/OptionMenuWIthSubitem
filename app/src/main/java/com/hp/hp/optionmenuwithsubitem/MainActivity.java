package com.hp.hp.optionmenuwithsubitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//ctrl+o to overide .search and select oncreateoption menu.and return true
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//menu inflator
        MenuInflater inflater=getMenuInflater();
        //inflate menu created
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    //menu on click ctl+o onoptionmenuitemselected


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this, "item1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "item2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "item3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this, "isubtem1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this, "subitem2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3:
                Toast.makeText(this, "subitem3 selected", Toast.LENGTH_SHORT).show();
                return true;
                default:        return super.onOptionsItemSelected(item);

        }
    }
}
