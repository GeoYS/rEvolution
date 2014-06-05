/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revolution.game.creature.properties.Types;

import java.util.ArrayList;

/**
 *
 * @author Christopher Stokese
 */
public class Location {
    private ArrayList<Object> Locations = new ArrayList<>();
    
    public void setWaterSource(WaterSources waterSource){
        Locations.add(waterSource);
    }
    
    public void setSleepingArea(SleepingArea sleepingArea){
        Locations.add(sleepingArea);
    }
    
    public void setFeedingArea(FeedingArea feedingArea){
        Locations.add(feedingArea);
    }
    
    public void setNestingArea(NestingArea nestingArea){
        Locations.add(nestingArea);
    }
    
    public void setMigrationStart(MigrationArea migrationStart){
        Locations.add(migrationStart);
    }
    
    public void setMigrationThrough(MigrationArea migrationThrough){
        Locations.add(migrationThrough);
    }
    
    public void setMigrationFinnish(MigrationArea migrationFinnish){
        Locations.add(migrationFinnish);
    }
    
    public int shares(Location location){
        int chance = 0;
        for (Object i : Locations){
            if(location.getArrayList().contains(i)){
                chance++;
            }
        }
        return chance;
    }
    
    public ArrayList getArrayList(){
        return Locations;
    }
    
    public enum WaterSources{
        LAKE, WATERFALL;
    }
    
    public enum SleepingArea{
        FORREST, SAVAHNNA;
    }
    
    public enum FeedingArea{
        FORREST, SAVAHNNA;
    }
    
    public enum NestingArea{
        FORREST, SAVAHNNA;
    }
    
    public enum MigrationArea{
        FORREST, SAVAHNNA;
    }
}
