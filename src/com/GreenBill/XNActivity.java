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
import android.widget.Toast;

public class XNActivity extends Activity implements OnClickListener {
	//final DBAdapter DBA = new DBAdapter(this);
	static String Str_compname = "", Str_streetName = "", Str_city = "",
			Str_email = "", Str_vat = "", Str_tax = "", Str_column = "",
			Str_colum1 = "";
	static Cursor Cursor_value;
	Button btn_save;
	Long id;
	boolean update;
	EditText edt_compName, edt_streetName, edt_city, edt_email, edt_vat_value,
			edt_tax_value, edt_column_value, edt_colum1_value;

	public static String str_comp_name, str_str_name, str_city, str_email,
			str_vat, str_tax, str_column, str_column1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.xnactivity);

		btn_save = (Button) this.findViewById(R.id.save);

		edt_compName = (EditText) this.findViewById(R.id.edt_comname);
		edt_streetName = (EditText) this.findViewById(R.id.edt_str_name);

		edt_city = (EditText) this.findViewById(R.id.edt_cty_name);
		edt_email = (EditText) this.findViewById(R.id.edt_emailID);
		edt_vat_value = (EditText) this.findViewById(R.id.edt_vat);
		edt_tax_value = (EditText) this.findViewById(R.id.edt_tax);


		btn_save.setOnClickListener(this);
	}

	
	public void onClick(View v) {
		// TODO Auto-generated method stub

		if (btn_save == v) {
			Toast.makeText(XNActivity.this, "hi", Toast.LENGTH_LONG).show();
			Str_compname = edt_compName.getText().toString().trim();
			Str_streetName = edt_streetName.getText().toString().trim();
			Str_city = edt_city.getText().toString().trim();
			Str_email = edt_email.getText().toString().trim();
			Str_vat = edt_vat_value.getText().toString().trim();
			Str_tax = edt_tax_value.getText().toString().trim();

			if (Str_compname.length() <= 0) {

				Toast.makeText(XNActivity.this,
						"Please You Enter The FirstName", Toast.LENGTH_LONG)
						.show();
			} else if (Str_streetName.length() <= 0) {
				Toast.makeText(XNActivity.this,
						"Please You Enter The LastName", Toast.LENGTH_LONG)
						.show();
			} else if (Str_city.length() <= 0) {
				Toast.makeText(XNActivity.this, "Please You Enter The EmailID",
						Toast.LENGTH_LONG).show();
			} else if (Str_email.length() <= 0) {
				Toast.makeText(XNActivity.this,
						"Please You Enter The phonenumber", Toast.LENGTH_LONG)
						.show();
			} else if (Str_vat.length() <= 0) {
				Toast.makeText(XNActivity.this,
						"Please You Enter The Passcode", Toast.LENGTH_LONG)
						.show();
			} else if (Str_compname.length() <= 0
					&& Str_streetName.length() <= 0 && Str_city.length() <= 0
					&& Str_email.length() <= 0 && Str_vat.length() <= 0) {
				Toast.makeText(XNActivity.this,
						"Please You Enter The All Field First",
						Toast.LENGTH_LONG).show();
			}

			else {
				goToCreateAccount();
			}

		}

	}

	public void goToCreateAccount() {
		// TODO Auto-generated method stub

		try {

//			SQLiteDatabase sdb;
//			sdb = openOrCreateDatabase("UserLogindetails",
//					SQLiteDatabase.CREATE_IF_NECESSARY, null);
//
//			sdb.execSQL(DBAdapter.INFO_TABLE_QUERY);
//			sdb.close();
//			DBA.open();


//			id = DBA.insertData(DBAdapter.INFO_TABLE, Str_compname.toString(),
//					Str_streetName.toString(), Str_city.toString(), Str_email
//							.toString(), Str_vat.toString(),
//					Str_tax.toString(), Str_column.toString(), Str_colum1
//							.toString());

//				Cursor_value = DBAdapter.getData("GreenBill", "CompanyName",
//						"");
//				str_comp_name = Cursor_value.getString(Cursor_value
//						.getColumnIndex("CompanyName"));
//				System.out.println("<<<<<<<<<Step1>>>>>>>>>" + str_comp_name);
//
//				Cursor_value = DBAdapter.getData("GreenBill", "StreetName", "");
//				str_str_name = Cursor_value.getString(Cursor_value
//						.getColumnIndex("StreetName"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "CityName", "");
//				str_city = Cursor_value.getString(Cursor_value.getColumnIndex("CityName"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "EmailID", "");
//				str_email = Cursor_value.getString(Cursor_value.getColumnIndex("EmailID"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "VAT", "");
//				str_vat = Cursor_value.getString(Cursor_value.getColumnIndex("VAT"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "TAX", "");
//				str_tax = Cursor_value.getString(Cursor_value.getColumnIndex("TAX"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "column", "");
//				str_column = Cursor_value.getString(Cursor_value.getColumnIndex("column"));
//
//				Cursor_value = DBAdapter.getData("GreenBill", "column1", "");
//				str_column1 = Cursor_value
//						.getString(Cursor_value.getColumnIndex("column1"));
//				Cursor_value.close();
				//DBA.close();
              Log.i("11111", "22222222"+SelectionActivity.tworow);
              Log.i("11111", "22222222"+SelectionActivity.tworow);
              Log.i("11111", "22222222"+SelectionActivity.thirdrow);


			if(SelectionActivity.radioCheckedId == R.id.radio0)
			{
				startActivity(new Intent(XNActivity.this,ColumnActivity.class));

			}
		    if(SelectionActivity.radioCheckedId == R.id.radio1)
			{
				startActivity(new Intent(XNActivity.this,ThirdColumnActivity.class));
            }
		    if(SelectionActivity.radioCheckedId == R.id.radio2)
			{
		    	startActivity(new Intent(XNActivity.this,FourthColumActivity.class));
			}
		    if(SelectionActivity.radioCheckedId == R.id.radio3)
			{
		    	startActivity(new Intent(XNActivity.this,FifthColumActivity.class));
			}

		} catch (Throwable t) {
			// Log.e("-----> Error",t.getMessage(),t);
		}
	}

}
