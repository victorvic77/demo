package service;

public class Compare {
    
    public double Compare1()
		{
			double a,c,d;
			double b;
                        a=(Double)Mts.Inco.get(0);
			c=(Double)Mts.TakeProfit1.get(0);
			d=(Double)Mts.StopLos1.get(0);
			b=0.0;
                        //for (Object I:Mts.Inco)
                        //{
                           // if (I.toString())
                        //}
                       //}
			for (int i=1;i<Mts.Inco.size();i++)
			{
				if ((Double)Mts.Inco.get(i)>b)
				{
					a=(Double)Mts.Inco.get(i);
					b=a;
					c=(Double)Mts.TakeProfit1.get(i);
					d=(Double)Mts.StopLos1.get(i);
				}
			}
                  return (a);
		}
               
	}

