import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmtTest {

    @Test
    void testSafety_AllBogiesValid() {
        List<UseCase12TrainConsistMgmt.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Open", "Coal"));
        assertTrue(bogies.stream().allMatch(b -> !"Cylindrical".equalsIgnoreCase(b.type) || "Petroleum".equalsIgnoreCase(b.cargo)));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {
        List<UseCase12TrainConsistMgmt.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Cylindrical", "Coal"));
        assertFalse(bogies.stream().allMatch(b -> !"Cylindrical".equalsIgnoreCase(b.type) || "Petroleum".equalsIgnoreCase(b.cargo)));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {
        List<UseCase12TrainConsistMgmt.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Open", "Grain"));
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Box", "Coal"));
        assertTrue(bogies.stream().allMatch(b -> !"Cylindrical".equalsIgnoreCase(b.type) || "Petroleum".equalsIgnoreCase(b.cargo)));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {
        List<UseCase12TrainConsistMgmt.GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new UseCase12TrainConsistMgmt.GoodsBogie("Cylindrical", "Coal"));
        assertFalse(bogies.stream().allMatch(b -> !"Cylindrical".equalsIgnoreCase(b.type) || "Petroleum".equalsIgnoreCase(b.cargo)));
    }

    @Test
    void testSafety_EmptyBogieList() {
        List<UseCase12TrainConsistMgmt.GoodsBogie> bogies = new ArrayList<>();
        assertTrue(bogies.stream().allMatch(b -> !"Cylindrical".equalsIgnoreCase(b.type) || "Petroleum".equalsIgnoreCase(b.cargo)));
    }
}