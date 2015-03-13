package com.example.td4;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;




public class MainActivity extends Activity {

	private String [] listStr;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		exo1();
		exo2();
	}
	
	
	
	private void exo2(){
		Button b = (Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
		      public void onClick(View v) {
		    	
		    		Toast toast = Toast.makeText(v.getContext(), "cesar est MAUVAIS ", Toast.LENGTH_SHORT);
		      		toast.show();
		    	  
		  			Intent i = new Intent(MainActivity.this, Activity2.class);
		  			startActivity(i);
		        }
		      });
			
		}
	
	private void exo1(){
		final String[] tp= {"Leibniz","Descartes","Euler"};
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tp);
		ListView lv = (ListView)findViewById(R.id.listView1);
		
		
		
		
		lv.setAdapter(aa);	                            
		
		lv.setOnItemClickListener(new OnItemClickListener() {

            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                    long arg3) {
                // TODO Auto-generated method stub

                Toast.makeText(getApplicationContext(), tp[position], Toast.LENGTH_SHORT).show();

            }
        });
		
			
		}
	
	private void toastMe(View v, String text){
		int duration = Toast.LENGTH_SHORT;

  		Toast toast = Toast.makeText(v.getContext(), "cesar est MAUVAIS ", duration);
  		toast.show();
	}
	
	
}




