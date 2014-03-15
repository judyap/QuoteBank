package com.example.quotebank.adapters;

import com.example.quotebank.R;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class AuthArrayAdapter extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	private Resources res;
	private String packageName;
 
	public AuthArrayAdapter(Context context, String[] values) {
		super(context, R.layout.authors, values);
		
		this.context = context;
		this.values = values;
		packageName = context.getPackageName(); 
		res = context.getResources();
	}
 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
			.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
 
		View rowView = inflater.inflate(R.layout.authors, parent, false);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(values[position]);
 
		// Change icon based on name
		String s = values[position];
 
		System.out.println(s);
		String[] temp = s.split(" ");
	 
		String authImg = temp[temp.length-1].toLowerCase();
		
		int id = res.getIdentifier(authImg, "drawable", packageName);
		if(id>0){
			imageView.setImageResource(id);
		}
		else{
			imageView.setImageResource(R.drawable.no_pic);
		}
		

		return rowView;
	}
}
