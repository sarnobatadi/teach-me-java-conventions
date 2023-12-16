package powerpackage;

import org.junit.Test;

public class powertest {
    @Test
    public void OnePowerOneIsOne() {
        assert powerfinder.OF(1,1) == 1;
    }

    @Test
    public void TwoPowerOneIsTwo() {

        assert powerfinder.OF(2,1) == 2;

    }

    @Test
    public void TwoPowerTwoIsFour() {

        assert powerfinder.OF(2, 2) == 4;
    }

    @Test
    public void ThreePowerTwoIsNine() {

        assert powerfinder.OF(3, 2) == 3*3;
    }
}
