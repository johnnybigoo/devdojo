package academy.devdojo.maratonajava.javacore.introducaoclasses.test;


import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);

    }
}
