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
Animation up,down,stay_up,stay_down;
int a,b,c,d,e,f=0,g=0,h=0,i=0,j=0,touch=0;

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
stay_up=AnimationUtils.loadAnimation(this,R.anim.stay_up);
stay_down=AnimationUtils.loadAnimation(this,R.anim.stay_down);

        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = new Random().nextInt(5);
                b = new Random().nextInt(5);
                c = new Random().nextInt(5);
                d = new Random().nextInt(5);
                e = new Random().nextInt(5);
                //position is indicated by f,g,h,i,j store the value of initial random number generated
                //if random number is even and the position is even send it down
                //if random number is odd and position is odd send it up.
                //for rest cases it will remain in same position
                touch=touch+1;

               if(touch==1)
               {f=a;
               g=b;
               h=c;
               i=d;
               j=e;
                   if(a%2==0) {
                   image1.startAnimation(down);
                   startAnimationDown();

               }
                   if(b%2==0) {
                       image2.startAnimation(down);
                       startAnimationDown();

                   }
                   if(c%2==0) {
                       image3.startAnimation(down);
                       startAnimationDown();

                   }
                   if(d%2==0) {
                       image4.startAnimation(down);
                       startAnimationDown();

                   }
                   if(e%2==0) {
                       image5.startAnimation(down);
                       startAnimationDown();

                   }

               }
               if(touch>1)
               {if (f%2==1) {
                    if (a% 2 == 0) {
                        f=a;
                        image1.startAnimation(down);
                        startAnimationDown();

                    }
                    else {

                        image1.startAnimation(stay_up);
                        stayUp();
                    }

               } else if(f%2==0) {
                        if (a%2 == 1) {
                            f=a;
                            image1.startAnimation(up);
                            startAnimationUp();

                        }
                        else
                        {
                            image1.startAnimation(stay_down);
                            stayDown();
                        }

                    }

                if (g%2== 1) {
                    if (b % 2 == 0) {g=b;
                        image2.startAnimation(down);
                        startAnimationDown();

                    }
                    else
                    {image2.startAnimation(stay_up);
                        stayUp();
                    }

                } else if(g%2==0) {
                        if (b% 2 == 1) {g=b;
                            image2.startAnimation(up);
                            startAnimationUp();

                        }
                        else {
                            image2.startAnimation(stay_down);
                            stayDown();
                        }
                    }
                if (h%2 ==1 ) {
                    if (c % 2 == 0) {h=c;
                        image3.startAnimation(down);
                        startAnimationDown();

                    }
                    else
                    {image3.startAnimation(stay_up);
                        stayUp();
                    }

                }
                else if(h%2==0) {
                    if (h%2 == 1) {
                        h=c;
                        image3.startAnimation(up);
                        startAnimationUp();
                    }
                    else {image3.startAnimation(stay_down);
                        stayDown();
                    }

                }
                if (i%2== 1) {
                    if (d % 2 == 0) {i=d;
                        image4.startAnimation(down);
                        startAnimationDown();

                    }
                    else
                    {image4.startAnimation(stay_up);
                        stayUp();
                    }

                }else  if(i%2==0) {
                    if (d% 2 == 1) {i=d;
                        image4.startAnimation(up);
                        startAnimationUp();

                    }
                    else {image4.startAnimation(stay_down);
                        stayDown();
                    }

                }
                if (j%2 == 1) {
                    if ( e% 2 == 0) {j=e;
                        image5.startAnimation(down);
                        startAnimationDown();

                    }
                    else
                    {
                        image5.startAnimation(stay_up);
                        stayUp();
                    }

                }
              else  if(j%2==0) {
                    if (e% 2 == 1) {j=e;
                        image5.startAnimation(up);
                        startAnimationUp();

                    }
                    else
                    {image5.startAnimation(stay_down);
                    stayDown();

                    }

                }

                }}
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
            private void stayUp()
            {
                {
                    stay_up.setAnimationListener(new Animation.AnimationListener() {
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
            private void stayDown()
            {
                {
                    stay_down.setAnimationListener(new Animation.AnimationListener() {
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



