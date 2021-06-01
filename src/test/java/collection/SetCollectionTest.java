package collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SetCollectionTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    int getSize(){
        return numbers.size();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void isNumbers_ShouldReturnTrueForNullOrBlankStrings(int number) {
        assertTrue(number > 0 && number < 4);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
    void isTrueFalse_ShouldGenerateTheExpectedNumValue(int input, boolean result){
        assertThat(numbers.contains(input)).isEqualTo(result);
    }
}
