package abstraction;

public class Tree extends ISort implements ITree
{
	@Override
	public void getLeafNodes() {
		System.out.println("Will return leaf nodes");
	}
}
