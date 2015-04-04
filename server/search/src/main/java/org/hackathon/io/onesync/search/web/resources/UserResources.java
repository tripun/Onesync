package org.hackathon.io.onesync.search.web.resources;

import org.hackathon.io.onesync.search.domain.User;
import org.hackathon.io.onesync.search.repository.IUserRepository;
import org.hackathon.io.onesync.search.web.resources.validator.RegistrationValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/user")
public class UserResources {

	@Autowired
	private IUserRepository userRepository;

	@Autowired
	private RegistrationValidator validator;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute(value = "user") User user, BindingResult result) {
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView(" redirect:/successful");
		if (!result.hasErrors()) {
			userRepository.addUser(user);
		}

		return mv;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginFormView(ModelAndView mv) {
		if (mv == null) {
			mv = new ModelAndView("/login");
		}
		return mv;
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public ModelAndView dashBoardView(ModelAndView mv) {
		if (mv == null) {
			mv = new ModelAndView("/dashboard");
		}
		return mv;
	}

	@RequestMapping(value = "/unlock", method = RequestMethod.POST)
	public ModelAndView loginauthenticate(@RequestParam(value = "username") String username,
			@RequestParam("password") String password) {

		ModelAndView mv = new ModelAndView("redirect:/login");
		try {
			User user = userRepository.authenticatetUser(username, password);
			if (user != null)
				mv.setViewName("redirect:/dashboard");

			return mv;
		} catch (Exception e) {
			e.printStackTrace();
			mv.setViewName("redirect:/login");
			mv.addObject("msg", "Error loggin in, Please Try Again");
			return mv;
		}

	}

	@RequestMapping(value = "/successful", method = RequestMethod.GET)
	public ModelAndView registrationSuccessView() {

		ModelAndView mv = new ModelAndView(" redirect:/login");
		mv.addObject("msg", "Registration Successful Please login");

		return mv;
	}
	
	@RequestMapping(value = "/authorize", method = RequestMethod.GET)
	public String addCloudService(@RequestParam(value = "cloudService", required = true) String cloudService) {

		return "/index";
	}

}
