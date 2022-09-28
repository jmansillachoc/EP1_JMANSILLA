package isil.pe.ep1.jmansilla.Alumnos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Alumno")
public class AlumnosController {

    @GetMapping
    @RequestMapping("/ListarAlumnos")
    public List<Alumnos> getAlumno(){
        Alumnos alumno1 = new Alumnos(
                001,
                "Joseph",
                "Mansilla   ",
                "72721846   ",
                "IntegracionAPP"
        );
        Alumnos alumno2 = new Alumnos(
                002,
                "Bryan",
                "Mansilla",
                "72721829",
                "IntegracionAPP"
        );
        Alumnos profesor = new Alumnos(
                003,
                "Julian",
                "Sanchez",
                "10038600",
                "IntegracionAPP"
        );

        return List.of(alumno1,alumno2,profesor);
    }
}
