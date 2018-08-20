package com.example.tyler.a28_filterable_lists.games;

import java.util.ArrayList;
import java.util.List;

public class GameData {
    private static GameData mSingleton;
    private List<Game> games;


    private GameData() {
        games = new ArrayList<>();
        games.add(new Game("The Witcher 3: Wild Hunt", "Fantasy RPG", "The Witcher: Wild Hunt is a story-driven, next-generation open world role-playing game set in a visually stunning fantasy universe full of meaningful choices and impactful consequences. In The Witcher you play as the professional monster hunter, Geralt of Rivia, tasked with finding a child of prophecy in a vast open world rich with merchant cities, viking pirate islands, dangerous mountain passes, and forgotten caverns to explore." ));
        games.add(new Game("Battlefield 1", "GPS", "Battlefield™ 1 takes you back to The Great War, WW1, where new technology and worldwide conflict changed the face of warfare forever. Take part in every battle, control every massive vehicle, and execute every maneuver that turns an entire fight around. The whole world is at war – see what’s beyond the trenches." ));
        games.add(new Game("World of Warcraft", "MMORPG", "World of Warcraft. World of Warcraft (WoW) is a massively multiplayer online role-playing game (MMORPG) released in 2004 by Blizzard Entertainment. It is the fourth released game set in the Warcraft fantasy universe." ));
        games.add(new Game("Half Life 2", "FPS", "Half-Life 2. This is the latest accepted revision, reviewed on 5 August 2018. Half-Life 2 (stylized as HλLF-LIFE2) is a first-person shooter video game developed and published by Valve Corporation. It is the sequel to 1998's Half-Life, and was released in November 2004 following a five-year $40 million development." ));


    }

    public static GameData get(){
        if(mSingleton == null){
            mSingleton = new GameData();
        }

        return mSingleton;
    }

    public List<Game> games(){
        return games;
    }

    public static List<Game> search(String filter){
        List<Game> results = new ArrayList<>();

        for (Game game : get().games()) {
            if (game.title.toLowerCase().contains(filter)){
                results.add(game);
            } else if (game.genre.toLowerCase().contains(filter)){
                results.add(game);
            }
        }

        return results;
    }

}
