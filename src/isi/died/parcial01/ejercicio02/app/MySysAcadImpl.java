package isi.died.parcial01.ejercicio02.app;

import java.util.ArrayList;
import java.util.List;

import isi.died.parcial01.ejercicio02.db.BaseDeDatos;
import isi.died.parcial01.ejercicio02.dominio.*;


public class MySysAcadImpl implements MySysAcad {
	private static final BaseDeDatos DB = new BaseDeDatos();


	private List<Materia> materia = new ArrayList<Materia>();
	
	@Override
	public void registrarMateria(Materia d) {
		this.materia.add(d);
	}
	
	private List<Docente> docentes = new ArrayList<Docente>();
	
	@Override
	public void registrarDocente(Docente d) {
		this.docentes.add(d);
	}
	
	private List<Alumno> alumnos = new ArrayList<Alumno>();
	
	@Override
	public void registrarAlumnos(Alumno d) {
		this.alumnos.add(d);
	}
	

	@Override
	public void inscribirAlumnoCursada(Docente d, Alumno a, Materia m, Integer cicloLectivo) {
		Inscripcion insc = new Inscripcion(cicloLectivo,Inscripcion.Estado.CURSANDO);
		d.agregarInscripcion(insc);
		a.addCursada(insc);
		m.addInscripcion(insc);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(insc);
	}

	@Override
	public void inscribirAlumnoExamen(Docente d, Alumno a, Materia m) {
		Examen e = new Examen();
		a.addExamen(e);
		d.agregarExamen(e);
		m.addExamen(e);
		// DESCOMENTAR Y gestionar excepcion
		// DB.guardar(e);
	}
	public void registrarNota(Alumno a, Materia m, Examen e){
		int lastIndex;
		e.setAlumno(a);
		if(e.getNota()>6){
			//agregar al alumno a a las ultimas de las inscripciones y cambiar el estado a PROMOCIONADA
			lastIndex = a.getMateriasCursadas().size();
			a.getMateriasCursadas().get(lastIndex-1).setEstado(Inscripcion.Estado.PROMOCIONADO);

		}
	}
	public List<Materia> materiasAprobadas(Alumno m){

		for(int i=0;i<m.getMateriasCursadas().size();i++){
			if(m.getMateriasCursadas().get(i).getEstado()== Inscripcion.Estado.PROMOCIONADO){
				System.out.println("Materia "+ i + "aprobada: "+ m.getMateriasCursadas().get(i).getMateria().getNombre() );
				}
			}

		}

	}


