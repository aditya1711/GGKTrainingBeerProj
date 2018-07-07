
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.*;

@HandlesTypes({})
public class ServletInitializer implements ServletContainerInitializer{
	
	public void onStartup(Set<Class<?>> initServletClassSet , ServletContext ctx){
		System.out.println("servlet container INITIALIZED");
		ctx.addServlet("BeerSelect",SelectBeer.class).addMapping("/beerProj/select");
		ctx.addServlet("WineSelect",SelectWine.class).addMapping("/beerProj/selectwine");
	}
}
