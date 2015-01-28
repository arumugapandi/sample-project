package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ThirdColumnActivity extends Activity
{
	EditText edt_value1,edt_value2,edt_value3;
	Button btn_save;
	String col_value1,col_value2,col_value3;


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.thirdcolumn);
		edt_value1 = (EditText) this.findViewById(R.id.edt_column1);
		edt_value2 = (EditText) this.findViewById(R.id.edtcolumn2);
		edt_value3 = (EditText) this.findViewById(R.id.edt_column3);
		btn_save = (Button) this.findViewById(R.id.item_save);

		btn_save.setOnClickListener(new OnClickListener(){


			public void onClick(View v) {
				// TODO Auto-generated method stub
				col_value1 =edt_value1.getText().toString().trim();
				col_value2 = edt_value2.getText().toString().trim();
				col_value3 = edt_value3.getText().toString().trim();

				ColumnDetails.columnsList= new String[]{col_value1,col_value2,col_value3};
				for(int i =0 ;i <ColumnDetails.columnsList.length;i++)

					Log.i(this.toString(), "1111111"+ColumnDetails.columnsList[i]);
					startActivity(new Intent(ThirdColumnActivity.this,billdetailsActivity.class));;


			}

		});
	}

}
