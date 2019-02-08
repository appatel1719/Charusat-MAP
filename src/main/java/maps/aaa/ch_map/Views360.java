package maps.aaa.ch_map;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import java.net.URI;


public class Views360 extends AppCompatActivity {

    @Override
   protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_views360);
    }

    public void cspit(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/CSPIT/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void ADMIN(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/Charusat_Campus/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void pdpias(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/PDPIAS/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void iiim(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/PDPIAS/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void rpcp(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/RPCP/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void mtin(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/MTIN/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void research(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/ResearchCenter/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void cips(View view){
        Uri uri = Uri.parse("http://117.239.83.200:8110/CHARUSAT_Virtual_Tour/CIPS/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}
