package com.ceub.pwd.pwd.controller;

import com.ceub.pwd.pwd.model.Profissional;
import com.ceub.pwd.pwd.service.ProfissionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalService service;

    @GetMapping("/list")
    public List<Profissional> getAllProfissionais(@RequestParam(required = false) String especialidade, @RequestParam(required = false) String nome) {

        return service.listarTodos(especialidade, nome);
    }
}
