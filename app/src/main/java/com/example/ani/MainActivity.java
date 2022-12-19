package com.example.ani;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);
        b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);
        b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);
        b16=findViewById(R.id.b16);



        //TranslationX
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
                ObjectAnimator trasladar=ObjectAnimator.ofFloat(b1,"translationX",-800f,0f);
                //La animación durará 5 segundos
                trasladar.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(trasladar);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });


        //TranslationY
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //1.º Trasladar de una posición inicial 500px hacia abajo
                ObjectAnimator trasladar=ObjectAnimator.ofFloat(b2,"translationY",0f,500f);
                //La animación durará 5 segundos
                trasladar.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(trasladar);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //Rotation
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Vuelta completa, 0 a 360º
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b3,"rotation",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(rotation);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //RotationX
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Vuelta completa, 0 a 360º, respecto al ejeX
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b4,"rotationX",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(rotation);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //RotationY
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Vuelta completa, 0 a 360º, respecto al ejeY
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b5,"rotationY",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(rotation);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //Alpha
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //2.º fade en 8 seg. De fade completo a vere como se vería normalmente.
                ObjectAnimator fade=ObjectAnimator.ofFloat(b6,"alpha",0f,1f);
                fade.setDuration(8000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(fade);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //ScaleX
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Escalado desde tamaño 0 al doble del tamaño inicial respecto al ejeX
                ObjectAnimator scaleX=ObjectAnimator.ofFloat(b7,"ScaleX",0f,2f);
                scaleX.setDuration(3000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(scaleX);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //ScaleY
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Escalado desde tamaño 0 al doble tamaño inicial respecto al ejeY
                ObjectAnimator scaleY=ObjectAnimator.ofFloat(b8,"ScaleY",1f,2f);
                scaleY.setDuration(3000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(scaleY);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //PivotX
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Cambia el eje sobre el que se produce la rotación y el escalado
                ObjectAnimator pivotX=ObjectAnimator.ofFloat(b9,"PivotX",0f,1f);
                pivotX.setDuration(3000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(pivotX);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //PivotY
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Cambia el eje sobre el que se produce la rotación y el escalado
                ObjectAnimator pivotY=ObjectAnimator.ofFloat(b10,"PivotY",0.5f);
                pivotY.setDuration(3000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(pivotY);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //X
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Desplazamiento en el eje X
                ObjectAnimator x=ObjectAnimator.ofFloat(b11,"X",100f);
                x.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(x);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //Y
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //Desplazamiento en el eje Y
                ObjectAnimator y=ObjectAnimator.ofFloat(b12,"Y",200f);
                y.setDuration(5000);
                //Asociamos la animación con el AnimationSet
                animadorBoton.play(y);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();
            }
        });

        //Combinación1 -> Traslación respecto a X y rotación completa al mismo tiempo
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
                ObjectAnimator trasladar=ObjectAnimator.ofFloat(b13,"translationX",-800f,0f);
                //La animación durará 5 segundos
                trasladar.setDuration(5000);

                //Vuelta completa, 0 a 360º, respecto al ejeX
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b13,"rotation",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);

                //Asociamos la animación con el AnimationSet
                animadorBoton.play(trasladar).with(rotation);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();


            }
        });

        //Combinación 2-> Lo mismo que antes pero ahora una después de otra y con un fade en la traslación
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
                ObjectAnimator trasladar=ObjectAnimator.ofFloat(b14,"translationX",-800f,0f);
                //La animación durará 5 segundos
                trasladar.setDuration(5000);

                //Vuelta completa, 0 a 360º, respecto al ejeX
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b14,"rotation",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);

                // fade en 5 seg. De fade completo a vere como se vería normalmente.
                ObjectAnimator fade=ObjectAnimator.ofFloat(b14,"alpha",0f,1f);
                fade.setDuration(5000);

                //Asociamos la animación con el AnimationSet
                animadorBoton.play(trasladar).with(fade).before(rotation);
                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //Combinación 3-> Traslación, rotación y fade al mismo tiempo y en bucle.
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Objeto que necesitaremos para cualquier animación
                AnimatorSet animadorBoton=new AnimatorSet();
                //1.º Trasladar de una posición inicial (-800) a una final (donde estaba la vista)
                ObjectAnimator trasladar=ObjectAnimator.ofFloat(b15,"translationX",-800f,0f);
                //La animación durará 5 segundos
                trasladar.setDuration(5000);

                //Vuelta completa, 0 a 360º, respecto al ejeX
                ObjectAnimator rotation=ObjectAnimator.ofFloat(b15,"rotation",0f,360f);
                //La animación durará 5 segundos
                rotation.setDuration(5000);

                // fade en 5 seg. De fade completo a vere como se vería normalmente.
                ObjectAnimator fade=ObjectAnimator.ofFloat(b15,"alpha",0f,1f);
                fade.setDuration(5000);

                //Asociamos la animación con el AnimationSet
                animadorBoton.playTogether(trasladar,rotation,fade);

                //Para que se puede ejecutar en bucle tendremos que añadir un Listener

                animadorBoton.addListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        // Al terminar la animación la volvemos a empezar
                        animator.start();
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {
                    }
                });

                //Lanzamos las animaciones asociadas al AnimationSet
                animadorBoton.start();

            }
        });

        //Animación propia
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animationScale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animacionq);
                b16.startAnimation(animationScale);
            }
        });
    }
}