package pl.coderslab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping("/firstForward")
	public String firstForward(HttpServletRequest request) {
		return "forward:second";
	}

	@RequestMapping("/secondForward")
	@ResponseBody
	public String secondForward() {
		return "second";
	}

	@RequestMapping("/redirectToGoogle")
	public String redirectToGoogle() {
		return "redirect:http://google.pl";
	}

	@RequestMapping("/first")
	public String first(HttpServletRequest request) {
		return "redirect:second";
	}

	@RequestMapping("/second")
	@ResponseBody
	public String second() {
		return "second";
	}

	@RequestMapping("/passParamModel/{max}/{count}")
	private String passParam(Model model, @PathVariable("max") long max, @PathVariable("count") int count) {
		model.addAttribute("var1", max);
		model.addAttribute("var2", count);
		return "passParam";
	}

	@ResponseBody
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}

	@RequestMapping("/helloParam")
	@ResponseBody
	private String helloParam(HttpServletRequest request) {
		String param = request.getParameter("paramName");
		System.out.println(param);
		return "My param = " + param;
	}

	@RequestMapping("/helloRequestParam")
	@ResponseBody
	private String helloRequest(
			@RequestParam(name = "paramName", defaultValue = "1", required = false) long paramName) {
		System.out.println(paramName);
		return "My param = " + paramName;
	}

	@RequestMapping("/requestParamsUri/{maxParam}/{countParam}")
	@ResponseBody
	private String requestParamsUri(@PathVariable("maxParam") long max, @PathVariable("countParam") long count) {
		return "My count = " + count + " My max = " + max;
	}

	@RequestMapping("/pattern/{size:\\d+}/{name:[a-z-]+}")
	@ResponseBody
	public String pattern(@PathVariable int size, @PathVariable String name) {
		return "size = " + size + " name= " + name;
	}

	@GetMapping("/userAgn")
	@ResponseBody
	public String userAgent(@RequestHeader("user-agent") String userAgent) {
		return "user-agent = " + userAgent;
	}

	// @RequestMapping("/pattern/*")
	// @ResponseBody
	// public String pattern2() {
	// return "pattern2";
	// }
	//
	// @RequestMapping("/pattern/**")
	// @ResponseBody
	// public String pattern3() {
	// return "pattern3";
	// }

}
