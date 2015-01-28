package com.GreenBill;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BillItemCreateActivity extends Activity {
	/** Called when the activity is first created. */
	//final DBAdapter DBA = new DBAdapter(this);

	static TextView txt_col_name, txt_col_value;
	public static String str_column, str_column1;
	static String str_column_value;
	public static String str_item_value;
	String col_item, col_amt;
	Button btn_save;
	Long idd;
	EditText edt_col_name, edt_col_value;
	Cursor Cursor, cursor_value;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.additemactivity);

		txt_col_name = (TextView) this.findViewById(R.id.column);
		txt_col_value = (TextView) this.findViewById(R.id.column1);
		edt_col_name = (EditText) this.findViewById(R.id.edt_itemdetails);
		edt_col_value = (EditText) this.findViewById(R.id.edt_amtdetails);

		btn_save = (Button) this.findViewById(R.id.item_save);

		SQLiteDatabase sdb;
		sdb = openOrCreateDatabase("UserItemdetails",
				SQLiteDatabase.CREATE_IF_NECESSARY, null);



		btn_save.setOnClickListener(new OnClickListener() {

			
			public void onClick(View v) {
				// TODO Auto-generated method stub
            
			}

		});


//		Cursor = DBAdapter.getData("GreenBill", "column", "");
//		System.out.println("3333333");
//		str_column = Cursor.getString(Cursor.getColumnIndex("column"));
//		System.out.println("44444444" + str_column);
//		txt_col_name.setText(str_column);
//
//		// txt_col_name.setText(str_column);
//
//		Cursor = DBAdapter.getData("GreenBill", "column1", "");
//		str_column1 = Cursor.getString(Cursor.getColumnIndex("column1"));
//		txt_col_value.setText(str_column1);
//		// txt_col_value.setText(str_column1);

	}

}
