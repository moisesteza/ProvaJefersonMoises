package jeferson.moises.provajefersonmoises;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Tela2 extends AppCompatActivity {

    //widgets
    private EditText etNome;
    private EditText etPesoAtual;
    private EditText etPesoDesejado;
    private RadioButton rdMasculino;
    private RadioButton rdFeminino;
    private RadioGroup grupoSexo;
    private Button btnCadastrar;
    private Spinner spTreino;

    //checks
    private CheckBox chManha;
    private CheckBox chTarde;
    private CheckBox chNoite;

    //Objeto
    private Meta me;

    //Log
    private static final String TAG_LOG = "LogsMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Log.d(TAG_LOG,"Entrou no onCreate");
        Log.d(TAG_LOG,"Vai passar pelas referencias");

        //Referencias
        etNome = (EditText) findViewById(R.id.t2_et_nome);
        etPesoAtual = (EditText) findViewById(R.id.t2_et_peso_atual);
        etPesoDesejado = (EditText) findViewById(R.id.t2_et_peso_desejado);
        rdMasculino = (RadioButton) findViewById(R.id.t2_rd_masculino);
        rdFeminino = (RadioButton) findViewById(R.id.t2_rd_feminino);
        grupoSexo = (RadioGroup) findViewById(R.id.t2_rg_sexo);
        spTreino = (Spinner) findViewById(R.id.t2_sp_treino);
        btnCadastrar = (Button) findViewById(R.id.t2_btn_cadastrar);

        //Checks
        chManha = (CheckBox) findViewById(R.id.t2_cb_manha);
        chTarde = (CheckBox) findViewById(R.id.t2_cb_tarde);
        chNoite = (CheckBox) findViewById(R.id.t2_cb_noite);

        Log.d(TAG_LOG,"Passou pelas referencias");



        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Instanciar cliente
                me = new Meta();

                me.setNome(etNome.getText().toString());
                me.setPesoAtual(etPesoAtual.getText().toString());
                me.setPesoDesejado(etPesoDesejado.getText().toString());

                if(grupoSexo.getCheckedRadioButtonId() == rdMasculino.getId()){
                    me.setSexo(rdMasculino.getText().toString());
                }else{
                    me.setSexo(rdFeminino.getText().toString());
                }//fecha else


                ArrayList<String> turno = new ArrayList<String>();
                if(chManha.isChecked()){
                    turno.add(chManha.getText().toString());
                }
                if (chTarde.isChecked()) {
                    turno.add(chTarde.getText().toString());
                }

                if (chNoite.isChecked()) {
                    turno.add(chNoite.getText().toString());
                }
                me.setTurno(turno); //NÃO ESQUECER!!!

                if(spTreino.getSelectedItem().toString().equalsIgnoreCase("Selecione")) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                    msg.setTitle("Erro");
                    msg.setMessage("Precisa selecionar uma opção.");
                    msg.setIcon(R.mipmap.ic_launcher);
                    msg.setNeutralButton("OK", null);
                    msg.show();
                }
                if(spTreino.getSelectedItem().toString().equalsIgnoreCase("Leve")) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                    msg.setTitle("Leve");
                    msg.setMessage("Trabalhos domésticos de esforço leve a modreado, caminhadas para atividades relacionadas ao cotidiano e ficar sentado por várias horas.\n" +
                            "Caminhadas além das mesmas atividades relacionadas ao compoartament sednetário. Até 3 horas de atividad física por semana.");
                    msg.setIcon(R.mipmap.ic_launcher);
                    msg.setNeutralButton("OK", null);
                    msg.show();
                    me.setTreino(spTreino.getSelectedItem().toString());
                }
                    if(spTreino.getSelectedItem().toString().equalsIgnoreCase("Moderado")) {
                        AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                        msg.setTitle("Moderado");
                        msg.setMessage(" Ginástica aeróbica, corrida, natação, jogar tênicas, além das atividades relacionadas ao compoartamente leve. Até 12 horas de atividade física por semana.");
                        msg.setIcon(R.mipmap.ic_launcher);
                        msg.setNeutralButton("OK", null);
                        msg.show();
                        me.setTreino(spTreino.getSelectedItem().toString());
                    }
                if(spTreino.getSelectedItem().toString().equalsIgnoreCase("Intenso")) {
                    AlertDialog.Builder msg = new AlertDialog.Builder(Tela2.this);
                    msg.setTitle("Intenso");
                    msg.setMessage("Ciclismo de intensidade moderada, corrida, pular corda, jogar tênis e além das atividades relacionadas ao comportamento moderado. Acima de 12 horas de atividade física por semana.");
                    msg.setIcon(R.mipmap.ic_launcher);
                    msg.setNeutralButton("OK", null);
                    msg.show();
                    me.setTreino(spTreino.getSelectedItem().toString());
                }
                Toast.makeText(getBaseContext(),
                        me.toString(),
                        Toast.LENGTH_SHORT).show();
            }//fecha onClick
        });//fecha listener





    }//fecha onCreate
}//fecha Classe
