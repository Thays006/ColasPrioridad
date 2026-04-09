import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Clinica {
    private PriorityQueue<Paciente> colaPrioridad;

    public Clinica(){
        colaPrioridad = new PriorityQueue<>();
    }
    public void encolar(Paciente paciente){
        colaPrioridad.add(paciente);
    }
    public Paciente desencolar() throws Exception {
        if (colaPrioridad.isEmpty())
            throw new Exception("No hay elementos");
        return colaPrioridad.poll();
    }

    public ArrayList<Paciente> listar(){
        return new ArrayList<>(colaPrioridad);
    }

}
