package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdColumnActivityItem extends Activity {

	TextView txt_value1,txt_value2,txt_value3;
	EditText edt_value1,edt_value2,edt_value3;
	Button btn_save;
    String Str_value1,Str_value2,Str_value3;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.thirdcolumnitem);
		txt_value1 = (TextView) this.findViewById(R.id.txt_thirdcolumn1);
		txt_value2 = (TextView) this.findViewById(R.id.txt_thirdcolumn2);
		txt_value3 = (TextView) this.findViewById(R.id.txt_thirdcolumn3);
		edt_value1 = (EditText) this.findViewById(R.id.edt_column1);
		edt_value2 = (EditText) this.findViewById(R.id.edt_column2);
		edt_value3 = (EditText) this.findViewById(R.id.edt_column3);
		txt_value1 .setText(ColumnDetails.columnsList[0]);
		txt_value2 .setText(ColumnDetails.columnsList[1]);
		txt_value3 .setText(ColumnDetails.columnsList[2]);
		btn_save = (Button) this.findViewById(R.id.item_save);;

		btn_save.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Str_value1 = edt_value1.getText().toString().trim();
				Str_value2 = edt_value2.getText().toString().trim();
				Str_value3 = edt_value3.getText().toString().trim();
				{

					ItemDetails.itemdetails = new String[]{Str_value1,Str_value2,Str_value3};
					for(int i= 0; i<ItemDetails.itemdetails.length;i++ ){
	                Log.i(this.toString(), "2222222"+ItemDetails.itemdetails[i]);
	                startActivity(new Intent(ThirdColumnActivityItem.this,billdetailsActivity.class));;

				}
			}}

		});

	}
}
