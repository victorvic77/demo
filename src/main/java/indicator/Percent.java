package indicator;




public  class Percent {
    
    public static double [] PERCENTD;//Массив с ДНЕВНЫМИ ПЕРСЕНТАМИ
    public static double [] PERCENTM;//Массив с ЧАСОВЫМИ ПЕРСЕНТАМИ
    public static int z;//Количество персентов (дневных)
    public static int q;//Количество персентов (часовых)
   
    // Метод заполняет массив значений дневной Percent(5)
    public void PercentD01()//PERCENT
    {
        double z1,z2;
        z=service.Table.ed-4;
        PERCENTD=new double[z];
	for (int i=4;i<service.Table.ed;i++)
	{
            z1=service.Table.DA[i][2];
            z2=service.Table.DA[i][3];
		for (int o=i-4;o<=i;o++)
		{
                    if (service.Table.DA[o][2]>z1)
			z1=service.Table.DA[o][2];
                    if (service.Table.DA[o][3]<z2)
			z2=service.Table.DA[o][3];
				}

		PERCENTD[i-4]=-100*((z1-service.Table.DA[i][4])/(z1-z2));
					
		}
			
		}

		
    //Метод заполняет массив значений часовой Percent(5)
		
    public  void PercentH02()//PERCENT
	{

            double z1,z2;

		q=service.Table.em-4;

		PERCENTM=new double[q];
		for (int i=4;i<service.Table.em;i++)
		{
                    z1=service.Table.HO[i][3];
                    z2=service.Table.HO[i][4];
                    for (int o=i-4;o<=i;o++)
                    {
			if (service.Table.HO[o][3]>z1)
			z1=service.Table.HO[o][3];
			if (service.Table.HO[o][4]<z2)
			z2=service.Table.HO[o][4];
				}

			PERCENTM[i-4]=-100*((z1-service.Table.HO[i][5])/(z1-z2));
			}
		}

	}

