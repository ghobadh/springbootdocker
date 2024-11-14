package ca.gforcesoftware.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gavinhashemi on 2024-11-13
 */
@RestController
public class DockerController {

    @GetMapping("/docker")
    public String dockerDemo(){
        return "Hello Docker! for Spring boot Application";
    }
}
