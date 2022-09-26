package araho.com.example.salario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2,et3;
    private TextView tv1,tv2,tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.edt_n1);
        et2 = (EditText)findViewById(R.id.edt_n2);
        et3 = (EditText)findViewById(R.id.edt_n3);
        tv1 = (TextView)findViewById(R.id.tv_n1);
        tv2 = (TextView)findViewById(R.id.tv_n2);
        tv3 = (TextView)findViewById(R.id.tv_n3);
        tv4 = (TextView)findViewById(R.id.Txtv_autor);


    }
    public void calcular(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        String valor3 = et3.getText().toString();

        int sol = Integer.parseInt(valor1);        //Integer.parseInt(valor1); -> combierte un string a entero
        int dolar = Integer.parseInt(valor2);
        int marco = Integer.parseInt(valor3);
        double euro = ((sol/3.52)/1.07)+(dolar/1.07)+ ((marco/2.08)/1.07);


        double n1 = euro * 0.6;
        double n2 = euro * 0.3;;
        double n3 = euro * 0.1;

        String re1 = String.valueOf(n1);
        tv1.setText(re1);

        String re2 = String.valueOf(n2);
        tv2.setText(re2);

        String re3 = String.valueOf(n3);
        tv3.setText(re3);

        String autor = String.valueOf("© Alan Atilio Condori Arapa");
        tv4.setText(autor);
    }
}