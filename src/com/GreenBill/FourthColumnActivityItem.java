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

public class FourthColumnActivityItem extends Activity {

	TextView txt_value1,txt_value2,txt_value3,txt_value4;
	EditText edt_value1,edt_value2,edt_value3,edt_value4;
	Button btn_save;
    String Str_value1,Str_value2,Str_value3,Str_value4;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.fourthcolumnitem);
		txt_value1 = (TextView) this.findViewById(R.id.txt_fourthcolumn1);
		txt_value2 = (TextView) this.findViewById(R.id.txt_fourthcolumn2);
		txt_value3 = (TextView) this.findViewById(R.id.txt_fourthcolumn3);
		txt_value4 = (TextView) this.findViewById(R.id.txt_fourthcolumn4);
		edt_value1 = (EditText) this.findViewById(R.id.edt_column1);
		edt_value2 = (EditText) this.findViewById(R.id.edt_column2);
		edt_value3 = (EditText) this.findViewById(R.id.edt_column3);
		edt_value4= (EditText) this.findViewById(R.id.edt_column4);
		txt_value1 .setText(ColumnDetails.columnsList[0]);
		txt_value2 .setText(ColumnDetails.columnsList[1]);
		txt_value3 .setText(ColumnDetails.columnsList[2]);
		txt_value4 .setText(ColumnDetails.columnsList[3]);
		btn_save = (Button) this.findViewById(R.id.item_save);;

		btn_save.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.out.println("11111111111111");
				Str_value1 =edt_value1.getText().toString().trim();
				Str_value2 = edt_value2.getText().toString().trim();
				Str_value3 = edt_value3.getText().toString().trim();
				Str_value4 = edt_value4.getText().toString().trim();
				System.out.println("222222222222");



				ItemDetails.itemdetails = new String[]{Str_value1,Str_value2,Str_value3,Str_value4};
				for(int i= 0; i<ItemDetails.itemdetails.length;i++ ){
                Log.i(this.toString(), "2222222"+ItemDetails.itemdetails[i]);
                startActivity(new Intent(FourthColumnActivityItem.this,billdetailsActivity.class));;

				}
			}});



	}
}
