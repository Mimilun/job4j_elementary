package ru.job4j.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {

    private static List<Integer> listStream;

    private EasyStream() {
    }

    public static EasyStream of(List<Integer> source) {

        return new Builder().createColl(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {

        List<Integer> listTemp = new ArrayList<>();
        Integer tmp;
        for (Integer el : listStream) {
            tmp = fun.apply(el);
            listTemp.add(tmp);
        }
        return new Builder().createColl(listTemp);
    }

    public EasyStream filter(Predicate<Integer> fun) {

        List<Integer> temp = new ArrayList<>();
        for (Integer el : listStream) {
            if (fun.test(el)) {
                temp.add(el);
            }
        }
        return new Builder().createColl(temp);
    }

    public List<Integer> collect() {

        return new Builder().builder();
    }

    static class Builder {

        public EasyStream createColl(List<Integer> source) {

            listStream = source;
            return new EasyStream();
        }

        public List<Integer> builder() {

            return listStream;
        }
    }
}
