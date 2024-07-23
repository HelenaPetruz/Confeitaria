package com.mentoria.helena.confeitaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DataHora {

    @Autowired
    public String dataHoraAtual(){
        Date dataHora = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy ").format(dataHora);
        String hora = new SimpleDateFormat("HH:mm").format(dataHora);
        return data.concat(hora);
    }
}
