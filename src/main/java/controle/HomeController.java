package controle;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dados.*;

/**
 * Handles requests for the application home page.
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest request, Locale locale, HttpSession session) {
		String redirecionamento = "index";
		
		if (request.getSession().getAttribute("usuarioLogado") != null){
			Usuario dadosUsuario = (Usuario)session.getAttribute("usuarioLogado");
			model.addAttribute("emailUsuario", dadosUsuario.getEmail());
			redirecionamento = "home";
		}else {
			redirecionamento = "index";
		}
		return redirecionamento;
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		Usuario dadosUsuario = (Usuario) session.getAttribute("usuarioLogado");
		model.addAttribute("emailUsuario", dadosUsuario.getEmail());
		return "home";
	}
}