//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class BuddyInfoRepoServiceTest {
//    @Autowired
//    private com.sysc.test.BuddyInfoRepo buddyInfoRepo;
//
//    @Test
//    public void testSaveAndFindBuddyInfo() {
//        // Create a com.sysc.test.BuddyInfo object
//        com.sysc.test.BuddyInfo buddyInfo = new com.sysc.test.BuddyInfo();
//        buddyInfo.setName("John Doe");
//        buddyInfo.setNumber("123-456-7890");
//
//        // Save the com.sysc.test.BuddyInfo object to the repository
//        buddyInfoRepo.save(buddyInfo);
//
//        // Find the com.sysc.test.BuddyInfo object by its ID
//        com.sysc.test.BuddyInfo foundBuddyInfo = buddyInfoRepo.findBuddyInfoById(buddyInfo.getId());
//
//        // Assert that the foundBuddyInfo is not null and has the same properties as the original buddyInfo
//        assertNotNull(foundBuddyInfo);
//        assertEquals("John Doe", foundBuddyInfo.getName());
//        assertEquals("123-456-7890", foundBuddyInfo.getNumber());
//    }
//}