public class Principal {
    public static void main(String[] args) {
        Curso c = new Curso("Analise e desenvolvimento de sistemas","ads");
        Curso c1 = new Curso("Programacao Orientada a Objeto","POO");
        Aluno a = new Aluno("123456","fernando","3018237",7.9,c);
        Professor p =new Professor("123","marcelo","301301","java");
       AlunoGraduacao graduacao = new AlunoGraduacao("123","marcelo","301",7.8,c,70);
       AlunoPosGraduacao posGraduacao = new AlunoPosGraduacao("789","mateus","789",9,c1,p);

       a.mostraDados();
       p.mostraDados();
        posGraduacao.mostraDados();
    }
}
