package app;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {
// 1. Проверяем, действительно ли метод выдаёт ошибку при отриц.значении.
    // 2. Проверим, правильный ли размер массива.
    // 3. Проверим работу метода при граничных значениях (0).
    // 4. Проверим, действительно ли соседние элементы отличаются на 1.
    // 5. Точечно проверим внутренние значения в массиве.
    // 6. Проверим, что метод возвращает не null.

    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        Main.getArray(-1);

    }

    @Test
    public void checkIfArraySizeIsCorrect() {
        int[] result =
                Main.getArray(7);
        int expectedSize = 7;
        int actualSize = result.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void checkInternalValues() {
        int[] result = Main.getArray(4);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void checkSizeZero() {
        int[] result = Main.getArray(0);
        int[] expected = {};
        Assert.assertArrayEquals(expected, result);
    }


    @Test
    public void checkIfNeighborsDifferByOne() {
        int[] result = Main.getArray(5);
        for (int i = 0; i < result.length - 1; i++) {
            Assert.assertEquals(result[i] + 1, result[i + 1]);
        }
    }
    @Test
    public void checkIfNotNull() {
        int[] result = Main.getArray(5);
        Assert.assertNotNull(result);
    }

}
