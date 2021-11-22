package aoc.java;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class Advent1 {
    public static void main(String[] args) {
        List<String> lines = null;
        try {
            lines = FileUtils.readLines(FileUtils.getFile("src/main/resources/input.txt"), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines.size());
    }
}
