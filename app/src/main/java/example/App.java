package example;

import com.google.common.collect.ImmutableList;

public final class App {

    public static void main(String[] args) {
        ImmutableList<Integer> list = ImmutableList.of(3);
        System.out.println(list.get(0));
    }
}
