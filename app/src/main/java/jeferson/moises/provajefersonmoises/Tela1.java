package jeferson.moises.provajefersonmoises;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela1 extends AppCompatActivity {

    private Button btnIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        //referencias
        btnIniciar = (Button) findViewById(R.id.t1_btn_iniciar);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Tela1.this, Tela2.class);
                startActivity(it);

                }//fecha onClick
            });//fecha listener
    }//fecha onCreate
}//fecha classe