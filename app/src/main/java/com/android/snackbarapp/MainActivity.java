package com.android.snackbarapp;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout mCoordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCoordinatorLayout=findViewById(R.id.coordinator);
    }

    public void showSnackbar1(View v){
        Snackbar snackbar=Snackbar.make(mCoordinatorLayout,"Snackbar 1",Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    public void showSnackbar2(View v){
        final Snackbar snackbar=Snackbar.make(mCoordinatorLayout,"Snackbar 2",Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("dismiss",new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

    public void showSnackbar3(View v){
        final Snackbar snackbar=Snackbar.make(mCoordinatorLayout,"Snackbar 3",Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("Say Hello", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.setActionTextColor(getResources().getColor(R.color.snackbarTextcolor));
        TextView textView=snackbar.getView().findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(getResources().getColor(R.color.snackbarActioncolor));
        snackbar.show();
    }
}
