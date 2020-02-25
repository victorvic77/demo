package service;

import java.util.*;


public class Mts {
  
	
public double MtsBull()
{
int a,b,c,d,e,f,j;
double a1,b1,c1,d1,e1,f1;
			
ArrayList SigDay = new ArrayList();
ArrayList SigTime = new ArrayList();
ArrayList OpenDay=new ArrayList();
ArrayList OpenTime=new ArrayList();
ArrayList CloseDay=new ArrayList();
ArrayList CloseTime=new ArrayList();
ArrayList PriseOpen=new ArrayList();
ArrayList TakeProfit=new ArrayList();
ArrayList StopLos=new ArrayList();
ArrayList ClosePrice=new ArrayList();
			
f1=0.0;
a=1839;//Порядковый номер первого дня в году 
Exchange Exc = new Exchange();
Equal Equ=new Equal();

for (int i=a;i<Table.ed;i++)//ПЕРВЫЙ МОНИТОР
    {
    c=0;
    b=Exc.TimtoPer(i);
if (indicator.Percent.PERCENTD[b]<-90 && Table.DA[i][0]>20050000 && Table.DA[i][0]<20060000 )
//Нашли сигнал ПЕРВОГО МОНИТОРА порядковый номер ДНЕВНОГО PERCENTA=b
//порядковый номер ДНЯ из ДНЕВНЫХ ДАННЫХ=i
{
	SigDay.add(Table.DA[i][0]);
	d=Equ.Equal01(i+1);
	//порядковый номер ДНЯ из ЧАСОВЫХ ДАННЫХ с которого начинается работа
	//ВТОРОГО МОНИТОРА
	d=Exc.TimtoPer(d);
	//порядковый номер Percenta из ЧАСОВЫХ ДАННЫХ с которого начинается работа
	//ВТОРОГО МОНИТОРА
					
            for(int i1=d;i1<Table.em;i1++)//ВТОРОЙ МОНИТОР
		{
                    if (indicator.Percent.PERCENTM[i1]<-90)//СИГНАЛ ВТОРОГО МОНИТОРА  
			{
                            e=Exc.PertoTim(i1);
                            SigTime.add(Table.HO[e][1]);
                            //Нашли сигнал ВТОРОГО  МОНИТОРА порядковый номер ЧАСОВОГО PERCENTA=i1
                            //порядковый номер ЧАСА из ЧАСОВЫХ ДАННЫХ=e
                            f=e+1;//порядковый номер клоза ЧАСА открытия КОРОТКОЙ ПОЗИЦИИ
                            OpenTime.add(Table.HO[f][1]);
                            OpenDay.add(Table.HO[f][0]);
                            a1=Table.HO[f][5];//Значение ОТКРЫТИЯ
                            b1=a1-0.004;//STOPLOSS
                            c1=a1+0.001;//TAKEPROFIT
                            PriseOpen.add(a1);
                            TakeProfit.add(c1);
                            StopLos.add(b1);
                            j=f+1;//порядковый номер ЧАСА с которого начинаем искать ЗАКРЫТИЕ
							
				for(int i2=j;i2<Table.em;i2++)//ИЩЕМ ЗАКРЫТИЕ
                                    {
					if (b1>Table.HO[i2][4])//вышли по STOPLOSSY 
                                            {			
                                            i=Equ.Equal02(i2);
                                            c=1;
                                            d1=Table.HO[i2][4];
                                            ClosePrice.add(-d1);
                                            CloseTime.add(Table.HO[i2][1]);
                                            CloseDay.add(Table.HO[i2][0]);
                                            e1=Math.abs(d1-a1);
                                            f1=f1-e1;

                                            break;
                                            }

					if (c1<Table.HO[i2][3])//вышли по TAKEPROFITY
                                            {
						i=Equ.Equal02(i2);
						c=1;
						d1=Table.HO[i2][3];
						ClosePrice.add(d1);
						CloseTime.add(Table.HO[i2][1]);
						CloseDay.add(Table.HO[i2][0]);
						e1=Math.abs(d1-a1);
						f1=f1+e1;

						break;
						}

					}

				if (c==1)
				break;
                                        }					
                                    }

				}

			}//Закрываем цикл Первого монитора
            return (f1);
		}//Закрываем метод

public double MtsBear()

