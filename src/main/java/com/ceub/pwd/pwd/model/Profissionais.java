package com.ceub.pwd.pwd.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;

public class Profissionais {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "profissional")
    private List<Profissional> profissionais;

    public List<Profissional> getProfissionais() { return profissionais; }

    public void setProfissionais(List<Profissional> profissionais) { this.profissionais = profissionais; }
}

