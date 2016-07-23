package com.kamalcheema.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    private FunFact mFunFact= new FunFact();
    // create variables
private TextView mFunTextView;
    private Button mFunFactButton;

    private RelativeLayout mRelativeLayout;
    private ColorWheel mColorWheel= new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Assign the views to variables
        mFunTextView = (TextView) findViewById(R.id.FunTextView);
        mFunFactButton = (Button) findViewById(R.id.FunFactButton);
        mRelativeLayout= (RelativeLayout) findViewById(R.id.relative_view);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact= mFunFact.getFact();

                mFunTextView.setText(fact);

                int matchColor = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(matchColor);
                mFunFactButton.setTextColor(matchColor);
            }
        };

        mFunFactButton.setOnClickListener(listener);
        //Toast.makeText(this,"yay activity created",Toast.LENGTH_SHORT).show();
        Log.d("FunFactsActivity","caught in error");

    }

}
