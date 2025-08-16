package com.example.cafe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OrderDetailActivity extends AppCompatActivity {

    private static final String USER_NAME = "userName";
    private static final String DRINK = "drink";
    private static final String DRINK_TYPE = "drinkType";
    private static final String ADDITIVES = "additives";

    private TextView textViewName;
    private TextView textViewDrink;
    private TextView textViewDrinkType;
    private TextView textViewAdditives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        initView();

        Intent intent = getIntent();
        textViewName.setText(intent.getStringExtra(USER_NAME));
        textViewDrink.setText(intent.getStringExtra(DRINK));
        textViewDrinkType.setText(intent.getStringExtra(DRINK_TYPE));
        textViewAdditives.setText(intent.getStringExtra(ADDITIVES));

    }

    private void initView(){
        textViewName = findViewById(R.id.textViewName);
        textViewDrink = findViewById(R.id.textViewDrink);
        textViewDrinkType = findViewById(R.id.textViewDrinkType);
        textViewAdditives = findViewById(R.id.textViewAdditives);
    }
    public static Intent newIntent(
            Context context,
            String userName,
            String drink,
            String drinkType,
            String additives) {
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(USER_NAME, userName);
        intent.putExtra(DRINK, drink);
        intent.putExtra(DRINK_TYPE, drinkType);
        intent.putExtra(ADDITIVES, additives);
        return intent;
    }
}