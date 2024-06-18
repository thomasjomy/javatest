package my.learn.vavr;

import io.vavr.collection.List;
import io.vavr.control.Try;

import java.io.File;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        printFilesInDirectory(new File("C:/workspace/projects/JavaTest"));
    }

    private static void printFilesInDirectory(File dir){
        List.of(dir.listFiles())
                .map(file -> Try.ofCallable(file::getCanonicalPath).getOrElseThrow(e -> new IllegalStateException("Can't access file")))
                .forEach(System.out::println);
    }
}
