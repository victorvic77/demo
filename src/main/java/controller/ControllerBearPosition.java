package controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import service.Start;
import org.springframework.web.context.ContextLoader;
import org.springframework.context.ApplicationContext;


public class ControllerBearPosition extends AbstractController {
    
   
    
    public ControllerBearPosition() {
    }
    
    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
          //Start St = new Start();
       Start St = (Start) ContextLoader.getCurrentWebApplicationContext().getBean("START");
       //ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
       //GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
       //ctx.refresh();
       //ctx.load ("classpath*:applicationContext.xml");
       // Start St = (Start) ctx.getBean("START");
       double recentRants = St.StartBear();
       return new ModelAndView("starttest", "rants", recentRants); 
    }
}
