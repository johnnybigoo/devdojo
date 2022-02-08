package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("nome: "+ professor.name + ", idade: " + professor.idade + ", sexo: " + professor.sexo);
    }
}
