package org.tasks.week5.Java8.StreamsTask;

import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamsExample {

    public static void main(final String[] args) {

        List<Author> authors = Library.getAuthors();

        banner("Authors information");
        // TODO With functional interfaces declared
        Consumer<Author> printer = System.out::println;
        authors
                .stream()
                .forEach(printer);

        // TODO With functional interfaces used directly
        authors
                .stream()
                .forEach(System.out::println);

        banner("Active authors");
        // TODO With functional interfaces declared
        Predicate<Author> activeFilter = author -> author.active;
        Consumer<Author> activePrinter = System.out::println;
        authors.stream().filter(activeFilter).forEach(activePrinter);

        // TODO With functional interfaces used directly
        authors
                .stream()
                .filter(author -> author.active)
                .forEach(System.out::println);

        banner("Active books for all authors");
        // TODO With functional interfaces declared
        Consumer<Book> activeBookPrinter = System.out::println;
        Predicate<Book> activeBookFilter = book -> book.published;
//        Predicate<Book> activeBooks= author -> author.books;
        authors.stream()
                .flatMap(author -> author.books.stream().filter(activeBookFilter))
                .forEach(activeBookPrinter);

        // TODO With functional interfaces used directly
        authors.stream()
                .flatMap(author -> author.books.stream().filter(book -> book.published))
                .forEach(System.out::println);

        banner("Average price for all books in the library");
        // TODO With functional interfaces declared
        Consumer<OptionalDouble> averagePricePrinter = System.out::println;
        OptionalDouble averagePrice = authors.stream()
                .flatMap(author -> author.books.stream())
                .mapToDouble(book -> book.price)
                .average();
        averagePricePrinter.accept(averagePrice);


        // TODO With functional interfaces used directly
        System.out.println(
                authors.stream()
                .flatMap(author -> author.books.stream())
                .mapToDouble(book -> book.price)
                .average()
        );


        banner("Active authors that have at least one published book");
        // TODO With functional interfaces declared
        Predicate<Author> activePublishedAuthorFilter = author -> author.active &&
                author.books.stream().anyMatch(Book-> Book.published);
        Consumer<Author> activePublishedAuthorPrinter = System.out::println;
        authors.stream().filter(activePublishedAuthorFilter).forEach(activePublishedAuthorPrinter);

        // TODO With functional interfaces used directly
        authors.stream()
                .filter(author -> author.active &&
                        author.books.stream().anyMatch(Book-> Book.published))
                .forEach(System.out::println);
    }

    private static void banner(final String m) {
        System.out.println("#### " + m + " ####");
    }
}


