package main.com.dh.academia;

import main.com.dh.academia.dao.impl.EstudianteDaoEnMemoria;
import main.com.dh.academia.dao.impl.EstudianteDaoH2;
import main.com.dh.academia.model.Estudiante;
import main.com.dh.academia.service.EstudianteService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Estudiante estudiante=new Estudiante(1L,"Juan", "Perez");
        Estudiante estudiante2=new Estudiante(2L,"pepito", "Perez");
        Estudiante estudiante3=new Estudiante(3L,"jaimito", "Perez");

        EstudianteService estudianteService = new EstudianteService();

        estudianteService.setEstudianteDao(new EstudianteDaoH2());
        estudianteService.guardarEstudiante(estudiante);
        estudianteService.guardarEstudiante(estudiante2);
        estudianteService.guardarEstudiante(estudiante3);
        List<Estudiante> listaEstudiantes=  estudianteService.buscarTodos();
        System.out.println(listaEstudiantes);

    }
}




