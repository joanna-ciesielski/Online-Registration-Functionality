package com.zybooks.onlineregistration2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.button1);
        mButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Uri uri = Uri.parse("https://eservice.eco.loc.gov/siebel/app/eservice/enu?SWECmd=Start");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}