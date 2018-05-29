package com.mobileruler;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.mobileruler.base.BaseActivity;

public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Point point = new Point();
		// getWindowManager().getDefaultDisplay().getRealSize(point);
		// logD(""+point.x);
		// logD(""+point.y);
		// DisplayMetrics dm = getResources().getDisplayMetrics();
		// double Inchesx = point.x / dm.xdpi;
		// double Inchesy = point.y / dm.ydpi;
		// double cmx = Inchesx * 2.54;
		// double cmy = Inchesy * 2.54;
		// double x = Math.pow(Inchesx, 2);
		// double y = Math.pow(Inchesy, 2);
		// double screenInches = Math.sqrt(x + y);
		// logD("Screen inches : " + screenInches);
		// logD("屏幕宽" + cmx + "cm");
		// logD("屏幕高" + cmy + "cm");
		// logD("5.14 toInt=" + toInt(5.14));
		// logD("5.68 toInt=" + toInt(5.68));
		Button btn_next = (Button) findViewById(R.id.btn_next);
		btn_next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				quickStartActivity(HorizontalActivity.class);
			}
		});

		// TextView tv_hint = (TextView) findViewById(R.id.text_hint);
		// tv_hint.setText("您的屏幕（发光部分）" + "\n" + "宽(约)：" + cmx + "cm" + "\n" +
		// "高(约)：" + cmy + "cm");
	}

}
