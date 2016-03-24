package com.thelikes.thegot2run;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	public void play(View v)
	{
		Intent i=new Intent(this,Game.class);
		startActivity(i);
	}
	
	public void highscore(View v)
	{
		Intent i=new Intent(this,Highscore.class);
		startActivity(i);
	}
	
	public void setting(View v)
	{
		Intent i=new Intent(this,Setting.class);
		startActivity(i);
	}
	
	public void exit(View v)
	{
		System.exit(0);
	}
	
	

	
	

}
