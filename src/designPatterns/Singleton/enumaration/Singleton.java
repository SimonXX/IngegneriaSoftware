package designPatterns.Singleton.enumaration;

public enum Singleton {
    INSTANCE;

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
