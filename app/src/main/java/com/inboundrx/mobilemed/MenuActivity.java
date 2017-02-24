package com.inboundrx.mobilemed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_menu);

    ButterKnife.bind(this);
  }

  @OnClick(R.id.buttonPatient)
  public void viewPatient() {
    Intent intent = new Intent(MenuActivity.this, PatientActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.buttonVitals)
  public void viewVitals() {
    Intent intent = new Intent(MenuActivity.this, VitalsActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.buttonVideo)
  public void viewVideo() {
    Intent intent = new Intent(MenuActivity.this, VideoActivity.class);
    startActivity(intent);
  }
}
