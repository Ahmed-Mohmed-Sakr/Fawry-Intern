package org.tasks.week5.Java8.LamdaTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class UsersRepository {
    List<User> users;

    UsersRepository() {
        users = Arrays.asList(
                new User("Seven", 7, true),
                new User("Four", 4, false),
                new User("Eleven", 11, true),
                new User("Three", 3, true),
                new User("Nine", 9, false),
                new User("One", 1, true),
                new User("Twelve", 12, true));
    }

    void select(final Predicate<User> filter, final Comparator<User> order) {
        Stream<User> usersStream = users.stream();

        if (filter != null) {
            usersStream = usersStream.filter(filter);
        }
        if (order != null) {
            usersStream = usersStream.sorted(order);
        }
        usersStream.forEach(System.out::println);
    }
}
