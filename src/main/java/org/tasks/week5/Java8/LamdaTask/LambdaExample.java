package org.tasks.week5.Java8.LamdaTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaExample {

    public static void main(final String[] args) {

        final UsersRepository repository = new UsersRepository();

        banner("Listing all users");
        repository.select(null, null);

        banner("Listing users with age > 5 sorted by name");
        // TODO once using anonymous objects and once using lambda expressions
        repository.select(user -> user.age > 5, (userA, userB) -> userA.name.compareTo(userB.name));

        banner("Listing users with age < 10 sorted by age");
        // TODO once using anonymous objects and once using lambda expressions
        repository.select(user -> user.age < 10, Comparator.comparingInt(user -> user.age));

        banner("Listing active users sorted by name");
        // TODO once using anonymous objects and once using lambda expressions
        repository.select(user -> user.active, (userA, userB) -> userA.name.compareTo(userB.name));

        banner("Listing active users with age > 8 sorted by name");
        // TODO once using anonymous objects and once using lambda expressions
        repository.select(user -> user.active && user.age > 8, (userA, userB) -> userA.name.compareTo(userB.name));
    }

    private static void banner(final String m) {
        System.out.println("#### " + m + " ####");
    }
    
}

