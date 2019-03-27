import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {



        List<Persona> personas = new ArrayList<>();
        personas = Arrays.asList(new Persona("Karina", "Felice", 37, 28754888),
                new Persona("Mariela", "Cagnoli", 36, 29754703),
                new Persona ("Matias", "Tassara", 15, 56555555),
                new Persona("German", "Gianotti", 17, 59754645));

        System.out.println(String.format("Mayores a 21: %s", personas.stream().
                filter(persona->persona.getEdad()>21).
                collect(Collectors.toList())));

        System.out.println(String.format("Menores a 18: %s", personas.stream().
                filter(persona->persona.getEdad()<18).
                collect(Collectors.toList())));
        System.out.println(String.format("Mayores a 21 y dni mayor a 20 millones: %s", personas.stream().
                filter(persona->persona.getEdad()>21).filter(persona->persona.getDni()>20000000).
                collect(Collectors.toList())));



    }
}
