package pavel.efimov.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/")
public class SenderController {

    private final Sender sender;

    public SenderController(Sender sender) {
        this.sender = sender;
    }

    @GetMapping(path = "/")
    public String showSendPage(Model model) {
        return "sendPage";
    }

    @PostMapping(path = "/")
    public String processSendPage(@RequestParam(name = "message") String message) {
        System.out.println(message);
        sender.send(message);
        return "sendPage";
    }
}
