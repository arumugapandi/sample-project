package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class FifthColumActivity extends Activity
{
	EditText edt_value,edt_value1,edt_value2,edt_value3,edt_value4;
	Button btn_save;
	String Str_value,Str_value1,Str_value2,Str_value3,Str_value4;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifthcolumn);
		edt_value = (EditText) this.findViewById(R.id.edt_column1);
		edt_value1 = (EditText) this.findViewById(R.id.edt_column2);
		edt_value2 = (EditText) this.findViewById(R.id.edt_column3);
		edt_value3 = (EditText) this.findViewById(R.id.edt_column4);
		edt_value4 = (EditText) this.findViewById(R.id.edt_column5);
		btn_save = (Button) this.findViewById(R.id.item_save);
		btn_save.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Str_value = edt_value.getText().toString().trim();
				Str_value1 = edt_value1.getText().toString().trim();
				Str_value2 = edt_value2.getText().toString().trim();
				Str_value3 = edt_value3.getText().toString().trim();
				Str_value4 = edt_value4.getText().toString().trim();

			}

		});


	}
}
