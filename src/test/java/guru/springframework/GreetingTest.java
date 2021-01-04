package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    void setUp() {
        System.out.println("----Before test----");
        greeting = new Greeting();
    }

    @AfterEach
    void tearDown() {
        System.out.println("----After Test----");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All Tests");
    }

    @Test
    void helloWorld() {

        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {

        System.out.println(greeting.helloWorld("Sean"));
    }
}
