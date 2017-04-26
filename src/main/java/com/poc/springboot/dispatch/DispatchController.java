package com.poc.springboot.dispatch;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DispatchController {
	
	@RequestMapping("/dispatches")
	public List<Dispatch> getDispatch(){
		return Arrays.asList(
					new Dispatch(1, "phone", "Hitachi Nanakramguda"),
					new Dispatch(1, "bag", "Flat 30, pragathi nagar"),
					new Dispatch(1, "bicycle", "Flat 30, pragathi nagar")
				);
	}

}
