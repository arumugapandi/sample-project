package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SelectionActivity extends Activity implements RadioGroup.OnCheckedChangeListener
{
	RadioGroup group;
	RadioButton radio_2xn,radio_3xn,radio_4xn,radio_5xn;
	Button next;
	public static int radioCheckedId = -1;
	static int tworow,thirdrow,fourthrow,fifthrow ;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.selectionactivity);
		group=(RadioGroup) this.findViewById(R.id.radioGroup1);
		radio_2xn = (RadioButton) this.findViewById(R.id.radio0);
		radio_3xn = (RadioButton) this.findViewById(R.id.radio1);
		radio_4xn = (RadioButton) this.findViewById(R.id.radio2);
		radio_5xn = (RadioButton) this.findViewById(R.id.radio3);
		next = (Button) this.findViewById(R.id.next);
		group.setOnCheckedChangeListener(this);

		next.setOnClickListener(new OnClickListener(){


			public void onClick(View v) {
			    if (v == next) {

			        if (radioCheckedId == R.id.radio0) {
			          startActivity(new Intent(SelectionActivity.this,XNActivity.class));
			              }
			        if (radioCheckedId == R.id.radio1) {

			          startActivity(new Intent(SelectionActivity.this,XNActivity.class));
			        }
			        if (radioCheckedId == R.id.radio2) {

				          startActivity(new Intent(SelectionActivity.this,XNActivity.class));
				        }
			        if (radioCheckedId == R.id.radio3) {
				          startActivity(new Intent(SelectionActivity.this,XNActivity.class));
				        }
			    }
			}

		});

	}


	
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub

		radioCheckedId = checkedId;


	}

}
