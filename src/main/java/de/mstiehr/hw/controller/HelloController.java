/*
 * Copyright (c) 2023 T-Systems Multimedia Solutions GmbH
 * Riesaer Str. 5, D-01129 Dresden, Germany
 * All rights reserved.
 *
 * Autor: mnsh
 * Datum: 06.02.2023
 */
package de.mstiehr.hw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/")
  public String hello() {
    return "hello world";
  }
}
