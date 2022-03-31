package gyak8;

import gyak8.Gyak8;
public class HR_dep {
	
	Gyak8[] prisms;
	
	public HR_dep(int prismCount)
	{
		prisms = new Gyak8[prismCount];
	}
	
	public void setPrism(int index, Gyak8 prism)
	{
		prisms[index] = prism;
	}
	public int getSize()
	{
	return prisms.length;
	}
	
	public Gyak8 getPrism(int index)
	{
		return prisms[index];
	}
	
	public int getPrismInsatnceCount()
	{
	int cnt = 0;
	for(int i = 0 ; i < prisms.length; i++)
	{
	if(prisms[i] != null)
	{
		cnt++;
	}
	}
	return cnt;
	}
	
	public double getAvrgVolume()
	{
	int cnt = 0;
	double vol = 0;
	for(int i = 0 ; i < prisms.length; i++)
	{
		cnt++;
		vol += prisms[i].getVolume();
	}
	return vol / cnt;
	}

}
