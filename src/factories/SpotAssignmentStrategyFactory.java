package factories;

import models.SpotAssignmentStrategyType;
import strategies.CheapestSpotAssignmentStrategy;
import strategies.RandomSpotAssignmentStrategy;
import strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType
                                                                           spotAssignmentStrategyType) {
        if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)) {
            return new CheapestSpotAssignmentStrategy();
        } else if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.RANDOM)) {
            return new RandomSpotAssignmentStrategy();
        }
        return null;
    }
}