package com.ppoox.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> includes = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fileSystem) {
        includes.add(fileSystem);
    }

    @Override
    public int getSize() {
        int sum = includes.stream()
                .map(FileSystem::getSize)
                .reduce(0, Integer::sum);

        System.out.println(name + " folder size " + sum);
        System.out.println("- - - - - - - - - - - -");

        return sum;
    }

    @Override
    public void remove() {
        for (FileSystem fs : includes) {
            fs.remove();
        }
        System.out.println(name + "folder remove");
        System.out.println("- - - - - - - - - - - -");
    }
}
