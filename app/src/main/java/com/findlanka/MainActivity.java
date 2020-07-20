package com.findlanka;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView restaurantCard,cargoCard,salonCard,groceryCard,medicalCard,jobCard,otherCard,dailyadCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Defining Cards
        restaurantCard = (CardView) findViewById(R.id.restaurantid);
        cargoCard = (CardView) findViewById(R.id.cargoid);
        salonCard = (CardView) findViewById(R.id.salonid);
        groceryCard = (CardView) findViewById(R.id.groceryid);
        medicalCard = (CardView) findViewById(R.id.medicalid);
        jobCard = (CardView) findViewById(R.id.jobid);
        otherCard = (CardView) findViewById(R.id.otherid);
        dailyadCard = (CardView) findViewById(R.id.dailyadid);

        //add click listner
        restaurantCard.setOnClickListener(this);
        cargoCard.setOnClickListener(this);
        salonCard.setOnClickListener(this);
        groceryCard.setOnClickListener(this);
        medicalCard.setOnClickListener(this);
        jobCard.setOnClickListener(this);
        otherCard.setOnClickListener(this);
        dailyadCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.restaurantid: i = new Intent(this, Resturent.class);startActivity(i);break;
            case R.id.cargoid:  i = new Intent(this, Cargo.class);startActivity(i);break;
            case R.id.salonid: i = new Intent(this, Salon.class);startActivity(i);break;
            case R.id.groceryid:  i = new Intent(this, Grocery.class);startActivity(i);break;
            case R.id.medicalid: i = new Intent(this, Medical.class);startActivity(i);break;
            case R.id.jobid:  i = new Intent(this, Jobs.class);startActivity(i);break;
            case R.id.otherid:  i = new Intent(this, Others.class);startActivity(i);break;
            case R.id.dailyadid:  i = new Intent(this, dailyad.class);startActivity(i);break;
            default:break;
        }



    }
}