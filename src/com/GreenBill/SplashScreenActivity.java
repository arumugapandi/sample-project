package com.GreenBill;

import java.io.File;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;

import android.os.Handler;

public class SplashScreenActivity extends Activity {

	private final int SPLASH_DISPLAY_LENGTH = 1000;
	private static final String DATABASE_NAME = "UserLogindetails";

	/** Called when the activity is first created. */

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.splashsceenactivity);

		new Handler().postDelayed(new Runnable() {

			// @Override

			public void run() {
				dataload();
			}

		}, SPLASH_DISPLAY_LENGTH);

	}

	private void dataload() {
		// TODO Auto-generated method stub

		final String DB_PATH = "/data/data/"
				+ getApplicationContext().getPackageName() + "/databases/";

		// // TODO Auto-generated method stub
		File dbFile = new File(DB_PATH + DATABASE_NAME);

		if (dbFile.exists()) {
			startActivity(new Intent(SplashScreenActivity.this,
					SelectionActivity.class));

			finish();

		} else if (!dbFile.exists()) {

			startActivity(new Intent(SplashScreenActivity.this,
					SelectionActivity.class));

		}

	}

}
