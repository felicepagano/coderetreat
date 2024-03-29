/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package it.fpagano.coderetreat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    @DisplayName("first test")
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    @DisplayName("assert that hamcrest is available")
    void assertThatHamcrestIsAvailable() {
        assertThat(true, is(true));
    }
}
