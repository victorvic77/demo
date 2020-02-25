package service;

//Конвертор порядковых номеров Percenta и Времени
public class Exchange {
     // Переводит порядковый номер Percenta в порядковый номер часа   
        public int PertoTim(int x)
		{
			int y=x+4;
			return y;
		}

		
		
    // Переводит порядковый номер часа в порядковый номер Percenta
		
	public int TimtoPer(int x)
		{
			int y=x-4;
			return y;
		}					
	}