package start;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/go")
public class HelloController {

	public  int[] o_x(){
		MyClass myClass = new MyClass();
		int [] o_x = myClass._x();
		return  o_x;
	}
	public  int[] o_y(){
		MyClass myClass = new MyClass();
		int [] o_y = myClass._y();
		return  o_y;
	}
	public String st(){
		MyClass myClass = new MyClass();
		return myClass.minmax();
	}
	public int idGPS(){
		MyClass myClass = new MyClass();
		return myClass.id_gps();
	}


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		MyClass myClass = new MyClass();
		int [] ff = myClass._x();

		model.addAttribute("message",ff);

		return "hello";

	}



}