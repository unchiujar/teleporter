package org.unchiujar.teleporter.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.List;

public class Route {
    private List<Waypoint> waypoints;

    /**
     * Constructor used by jackson. Do not use.
     */
    protected Route() {
    }

    public Route(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public void addWaypoint(Waypoint waypoint) {
        waypoints.add(waypoint);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Route route = (Route) o;

        if (waypoints != null ? !waypoints.equals(route.waypoints) : route.waypoints != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return waypoints != null ? waypoints.hashCode() : 0;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
