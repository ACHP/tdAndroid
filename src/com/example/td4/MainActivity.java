package com.example.td4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

	private String [] listStr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		exo1();
	}
	
	private void exo1(){
		String[] tp= {"Leibniz","Descartes","Euler"};
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tp);
		ListView lv = (ListView)findViewById(R.id.listView1);
		
		lv.setAdapter(aa);
		
		}
	
	
}
