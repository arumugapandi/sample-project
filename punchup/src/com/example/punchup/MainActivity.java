package com.example.punchup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.MessageTypeFilter;
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.util.StringUtils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	 public static final String HOST = "209.236.116.118";
	  public static final int PORT = 9090;
	  public static final String SERVICE = "projects@sentientsoftware.in";
	  public static final String USERNAME = "sarankani";
	  public static final String PASSWORD = "saran143";
	  private XMPPTCPConnection connection;
	  private ArrayList<String> messages = new ArrayList<String>();
	  private Handler mHandler = new Handler();

	  private EditText recipient;
	  private EditText textMessage;
	  private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnectionConfiguration connConfig = new ConnectionConfiguration(HOST, PORT, SERVICE);
        XMPPTCPConnection connection = new XMPPTCPConnection(connConfig);

        try {
          //Connect to the server
          connection.connect();
        } catch (XMPPTCPConnection ex) {
          connection = null;
          //Unable to connect to server
        }
      }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
