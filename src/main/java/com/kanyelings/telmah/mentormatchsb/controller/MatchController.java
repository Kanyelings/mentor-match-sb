package com.kanyelings.telmah.mentormatchsb.controller;

import com.kanyelings.telmah.mentormatchsb.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/match")
@AllArgsConstructor
public class MatchController {
    private final MatchService matchService;

}