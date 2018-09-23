package LimpBiscuit.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("text", "Hello");
        return "Index";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("text", "Hello");
        return "About";
    }
}
