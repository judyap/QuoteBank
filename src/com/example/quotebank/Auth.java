package com.example.quotebank;



import com.example.quotebank.adapters.AuthArrayAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class Auth extends ListActivity {
	String[] authors = new String[] {"Nelson Mandela", "Friedrich Nietzche", "Barrack Obama", "William Shakespeare", "Mother Teresa", "Mark Twain", "Oscar Wilde", "Oprah Winfrey", "Voltaire"};
	private static final int REQUEST_CODE = 10;
	@Override	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.authors);
		AuthArrayAdapter authorList = new AuthArrayAdapter(this, authors);
		setListAdapter(authorList);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		String item = (String)getListAdapter().getItem(position);
		Intent i = new Intent(this,AuthClicked.class);
		i.putExtra("author", item);
		startActivityForResult(i, REQUEST_CODE);
		
	}
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		if(resultCode==RESULT_OK && requestCode==REQUEST_CODE){
			if(data.hasExtra("returnkey")){
				
			}
		}
	}
}
