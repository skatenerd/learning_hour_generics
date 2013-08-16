import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: 8thlight
 * Date: 8/15/13
 * Time: 8:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class DemoTest {
	@Test
	public void demoTest(){
		Demo demo = new Demo();
		assertEquals(demo, demo);
		Demo.FakeList fl = new Demo.FakeList();
	}

	@Test
	public void addAndNth(){

	}

	@Test
	public void sorts(){
		Demo.FakeList fl = new Demo.FakeList<Integer>();
		fl.add(2);
		fl.add(5);
		fl.add(1);
		fl.add(4);
		fl.add(99);
		fl.add(0);

		Demo.FakeList sorted = fl.sort();
		assertEquals(sorted.nth(0), 0);
		assertEquals(sorted.nth(1), 1);
		assertEquals(sorted.nth(2), 2);
		assertEquals(sorted.nth(3), 4);
		assertEquals(sorted.nth(4), 5);
		assertEquals(sorted.nth(5), 99);
	}

//	@Test
//	public void composes(){
//		Demo.Function<Integer,Double> halve = new Demo.Function<Integer, Double>() {
//			public Double execute(Integer input) {
//				return input / 2.0;
//			}
//		};
//
//		Demo.Function<Integer, Integer> increment = new Demo.Function<Integer, Integer>() {
//			@Override
//			public Integer execute(Integer input) {
//				return input + 1;
//			}
//		};
//
//		Demo.Function<Integer, Double> IncThenHalve = new Demo().compose(increment, halve);
//		assertEquals(1.5, IncThenHalve.execute(2), 0.01);
//	}
}
