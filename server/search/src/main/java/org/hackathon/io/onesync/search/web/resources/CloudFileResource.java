package org.hackathon.io.onesync.search.web.resources;

import org.hackathon.io.onesync.search.repository.IFileRepository;
import org.hackathon.io.onesync.search.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/file")
public class CloudFileResource {
	
	@Autowired
	private IFileRepository fileRepository;
	
	@Autowired	
	private IUserRepository userRepository;
	
	
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public ModelAndView fileErrorView(ModelAndView mv) {
		if (mv == null) {
			mv = new ModelAndView("/error");
		}
		return mv;
	}

}
