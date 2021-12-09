import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void EightPlusTwoEqualsTen() {
        Main main = new Main(8, 2);
        assertEquals(10, main.adding());
    }
    @Test
    public void MinusSevenPlusFourEqualsMinusThree() {
        Main main = new Main(-7, 4);
        assertEquals(-3, main.adding());
    }
    @Test
    public void MinusFivePlusMinusOneEqualsMinusSix() {
        Main main = new Main(-5, -1);
        assertEquals(-6, main.adding());
    }
    @Test
    public void SixPlusZeroEqualSix() {
        Main main = new Main(6, 0);
        assertEquals(6, main.adding());
    }
    ///////////
    @Test
    public void TenMinusThreeEqualSeven() {
        Main main = new Main(10, 3);
        assertEquals(7, main.subtraction());
    }
    @Test
    public void MinusNineMinusMinusTwoEqualMinusEleven() {
        Main main = new Main(-9, -2);
        assertEquals(-7, main.subtraction());
    }
    @Test
    public void MinusTwelveMinusZeroEqual() {
        Main main = new Main(-12, 0);
        assertEquals(-12, main.subtraction());
    }
    @Test
    public void EightMinusMinusOneEqualsNine() {
        Main main = new Main(8, -1);
        assertEquals(9, main.subtraction());
    }
    ///////
    @Test
    public void ThreeMultipliedByThreeEqualsNine() {
        Main main = new Main(3, 3);
        assertEquals(9, main.multiplication());
    }
    @Test
    public void ThreeMultipliedByMinusFiveEqualsMinusFifteen() {
        Main main = new Main(3, -5);
        assertEquals(-15, main.multiplication());
    }
    @Test
    public void MinusFourMultipliedByMinusTwoEqualsEight() {
        Main main = new Main(-4, -2);
        assertEquals(8, main.multiplication());
    }
    @Test
    public void NineMultipliedByZeroEqualsZero() {
        Main main = new Main(9, 0);
        assertEquals(0, main.multiplication());
    }
    //////////////////////
            @Test
            public void TwelveDividedByThreeEqualsFour () {
            Main main = new Main(12, 3);
            assertEquals(4, main.division());
        }
            @Test
            public void TwelveDividedByZeroEqualsMinusTwelve () {
            Main main = new Main(12, -1);
            assertEquals(-12, main.division());
        }
            @Test
            public void MinusTenDividedByMinusTwoEqualsFive () {
            Main main = new Main(-10, -2);
            assertEquals(5, main.division());
        }
            @Test
            public void TwoDividedByTwoEqualsOne () {
            Main main = new Main(2, 2);
            assertEquals(1, main.division());
        }
            @Test
            public void ZeroDividedByThreeEqualsZero () {
            Main main = new Main(0, 3);
            assertEquals(0, main.division());
        }
            @Test
            public void ThreeDividedByZeroEqualsZero () {
            Main main = new Main(3, 0);
            assertEquals(0, main.division());
        }


    ////////////
    @Test
    public void SixToThePowerOfThreeEqualsTwoHundredSixteen() {
        Main main = new Main(6, 3);
        assertEquals(216, main.exponentiation());
    }
    @Test
    public void MinusTwoToThePowerOfFourEqualsSixteen() {
        Main main = new Main(-2, 4);
        assertEquals(16, main.exponentiation());
    }
    @Test
    public void MinusTwoToThePowerOfThreeEqualsMinusEight() {
        Main main = new Main(-2, 3);
        assertEquals(-8, main.exponentiation());
    }
    @Test
    public void FiveToThePowerOfZeroEqualsZero() {
        Main main = new Main(5, 0);
        assertEquals(1, main.exponentiation());
    }
    @Test
    public void MinusTwoToThePowerOfMinusOneEqualsMinusZeroPointFive() {
        Main main = new Main(-2, -1);
        assertEquals(-0.5, main.exponentiation());
    }
    ////////
    @Test
    public void SquareRootOfOneHundred() {
        Main main = new Main(100);
        assertEquals(10, main.square());
    }



}