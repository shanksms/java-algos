package strings;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Codec {


    public String encode(List<String> lsOfStrings) {

        return lsOfStrings.stream()
                .map(element -> element.replaceAll("#", "##") + " # ")
                .collect(Collectors.joining(""));

    }

    public List<String> decode(String str) {
        List<String> ls = Arrays.stream(str.split(" # ", -1))
                .map(element -> element.replaceAll("##", "#"))
                .collect(Collectors.toList());
        ls.remove(ls.size() - 1);
        return ls;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString("".split(" # ")));
    }

}
