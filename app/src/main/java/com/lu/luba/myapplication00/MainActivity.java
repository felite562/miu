package com.lu.luba.myapplication00;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;



    public class MainActivity extends AppCompatActivity {


        private MediaPlayer mp;
        ImageView im;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            im = (ImageView) findViewById(R.id.imageView1);
            im.setImageResource(R.drawable.hg);
        }
        @SuppressLint("ResourceType")
        public void buttonTapped(View view) {

            int id= view.getId();
            String ourId="";
            ourId=view.getResources().getResourceEntryName(id);

            int resourceImId = getResources().getIdentifier(ourId, "drawable", getPackageName());
            im.setImageResource(resourceImId);



            int resourceId = getResources().getIdentifier(ourId, "raw", getPackageName());
            mp = MediaPlayer.create(this, resourceId); mp.start();


        }
    }

