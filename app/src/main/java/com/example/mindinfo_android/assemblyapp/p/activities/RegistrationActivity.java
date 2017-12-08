package com.example.mindinfo_android.assemblyapp.p.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.mindinfo_android.assemblyapp.R;
import com.example.mindinfo_android.assemblyapp.p.other.familyAdapter;

public class RegistrationActivity extends AppCompatActivity {

    ListView recyclerViewItem;
    familyAdapter itemlistAdapter;
    int total_number =1;
    EditText familyNumberEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
       familyNumberEt = (EditText)findViewById(R.id.numbrTV);
        recyclerViewItem = (ListView)findViewById(R.id.listview);
     final LinearLayout family_details = (LinearLayout) findViewById(R.id.family_details);

        TextView headerTV = (TextView)findViewById(R.id.headerTV);

        headerTV.setText("Voter Details");
        family_details.setVisibility(View.GONE);

        familyNumberEt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId== EditorInfo.IME_ACTION_NEXT){
                    total_number = Integer.parseInt(familyNumberEt.getText().toString());
                    System.out.println("**********total number sent ********* " + total_number);
                    family_details.setVisibility(View.VISIBLE);
                    itemlistAdapter = new familyAdapter(RegistrationActivity.this, total_number);
                    recyclerViewItem.setAdapter(itemlistAdapter);
                }
                return false;
            }
        });
    }
}
