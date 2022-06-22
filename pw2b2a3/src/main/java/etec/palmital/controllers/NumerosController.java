package etec.palmital.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class NumerosController {
    @Value{"${Marco Antonio Lopes Vasco}"}

    @RequestMapping("/")
    public String calc(Model model) {
        int[] resultado = null;
        for(int val = 2 ; val < 30 ; val)
        


    }
}