		{
			int a,b,c,d,e,f,j;
			double a1,b1,c1,d1,e1,f1;
			
			ArrayList SigDay = new ArrayList();
			ArrayList SigTime = new ArrayList();
			ArrayList OpenDay=new ArrayList();
			ArrayList OpenTime=new ArrayList();
			ArrayList CloseDay=new ArrayList();
			ArrayList CloseTime=new ArrayList();
			ArrayList PriseOpen=new ArrayList();
			ArrayList TakeProfit=new ArrayList();
			ArrayList StopLos=new ArrayList();
			ArrayList ClosePrice=new ArrayList();
			
			f1=0.0;
			a=1839;//Порядковый номер первого дня в году 
			Exchange Exc = new Exchange();
			Equal Equ=new Equal();

			for (int i=a;i<Table.ed;i++)//ПЕРВЫЙ МОНИТОР
			{
				c=0;
				b=Exc.TimtoPer(i);
	
                                if (indicator.Percent.PERCENTD[b]>-10 && Table.DA[i][0]>20050000 && Table.DA[i][0]<20060000)
					//Нашли сигнал ПЕРВОГО МОНИТОРА порядковый номер ДНЕВНОГО PERCENTA=b
					//порядковый номер ДНЯ из ДНЕВНЫХ ДАННЫХ=i
				{
					SigDay.add(Table.DA[i][0]);
					d=Equ.Equal01(i+1);
					//порядковый номер ДНЯ из ЧАСОВЫХ ДАННЫХ с которого начинается работа
					//ВТОРОГО МОНИТОРА
					d=Exc.TimtoPer(d);
					//порядковый номер Percenta из ЧАСОВЫХ ДАННЫХ с которого начинается работа
					//ВТОРОГО МОНИТОРА
					
					for(int i1=d;i1<Table.em;i1++)//ВТОРОЙ МОНИТОР
					{
						if (indicator.Percent.PERCENTM[i1]>-10)//СИГНАЛ ВТОРОГО МОНИТОРА  
						{
							e=Exc.PertoTim(i1);
							SigTime.add(Table.HO[e][1]);
							//Нашли сигнал ВТОРОГО  МОНИТОРА порядковый номер ЧАСОВОГО PERCENTA=i1
							//порядковый номер ЧАСА из ЧАСОВЫХ ДАННЫХ=e
							f=e+1;//порядковый номер клоза ЧАСА открытия КОРОТКОЙ ПОЗИЦИИ
							OpenTime.add(Table.HO[f][1]);
							OpenDay.add(Table.HO[f][0]);
							a1=Table.HO[f][5];//Значение ОТКРЫТИЯ
							b1=a1+0.006;//STOPLOSS
							c1=a1-0.003;//TAKEPROFIT
							PriseOpen.add(a1);
							TakeProfit.add(c1);
							StopLos.add(b1);
							j=f+1;//порядковый номер ЧАСА с которого начинаем искать ЗАКРЫТИЕ
							
							for(int i2=j;i2<Table.em;i2++)//ИЩЕМ ЗАКРЫТИЕ
							{
								if (b1<Table.HO[i2][3])//вышли по STOPLOSSY 
								{
									
									i=Equ.Equal02(i2);
									c=1;
									d1=Table.HO[i2][3];
									ClosePrice.add(-d1);
									CloseTime.add(Table.HO[i2][1]);
									CloseDay.add(Table.HO[i2][0]);
									e1=Math.abs(d1-a1);
									f1=f1-e1;

									break;
								}

								if (c1>Table.HO[i2][4])//вышли по TAKEPROFITY
								{
									i=Equ.Equal02(i2);
									c=1;
									d1=Table.HO[i2][4];
									ClosePrice.add(d1);
									CloseTime.add(Table.HO[i2][1]);
									CloseDay.add(Table.HO[i2][0]);
									e1=Math.abs(d1-a1);
									f1=f1+e1;

									break;
								}

							}

							if (c==1)
								break;
						}					
					}

				}

			}//Закрываем цикл Первого монитора
		   return (f1);
                }//Закрываем метод

public double MtsBoth()

{
			int a,b,c,d,e,f,j,p;
			double a1,b1,c1,d1,e1,f1;
			
			ArrayList SigDay = new ArrayList();
			ArrayList SigTime = new ArrayList();
			ArrayList OpenDay=new ArrayList();
			ArrayList OpenTime=new ArrayList();
			ArrayList CloseDay=new ArrayList();
			ArrayList CloseTime=new ArrayList();
			ArrayList PriseOpen=new ArrayList();
			ArrayList TakeProfit=new ArrayList();
			ArrayList StopLos=new ArrayList();
			ArrayList ClosePrice=new ArrayList();
			
			f1=0.0;
			a=1839;//Порядковый номер первого дня в году 
			Exchange Exc = new Exchange();
			Equal Equ=new Equal();

			for (int i=a;i<Table.ed;i++)//ПЕРВЫЙ МОНИТОР
			{
				c=0;//флажок для закрытия второго монитора
				p=0;//флажок блокирущий заход в короткии после закрытия длинной
				b=Exc.TimtoPer(i);
				//Длинные
				if (indicator.Percent.PERCENTD[b]<-90 && Table.DA[i][0]>20050000 && Table.DA[i][0]<20060000 )
					//Нашли сигнал ПЕРВОГО МОНИТОРА порядковый номер ДНЕВНОГО PERCENTA=b
					//порядковый номер ДНЯ из ДНЕВНЫХ ДАННЫХ=i
				{
					SigDay.add(+Table.DA[i][0]);
					d=Equ.Equal01(i+1);
					//порядковый номер ДНЯ из ЧАСОВЫХ ДАННЫХ с которого начинается работа
					//ВТОРОГО МОНИТОРА
					d=Exc.TimtoPer(d);
					//порядковый номер Percenta из ЧАСОВЫХ ДАННЫХ с которого начинается работа
					//ВТОРОГО МОНИТОРА
					
					for(int i1=d;i1<Table.em;i1++)//ВТОРОЙ МОНИТОР
					{
						if (indicator.Percent.PERCENTM[i1]<-90)//СИГНАЛ ВТОРОГО МОНИТОРА  
						{
							e=Exc.PertoTim(i1);
							SigTime.add(+Table.HO[e][1]);
							//Нашли сигнал ВТОРОГО  МОНИТОРА порядковый номер ЧАСОВОГО PERCENTA=i1
							//порядковый номер ЧАСА из ЧАСОВЫХ ДАННЫХ=e
							f=e+1;//порядковый номер клоза ЧАСА открытия КОРОТКОЙ ПОЗИЦИИ
							OpenTime.add(+Table.HO[f][1]);
							OpenDay.add(+Table.HO[f][0]);
							a1=Table.HO[f][5];//Значение ОТКРЫТИЯ
							b1=a1-0.006;//STOPLOSS
							c1=a1+0.003;//TAKEPROFIT
							PriseOpen.add(a1);
							TakeProfit.add(c1);
							StopLos.add(b1);
							j=f+1;//порядковый номер ЧАСА с которого начинаем искать ЗАКРЫТИЕ
							
							for(int i2=j;i2<Table.em;i2++)//ИЩЕМ ЗАКРЫТИЕ
							{
								if (b1>Table.HO[i2][4])//вышли по STOPLOSSY 
								{
									
									i=Equ.Equal02(i2);
									c=1;
									p=1;
									d1=Table.HO[i2][4];
									ClosePrice.add(-d1);
									CloseTime.add(Table.HO[i2][1]);
									CloseDay.add(Table.HO[i2][0]);
									e1=Math.abs(d1-a1);
									f1=f1-e1;

									break;
								}

								if (c1<Table.HO[i2][3])//вышли по TAKEPROFITY
								{
									i=Equ.Equal02(i2);
									c=1;
									p=1;
									d1=Table.HO[i2][3];
									ClosePrice.add(d1);
									CloseTime.add(Table.HO[i2][1]);
									CloseDay.add(Table.HO[i2][0]);
									e1=Math.abs(d1-a1);
									f1=f1+e1;
									
									break;
								}

							}

							if (c==1)
								break;
						}					
					}

				}

				
				//Короткие	
				if (indicator.Percent.PERCENTD[b]>-10 && Table.DA[i][0]>20050000 && Table.DA[i][0]<20060000 && p==0)
						//Нашли сигнал ПЕРВОГО МОНИТОРА порядковый номер ДНЕВНОГО PERCENTA=b
						//порядковый номер ДНЯ из ДНЕВНЫХ ДАННЫХ=i
					{
						SigDay.add(-Table.DA[i][0]);
						d=Equ.Equal01(i+1);
						//порядковый номер ДНЯ из ЧАСОВЫХ ДАННЫХ с которого начинается работа
						//ВТОРОГО МОНИТОРА
						d=Exc.TimtoPer(d);
						//порядковый номер Percenta из ЧАСОВЫХ ДАННЫХ с которого начинается работа
						//ВТОРОГО МОНИТОРА
					
						for(int i1=d;i1<Table.em;i1++)//ВТОРОЙ МОНИТОР
						{
							if (indicator.Percent.PERCENTM[i1]>-10)//СИГНАЛ ВТОРОГО МОНИТОРА  
							{
								e=Exc.PertoTim(i1);
								SigTime.add(-Table.HO[e][1]);
								//Нашли сигнал ВТОРОГО  МОНИТОРА порядковый номер ЧАСОВОГО PERCENTA=i1
								//порядковый номер ЧАСА из ЧАСОВЫХ ДАННЫХ=e
								f=e+1;//порядковый номер клоза ЧАСА открытия КОРОТКОЙ ПОЗИЦИИ
								OpenTime.add(-Table.HO[f][1]);
								OpenDay.add(-Table.HO[f][0]);
								a1=Table.HO[f][5];//Значение ОТКРЫТИЯ
								b1=a1+0.006;//STOPLOSS
								c1=a1-0.003;//TAKEPROFIT
								PriseOpen.add(a1);
								TakeProfit.add(c1);
								StopLos.add(b1);
								j=f+1;//порядковый номер ЧАСА с которого начинаем искать ЗАКРЫТИЕ
							
								for(int i2=j;i2<Table.em;i2++)//ИЩЕМ ЗАКРЫТИЕ
								{
									if (b1<Table.HO[i2][3])//вышли по STOPLOSSY 
									{
									
										i=Equ.Equal02(i2);
										c=1;
										d1=Table.HO[i2][3];
										ClosePrice.add(-d1);
										CloseTime.add(Table.HO[i2][1]);
										CloseDay.add(Table.HO[i2][0]);
										e1=Math.abs(d1-a1);
										f1=f1-e1;

										break;
									}

									if (c1>Table.HO[i2][4])//вышли по TAKEPROFITY
									{
										i=Equ.Equal02(i2);
										c=1;
										d1=Table.HO[i2][4];
										ClosePrice.add(d1);
										CloseTime.add(Table.HO[i2][1]);
										CloseDay.add(Table.HO[i2][0]);
										e1=Math.abs(d1-a1);
										f1=f1+e1;

										break;
									}

								}

								if (c==1)
									break;
							}
						
						

                                                }
                                }

			}//Закрываем цикл Первого монитора
                        return (f1);
		}//Закрываем метод



