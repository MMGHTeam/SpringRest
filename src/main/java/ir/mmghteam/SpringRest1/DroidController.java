package ir.mmghteam.SpringRest1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/droid")
public class DroidController {
    private final Driod driod;
    public DroidController(Driod driod) {
        this.driod = driod;
    }
    @GetMapping
    public Driod getDroid() {
        return driod;
    }
}
