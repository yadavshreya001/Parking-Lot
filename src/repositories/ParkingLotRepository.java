package repositories;
import models.ParkingLot;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap;

    public Optional<ParkingLot> findByGateId(Long gateId) {
        return null;
    }

}