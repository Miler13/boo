package com.home.miler.homerele;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity implements View.OnClickListener  {


    Button f1;
    Button f2;
    Button f3;
    Button f4;
    Button f5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    f1=(Button)findViewById(R.id.bu1);
    f2=(Button)findViewById(R.id.bu2);
    f3=(Button)findViewById(R.id.bu3);

    f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        f3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {




        switch(v.getId())
        {
            case R.id.bu1:
                f1.setText(" aa");
                break;
            case R.id.bu2:
                f2.setText(" aa");
                break;
            case R.id.bu3:
                f3.setText(" aa");
                break;
    }
}


}
