package com.alfons.smartagent.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="apartments")
public class Apartment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(nullable = false, updatable = false)
    private String postId;

    @Column(nullable = false, updatable = false)
    private String searchId;

    private String street;

    private String neighborhood;

    private String price;

    private String rooms;

    private String floor;

    private String squareMeters;

    private String link;

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(String squareMeters) {
        this.squareMeters = squareMeters;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }


    public static final class ApartmentBuilder {
        private String postId;
        private String searchId;
        private String street;
        private String price;
        private String rooms;
        private String floor;
        private String squareMeters;
        private String link;
        private String neighborhood;

        private ApartmentBuilder() {
        }

        public static ApartmentBuilder anApartment() {
            return new ApartmentBuilder();
        }

        public ApartmentBuilder postId(String postId) {
            this.postId = postId;
            return this;
        }

        public ApartmentBuilder neighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public ApartmentBuilder searchId(String searchId) {
            this.searchId = searchId;
            return this;
        }

        public ApartmentBuilder street(String street) {
            this.street = street;
            return this;
        }

        public ApartmentBuilder price(String price) {
            this.price = price;
            return this;
        }

        public ApartmentBuilder rooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public ApartmentBuilder floor(String floor) {
            this.floor = floor;
            return this;
        }

        public ApartmentBuilder squareMeters(String squareMeters) {
            this.squareMeters = squareMeters;
            return this;
        }

        public ApartmentBuilder link(String link) {
            this.link = link;
            return this;
        }

        public Apartment build() {
            Apartment apartment = new Apartment();
            apartment.setPostId(postId);
            apartment.setSearchId(searchId);
            apartment.setStreet(street);
            apartment.setNeighborhood(neighborhood);
            apartment.setPrice(price);
            apartment.setRooms(rooms);
            apartment.setFloor(floor);
            apartment.setSquareMeters(squareMeters);
            apartment.setLink(link);
            return apartment;
        }
    }
}