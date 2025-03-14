import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Test
{
    @DisplayName("Тест на проверку notnull значения")
    @ParameterizedTest(name = "Тест номер {index} с данными ''{0}''")
    @ValueSource(strings = {"one","two","three"})
    void TestNotTull(String string){
        assertNotNull(string);
    }

    @ParameterizedTest(name = "{index} => name=''{0}''")
    @MethodSource("numberToMonth")
    void monthNames(String name) {
        assertTrue(name.contains("b"));
    }

    private static Stream<Arguments> numberToMonth() {
        return Stream.of(
                arguments("Januaryb"),
                arguments("February"),
                arguments("December")
        );
    }
    enum Protocol {
        HTTP_1_0, HTTP_1_1, HTTP_2
    }
    @DisplayName("Test 1")
    @ParameterizedTest
    @EnumSource(Protocol.class)
    void postRequestWithDifferentProtocols(Protocol protocol) {
        assertTrue(protocol.toString().contains("T"));
    }
    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5"
    })
    void sum(int a, int b, int sum) {
        assertEquals(sum, a + b);
    }


}
