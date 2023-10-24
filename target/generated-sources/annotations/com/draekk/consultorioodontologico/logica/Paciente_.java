package com.draekk.consultorioodontologico.logica;

import com.draekk.consultorioodontologico.logica.Responsable;
import com.draekk.consultorioodontologico.logica.TipoSangre;
import com.draekk.consultorioodontologico.logica.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-10-24T19:27:50")
@StaticMetamodel(Paciente.class)
public class Paciente_ extends Persona_ {

    public static volatile SingularAttribute<Paciente, Boolean> tiene_OS;
    public static volatile SingularAttribute<Paciente, TipoSangre> tipoSangre;
    public static volatile SingularAttribute<Paciente, Responsable> responsable;
    public static volatile ListAttribute<Paciente, Turno> turnos;

}