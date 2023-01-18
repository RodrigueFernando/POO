public class Principal {
    public static void main(String[]args){


        Aluno a1 = new Aluno("João","SC12345");
        Aluno a2 = new Aluno("Maria","SC11223");
        Aluno a3=  new Aluno("Jose","SC98765");


        Disciplina d1 = new Disciplina("POOS3","Programação Orientada a Objeto",80);
        Disciplina d2 = new Disciplina("ESDS3","Estrutura de Dados",80);
        Disciplina d3 = new Disciplina("ESWS3","Engenharia de Sofware",80);

        Matricula m1 =  new Matricula(a1,d1,9,70,"2022.1");
        Matricula m2 =  new Matricula(a2,d1,10,90,"2022.1");
        Matricula m3 =  new Matricula(a2,d2,8,100,"2022.1");
        Matricula m4 = new Matricula(a3,d2,9,100,"2022.1");
        Matricula m5 = new Matricula(a3, d3, 10,90, "2022.1");

        a1.setMatriculas(new Matricula[]{m1});
        a2.setMatriculas(new Matricula[]{m2,m3});
        a3.setMatriculas(new Matricula[]{m4,m5});

        d1.setMatricula(new Matricula[]{m1,m2});
        d2.setMatricula(new Matricula[]{m3,m4});
        d3.setMatricula(new Matricula[]{m5});

        for( Matricula m: a3.getMatriculas()){
            System.out.println(m.getDisciplina().getNomeDisciplina());
        }

        for(Matricula m: d1.getMatricula()){
            System.out.println(m.getAluno().getNome()

            );
        }

    }
}

