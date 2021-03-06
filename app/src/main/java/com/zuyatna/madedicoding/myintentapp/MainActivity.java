package com.zuyatna.madedicoding.myintentapp;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button btnMoveWithData;
    Button btnMoveWithObject;
    Button btnDialPhone;
    Button btnMoveForResult;

    TextView tvResult;

    private int REQUEST_CODE =  100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithData = findViewById(R.id.btn_move_activity_data);
        btnMoveWithData.setOnClickListener(this);

        btnMoveWithObject = findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        btnMoveForResult = findViewById(R.id.btn_move_for_result);
        btnMoveForResult.setOnClickListener(this);

        tvResult = findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_move_activity:

                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:

                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Suyatna");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 21);

                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_move_activity_object:

                Person person = new Person();
                person.setName("Suyatna");
                person.setAge(21);
                person.setEmail("zuyatna@gmail.com");
                person.setCity("Bekasi");

                Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithObjectActivity.class);
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, person);

                startActivity(moveWithObjectIntent);
                break;
            case R.id.btn_dial_number:

                String phoneNumber = "08123456789";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));

                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_move_for_result:

                Intent moveForResultIntent = new Intent(MainActivity.this, MoveForResultActivity.class);

                startActivityForResult(moveForResultIntent, REQUEST_CODE);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {

            if (resultCode == MoveForResultActivity.RESULT_CODE) {

                int selectedValue = data.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0);
                tvResult.setText(String.format("Hasil: %s", selectedValue));
            }
        }
    }
}