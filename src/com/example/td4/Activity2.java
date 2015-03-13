package com.example.td4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Activity2 extends Activity {
	
	Integer[] tab= {1,2,3,4,5,6};
	String[] tp= {"Leibniz","Descartes","Euler"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		exo1();
	}
	
	public void exo1(){
		//ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, tp);
		
		ArrayAdapter<Integer>  dataAdapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item,tab );
		Spinner sp = (Spinner)findViewById(R.id.spinner1);
		
		
		
		
		sp.setAdapter(dataAdapter);	                            
	}
}
