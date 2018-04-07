package com.example.studente.calcolatrice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView calc;

    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;

    private Button bCanc;
    private Button bParentesiAp;
    private Button bParentesiCh;
    private Button bPercentuale;
    private Button bDivisione;
    private Button bMoltiplicazione;
    private Button bSottrazione;
    private Button bAddizione;
    private Button bUguale;
    private Button bVirgola;
    private Button bMisure;

  /*private Button bIntegrale;
    private Button bRadiante;
    private Button bRadice;
    private Button bSin;
    private Button bCos;
    private Button bTan;
    private Button bLn;
    private Button bLog;
    private Button bNsuX;
    private Button bEalla;
    private Button bXalla2;
    private Button bXalla;
    private Button bModulo;
    private Button bPgreco;
    private Button bE;*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        elementi();
    }

    @Override
    public void onClick(View v) {

        if(b0.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"0");
        }
        if(b1.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"1");
        }
        if(b2.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"2");
        }
        if(b3.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"3");
        }
        if(b4.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"4");
        }
        if(b5.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"5");
        }
        if(b6.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"6");
        }
        if(b7.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"7");
        }
        if(b8.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"8");
        }
        if(b9.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"9");
        }


        if(bCanc.getId()==v.getId()){
            String s= "";
            calc.setText(s);
        }
        if(bParentesiAp.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"(");
        }
        if(bParentesiCh.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+")");
        }
        if(bPercentuale.getId()==v.getId()){
           // String s= ""+calc.getText();
            //calc.setText(s+"%");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bDivisione.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"/");
        }
        if(bMoltiplicazione.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"*");
        }
        if(bSottrazione.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"-");
        }
        if(bAddizione.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+"+");
        }
        if(bUguale.getId()==v.getId()){
            Expression ris=new ExpressionBuilder(calc.getText().toString()).build();
            String s= "";
            calc.setText(s+ris.evaluate());
        }
        if(bVirgola.getId()==v.getId()){
            String s= ""+calc.getText();
            calc.setText(s+".");
        }
        if(bMisure.getId()==v.getId()){
            Intent i = new Intent(MainActivity.this, ConvertiActivity.class);
           i.putExtra("val",calc.getText());
            startActivity(i);
        }


     /*if(bIntegrale.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"∫");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bRadiante.getId()==v.getId()){
            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bRadice.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"√");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bSin.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"sin(");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bCos.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"cos(");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }if(bTan.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"tan(");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }if(bLn.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"ln");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bLog.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"log");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bNsuX.getId()==v.getId()){
            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bEalla.getId()==v.getId()){
            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bXalla2.getId()==v.getId()){
            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bXalla.getId()==v.getId()){
            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bModulo.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText("|"+s+"|");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }if(bPgreco.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"𝜋");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }
        if(bE.getId()==v.getId()){
            // String s= ""+calc.getText();
            //calc.setText(s+"e");

            Toast mioToast = Toast.makeText(MainActivity.this,"Implementazione futura", Toast.LENGTH_LONG);
            mioToast.show();
        }*/
    }

    public void elementi(){
        calc=(TextView)findViewById(R.id.calc);
        calc.setOnClickListener(this);

        b0=(Button) findViewById(R.id.b0);
        b0.setOnClickListener(this);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);
        b2=(Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        b3=(Button) findViewById(R.id.b3);
        b3.setOnClickListener(this);
        b4=(Button) findViewById(R.id.b4);
        b4.setOnClickListener(this);
        b5=(Button) findViewById(R.id.b5);
        b5.setOnClickListener(this);
        b6=(Button) findViewById(R.id.b6);
        b6.setOnClickListener(this);
        b7=(Button) findViewById(R.id.b7);
        b7.setOnClickListener(this);
        b8=(Button) findViewById(R.id.b8);
        b8.setOnClickListener(this);
        b9=(Button) findViewById(R.id.b9);
        b9.setOnClickListener(this);

        bCanc=(Button) findViewById(R.id.bCanc);
        bCanc.setOnClickListener(this);
        bParentesiAp=(Button) findViewById(R.id.bParentesiAp);
        bParentesiAp.setOnClickListener(this);
        bParentesiCh=(Button) findViewById(R.id.bParentesiCh);
        bParentesiCh.setOnClickListener(this);
        bPercentuale=(Button) findViewById(R.id.bPercentuale);
        bPercentuale.setOnClickListener(this);
        bDivisione=(Button) findViewById(R.id.bDivisione);
        bDivisione.setOnClickListener(this);
        bDivisione=(Button) findViewById(R.id.bDivisione);
        bDivisione.setOnClickListener(this);
        bMoltiplicazione=(Button) findViewById(R.id.bMoltiplicazione);
        bMoltiplicazione.setOnClickListener(this);
        bSottrazione=(Button) findViewById(R.id.bSottrazione);
        bSottrazione.setOnClickListener(this);
        bAddizione=(Button) findViewById(R.id.bAddizione);
        bAddizione.setOnClickListener(this);
        bUguale=(Button) findViewById(R.id.bUguale);
        bUguale.setOnClickListener(this);
        bVirgola=(Button) findViewById(R.id.bVirgola);
        bVirgola.setOnClickListener(this);

        bMisure=(Button) findViewById(R.id.bMisure);
        bMisure.setOnClickListener(this);

     /* bIntegrale=(Button) findViewById(R.id.bIntegrale);
        bIntegrale.setOnClickListener(this);
        bRadiante=(Button) findViewById(R.id.bRadiante);
        bRadiante.setOnClickListener(this);
        bRadice=(Button) findViewById(R.id.bRadice);
        bRadice.setOnClickListener(this);
        bSin=(Button) findViewById(R.id.bSin);
        bSin.setOnClickListener(this);
        bCos=(Button) findViewById(R.id.bCos);
        bCos.setOnClickListener(this);
        bTan=(Button) findViewById(R.id.bTan);
        bTan.setOnClickListener(this);
        bLn=(Button) findViewById(R.id.bLn);
        bLn.setOnClickListener(this);
        bLog=(Button) findViewById(R.id.bLog);
        bLog.setOnClickListener(this);
        bNsuX=(Button) findViewById(R.id.bNsuX);
        bNsuX.setOnClickListener(this);
        bEalla=(Button) findViewById(R.id.bEalla);
        bEalla.setOnClickListener(this);
        bXalla2=(Button) findViewById(R.id.bXalla2);
        bXalla2.setOnClickListener(this);
        bXalla=(Button) findViewById(R.id.bXalla);
        bXalla.setOnClickListener(this);
        bModulo=(Button) findViewById(R.id.bModulo);
        bModulo.setOnClickListener(this);
        bPgreco=(Button) findViewById(R.id.bPgreco);
        bPgreco.setOnClickListener(this);
        bE=(Button) findViewById(R.id.bE);
        bE.setOnClickListener(this);*/

    }
}