                public static ArrayList Inco;
		public static ArrayList StopLos1;
		public static ArrayList TakeProfit1;

		public void MtsStartTest()
		{
			
                        int a,b,c,d,e,f,j;
			double a1,b1,c1,d1,e1,f1;
			
			Inco=new ArrayList();
			StopLos1=new ArrayList();
			TakeProfit1=new ArrayList();
			
			f1=0.0;
			a=1839;//Порядковый номер первого дня в году 
			Exchange Exc = new Exchange();
			Equal Equ=new Equal();

			for (double v=0.001;v<0.01;v=v+0.001)
			{
				for (double v1=0.001;v1<0.01;v1=v1+0.001)
				{

					for (int i=a;i<Table.ed;i++)//ПЕРВЫЙ МОНИТОР
					{
						c=0;
						b=Exc.TimtoPer(i);
						if (indicator.Percent.PERCENTD[b]<-90 && Table.DA[i][0]>20050000 && Table.DA[i][0]<20060000 )
							//Нашли сигнал ПЕРВОГО МОНИТОРА порядковый номер ДНЕВНОГО PERCENTA=b
							//порядковый номер ДНЯ из ДНЕВНЫХ ДАННЫХ=i
						{

							d=Equ.Equal01(i+1);
							//порядковый номер ДНЯ из ЧАСОВЫХ ДАННЫХ с которого начинается работа
							//ВТОРОГО МОНИТОРА
							d=Exc.TimtoPer(d);
							//порядковый номер Percenta из ЧАСОВЫХ ДАННЫХ с которого начинается работа
							//ВТОРОГО МОНИТОРА
					
							for(int i1=d;i1<Table.em;i1++)//ВТОРОЙ МОНИТОР
							{
								if (indicator.Percent.PERCENTM[i1]<-90)//СИГНАЛ ВТОРОГО МОНИТОРА  
								{
									e=Exc.PertoTim(i1);
									//Нашли сигнал ВТОРОГО  МОНИТОРА порядковый номер ЧАСОВОГО PERCENTA=i1
									//порядковый номер ЧАСА из ЧАСОВЫХ ДАННЫХ=e
									f=e+1;//порядковый номер клоза ЧАСА открытия КОРОТКОЙ ПОЗИЦИИ
									a1=Table.HO[f][5];//Значение ОТКРЫТИЯ
									b1=a1-v1;//STOPLOSS
									c1=a1+v;//TAKEPROFIT
									j=f+1;//порядковый номер ЧАСА с которого начинаем искать ЗАКРЫТИЕ
							
									for(int i2=j;i2<Table.em;i2++)//ИЩЕМ ЗАКРЫТИЕ
									{
										if (b1>Table.HO[i2][4])//вышли по STOPLOSSY 
										{
									
											i=Equ.Equal02(i2);
											c=1;
											d1=Table.HO[i2][4];
											e1=Math.abs(d1-a1);
											f1=f1-e1;

											break;
										}

										if (c1<Table.HO[i2][3])//вышли по TAKEPROFITY
										{
											i=Equ.Equal02(i2);
											c=1;
											d1=Table.HO[i2][3];
											e1=Math.abs(d1-a1);
											f1=f1+e1;

											break;
										}

									}

									if (c==1)
										break;
								}					
							}

						}

					}//Закрываем цикл Первого монитора
					Inco.add(f1);
					TakeProfit1.add(v);
					StopLos1.add(v1);
					f1=0.0;
				}
			}
                    
		}//Закрываем метод
	}//Закрываем класс

				
    



