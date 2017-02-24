package com.inboundrx.mobilemed;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private Button mLogin;
  private TextView mPhoneLabel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mLogin = (Button) findViewById(R.id.buttonSignin);
    mPhoneLabel = (TextView) findViewById(R.id.textViewPhone);

    mLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
      }
    });

    mPhoneLabel.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent phoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "18666245633"));
        startActivity(phoneIntent);
      }
    });
  }
}
