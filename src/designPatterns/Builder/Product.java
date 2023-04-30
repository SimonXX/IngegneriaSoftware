package designPatterns.Builder;

public class Product implements ProductIF{
    private String partA;
    private String partB;


    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void printParts() {
        System.out.println("PartA: " + partA + ", PartB: " + partB);
    }
}
