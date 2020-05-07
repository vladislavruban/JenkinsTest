import org.testng.annotations.Test;

public class ClassTest {
    @Test
    public void methodTest1() {
        assert (true == true);
        System.out.println("HEEEHEEEHEEEHEEEHEEEHEEEEEE!!!");
    }

    @Test
    public void methodTest2() {
        assert (false == false);
        System.out.println("EEEEEEEEEHHHAAAAAAAAAAAAAAA!!!");
    }

    @Test
    public void methodTest3() {
        assert (0 < 1);
        System.out.println("WOOOOOOOOOOOOoOOOOOOOOOOOOO!!!");
    }
}
