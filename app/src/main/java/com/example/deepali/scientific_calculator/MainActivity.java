package com.example.deepali.scientific_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAdd,buttonSub,buttonDivision,buttonMul,buttonClear,buttonEqual,buttonsin,buttonin,buttoncos,buttontan,buttonln,buttonlog,buttonpow,buttondel,buttonsqrt,buttback,button10;
    EditText edt1; TextView t1;
    float mValueOne,mValueTwo;
    boolean mAddition,mSubtract,mMultiplication,mDivision,minv,msin,mcos,mtan,mln,mlog,msqrt,mret,mpow,mdecimal=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button0=(Button)findViewById(R.id.button0);
        buttonAdd=(Button)findViewById(R.id.button23);
        buttonSub=(Button)findViewById(R.id.button24);
        buttonMul=(Button)findViewById(R.id.button25);
        buttonDivision=(Button)findViewById(R.id.button26);
        buttonsin=(Button)findViewById(R.id.buttonsin);
        buttoncos=(Button)findViewById(R.id.buttoncos);
        buttontan=(Button)findViewById(R.id.buttontan);
        buttonln=(Button)findViewById(R.id.buttonln);
        buttonlog=(Button)findViewById(R.id.buttonlog);
        buttonsqrt=(Button)findViewById(R.id.buttonsqrt);
        buttonpow=(Button)findViewById(R.id.buttonpow);
        buttonin=(Button)findViewById(R.id.buttoninv);
        buttback=(Button)findViewById(R.id.buttonret);
        buttonClear=(Button)findViewById(R.id.clear);
        buttondel=(Button)findViewById(R.id.buttondel);
        buttonEqual=(Button)findViewById(R.id.equal);
        button10=(Button)findViewById(R.id.button);
        edt1=(EditText)findViewById(R.id.editText);
        t1=(TextView)findViewById(R.id.textView2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  if(mdecimal==false){
                edt1.setText(edt1.getText()+"."); mdecimal=true;}
                else
            {
                edt1.setText("ERROR");
            }


            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mMultiplication=true;
                edt1.setText(null);
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mDivision=true;
                edt1.setText(null);
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mAddition=true;
                edt1.setText(null);
            }
        });
        buttonpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpow=true; mValueOne=Float.parseFloat(edt1.getText()+"");
                t1.setText("pow"); edt1.setText(null);
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne=Float.parseFloat(edt1.getText()+"");
                mSubtract=true;
                edt1.setText(null);

            }
        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(""); mdecimal=false;



            }
        });

        buttondel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p=edt1.getText()+""; String ch="";
                if(p.length()!=0) {
                    for (int i = 0; i < p.length() - 1; i++) {
                        ch = ch + p.charAt(i);
                    }
                    if (p.charAt(p.length() - 1) == '.') {
                        mdecimal = false;
                    }
                    edt1.setText(ch + "");


                }
            }
        });
        buttonsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                msin=true; if(minv!=true){
                t1.setText("sin");}
                else
                {
                    t1.setText("sininv");
                }

            }
        });
        buttoncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                mcos=true;
                if(minv!=true){
                    t1.setText("cos");}
                else
                {
                    t1.setText("cosinv");
                }

            }
        });
        buttontan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                mtan=true;
                if(minv!=true){
                    t1.setText("tan");}
                else
                {
                    t1.setText("taninv");
                }


            }
        });
        buttonln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                mln=true;
                if(minv!=true){
                    t1.setText("ln");}
                else
                {
                    t1.setText("pow(10)");
                }


            }
        });
        buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                mlog=true;
                if(minv!=true){
                    t1.setText("log");}
                else
                {
                    t1.setText("pow(e)");
                }


            }
        });
        buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                msqrt=true;
                if(minv!=true){
                    t1.setText("sqrt");}
                else
                {
                    t1.setText("square");
                }


            }
        });
        buttonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                minv=true; mret=false;
                buttonsin.setText("sininv");
                buttoncos.setText("cosinv");
                buttontan.setText("taninv");
                buttonln.setText("pow(10)");
                buttonlog.setText("pow(e)");
                buttonsqrt.setText("square");

            }
        });
        buttback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(null);

                mret=true; minv=false;
                buttonsin.setText("SIN");
                buttoncos.setText("COS");
                buttontan.setText("TAN");
                buttonln.setText("LN");
                buttonlog.setText("LOG");
                buttonsqrt.setText("SQRT");


            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mValueTwo=Float.parseFloat(edt1.getText()+"");

                if(mAddition==true)
                {
                    edt1.setText(mValueOne+mValueTwo+"");
                    mAddition=false;

                }
                if(mSubtract==true)
                {
                    edt1.setText(mValueOne-mValueTwo+"");
                    mSubtract=false;

                }
                if(mDivision==true)
                {
                    edt1.setText(mValueOne/mValueTwo+"");
                    mDivision=false;

                }
                if(mMultiplication==true)
                {
                    edt1.setText(mValueOne*mValueTwo+"");
                    mMultiplication=false;

                }
                if(msin==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p);double v1 = Math.toRadians((double) mValueOne);
                    if(minv==false){

                        edt1.setText(Math.sin(v1)+"");
                    }
                    else
                    {  v1=Math.asin(mValueOne);v1=Math.toDegrees(v1);
                        edt1.setText(v1+"");
                    }
                    msin=false; }
                if(mcos==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p);double v1 = Math.toRadians((double) mValueOne);
                    if(minv==false){

                        edt1.setText(Math.cos(v1)+"");
                    }
                    else
                    { v1=Math.acos(mValueOne);v1=Math.toDegrees(v1);
                        edt1.setText(v1+"");
                    }
                    mcos=false; }
                if(mtan==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p); double v1 = Math.toRadians((double) mValueOne);
                    if(minv==false){

                        edt1.setText(Math.tan(v1)+"");
                    }
                    else
                    {   v1=Math.atan(mValueOne);v1=Math.toDegrees(v1);
                        edt1.setText(v1+"");
                    }
                    mtan=false; }
                if(mlog==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p);
                    if(minv==false){

                        edt1.setText(Math.log(mValueOne)+"");

                    }
                    else
                    {
                        edt1.setText(Math.pow(Math.E,mValueOne)+"");
                    }
                    mlog=false; }
                if(mln==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p);
                    if(minv==false){


                        edt1.setText(Math.log10(mValueOne)+"");

                    }
                    else
                    {
                        edt1.setText(Math.pow(10,mValueOne)+"");
                    }
                    mln=false; }
                if(msqrt==true) {
                    String p = edt1.getText() + "";
                    mValueOne=Float.parseFloat(p);
                    if(minv==false){


                        edt1.setText(Math.sqrt(mValueOne)+"");

                    }
                    else
                    {
                        edt1.setText(Math.pow(mValueOne,2)+"");
                    }
                    msqrt=false; }
                if(mpow==true)
                {
                    mValueTwo=Float.parseFloat(edt1.getText()+"");
                    edt1.setText(Math.pow(mValueOne,mValueTwo)+"");

                }

                t1.setText("");
                edt1.setText(edt1.getText());









            }
        });




    }
}
