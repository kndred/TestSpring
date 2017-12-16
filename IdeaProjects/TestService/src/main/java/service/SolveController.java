package service;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class SolveController {

    @RequestMapping(value = "/sum",method = RequestMethod.POST)
    public Solve sum(@RequestParam(value="a",defaultValue = "2") String a,
                     @RequestParam(value="b",defaultValue = "3") String b) {
        return new Solve(Integer.parseInt(a),Integer.parseInt(b),Integer.parseInt(a)+Integer.parseInt(b));
    }

}