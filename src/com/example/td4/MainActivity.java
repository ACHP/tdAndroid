package com.example.td4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String [] listStr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		exo1();
	}
	
	private void exo1(){
		final String[] tp= {"Leibniz","Descartes","Euler"};
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tp);
		ListView lv = (ListView)findViewById(R.id.listView1);
		
		lv.setAdapter(aa);
		samSoule ss = new samSoule();
		lv.setOnItemClickListener(ss);
		
			
		}
	
	private void toastMe(View v, String text){
		int duration = Toast.LENGTH_SHORT;

  		Toast toast = Toast.makeText(v.getContext(), "cesar est MAUVAIS ", duration);
  		toast.show();
	}
	
	
}




