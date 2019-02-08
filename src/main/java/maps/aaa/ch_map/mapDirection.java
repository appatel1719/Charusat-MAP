package maps.aaa.ch_map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapDirection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_direction);



        Button b1=(Button) findViewById(R.id.ADMIN);
        Button b2=(Button) findViewById(R.id.CSPIT);
        Button b3=(Button) findViewById(R.id.PDPIAS);
        Button b4=(Button) findViewById(R.id.IIIM);
        Button b5=(Button) findViewById(R.id.RPCP);
        Button b6=(Button) findViewById(R.id.CIPS);
        Button b7=(Button) findViewById(R.id.MTIN);
        Button b8=(Button) findViewById(R.id.CANTEEN);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                        i.putExtra("m",22.5995173);
                        i.putExtra("n",72.8194895);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.5995173);
                i.putExtra("n",72.8194895);
                startActivity(i);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.6004499);
                i.putExtra("n",72.8192037);
                startActivity(i);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.6004495);
                i.putExtra("n",72.819085);
                startActivity(i);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.5993753);
                i.putExtra("n",72.8185876);
                startActivity(i);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.6026339);
                i.putExtra("n",72.8185625);
                startActivity(i);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.6012554);
                i.putExtra("n",72.817667);
                startActivity(i);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mapDirection.this,MapsActivity.class);
                i.putExtra("m",22.5988349);
                i.putExtra("n",72.8202501);
                startActivity(i);
            }
        });



    }
}
