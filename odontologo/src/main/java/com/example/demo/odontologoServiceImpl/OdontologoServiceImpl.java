package com.example.demo.odontologoServiceImpl;

import com.example.demo.domain.Odontologo;
import com.example.demo.odontologoService.OdontologoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {
    @Override
    public List<Odontologo> listaOdontologos() {
        return Arrays.asList(new Odontologo("Javier"), new Odontologo("Ramon"));
    }
}
