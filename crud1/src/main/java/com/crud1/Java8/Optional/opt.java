package com.crud1.Java8.Optional;

import java.util.List;
import java.util.Optional;

public class opt {

    public static void main(String[] args) {
        List<String> ss = null;
        List<String> res = Optional.ofNullable(ss).orElse(List.of("Not value"));
        System.out.println(res);

        List<String> ll =  List.of("Applle","banaan","carrot");
        Optional<List<String>> kk = Optional.of(ll);
        kk.orElseThrow(()-> new RuntimeException("exception"));

    }
}
