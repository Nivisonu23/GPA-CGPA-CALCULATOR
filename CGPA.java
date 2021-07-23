Semc.java

package com.example.cgpa_gpacalculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Semc extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_semc);
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		Button b3 = (Button) findViewById(R.id.button3);
		Button b4 = (Button) findViewById(R.id.button4);
		Button b5 = (Button) findViewById(R.id.button5);
		Button b6 = (Button) findViewById(R.id.button6);
		Button b7 = (Button) findViewById(R.id.button7);
		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o = new Intent(getApplicationContext(), Sem2cgpa.class);
				startActivity(o);
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o1 = new Intent(getApplicationContext(), Sem3cgpa.class);
				startActivity(o1);
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o2 = new Intent(getApplicationContext(), Sem4cgpa.class);
				startActivity(o2);
			}
		});
		b4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o3 = new Intent(getApplicationContext(), Sem5cgpa.class);
				startActivity(o3);
			}
		});
		b5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o4 = new Intent(getApplicationContext(), Sem6cgpa.class);
				startActivity(o4);
			}
		});
		b6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o5 = new Intent(getApplicationContext(), Sem7cgpa.class);
				startActivity(o5);
			}
		});
		b7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "WELCOME",
						Toast.LENGTH_SHORT).show();
				Intent o6 = new Intent(getApplicationContext(), Sem8cgpa.class);
				startActivity(o6);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.semc, menu);
		return true;
	}

}
