import com.sysc.test.AccessingDataJpaApplication;
import com.sysc.test.AddressBook;
import com.sysc.test.AddressBookRepo;
import com.sysc.test.AdrBookControllerAPI;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AdrBookControllerAPI.class)
@ContextConfiguration(classes = AccessingDataJpaApplication.class)
public class AdrBookTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AddressBookRepo addressBookRepo;

    @Test
    public void test() throws Exception {
        List<AddressBook> addresses = new ArrayList<>();
        when(addressBookRepo.findAll()).thenReturn(addresses);
        this.mockMvc.perform(get("/addressBook")).andDo(print()).andExpect(status().isOk());
        // should be more
    }

}
