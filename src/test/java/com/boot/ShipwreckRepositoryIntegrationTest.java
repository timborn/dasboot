package com.boot;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
// import org.springframework.boot.SpringApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
// @SpringApplicationConfiguration(App.class)   // deprecated
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRespository;

    @Test
    public void testFinallAll() {
        List<Shipwreck> wrecks = shipwreckRespository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
