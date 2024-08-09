package cl.praxis.demospringsecurity.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Ruta principal
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to the Home Page");
        return "home"; // Asegúrate de tener una vista home.html en templates
    }

    // Ruta de login
    @GetMapping("/login")
    public String login() {
        return "login"; // Asegúrate de tener una vista login.html en templates
    }

    // Ruta para admin
    @GetMapping("/admin/home")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminHome(Model model) {
        model.addAttribute("message", "Welcome Admin");
        return "adminHome"; // Asegúrate de tener una vista adminHome.html en templates
    }

    // Ruta para user
    @GetMapping("/user/home")
    @PreAuthorize("hasRole('USER')")
    public String userHome(Model model) {
        model.addAttribute("message", "Welcome User");
        return "userHome"; // Asegúrate de tener una vista userHome.html en templates
    }
}