package br.ufjf;
public class ExameRAD {
    private ExameRAD(){}
    private static ExameRAD instance = new ExameRAD();
    public static ExameRAD getInstance(){
        return instance;
    }
    private String nome;
    private Integer taxa;

    public static void setInstance(ExameRAD instance) {
        ExameRAD.instance = instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTaxa() {
        return taxa;
    }

    public void setTaxa(Integer taxa) {
        this.taxa = taxa;
    }
}
