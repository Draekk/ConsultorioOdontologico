package com.draekk.consultorioodontologico.logica;

import com.draekk.consultorioodontologico.logica.Especialidad;
import com.draekk.consultorioodontologico.logica.Horario;
import com.draekk.consultorioodontologico.logica.Turno;
import com.draekk.consultorioodontologico.logica.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-18T12:53:41")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Horario> horario;
    public static volatile ListAttribute<Odontologo, Turno> turnos;
    public static volatile SingularAttribute<Odontologo, Usuario> usuario;
    public static volatile SingularAttribute<Odontologo, Especialidad> especialidad;

}