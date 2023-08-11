# Unit Testing

> JUnit, AssertJ, Mockito, JaCoCo

## About

- In this part of repo we will talk about software testing specially **Unit Test**.

----

## Why we need Testing ?!!
 `If you need to destroy your org don't use any kind of test.`
- Early Identify defects and errors.
- Minimize risks.
- **If you ignore Testing by time:**
  - Your code is no longer stable.
  - Higher costs in Damaged reputation specially if it's in service.

----
## Testing levels:
` we will focus now on Unit Testing`

- **The earlier you discover bugs, the easier and less costly they are to fix.**

<img alt="Testing levels" src="https://static.javatpoint.com/tutorial/software-testing/images/levels-of-testing.png">

---
## Unit Testing:
- ### what is Unit Testing?
  - Unit Testing involves testing each and every component of your code to see if they work as expected.
  - It isolates each individual method of your code and performs tests on it.
  - Unit tests helps make sure that your software is working as expected before releasing it.
- ### Unit Testing Guide (F.I.R.S.T):
  - **Fast :** TestCase must be fast -imagine how may component in system- and efficiency cover different testcases.
  - **Isolated/Independent :** Testcases need to be independent on each others.
  - **Repeatable :** I can repeat same testCase and get same result.
  - **Self-validating :** Have it's logic validate itself if it's valid operation or not.
  - **Thorough :**  Cover all scenarios of code (Test Coverage).
- ### Unit testing challenges:

  - | Challenge | Solution                          |
    | ------------- |-----------------------------------|
    | Dependencies  | Depend on interfaces              |
    | Long complex methods | SRP, refactoring                  |
    | new keyword  | Dependency Injection              |
    | 100% Coverage |                                   |

- ### Don't of Unit Testing:
  - Do not try to test code that is not a part of the method under test.
  - Do not make API calls, database connections, or network requests while writing your tests.
  - **Don’t test already tested things:**
    - Trivial code:
      - Getters & Setters. 
    - Database.
    - Frameworks/libraries (well-tested).

- ### Test steps:
  -  |   | Test steps:   | BDD           | AAA |
     |---|---------------|-----------------|-----|
     | 1 | Preconditions |  Given | Arrange    |
     | 2 | Action     | When |   Act  |
     | 3 | Assertions | Then |  Assert   |
  

- ### JUnit (Test runner):
  - JUnit is a popular open-source testing framework for Java applications. It provides a simple and standardized way to write and execute unit tests.
  - Resources to study it:
    - [junit5-docs](https://junit.org/junit5/docs/current/user-guide/)
    - [junit-5](https://www.baeldung.com/junit-5)
    - [tutorialspoint-junit](https://www.tutorialspoint.com/junit/index.htm)

- ### Code coverage (JaCoCo):
  - Code coverage is a software metric used to measure how many lines of our code are executed during automated tests.
  - Go ahead and see how to use it and how that plugin work.
  - [maven-jacoco-code-coverage-example](https://mkyong.com/maven/maven-jacoco-code-coverage-example/).
  - [baeldung-jacoco](https://www.baeldung.com/jacoco).
  - [eclemma-jacoco](https://www.eclemma.org/jacoco/trunk/doc/index.html).
  - [youtube.com-jacoco](https://www.youtube.com/watch?v=UZWOb9ce6go&ab_channel=DailyCodeBuffer).
  - [jacoco](https://www.eclemma.org/jacoco/trunk/doc/index.html).

- ### AssertJ (Fluent Assertions):
  - AssertJ is a popular Java library that provides a fluent and expressive API for writing assertions in tests.
  - It aims to make your assertions more readable, maintainable, and intuitive.
  - AssertJ offers a wide range of assertion methods, chaining options, and customizations, making it a powerful tool for enhancing the clarity and effectiveness of your test code.
  - Resources to study it:
    - [assertj-doc](https://assertj.github.io/doc/).
    - [github-assertj](https://github.com/assertj/assertj).
    - [tutorials-AssertJ](https://www.vogella.com/tutorials/AssertJ/article.html).
    - [introduction-to-assertj](https://www.baeldung.com/introduction-to-assertj)
    
  
- ### Mockito (Mocking):
  - be for you go anyplace see that : [testing-with-test-doubles](https://jesusvalerareales.com/testing-with-test-doubles/).
  - Mockito is a popular open-source Java framework for creating mock objects in unit tests.
  - It allows you to simulate the behavior of dependencies and collaborator objects, enabling isolated and focused testing of units.
  - Mockito provides a simple and intuitive API for creating mocks, defining their behavior, and verifying interactions with them during testing.
  - Resources to study it:
    - [mockito-doc](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
    - [mockito-wiki](https://github.com/mockito/mockito/wiki).
    - [site.mockito.org](https://site.mockito.org/).
    - [javatpoint-mockito](https://www.javatpoint.com/mockito).
    - [tutorialspoint-mockito](https://www.tutorialspoint.com/mockito/index.htm).
    - [baeldung-mockito-series](https://www.baeldung.com/mockito-series).

---
## Unit Testing Tasks:
- [Using_Runnable_Interface_01](Using_Runnable_Interface_01)
- [Using_JUnit_02](Using_JUnit_02)
- [Using_JUnit_Mock_03](Using_JUnit_Mock_03)

---
### Resources:

- [levels-of-testing](https://www.javatpoint.com/levels-of-testing).
- [java-unit-testing](https://www.freecodecamp.org/news/java-unit-testing/).
- [jacoco](https://www.eclemma.org/jacoco/trunk/doc/index.html).
- [maven-jacoco-code-coverage-example](https://mkyong.com/maven/maven-jacoco-code-coverage-example/).
- [junit5-docs](https://junit.org/junit5/docs/current/user-guide/)
- [assertj-doc](https://assertj.github.io/doc/).
- [mockito-doc](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)

---
### Contact
Ahmed Sakr | [@Ahmed-Mohmed-Sakr](https://github.com/Ahmed-Mohmed-Sakr)
