package cautiousdrive.com.cautiousdrive;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Dialog.*;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View;

import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private ImageButton btnAccident, btnTrafficCong, btnTrafficLights, btnPronedZone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.cd_logo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);



        btnPronedZone = (ImageButton) findViewById(R.id.btn_proneZone);
        btnPronedZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(MainActivity.this, MapActivity.class);
                startActivity(map);

            }
        });

        btnAccident = (ImageButton) findViewById(R.id.accident);
        btnAccident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder theDialog = new AlertDialog.Builder(MainActivity.this);
                theDialog.setMessage("Are you sure you want to send an alert on ACCIDENT?");
                theDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Sharing location methond
                        Toast.makeText(MainActivity.this, "YOUR ALERT WAS SENT",Toast.LENGTH_LONG).show();
                    }
                });

                theDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                });

                AlertDialog myDialog = theDialog.create();
                myDialog.show();
            }
        });

        btnTrafficLights = (ImageButton) findViewById(R.id.traffic_lights);
        btnTrafficLights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder theDialog = new AlertDialog.Builder(MainActivity.this);
                theDialog.setMessage("Are you sure you want to send an alert on TRAFFIC LIGHTS");
                theDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Sharing location methond
                        Toast.makeText(MainActivity.this, "YOUR ALERT WAS SENT",Toast.LENGTH_LONG).show();
                    }
                });

                theDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                });

                AlertDialog myDialog = theDialog.create();
                myDialog.show();
            }
        });

        btnTrafficCong = (ImageButton) findViewById(R.id.traffic_cong);
        btnTrafficCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder theDialog = new AlertDialog.Builder(MainActivity.this);
                theDialog.setMessage("Are you sure you want to send an alert on TRAFFIC CONGESTION?");
                theDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Sharing location methond
                        Toast.makeText(MainActivity.this, "YOUR ALERT WAS SENT",Toast.LENGTH_LONG).show();
                    }
                });

                theDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        return;
                    }
                });

                AlertDialog myDialog = theDialog.create();
                myDialog.show();
            }
        });

    }

}
