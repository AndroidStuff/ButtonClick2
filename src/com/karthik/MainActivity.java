package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button_click_me = (Button) findViewById(R.id.activity_main_button_click_me);
		button_click_me.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "Button Click Me, is clicked");				
			}
		}); //Attaching (Anonymous Inner Class) OnClickListener implementation to Button object
		
		Button button_click_me_too = (Button) findViewById(R.id.activity_main_button_click_me_too);
		button_click_me_too.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "Button Click Me Too, is clicked");				
			}
		}); //Attaching (Anonymous Inner Class) OnClickListener implementation to Button object
	}

}
