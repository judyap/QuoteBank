package com.example.quotebank;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.content.Intent;

public class MainmenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	public void showAuthors(View v){
		Intent i = new Intent(getApplicationContext(), Auth.class);
		startActivity(i);
	}
	public void showCredits(View v){
		Intent i = new Intent(getApplicationContext(), Credits.class);
		startActivity(i);
	}
	public void showCategories(View v){
		Intent i = new Intent(getApplicationContext(), Category.class);
		startActivity(i);
	}
	
	public void AppExit(View v)
	{
	    System.exit(0);

	}	

}
