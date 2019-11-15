package it.fpagano.coderetreat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    @DisplayName("rigourous test")
    public void testApp() {
        String html = """
            <html>
                <body>
                </body?
            </html>
        """;
        assertTrue(true);
        assertThat(true, is(true));
    }
}
