package com.ceub.pwd.pwd.model;

import java.util.ArrayList;
import java.util.List;

public class Profissional {
    private String nome;
    private String especialidade;

    public Profissional() {}

    public Profissional(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
