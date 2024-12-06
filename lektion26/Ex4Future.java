import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Ex4Future {
    public static void main(String[] args) {
        readAllWords("Ex4Future.java", StandardCharsets.UTF_8)
            .thenAccept(System.out::println);

        readAllWords("SimpleThreads.java", StandardCharsets.UTF_8)
            .thenAccept(l -> System.out.println(l.size()));

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, world!");
        }

        ForkJoinPool.commonPool().awaitQuiescence(2, TimeUnit.MINUTES);
    }
    
    private static CompletableFuture<List<String>> readAllWords(String filename, Charset charset) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return Files.lines(Path.of(filename), charset)
                        .map(s -> s.split("[\\s\\p{Punct}]+"))
                        .flatMap(Arrays::stream)
                        .map(str -> str.replaceAll("[.,?!]", ""))
                        .filter(s -> s.trim().length() != 0)
                        .collect(Collectors.toList());
            }
            catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        });
    }
}
