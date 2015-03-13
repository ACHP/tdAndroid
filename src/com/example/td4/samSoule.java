package com.example.td4;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;



public class samSoule implements OnItemClickListener{


	@Override
	public void onItemClick(AdapterView<?> v, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		CharSequence text = "cesar n'a toujours pas lancé un toast";
		int duration = Toast.LENGTH_SHORT;

		Toast toast = Toast.makeText(v.getContext(), text, duration);
		toast.show();
	}
	
} 
