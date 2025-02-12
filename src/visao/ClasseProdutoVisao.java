package visao;

import java.time.LocalDate;

import dominio.ClasseProduto;

public class ClasseProdutoVisao {
    public ClasseProdutoVisao() {

    }

    public void Exibir() {
        ClasseProduto cp1 = new ClasseProduto();
        cp1.setCodigo(1);
        cp1.setDescricao("Bebidas");
        cp1.setDataDeInclusao(LocalDate.now());

        System.out.println("Classe de Produto");
        System.out.println("Código: " + cp1.getCodigo());
        System.out.println("Descricao:" + cp1.getDescricao());
        System.out.println("Data de Inclusao" + cp1.getDataDeInclusao());

        ClasseProduto cp2 = new ClasseProduto(2, "Carnes", LocalDate.now());

        System.out.println("Classe de Produto");
        System.out.println("Código: " + cp2.getCodigo());
        System.out.println("Descricao:" + cp2.getDescricao());
        System.out.println("Data de Inclusao" + cp2.getDataDeInclusao());

    }

}
