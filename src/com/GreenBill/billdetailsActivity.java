package com.GreenBill;









import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class billdetailsActivity extends Activity {

	/** Called when the activity is first created. */
 //   final DBAdapter DBA = new DBAdapter(this);
     ListView listView;
	 ListView list_view;
	public static TextView txt_addre, txt_email,txt_vat,txt_tax;
	Button btn_add;
	static Cursor cursor, cursor_value;

	public static String str_comp_item_value, str_comp_qty_value;

	public static String str_comp_name, str_str_name, str_city, str_email,
			str_vat, str_tax, str_column, str_column1;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.billdetailsactivity);

		btn_add = (Button) this.findViewById(R.id.add);
		listView = (ListView) findViewById(R.id.listview);
		list_view = (ListView) findViewById(R.id.list_item);
		txt_addre = (TextView) this.findViewById(R.id.address);
		txt_email = (TextView) this.findViewById(R.id.email);
		txt_vat = (TextView) this.findViewById(R.id.vat_value);
		txt_tax = (TextView) this.findViewById(R.id.tax_value);
//	    SQLiteDatabase sdb;
//		sdb = openOrCreateDatabase("UserLogindetails",
//				SQLiteDatabase.CREATE_IF_NECESSARY, null);
//		sdb.execSQL(DBAdapter.INFO_TABLE_QUERY);
//		sdb.close();
//		DBA.open();
////
//		SQLiteDatabase sQdb;
//		sQdb = openOrCreateDatabase("UserItemdetails",
//				SQLiteDatabase.CREATE_IF_NECESSARY, null);
//
//		sQdb.execSQL(DBAdapter.INFO_TABLE_QUERY);
//		sQdb.close();
//		DBAsec.open();




		btn_add.setOnClickListener(new OnClickListener() {

			
			public void onClick(View v) {
				// TODO Auto-generated method stub

			    if (v == btn_add) {

			        if (SelectionActivity.radioCheckedId == R.id.radio0)
			        {
			          startActivity(new Intent(billdetailsActivity.this,ColumnActivityItem.class));
			        }
			        if (SelectionActivity.radioCheckedId == R.id.radio1)
			        {

			          startActivity(new Intent(billdetailsActivity.this,ThirdColumnActivityItem.class));
			        }
			        if (SelectionActivity.radioCheckedId == R.id.radio2)
			        {
				      startActivity(new Intent(billdetailsActivity.this,FourthColumnActivityItem.class));
				    }
			        if (SelectionActivity.radioCheckedId == R.id.radio3)
			        {
				      startActivity(new Intent(billdetailsActivity.this,FifthColumActivity.class));
				    }
			    }

			}

		});

		listView.setAdapter (new EfficientAdapter(this));
		list_view.setAdapter(new ListViewOrderAdapter(this));
	}
	class ListViewOrderAdapter extends BaseAdapter {
		LayoutInflater mInflater;

		public ListViewOrderAdapter(Context context) {
			mInflater = LayoutInflater.from(context);
		}

		public int getCount() {
			
			if (ColumnActivityItem.arrayListOrder != null){
				return ColumnActivityItem.arrayListOrder.size();
			}else{
				return 0;
			}
			
		}

		public Object getItem(int arg0) {
			return arg0;
		}

		public long getItemId(int arg0) {
			return arg0;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				v = vi.inflate(R.layout.billdetailslistitem, null);
			}
			if (v != null) {
				ViewHolder holder = new ViewHolder();
				holder.txtViewItemName = (TextView) v
						.findViewById(R.id.txt_item_value);
				holder.txtViewQty = (TextView) v.findViewById(R.id.txt_itemname_value);
				holder.txtViewItemName.setText(ColumnActivityItem.arrayListOrder.get(position)
						.get("item"));
				holder.txtViewQty.setText(ColumnActivityItem.arrayListOrder.get(position)
						.get("qty"));

				v.setTag(holder);
			}
			return v;
		}

		private class ViewHolder {
			private Button btnEdit, btnDelete;
			private TextView txtViewItemName, txtViewQty;
		}
	}// End of custom
	private static class EfficientAdapter extends BaseAdapter {
		ViewHolder holder;
		private LayoutInflater mInflater;

		public EfficientAdapter(Context context) {
			mInflater = LayoutInflater.from(context);
		}

		
		public int getCount() {
			// TODO Auto-generated method stub
			return 1;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent)
		{

			if (convertView == null) {
                   if(SelectionActivity.radioCheckedId == R.id.radio0)
                         {
	                   convertView = mInflater.inflate(R.layout.billdetailslist, null);
	                   holder = new ViewHolder();
	                   holder.text1 = (TextView) convertView
			                    .findViewById(R.id.txt_item);
	                   holder.text2 = (TextView) convertView
			                    .findViewById(R.id.txt_itemname);
	                   convertView.setTag(holder);
	                   holder.text1.setText(ColumnDetails.columnsList[0]);
	       			   holder.text2.setText(ColumnDetails.columnsList[1]);
                         }

                   if(SelectionActivity.radioCheckedId == R.id.radio2)
                   {
                	   convertView = mInflater.inflate(R.layout.fourthbilldetailslist, null);
	                   holder = new ViewHolder();
	                   holder.text1 = (TextView) convertView
			                    .findViewById(R.id.txt_item);
	                   holder.text2 = (TextView) convertView
			                    .findViewById(R.id.txt_itemname);
	                   holder.text3 = (TextView) convertView
	                    .findViewById(R.id.txt_itemprice);
	                   holder.text4 = (TextView) convertView
	                    .findViewById(R.id.txt_itemQty);
	                   convertView.setTag(holder);
	                   holder.text1.setText(ColumnDetails.columnsList[0]);
	       			   holder.text2.setText(ColumnDetails.columnsList[1]);
	       			   holder.text3.setText(ColumnDetails.columnsList[2]);
	       			   holder.text4.setText(ColumnDetails.columnsList[3]);
                   }

			} else {
				holder = (ViewHolder) convertView.getTag();
			}


			//billdetailsActivity.cursor.close();

			return convertView;
		}

		static class ViewHolder {
			TextView text1,text3,text4;
			TextView text2;

		}

	}
}