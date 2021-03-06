
package com.portfolio.Fernando.Interface;

import com.portfolio.Fernando.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lsita de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    //Buscar una Persona por ID
    public Persona findPersona(Long id);
}
