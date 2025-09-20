package com.demo.structural.facade;

public class FacadeDesignPatternDemo {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Lights lights = new Lights();
        HomeTheaterFacade theater = new HomeTheaterFacade(dvdPlayer,projector,lights);
        theater.WatchMovie();
    }
}
