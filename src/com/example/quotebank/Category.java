package com.example.quotebank;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Category extends Activity {
	
	private static final int REQUEST_CODE =10;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.categories);
		//getActionBar().hide();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.

		
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	public void BirthdaysList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "birthday");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void LoveList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "love");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void GraduationList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "graduation");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void MusicList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "music");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void FriendshipList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "friendship");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void ChristmasList(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "christmas");
		startActivityForResult(i, REQUEST_CODE);
	}
	public void Randomize(View v){
		Intent i = new Intent(getApplicationContext(), CategoryClicked.class);
		i.putExtra("category", "random");
		startActivityForResult(i, REQUEST_CODE);
	}
	
	public void showTopFive(View v){
		Intent i = new Intent(getApplicationContext(), TopFive.class);
		startActivity(i);
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if(resultCode==RESULT_OK && requestCode==REQUEST_CODE){
			if(data.hasExtra("returnkey")){
				
			}
		}
	}
}
