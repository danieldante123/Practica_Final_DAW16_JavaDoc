
package practicaDAW;

import java.awt.Color;
import java.util.List;

/**
 * Clase que deben implementar los alumnos para completar la practica de GIT
 * @author DaniDespacho
 * @version 1.0
 * 
 */

public class Alumnos {
    
    public Color metodoProfesor(List<String> atributos)
    {
        atributos.add("Nombre: Daniel");
        atributos.add("Apellidos: López Lozano");
        
        return null;
        
    }
    
    /**
     * Esta es la documentacion del metodo de Carlos Amezcua Puertas, de 2º CFGS DAW
     * @author: camezcua
     * @version: 1.0.0
     * @param atributos: lista con los diferentes atributos de cada alumno
    */
    public Color metodoCarlos(List<String> atributos)
    {
        atributos.add("Nombre: Carlos");
        atributos.add("Apellidos: Amezcua Puertas");
        atributos.add("Edad: 21");
        atributos.add("Aficiones: informatica, cine, musica");
        atributos.add("Nombre PFC: Por decidir");
        atributos.add("Descripcion PFC: aplicacion de viñetas");
        atributos.add("Experiencia asignaturas DAW: satisfecho en programacion y mejorando en diseño");
        atributos.add("Planes de futuro: algun proyecto en colaboracion");
        return new Color(254,0,0);
    }
    
    public Color metodoAntonioB(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoFrancisco(List<String> atributos)
    {
        
        
        return null;
        
    }
    /**
     * Lista con todos los nombres de los alumnos, y al pulsar sobre alguno de ellos aparecerá su información y el color elegido
     * @author: jjcobojim
     * @version: 1.0.0
     * @param atributos: lista con los diferentes atributos de cada alumno
     * @return Color de fondo elegido
    */
    public Color metodoJuanjo(List<String> atributos)
    {
        atributos.add("Nombre: Juan José");
        atributos.add("Apellidos: Cobo Jiménez");
        atributos.add("Edad: 23");
        atributos.add("Aficiones: Deporte, viajar, salir, videojuegos");
        atributos.add("Nombre PFC: LuckSport (por decidir)");
        atributos.add("Descripcion PFC: Aplicación web dedicada a la gestión de apuestas deportivas ");
        atributos.add("Experiencia asignaturas DAW: Buena. Incentiva el trabajo autónomo");
        atributos.add("Planes de futuro: Encontrar trabajo o seguir formándome");
        return new Color(0,77,0);  
        
    }
    
    public Color metodoDavid(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoIsidoro(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    /**
     * Aparecerán una lista con todos los nombres de los alumnos y al pulsar un alumno se mostrarán sus datos y el color que 
     * él haya elegido
     * @param atributos Lista de frases que se va a visualizar (datos de los alumnos)
     * @return Color de fondo para la pantalla
    */
    public Color metodoVeronica(List<String> atributos)
    {
        atributos.add("Nombre: Verónica");
        atributos.add("Apellidos: Espigares Asenjo");
        atributos.add("Edad: 20");
        atributos.add("Aficiones: Natación");
        atributos.add("Nombre PFC: Guardería bbsvero");
        atributos.add("Descripcion PFC: En mi proyecto voy a crear una comunicación diaria entre los padres de los alumnos y"+
        "los profesores de la guarderia. Además voy a gestionar todos los datos de la guardería (profesores, secretario, alumnos,"+
        "padres, etc)");
        atributos.add("Experiencia asignatura DAW: Asignautra dinámica");
        atributos.add("Planes de futuro: Estudiar el módulo de multiplataforma y hacer cursos (android, photoshop)");
        
        return new Color(153,0,153);
        
    }
    
    public Color metodoPabloE(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoRuben(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoJuanCarlos(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoAntonioM(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    /**
    * @author Jaime Ocón
    * @param atributos Lista que contiene los datos
    * @return Color de fondo de la pantalla
    */
    public Color metodoJaime(List<String> atributos)
    {
        atributos.add("Nombre: Jaime");
        atributos.add("Apellidos: Ocón Luján");
        atributos.add("Edad: 20");
        atributos.add("Aficiones: Salir,videojuegos");
        atributos.add("Nombre PFC: Lorem ipsum");
        atributos.add("Descripcion PFC: Aplicacion web para gestionar una empresa de servicios");
        atributos.add("Experiencia asignatura DAW: Buena");
        atributos.add("Planes de futuro: Seguir estudiando");
        
        return new Color(111,111,111);
        
    }
    
    public Color metodoVictor(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    public Color metodoAlejandro(List<String> atributos)
    {
        
        
        return null;
        
    }
    
    /**
    * @author Pablo Robles
    * @param atributos Es la lista de datos que se van a ver
    * @return Color de fondo que se vera en la pantalla
    */
    public Color metodoPabloR(List<String> atributos)
        {
        atributos.add("Nombre: Pablo");
        atributos.add("Apellidos: Robles Molina");
        atributos.add("Edad: 20");
        atributos.add("Aficiones: Hacer practicas de DAW, atender en clase, sacar buenas notas, ir a misa los domingos.");
        atributos.add("Nombre PFC: Plan G");
        atributos.add("Descripcion PFC: Aplicación web donde encontrar todos los planes en tu ciudad.");
        atributos.add("Experiencia asignatura DAW: Ha dado una visión general pero no muy profunda de diversos temas referentes al Despliegue de Aplicaciones.");
        atributos.add("Planes de futuro: Estudiar Desarrollo de Aplicaciones Multiplataforma.");
        
        return new Color(254,255,0);
    }
    
    /**
     * Metodo que da la informacion de el alumno Daniel
     * @author: Daniel Ruiz Medina
     * @param atributos es la lista de frases que se va a visualizar
     * @return Color de fondo que se le pondra a la pantalla
     * 
    */ 
    public Color metodoDaniel(List<String> atributos)
    {
        atributos.add("Nombre: Daniel");
        atributos.add("Apellidos: López Lozano");
        atributos.add("Edad: 22");
        atributos.add("Aficiones: Programar, Cine, Deporte,...");
        atributos.add("Nombres PFC: RecSoc");
        atributos.add("Descripcion PFC: red social que mediante eventos pretende medir la imagen corporativa de las empresas");
        atributos.add("Experiencia asignatura DAW: Es una asignatura que se aprenden cosas utiles");
        atributos.add("Planes de futuro: Continuar mis estudios con un Grado en Informatica en la UGR");
        
        return new color(0,255,255);
        
    }
}
