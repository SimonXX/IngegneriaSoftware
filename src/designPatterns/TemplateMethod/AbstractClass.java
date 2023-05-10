package designPatterns.TemplateMethod;

// Classe astratta AbstractClass che definisce il Template Method
abstract class AbstractClass {
    // Metodo TemplateMethod che utilizza i metodi primitivi per eseguire l'algoritmo
    public void TemplateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    // Metodo primitivo 1, implementato dalle classi concrete
    abstract void primitiveOperation1();

    // Metodo primitivo 2, implementato dalle classi concrete
    abstract void primitiveOperation2();
}
