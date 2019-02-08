package maps.aaa.ch_map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    public void view360(View view){
        Intent i=new Intent(Welcome.this,Views360.class);
        startActivity(i);

    }

    public void viewMaps(View view){
        Intent i1=new Intent(Welcome.this,mapDirection.class);
        startActivity(i1);
    }



}
