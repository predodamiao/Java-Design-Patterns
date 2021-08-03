package Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{

    private List<File> content;

    public Directory(String name){
        super(name);
        this.content = new ArrayList<>();
    }

    public void addFile(File file){
        content.add(file);
    }

    @Override
    public String getContent () {
        StringBuilder result = new StringBuilder();
        result.append("\\").append(this.getName()).append("\n");
        for (File file : this.content) {
            result.append(file.getContent()).append("\n");
        }
        return result.toString();
    }
}
