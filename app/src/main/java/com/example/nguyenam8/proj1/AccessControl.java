package com.example.nguyenam8.proj1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AccessControl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access_control);
    }

    StringBuffer sb = new StringBuffer();
    StringBuffer pass = new StringBuffer("1234");

    public void clickOne (View view)
    {
        sb.append(1);
    }
    public void clickTwo (View view)
    {
        sb.append(2);
    }
    public void clickThree (View view)
    {
        sb.append(3);
    }
    public void clickFour (View view)
    {
        sb.append(4);
    }
    public void clickSubmit(View view)
    {
        if (sb.equals(pass))
        {
            Intent intent = new Intent();
            setResult(RESULT_OK);
            finish();
        }
    }
}