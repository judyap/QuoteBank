package com.example.quotebank;

import com.example.quotebank.QuoteA;
import com.example.quotebank.QuoteB;
import com.example.quotebank.QuoteC;
import com.example.quotebank.MyAdapter;
import com.example.quotebank.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class TopFive extends FragmentActivity {
	
	ViewPager viewPager = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.topfivequotes);
		
		viewPager = (ViewPager) findViewById(R.id.pager);
		FragmentManager fragmentManager = getSupportFragmentManager();
		viewPager.setAdapter(new MyAdapter(fragmentManager));
		
	}

	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}
}

class MyAdapter extends FragmentPagerAdapter{

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		if(arg0==0){
			fragment = new QuoteA();
		}
		if(arg0==1){
			fragment = new QuoteB();
		}
		if(arg0==2){
			fragment = new QuoteC();
		}
		if(arg0==3){
			fragment = new QuoteD();
		}
		if(arg0==4){
			fragment = new QuoteE();
		}
		return fragment;
	}

	@Override
	public int getCount() {
		return 5;
	}
	
}