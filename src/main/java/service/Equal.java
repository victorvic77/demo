package service;


public class Equal {
                // Метод возвращает порядковый номер дня из часовых данных-входные данные дни из дневных данных
		public int Equal01(int x)
		{
			int a;
			for (a=0;a<Table.em;a++)//Ищем порядковый номер дня из часовых данных
			{
				if (Table.DA[x][0]<=Table.HO[a][0])
				break;
			}//Нашли порядковый номер дня

			return a;
		}

		// Метод возвращает порядковый номер дня из дневных данных-входные данные дни из часовых данных
		public int Equal02(int x)
		{
			int a;
			for (a=0;a<Table.ed;a++)//Ищем порядковый номер дня из часовых данных
			{
				if (Table.HO[x][0]<=Table.DA[a][0])
					break;
			}//Нашли порядковый номер дня

			return a;
		}


	}