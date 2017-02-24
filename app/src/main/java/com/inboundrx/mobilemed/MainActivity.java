package com.inboundrx.mobilemed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button mLogin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mLogin = (Button) findViewById(R.id.buttonSignin);

    mLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(v == mLogin) {
          Intent intent = new Intent(MainActivity.this, MenuActivity.class);
          startActivity(intent);
        }
      }
    });
  }
}
