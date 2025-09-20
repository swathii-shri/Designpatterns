package com.demo.structural.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }
    public void WatchMovie(){
        System.out.println("Getr eadyt o watch movie");
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        lights.dim();
    }
}
