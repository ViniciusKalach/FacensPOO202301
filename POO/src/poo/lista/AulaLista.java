package poo.lista;

import java.util.ArrayList;

public class AulaLista {
    public static void main(String[] args) {
        //aula de lista
        //Comparação entre array e arraylist
        
        /*
        //conceito de array
        int[] numeros = new int[4];
        int[] novo = new int[5];
        numeros[0] = 1;
        numeros[1] = 25;
        numeros[2] = 40;
        numeros[3] = 89;
        System.out.println(numeros[3]);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        for (int numero : numeros) {
            System.out.println(">>>"+numero);
        
        int numeroChefe = 100;
        for (int i = 0; i < numeros.length; i++) {
            novo[i] = numeros[i];
        }
        novo[4] = numeroChefe;
        for (int i : novo) {
            System.out.println("TODOS:"+i);
        }
        */
        
        /*
        //arraylist
        ArrayList<String> nomes = new ArrayList<>();
        //adicionar
        nomes.add("Edson");
        nomes.add("Victor");
        nomes.add("Vinícius");
        nomes.add("Renata");
        System.out.println(nomes);
        nomes.add(2, "Daniela");
        System.out.println(nomes);
        if (nomes.contains("Vinícius")) {
            System.out.println("Tem o Vinícios na lista");
        }
        //pegar item na lista pelo índice ou pegar o índice
        System.out.println("O terceiro nome é "+nomes.get(2));
        System.out.println("posição da Renata é "+nomes.indexOf("Renata"));
        
        //remover da lista
        nomes.remove("Edson");
        System.out.println(nomes);
        nomes.remove(1);
        System.out.println(nomes);
        //alterar item
        nomes.set(1, "Vini");
        System.out.println(nomes);
        System.out.println("Quantidade de items na lista é "+nomes.size());
        */
        Fornecedor f1 = new Fornecedor();
        f1.setNome("hp");
        Produto p1 = new Produto();
        p1.setNome("notebook");
        f1.setProduto(p1);
        Produto p2 = new Produto();
        p2.setNome("caneta");
        f1.setProduto(p2);
        Fornecedor f2 = new Fornecedor();
        f2.setNome("Facens");
        f2.setProduto(p2);
        Produto p3 = new Produto();
        p3.setNome("mouse");
        f2.setProduto(p3);
        for (Produto produto : f1.getProdutos()) {
            System.out.println(produto.getNome());
        }
        ArrayList<Fornecedor> fornecedores = 
                new ArrayList<>();
        fornecedores.add(f1);
        fornecedores.add(f2);
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println("Nome do fornecedor: "+
                    fornecedor.getNome());
            for (Produto produto : fornecedor.getProdutos()) {
                System.out.println("----->produto: "+
                        produto.getNome());
            }
        }
    }
}
