package designPatterns.Visitor;


//ogni elemento potrebbe avere un'interfaccia diversa (in questo caso è comune sia per ElementA che ElementB)
public interface Element {
    void accept(Visitor visitor);
}
