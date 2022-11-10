package my.groupId;

import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.Arrays;

@QuarkusMain
public class IssueReproducer {
    public static void main(String... args) {
        System.out.println("args: " + args.length);
        System.out.println(Arrays.toString(args));
    }
}