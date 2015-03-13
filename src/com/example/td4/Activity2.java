package com.example.td4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends Activity {
	
	public Integer[] tab= {1,2,3,4,5,6};
	public TextView tv;
	public Button b1;

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
		
		tv = (TextView)findViewById(R.id.textView1);
		sp.setAdapter(dataAdapter);		
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {


			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long arg3) {
				tv.setText(Integer.toString(tab[position]));   
				   
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        });
		
		b1 = (Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), Integer.toString(Integer.parseInt(tv.getText().toString())*2), Toast.LENGTH_SHORT).show();
				
				
			}
			
			
		});
		
		
		
	}
}
