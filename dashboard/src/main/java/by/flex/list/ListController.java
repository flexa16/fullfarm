package by.flex.list;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
@RequestMapping("/devices-list")
public class ListController {
    private static final Logger log = Logger.getLogger(ListController.class.getName());


    @GetMapping()
    public String showDevices(Model model) {
        log.info("Calling devicesList");

        return "devicesList";
    }


}
