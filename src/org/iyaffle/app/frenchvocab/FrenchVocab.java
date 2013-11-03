package org.iyaffle.app.frenchvocab;

import android.os.Bundle;
import android.widget.LinearLayout;
import org.apache.cordova.*;
import com.google.ads.*;
import com.google.ads.AdView;

public class FrenchVocab extends DroidGap {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
		
		final AdView adView;
		adView = new AdView(this, AdSize.BANNER, "a15264206242e9b");  

		LinearLayout layout = super.root;
		layout.addView(adView);
		layout.setHorizontalGravity(android.view.Gravity.CENTER_HORIZONTAL);              
		adView.loadAd(new AdRequest());

	}
}
