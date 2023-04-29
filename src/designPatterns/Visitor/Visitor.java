package designPatterns.Visitor;

public interface Visitor {//si definisce un metodo per ogni classe concreta della struttura
    void visitElementA(ElementA elementA);//potrebbero essere chiamati allo stesso modo, poiché l'input è differente
    void visitElementB(ElementB elementB);
}
