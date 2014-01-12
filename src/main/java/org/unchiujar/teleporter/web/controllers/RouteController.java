package org.unchiujar.teleporter.web.controllers;

import org.unchiujar.teleporter.model.Route;
import org.unchiujar.teleporter.service.RouteCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RouteController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RouteController.class);

    @Autowired
    private RouteCalculator routeCalculator;

    @RequestMapping(value = "/api/0.1/route", method = RequestMethod.POST)
    public Route route(@RequestBody Route stops) {
        LOGGER.debug("Received stops to be processed: {}", stops);

        Route answer = routeCalculator.calculateRoute(stops);

        return answer;
    }
}
