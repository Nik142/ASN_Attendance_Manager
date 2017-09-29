package com.example.nikhil.asn_attendance_manager.asn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nikhil.asn_attendance_manager.R;


public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.about);
		setTitle("About us");
		TextView tv_about  = (TextView) findViewById(R.id.tv_about);
		
		String toast = "Presented By:\n\nAbhishek Wadhawan\n(00411502715)\n\nMohammad Saad Bin Moosa\n(02111502715)\n\nNikhil Goel\n(02611502715)";
		tv_about.setText(toast);
	}
}
