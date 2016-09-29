package br.com.treinaweb.springmvc.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/message")
	public String message(){
		return "hello";
	}
	
	@RequestMapping("/messageDoServidor")
	public String messageDoServicor(Model model){
		model.addAttribute("mensagem","Olá Curso");
		return "messageDoServidor";
	}
	
	@RequestMapping("/messageDoServidor2")
	public ModelAndView mensagemDoServidor2(){
		return new ModelAndView("messageDoServidor","mensagem",new Date().toString());
	}
	
	@RequestMapping("/receberMensagem/{mensagem}")
	public String receberMensagem(Model model, @PathVariable("mensagem") String msg){
		model.addAttribute("mensagem",msg);
		return "messageDoServidor";
	}
	
	@RequestMapping("/receberMensagem2}")
	public String receberMensagem2(Model model, @RequestParam(value ="mensagem", required = false, defaultValue = "Mensagem Padrao") String msg){
		model.addAttribute("mensagem",msg);
		return "messageDoServidor";
	}

	
}
