package Composite;

import java.util.ArrayList;
import java.util.List;

public class Drive {

    private String name;
    private List<Directory> content;

    public Drive(String name){
        this.name = name;
        this.content = new ArrayList<>();
    }

    public void addDirectory(Directory d){
        content.add(d);
    }

    public String getName () {
        return name;
    }

    public Drive setName (String name) {
        this.name = name;
        return this;
    }

    public Drive setContent (List<Directory> content) {
        this.content = content;
        return this;
    }

    public String getContent () {
        StringBuilder result = new StringBuilder();
        result.append(this.getName()).append("\n");
        for (File file : this.content) {
            result.append(file.getContent());
        }
        return result.toString().trim();
    }
}
