import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: 8thlight
 * Date: 8/15/13
 * Time: 8:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
	interface SmallList<T>{
		public void add(T toAdd);
		public T nth(Integer index);
	}

	static class FakeList<T extends Comparable<T>> implements SmallList<T>{

		public void add(T toAdd) {
		}

		public T nth(Integer index){
			return null;
		}

		public FakeList<T> sort(){
			return null;
		}
	}

	public static void main(){
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(22);
		System.out.println(integers);
	}

//	static abstract class Function<D,R>{
//		public abstract R execute(D input);
//	}
//
//	public <D,R,T> Function<D,T> compose(final Function<D,R> first, final Function<R,T> second){
//		return null;
//	}


}
