package org.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping ("testSuccess")
    @PreAuthorize("hasAnyAuthority('xiaoer')")
    public Boolean test() {
        return Boolean.TRUE;
    }
}
