package designPatterns.Observer;

class ConcreteSubject extends Subject {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        setStato(1); // notifica i suoi observers del cambiamento di stato
    }
}