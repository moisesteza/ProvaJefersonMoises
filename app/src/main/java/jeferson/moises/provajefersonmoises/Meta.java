package jeferson.moises.provajefersonmoises;

import java.util.ArrayList;

/**
 * Created by Alunos on 14/12/2016.
 */

public class Meta {

    private String nome;
    private String pesoAtual;
    private String pesoDesejado;
    private String sexo;
    private String treino;
    private ArrayList<String> turno; //checkbox

    public Meta() { turno = new ArrayList<>(); //instanciar
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(String pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public String getPesoDesejado() {
        return pesoDesejado;
    }

    public void setPesoDesejado(String pesoDesejado) {
        this.pesoDesejado = pesoDesejado;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTreino() {
        return treino;
    }

    public void setTreino(String treino) {
        this.treino = treino;
    }

    public ArrayList<String> getTurno() {
        return turno;
    }

    public void setTurno(ArrayList<String> turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "nome='" + nome + '\'' +
                ", pesoAtual=" + pesoAtual +
                ", pesoDesejado=" + pesoDesejado +
                ", sexo='" + sexo + '\'' +
                ", treino='" + treino + '\'' +
                ", turno=" + turno +
                '}';
}//fecha toString
}//fecha meta

