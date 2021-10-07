package exercice;

import static org.junit.Assert.assertEquals;

import exercice.*;
import org.junit.Test;

public class DiviseAndReplaceTest {
	@Test
	public void shouldReturn1WhenNumberisEqualTo1() {
		assertEquals(DiviseAndReplace.compute("1"),"1");
	}
	@Test
	public void shouldReturn2WhenNumberisEqualTo2() {
		assertEquals(DiviseAndReplace.compute("2"),"2");
	}
	@Test
	public void shouldReturnTotoTotoWhenNumberisEqualTo3() {
		assertEquals(DiviseAndReplace.compute("3"),"TotoToto");
	}
	@Test
	public void shouldReturn4WhenNumberisEqualTo4() {
		assertEquals(DiviseAndReplace.compute("4"),"4");
	}
	@Test
	public void shouldReturnTutuTutuWhenNumberisEqualTo5() {
		assertEquals(DiviseAndReplace.compute("5"),"TutuTutu");
	}
	@Test
	public void shouldReturnTotoWhenNumberisEqualTo6() {
		assertEquals(DiviseAndReplace.compute("6"),"Toto");
	}
	@Test
	public void shouldReturnTotoWhenNumberisEqualTo13() {
		assertEquals(DiviseAndReplace.compute("13"),"Toto");
	}
	@Test
	public void shouldReturnTotoTutuTutuWhenNumberisEqualTo15() {
		assertEquals(DiviseAndReplace.compute("15"),"TotoTutuTutu");
	}
	@Test
	public void shouldReturn1star1WhenNumberisEqualTo101() {
		assertEquals(DiviseAndReplace.compute("101"),"1*1");
	}
	@Test
	public void shouldReturnTotoTotostarTotoWhenNumberisEqualTo303() {
		assertEquals(DiviseAndReplace.compute("303"),"TotoToto*Toto");
	}
	@Test
	public void shouldReturnTotoTutuTitistarTutustar1WhenNumberisEqualTo105() {
		assertEquals(DiviseAndReplace.compute("105"),"TotoTutuTiti*Tutu");
	}
	@Test
	public void shouldReturnTotoTitistarstarWhenNumberisEqualTo10101() {
		assertEquals(DiviseAndReplace.compute("10101"),"TotoTiti**");
	}
	
}
