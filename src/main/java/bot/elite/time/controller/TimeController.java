package bot.elite.time.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.ZoneId;


@RequiredArgsConstructor
@Controller
@RequestMapping("/time")
public class TimeController {

    @PostMapping
    public void setTime(String timeZone) {

    }
}
