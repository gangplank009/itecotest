package pavel.efimov.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl implements SenderService {

    private final Sender sender;

    public SenderServiceImpl(Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send(String message) {
        sender.send(message);
    }
}
