package com.inboundrx.mobilemed;

import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
  private Button mLogin;
  private TextView mPhoneLabel;
  private TextView mETA;
  private int seconds;
  private int minutes;
  private int eta;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mETA = (TextView) findViewById(R.id.textViewETA);
    mPhoneLabel = (TextView) findViewById(R.id.textViewPhone);
    mLogin = (Button) findViewById(R.id.buttonSignin);

    eta = 60000 * 25; //milliseconds in a minute * 25 minutes
    new CountDownTimer(eta, 1000) {

      public void onTick(long millisUntilFinished) {
        seconds = (int) (millisUntilFinished/1000);
        minutes = seconds/60;
        seconds = seconds%60;
        if(seconds<10) {
          mETA.setText("ETA - " + minutes + ":0" + seconds);
        } else {
          mETA.setText("ETA - " + minutes + ":" + seconds);
        }
      }

      public void onFinish() {
        mETA.setText("Done");
      }

    }.start();

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
