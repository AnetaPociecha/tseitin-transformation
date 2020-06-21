package pl.edu.agh;

public abstract class AbstractFile {
    private final String name;
    private final String text;

    protected AbstractFile(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public void save(String filepath) {

    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }
}
