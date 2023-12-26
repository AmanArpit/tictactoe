package com.arpit.tictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;


public class MainActivity extends AppCompatActivity {


    Button btnref,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    int flag=0;
    int count=0;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitleColor(Color.parseColor("#FF69B4"));

        


        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnref=findViewById(R.id.btnrefresh);






        btnref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iref;
                iref=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(iref) ;
            }
        });




    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder delDialog = new AlertDialog.Builder(this);
        delDialog.setTitle("Exit?");
        delDialog.setIcon(R.drawable.ic_baseline_delete_24);
        delDialog.setMessage("Sure, You want to Exit ?");

        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                moveTaskToBack(true);


            }
        });
        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Welcome Back !! ", Toast.LENGTH_SHORT).show();
            }
        });
        delDialog.show();



    }

    public void Check(View view){
        Button btnCurrent=(Button) view;
        LottieAnimationView lottie;
        lottie=findViewById(R.id.lottie);
        count++;

        if(flag==0){
            btnCurrent.setText("X");
            flag=1;
        }else{
            btnCurrent.setText("O");
            flag=0;
        }

        if(count>4){

            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();

            Toast toast = new Toast(getApplicationContext());
            ViewGroup parent = findViewById(R.id.Linear);
            View customToastView = getLayoutInflater().inflate(R.layout.custom_toast_layout, parent);
            toast.setView(customToastView);


            if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);

                toastTextView.setText("Winner is " + b1);

                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());
            }else if(b4.equals(b5)&&b5.equals(b6)&&!b4.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b4);

                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(b7.equals(b8)&&b8.equals(b9)&&!b7.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b7);
                toast.setDuration(Toast.LENGTH_LONG);

                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(b1.equals(b4)&&b4.equals(b7)&&!b1.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b1);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(b2.equals(b5)&&b5.equals(b8)&&!b2.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b2);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(b3.equals(b6)&&b6.equals(b9)&&!b3.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b3);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(b1.equals(b5)&&b5.equals(b9)&&!b1.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b1);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if (b3.equals(b5)&&b5.equals(b7)&&!b3.equals("")){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Winner is " + b3);

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());

            }else if(count>8){
                TextView toastTextView = customToastView.findViewById(R.id.txtmsg);
                toastTextView.setText("Draw Match -_- ");

                toast.setDuration(Toast.LENGTH_LONG);
                toast.show();
                lottie.animate();
                finish();
                startActivity(getIntent());
            }

        }
    }
}