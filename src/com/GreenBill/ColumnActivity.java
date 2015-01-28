package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ColumnActivity extends Activity
{
   EditText edt_col_value,edt_col_value1;
   static String col_value1,col_value2;
   Button btn_save;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.column);
		edt_col_value = (EditText) this.findViewById(R.id.edt_itemdetails);
		edt_col_value1 = (EditText) this.findViewById(R.id.edt_amtdetails);
		btn_save = (Button) this.findViewById(R.id.item_save);


		btn_save.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				col_value1 = edt_col_value.getText().toString().trim();
				col_value2 = edt_col_value1.getText().toString().trim();
				ColumnDetails.columnsList = new String[]{col_value1,col_value2};
				Log.i(this.toString(), "4444"+col_value1);
				Log.i(this.toString(), "4444"+col_value2);
				for(int i=0; i<ColumnDetails.columnsList.length; i++)

				Log.i(this.toString(),"1111111111111111"+ColumnDetails.columnsList[i]);
				startActivity(new Intent(ColumnActivity.this,billdetailsActivity.class));;
			}

		});


	}
}
