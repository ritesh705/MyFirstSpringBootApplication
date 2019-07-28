package com.ritesh;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class App
{
	@RequestMapping("/")
	String home()
	{
		return "Spring Boot Application";
	}

    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(App.class, args);
    }
}
