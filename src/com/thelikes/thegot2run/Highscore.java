package com.thelikes.thegot2run;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.widget.TextView;

public class Highscore extends Activity {
	TextView t1;
	int score,hscore;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_highscore);
		SharedPreferences pref = getApplicationContext().getSharedPreferences("higher", MODE_PRIVATE);
	    Editor editor = pref.edit();
	    
	    score=pref.getInt("score", 0);
	    hscore=pref.getInt("hscore", 0);
	    
	    if(score>hscore)
	    {
	    	editor.putInt("hscore", score);
    	    editor.commit(); 
	    }
	    hscore=pref.getInt("hscore", 0);
	    
	    t1=(TextView) findViewById(R.id.textView1);
	    t1.setText("Highscore :"+hscore);
	}

	
}
