import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class LeapYearTest {

    @Test
    public void testThat2001IsNotALeapYear() {
        assertThat(new LeapYear().isALeapYear(2001)).isFalse();
    }

    @Test
    public void testThat1996IsALeapYear() {
        assertThat(new LeapYear().isALeapYear(1996)).isTrue();
    }

    @Test
    public void testThat1992IsALeapYear() {
        assertThat(new LeapYear().isALeapYear(1992)).isTrue();
    }

    @Test
    public void testThat1900IsNotALeapYear() {
        assertThat(new LeapYear().isALeapYear(1900)).isFalse();
    }

    @Test
    public void testThat1700IsNotALeapYear() {
        assertThat(new LeapYear().isALeapYear(1700)).isFalse();
    }

    @Test
    public void testThat2000IsALeapYear() {
        assertThat(new LeapYear().isALeapYear(2000)).isTrue();
    }

    @Test
    public void testThat1600IsALeapYear() {
        assertThat(new LeapYear().isALeapYear(1600)).isTrue();
    }
}
