import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LolTest {

    @Test
    void test() {
        int x = 1;
        Lol lol = new Lol(x);

        System.out.println(lol.getX());

        lol.getX() = 2;
        System.out.println(lol.getX());
    }
}