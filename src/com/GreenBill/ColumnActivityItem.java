package com.GreenBill;


import java.util.ArrayList;
import java.util.HashMap;

import com.GreenBill.billdetailsActivity.ListViewOrderAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.GreenBill.billdetailsActivity;
public class ColumnActivityItem extends Activity {

	TextView txt_value,txt_value1;
	EditText edt_value,edt_value1;
	Button btn_save;
    static String Str_value,Str_value1;
    public static  ArrayList<HashMap<String, String>> arrayListOrder;
    private HashMap<String, String> hashMapOrder;
    private  ListViewOrderAdapter listViewOrderAdapter;
    private static int countOrder = 0;
    billdetailsActivity b = new billdetailsActivity();
    private final static int MAXBILLORDER = 15;
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.columnitem);
		arrayListOrder = new ArrayList<HashMap<String, String>>();
		txt_value = (TextView) this.findViewById(R.id.column);
		txt_value1 = (TextView) this.findViewById(R.id.column1);
		edt_value = (EditText) this.findViewById(R.id.edt_itemdetails);
		edt_value1 = (EditText) this.findViewById(R.id.edt_amtdetails);
		btn_save = (Button) this.findViewById(R.id.item_save);;
		txt_value.setText(ColumnDetails .columnsList[0]);
		txt_value1.setText(ColumnDetails.columnsList[1]);
		btn_save.setOnClickListener(new OnClickListener(){

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Str_value =edt_value.getText().toString().trim();
				Str_value1 = edt_value1.getText().toString().trim();
////				hashMapOrder = new HashMap<String, String>();
////
////				hashMapOrder.put("item", Str_value);
////				hashMapOrder.put("qty", Str_value1);
////
////
////				arrayListOrder.add(hashMapOrder);
//
//
//
//				ItemDetails.itemdetails = new String[]{Str_value,Str_value1};
//				for(int i= 0; i<ItemDetails.itemdetails.length;i++ ){
//                Log.i(this.toString(), "2222222"+ItemDetails.itemdetails[i]);
//                startActivity(new Intent(ColumnActivityItem.this,billdetailsActivity.class));;


						if (countOrder < MAXBILLORDER) {
							//if(countOrder == 0)
							hashMapOrder = new HashMap<String, String>();
							hashMapOrder.put("item", Str_value);
							hashMapOrder.put("qty", Str_value1);

							arrayListOrder.add(hashMapOrder);

							if (listViewOrderAdapter == null) {
								listViewOrderAdapter = b.new ListViewOrderAdapter(ColumnActivityItem.this);
								listViewOrderAdapter.areAllItemsEnabled();
								listViewOrderAdapter.getCount();
								ColumnActivityItem.this.finish();

							} else {
								listViewOrderAdapter.notifyDataSetChanged();
							}

							countOrder++;

						} else {
							Toast.makeText(getApplicationContext(),
									"Bill Item exceed", Toast.LENGTH_LONG).show();
						}



			}

		});


	}
}
