package my.learn.jool;

import org.jooq.lambda.Unchecked;

import java.io.File;
import java.util.Arrays;

public class DirectoryReader {
    public static void main(String[] args) {
        exploreDirectory(new File("."));
    }

    private static void exploreDirectory(File directory){
        Arrays.stream(directory.listFiles())
                .map(Unchecked.function(File::getCanonicalPath,
                e -> { throw new IllegalStateException("Can't access file", e); }))
                .forEach(System.out::println);
    }
}
