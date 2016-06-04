package com.FlappyTicket.Controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.FlappyTicket.Service.*;

@Controller
@RequestMapping(value = "Cinema")

public class CinemaController {
	
	@Autowired
	private CinemaService CinemaService;
	
	@RequestMapping(value = "AllCinemaList", method = RequestMethod.GET)
	@ResponseBody
	public Object getCurrentMovieList() {
		return CinemaService.findAll();
		
	}
}