package com.junyoung.firechatting;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PrepareActivity extends AppCompatActivity {

    private RadioButton optionWomen;
    private RadioButton optionMen;
    private RadioButton optionWing;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prepare);


        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        optionWomen = (RadioButton) findViewById(R.id.women);
        optionMen = (RadioButton) findViewById(R.id.men);
        optionWing = (RadioButton) findViewById(R.id.wing);
        optionWing.setChecked(true);


    }


    public void clickComfirmUsername(View view) {
        EditText et = (EditText) findViewById(R.id.user_name);
        if(String.valueOf(et.getText()).equals("")){
            Toast.makeText(this,"Please write your name!",Toast.LENGTH_SHORT).show();
            return;
        }

        User.setName(String.valueOf(et.getText()));

        RadioButton rd = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        String userChannel = rd.getText().toString();

        User.setChannel(userChannel);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class); // 다음 넘어갈 클래스 지정
        startActivity(intent);



    }
}
