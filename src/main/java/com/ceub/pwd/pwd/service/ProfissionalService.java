package com.ceub.pwd.pwd.service;

import com.ceub.pwd.pwd.model.Profissionais;
import com.ceub.pwd.pwd.model.Profissional;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfissionalService {

    private final String XML_PATH = "src/main/resources/profissionais.xml";
    private List<Profissional> listaProfissionais = new ArrayList<>();

    public ProfissionalService() {
        carregar();
    }

    public void carregar() {
        try {
            XmlMapper mapper = new XmlMapper();
            File file = new File(XML_PATH);
            Profissionais wrapper = mapper.readValue(file, Profissionais.class);
            listaProfissionais = wrapper.getProfissionais();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Profissional> listarTodos(String especialidade, String name) {
        List<Profissional> profissionalList = listaProfissionais.stream()
                .filter(p -> (name == null || p.getNome().toLowerCase().contains(name.toLowerCase())))
                .filter(p -> (especialidade == null || p.getEspecialidade().toLowerCase().contains(especialidade.toLowerCase())) )
                .collect(Collectors.toList());

        return profissionalList;
    }



}