package com.example.gravityapp;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import java.util.Random;

import static android.graphics.Color.BLACK;

public class MainActivity extends AppCompatActivity {
private ConstraintLayout r;
private ImageView image1,image2,image3,image4,image5;
Animation up,down;
int a,b,c,d,e,A=0,B=0,C=0,D=0,E=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = (ConstraintLayout) findViewById(R.id.r);
        r.setBackgroundColor(BLACK);
        image1 = (ImageView) findViewById(R.id.image1);
        image2 = (ImageView) findViewById(R.id.image2);
        image3 = (ImageView) findViewById(R.id.image3);
        image4 = (ImageView) findViewById(R.id.image4);
        image5 = (ImageView) findViewById(R.id.image5);
        up = AnimationUtils.loadAnimation(this, R.anim.translate_up);
        down = AnimationUtils.loadAnimation(this, R.anim.translate_down);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = new Random().nextInt(5);
                b = new Random().nextInt(5);
                c = new Random().nextInt(5);
                d = new Random().nextInt(5);
                e = new Random().nextInt(5);
                //position is indicated by A,B,C,D,E for even values stone is up and odd values stone is down.
                //if random number is even and the position is even send it down
                //if random number is odd and position is odd send it up.
                //for rest cases it will remain in same position
                if (a%2== 0) {
                    if (A % 2 == 0) {
                        A=A+1;
                        image1.startAnimation(down);
                        startAnimationDown();

                    }

                }  else if(a%2==1) {
                        if (A % 2 == 1) {
                            A=A+1;
                            image1.startAnimation(up);
                            startAnimationUp();

                        }

                    }

                if (b%2== 0) {
                    if (B % 2 == 0) {B=B+1;
                        image2.startAnimation(down);
                        startAnimationDown();

                    }

                } else if(b%2==1) {
                        if (B% 2 == 1) {B=B+1;
                            image2.startAnimation(up);
                            startAnimationUp();

                        }

                    }
                if (c%2 ==0 ) {
                    if (C % 2 == 0) {C=C+1;
                        image3.startAnimation(down);
                        startAnimationDown();

                    }

                }
                else if(c%2==1) {
                    if (C%2 == 1) {
                        C = C + 1;
                        image3.startAnimation(up);
                        startAnimationUp();
                    }

                }
                if (d%2== 0) {
                    if (D % 2 == 0) {D=D+1;
                        image4.startAnimation(down);
                        startAnimationDown();

                    }

                }else  if(d%2==1) {
                    if (D% 2 == 1) {D=D+1;
                        image4.startAnimation(up);
                        startAnimationUp();

                    }

                }
                if (e%2 == 0) {
                    if (E % 2 == 0) {E=E+1;
                        image5.startAnimation(down);
                        startAnimationDown();

                    }

                }
              else  if(e%2==1) {
                    if (E% 2 == 1) {E=E+1;
                        image5.startAnimation(up);
                        startAnimationUp();

                    }

                }

                }
            private void startAnimationDown()
            {
                {
                    down.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });

                }
            }
            private void startAnimationUp()
            {
                {
                    up.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });

                }
            }

        });













    }
}



