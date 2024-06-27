package hwan.securityexam3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/abc")
    public String abc() {
        return "abc";
    }

    @GetMapping("/def")
    public String def() {
        return "def";
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }
}
