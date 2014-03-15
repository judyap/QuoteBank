package com.example.quotebank;

import java.util.ArrayList;
import java.util.Collections;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomClass extends Activity {
    
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.randomlayout);
        Bundle extras = getIntent().getExtras();
        if(extras==null){
        	return;
        }
        ArrayList<String> quotelist = new ArrayList<String>();
        quotelist = extras.getStringArrayList("quote");
        
        TextView textView = (TextView) findViewById(R.id.randomquote);
        Collections.shuffle(quotelist);
		textView.setText(quotelist.get(0));
    
    }
    
    public void onclick(View view){
    	finish();
    }
    
    public void finish(){
    	Intent data = new Intent();
    	data.putExtra("returnkey", "Success");
    	setResult(RESULT_OK, data);
    	super.finish();
    }

}
