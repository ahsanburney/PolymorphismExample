package com.ahsanburney;

class  Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{

    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}


class Mazerunner extends Movie{

    public Mazerunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class Starwars extends Movie{
    public Starwars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends  Movie{
    public Forgetable() {
        super("Forgetable");
    }

    //No plot Method.
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie # "+i+
            " : "+ movie.getName() + "\n"+
            "Plot: " +movie.plot() + "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() *5) +1;
        System.out.println("Random number generated : " +randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Mazerunner();
            case 4:
                return new Starwars();
            case 5:
            return new Forgetable();
        }

        return null;
    }
}
