package org.unchiujar.teleporter.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Waypoint {
    private int latitude;
    private int longitude;

    private String message;

    /**
     * Constructor used by jackson. Do not use.
     */
    protected Waypoint() {
    }

    public Waypoint(int latitude, int longitude, String message) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.message = message;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Waypoint waypoint = (Waypoint) o;

        if (latitude != waypoint.latitude) return false;
        if (longitude != waypoint.longitude) return false;
        if (message != null ? !message.equals(waypoint.message) : waypoint.message != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = latitude;
        result = 31 * result + longitude;
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }


}
