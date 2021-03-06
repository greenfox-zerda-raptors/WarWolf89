package com.greenfox.jasper.services;

import com.greenfox.jasper.domain.*;
import com.greenfox.jasper.repos.BuildingRepo;
import com.greenfox.jasper.repos.TimedEventRepo;
import com.greenfox.jasper.repos.TroopRepo;
import com.greenfox.jasper.repos.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServices {


    private UserRepo userRepo;
    private TimedEventRepo timedEventRepo;
    private BuildingRepo buildingRepo;
    private TroopRepo troopRepo;

    private final Logger log = LoggerFactory.getLogger(EventServices.class);

    @Autowired
    public EventServices(UserRepo userRepo, TimedEventRepo timedEventRepo, BuildingRepo buildingRepo, TroopRepo troopRepo) {
        this.userRepo = userRepo;
        this.troopRepo = troopRepo;
        this.timedEventRepo = timedEventRepo;
        this.buildingRepo = buildingRepo;

    }

    @Scheduled(fixedRate = 1000)
    public void checkForEvents() {
        long currentTime = System.currentTimeMillis();
        List<TimedEvent> listedEvents = timedEventRepo.findAllWaitingForExecution(currentTime);

        for (TimedEvent listedEvent : listedEvents) {
            processEvent(listedEvent);
        }
    }

    private void processEvent(TimedEvent timedEvent) {
        executeEvent(timedEvent.getBuildingId(), timedEvent.getEvent());
        timedEvent.setWasExecuted(true);
        timedEventRepo.save(timedEvent);
    }

    public void executeEvent(long buildingID, GameEvent events) {
        Building tempBuilding = buildingRepo.findOne(buildingID);
        Kingdom tempKingdom = tempBuilding.getKingdom();

        //TODO Battle event - see TimedEvent class for further info

        switch (events) {
            case LEVELUP:
                tempBuilding.levelUp();
                buildingRepo.save(tempBuilding);
                log.info("Leveled up building with id {} to level {}", tempBuilding.getBuildingId(), tempBuilding.getLevel());
                break;
            case DELEVEL:
                tempBuilding.decreaseLvl();
                buildingRepo.save(tempBuilding);
                log.info("De-leveled building with id {} to level {}", tempBuilding.getBuildingId(), tempBuilding.getLevel());
                break;
            case TRAINTROOPS:
                Troop tempTroop = new Troop(tempKingdom);
                troopRepo.save(tempTroop);
                log.info("Troop with id {} and kingdom {} has been trained by building with ID {}", tempTroop.getTroopId(), tempKingdom.getKingdomId(), tempBuilding.getBuildingId());
                break;
            case UPGRADETROOPS:
                // TODO level up the selected troop - see timed event TODO for further info
                System.out.println("Troops being upgraded");
                break;
            default:
                System.out.println("Error, no such event found");
        }
    }

    public void cancelEvent(long eventID) {
        timedEventRepo.delete(eventID);
    }

    public void addNewLevelUpEvent(long buildingID) {

        Building temporaryBuilding = buildingRepo.findOne(buildingID);

        TimedEvent timedEvent = new TimedEvent(
                buildingID, (System.currentTimeMillis()
                + (60000
                * calculateBuildingTimeRatio(temporaryBuilding.getLevel()))),
                GameEvent.LEVELUP);

        timedEventRepo.save(timedEvent);
    }

    public void addNewCreateTroopEvent(long buildingId) {
        long queueTime = 0;
        List<TimedEvent> allEventForABuilding = timedEventRepo.findAllByBuildingIdOrderByExecutionTimeDesc(buildingId);
        if (allEventForABuilding.size() > 0) {
            TimedEvent tempTimedEvent = allEventForABuilding.get(0);
            queueTime += tempTimedEvent.getExecutionTime() - System.currentTimeMillis();
        }
        // TODO add building-occupation-status;  handle time formula for troop;
        TimedEvent timedEvent = new TimedEvent(buildingId, (System.currentTimeMillis() + queueTime + 60000), GameEvent.TRAINTROOPS);
        timedEventRepo.save(timedEvent);
    }

    private long calculateBuildingTimeRatio(int level) {
        return calculateTotalCost(level) / 250;
    }

    private int calculateTotalCost(int n) {
        int i = 0;
        int result = 0;
        while (i < n) {
            result += i * 100;
            i++;
        }
        return result + 250;
    }


}
