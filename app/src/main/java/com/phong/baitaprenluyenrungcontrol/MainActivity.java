package com.phong.baitaprenluyenrungcontrol;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
    }

    private void addControls() {
        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);
    }

    public void XuLyLogin(View view) {
        String user = edtUser.getText().toString();
        String pass = edtPass.getText().toString();
        if (user.equals("admin") == false || user.equals("123") == false){
            Animation animation =AnimationUtils.loadAnimation(MainActivity.this,R.anim.lac_control);
            edtUser.startAnimation(animation);
            edtPass.startAnimation(animation);
        }
    }

    public void XuLyCancel(View view) {
        ConstraintLayout constraintLayout = findViewById(R.id.activity_main);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.xoay);
        constraintLayout.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
