package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts
{
	@Override
	public double fOfXY(int x, int y)
	{
		Complex a = new Complex(x,y);
		return a.norm() * a.norm();
	}
	
	
	@Override
	public String getName()
	{
		return "Complex Squared Norm";
	}
}
