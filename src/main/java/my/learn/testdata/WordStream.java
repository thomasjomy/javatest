package my.learn.testdata;

import java.util.ArrayList;
import java.util.List;


public class WordStream {
    private static List<String> programmingLanguages = new ArrayList<>();

    static {
        programmingLanguages.add("java");
        programmingLanguages.add("php");
        programmingLanguages.add("python");
        programmingLanguages.add("perl");
        programmingLanguages.add("c");
        programmingLanguages.add("lisp");
        programmingLanguages.add("c#");
        programmingLanguages.add("Erlang");
        programmingLanguages.add("F#");
        programmingLanguages.add("scala");
        programmingLanguages.add("haskell");
        programmingLanguages.add("javascript");
        programmingLanguages.add("typescript");

    }

    public static List<String> getProgrammingLanguages(){
        return programmingLanguages;
    }

}
