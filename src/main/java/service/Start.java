package service;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.context.ApplicationContext;



public class Start {
     public double StartBull()  {
        try {
            Table Tabl = ContextLoader.getCurrentWebApplicationContext().getBean("TABLE",Table.class);
            indicator.Percent Per = (indicator.Percent) ContextLoader.getCurrentWebApplicationContext().getBean("PERCENT");
            Mts Mt = (Mts) ContextLoader.getCurrentWebApplicationContext().getBean("MTS");
            //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
            //Table Tabl = new Table();
            // Percent Per = new Percent();
            // Mts Mt=new Mts();
            //ctx.refresh();
            //Mts Mt = (MTS)ctx.getBean("MTS");
            //Table Tabl = ctx.getBean("TABLE",Table.class);
            
            Tabl.Table01D();
            Tabl.Table01H();
            Per.PercentD01();
            Per.PercentH02();
            double s = Mt.MtsBull();
            return (s);
            //System.out.println("Результат стратегии "+s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return 0.0;
         
     } 
       public double StartBear()  {
        try {
            Table Tabl = ContextLoader.getCurrentWebApplicationContext().getBean("TABLE",Table.class);
            indicator.Percent Per = (indicator.Percent) ContextLoader.getCurrentWebApplicationContext().getBean("PERCENT");
            Mts Mt = (Mts) ContextLoader.getCurrentWebApplicationContext().getBean("MTS");
            //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
            //Table Tabl = new Table();
            // Percent Per = new Percent();
            // Mts Mt=new Mts();
            //ctx.refresh();
            //Mts Mt = (MTS)ctx.getBean("MTS");
            //Table Tabl = ctx.getBean("TABLE",Table.class);
            
            Tabl.Table01D();
            Tabl.Table01H();
            Per.PercentD01();
            Per.PercentH02();
            double s = Mt.MtsBear();
            return (s);
            //System.out.println("Результат стратегии "+s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return 0.0;
         
     } 
      public double StartBoth()  {
        try {
            Table Tabl = ContextLoader.getCurrentWebApplicationContext().getBean("TABLE",Table.class);
            indicator.Percent Per = (indicator.Percent) ContextLoader.getCurrentWebApplicationContext().getBean("PERCENT");
            Mts Mt = (Mts) ContextLoader.getCurrentWebApplicationContext().getBean("MTS");
            //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
            //Table Tabl = new Table();
            // Percent Per = new Percent();
            // Mts Mt=new Mts();
            //ctx.refresh();
            //Mts Mt = (MTS)ctx.getBean("MTS");
            //Table Tabl = ctx.getBean("TABLE",Table.class);
            
            Tabl.Table01D();
            Tabl.Table01H();
            Per.PercentD01();
            Per.PercentH02();
            double s = Mt.MtsBoth();
            return (s);
            //System.out.println("Результат стратегии "+s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return 0.0;
         
     } 
      
     public double StartTestBullMts()  {
        try {
            Table Tabl = ContextLoader.getCurrentWebApplicationContext().getBean("TABLE",Table.class);
            indicator.Percent Per = (indicator.Percent) ContextLoader.getCurrentWebApplicationContext().getBean("PERCENT");
            Mts Mt = (Mts) ContextLoader.getCurrentWebApplicationContext().getBean("MTS");
            Compare Co = (Compare) ContextLoader.getCurrentWebApplicationContext().getBean("COMPARE");
            //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
            //Table Tabl = new Table();
            // Percent Per = new Percent();
            // Mts Mt=new Mts();
            //Compare Co= new Compare();
            //ctx.refresh();
            //Mts Mt = (MTS)ctx.getBean("MTS");
            //Table Tabl = ctx.getBean("TABLE",Table.class);
           
            
            Tabl.Table01D();
            Tabl.Table01H();
            Per.PercentD01();
            Per.PercentH02();
            Mt.MtsStartTest();
            double s=Co.Compare1();
            return (s);
            
            //System.out.println("Результат стратегии "+s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("error " + ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return 0.0;
         
     } 
}
