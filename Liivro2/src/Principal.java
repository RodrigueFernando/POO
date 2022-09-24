public class Principal {
    public static void main(String[] args) {
        Editora e1 = new Editora("1","3384-301-000-00");
        Editora e2 = new Editora("2","741-852-22");

        Autor a1 = new Autor("fernando","33414168");
        Autor a2 = new Autor("paulo","99318537");

        Livro livro1 = new Livro(e1,a1,"a batalha final", 2022,250);

        livro1.mostraDados();
    }
}
