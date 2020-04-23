import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("Тест пройден. getLocalNumber возвращает верное значение 14");
        } else {
            System.out.println("Ошибка! getLocalNumber должен возвращать 14, а возвращает " + a);
        }
    }

    @Test
    public void testGetClassNumber()
    {
        int check = this.getClassNumber();

        if (check > 45)
        {
            System.out.println("Тест пройден. getClassNumber возвращает число > 45");
        }
        else {
            System.out.println("Ошибка! getClassNumber должен возвращать число > 45, а возвращает " + check);
        }
    }

    @Test
    public void testGetClassString()
    {
        String check_hello = this.getClassString();
        int searchString1 = check_hello.indexOf("hello");
        int searchString2 = check_hello.indexOf("Hello");

        if ((searchString1 != -1) || (searchString2 != -1))
        {
            System.out.println("Тест пройден. getClassString содержит Hello или hello");
        } else {
            Assert.fail("Тест НЕ пройден. getClassString НЕ содержит Hello или hello");
        }
    }
}

