package org.unchiujar.teleporter.service;

import org.unchiujar.teleporter.model.Route;
import org.unchiujar.teleporter.model.Waypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteCalculatorImpl implements RouteCalculator {
    private static final Logger LOGGER = LoggerFactory.getLogger(RouteCalculatorImpl.class);
    @Override
    public Route calculateRoute(Route route) {
        LOGGER.debug("Getting intermediate points for {}", route);

        //TODO route processing using service

        List<Waypoint> waypoints =  new ArrayList<Waypoint>();

        waypoints.add(new Waypoint(50, 50, "start"));
        waypoints.add(new Waypoint(51, 51, "intermediate"));
        waypoints.add(new Waypoint(52, 52, "stop"));

        Route answer = new Route(waypoints);

        LOGGER.debug("Found route {}", answer);
        return answer;
    }
}
