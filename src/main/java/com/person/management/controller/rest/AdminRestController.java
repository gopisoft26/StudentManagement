package com.person.management.controller.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@RequestMapping("/rest/admin")
@SessionAttributes("roles")
public class AdminRestController {

}