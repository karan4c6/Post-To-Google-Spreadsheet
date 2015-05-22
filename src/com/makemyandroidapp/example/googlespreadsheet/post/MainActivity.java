package com.makemyandroidapp.example.googlespreadsheet.post;

import java.net.URLEncoder;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity
{
	
	final String myTag = "DocsUpload";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(myTag, "OnCreate()");
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				postData();
				
			}
		});
		t.start();
	}

	public void postData() {

		String fullUrl = "https://docs.google.com/forms/d/1alD0YHON2LYTsNtRk6GT5orQSe6-GkltjSI8PAUYilU/formResponse";
		/*
		 * full name : entry_2041477122
		 * email : entry_721968333
		 * alternate email : entry_668853526
		 * mobile no : entry_272064748
		 * class 10 : entry_1763750982
		 * class 12 : entry_1649041482
		 * engineering percent : entry_486520398
		 * degree completion year : group_1265197458_2
		 * college name : entry_789083742
		 */
		
		HttpRequest mReq = new HttpRequest();
		String col1 = "Karan Sharma";
		String col2 = "javakaran@live.com";
		String col3 = "sr.karan@live.com";
		String col4 = "9653874484";
		String col5 = "78";
		String col6 = "70";
		String col7 = "80";
		String col8 = "2014";
		String col9 = "Surya School of Engineering and Technology";

		String data = "entry_1554782860=" + URLEncoder.encode(col1);
		
		String response = mReq.sendPost(fullUrl, data);
		
		Log.i(myTag, response);
	} 

}

/*
 
 		String fullUrl = "https://docs.google.com/forms/d/12gZrOM_sFmCj1VYbyZ5agpJahilkADP-toeRpbIajP0/formResponse";
		
		HttpRequest mReq = new HttpRequest();
		String col1 = "Karan Sharma";
		String col2 = "javakaran@live.com";
		String col3 = "sr.karan@live.com";
		String col4 = "9653874484";
		String col5 = "78";
		String col6 = "70";
		String col7 = "80";
		String col8 = "2014";
		String col9 = "Surya School of Engineering and Technology";

		String data = "entry_2041477122=" + URLEncoder.encode(col1) + "&" + 
					  "entry_721968333=" + URLEncoder.encode(col2) + "&" +
					  "entry_668853526=" + URLEncoder.encode(col3) + "&" +
					  "entry_272064748=" + URLEncoder.encode(col4) + "&" +
					  "entry_1763750982=" + URLEncoder.encode(col5) + "&" +
					  "entry_1649041482=" + URLEncoder.encode(col6) + "&" +
					  "entry_486520398=" + URLEncoder.encode(col7) + "&" +
					  "group_1265197458_2=" + URLEncoder.encode(col8) + "&" +
					  "entry_789083742=" + URLEncoder.encode(col9);
		
		String response = mReq.sendPost(fullUrl, data);
		
		Log.i(myTag, response);

 * 
 * 
 */


