package com.example.dongchuang02;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private ImageView face = null;
	private Button start = null;
	private AnimationDrawable draw = null;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.activity_main);
		this.face = (ImageView) super.findViewById(R.id.i1);
		this.start = (Button) super.findViewById(R.id.b1);
		this.start.setOnClickListener(new OnClickListenerImpl());
	}

	private class OnClickListenerImpl implements OnClickListener {
		public void onClick(View v) {
			MainActivity.this.face.setBackgroundResource(R.anim.allface);
			MainActivity.this.draw = (AnimationDrawable) MainActivity.this.face
					.getBackground();
			MainActivity.this.draw.setOneShot(false);
			MainActivity.this.draw.start();
		}

	}

}