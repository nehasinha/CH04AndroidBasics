package com.example.ch04androidbasics;

import android.os.Bundle;
import android.app.ListActivity; 
import android.content.Intent; 
import android.view.View;
import android.widget.ArrayAdapter; 
import android.widget.ListView;


public class AndroidBasicsStarter extends ListActivity {
	String tests[] = { "LifeCycleTest", "SingleTouchTest", "MultiTouchTest",
			"KeyTest", "AccelerometerTest", "AssetsTest", "ExternalStorageTest", 
			"SoundPoolTest", "MediaPlayerTest","FullScreenTest", "RenderViewTest", 
			"ShapeTest", "BitmapTest",
			"FontTest", "SurfaceViewTest" };
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tests));
      //  setContentView(R.layout.main);
    }
    
    @Override
    protected void onListItemClick(ListView list, View view, int position, long id) {
    	super.onListItemClick(list, view, position, id); 
    	String testName = tests[position];
    	try {
    			Class clazz = Class.forName("com.example.ch04androidbasics." + testName);
    			Intent intent = new Intent(this, clazz);
    			startActivity(intent);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace(); 
    	}
    } 
 }
