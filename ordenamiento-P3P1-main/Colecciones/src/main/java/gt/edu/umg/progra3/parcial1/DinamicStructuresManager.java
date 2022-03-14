package gt.edu.umg.progra3.parcial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        //inserte codigo aqui
       Collections.sort(values, null);
        return values;
    }

    public List<T> ordenarInversa(){
        //inserte codigo aqui
        Collections.sort(values, null);
        Collections.reverse(values);

        return values;
    }

}
