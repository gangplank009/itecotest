package pavel.efimov.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(path = "/message")
public class SenderController {

    private final SenderService senderService;


    public SenderController(SenderService senderService) {
        this.senderService = senderService;
    }

    @PostMapping()
    public Map<String, String> createMessage(@RequestBody Map<String, String> message) {
        senderService.send(message.get("text"));
        return message;
    }
}
