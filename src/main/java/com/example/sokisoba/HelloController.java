<<<<<<< HEAD
package com.example.sokisoba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

   @RequestMapping("/hello")
   public String helloWorld() {
       return "index";
   }
}
=======
package com.example.sokisoba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

   @RequestMapping("/hello")
   public String helloWorld() {
       return "index";
   }
}
>>>>>>> branch 'master' of https://github.com/toBeEngineer/demo3
