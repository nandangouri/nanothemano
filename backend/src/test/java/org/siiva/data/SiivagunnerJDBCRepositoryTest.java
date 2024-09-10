package org.siiva.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.siiva.Model.Siivagunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class SiivagunnerJDBCRepositoryTest {

        @Autowired
        SiivagunnerRepository repository;

        @Autowired
        KnownGoodState knownGoodState;

        @BeforeEach
        void setup() {knownGoodState.set();}


        @Test
    void setCurrent() {
    }

    @Test
    void updateNew() {
    }

    @Test
    void add() {
        Siivagunner expected = new Siivagunner( 4, "testtest",
                "addnew" , false, false, true);
        Siivagunner actual = repository.add(expected);
        assertEquals(expected, actual);
    }

    @Test
    void ShouldgetById() {
        Siivagunner actual = repository.getById(1);
        Siivagunner expected = new Siivagunner( 1, "Z6gf4rqhYxk",
                "Monochrome (PAL-M Version) - Hotel Dusk: Room 215" , false, false, true);
        assertEquals(expected, actual);
    }

    @Test
    void getByVideoId() {
    }

    @Test
    void update() {
    }

    @Test
    void updateListened() {
    }

    @Test
    void updateWorth() {
    }

    @Test
    void getAll() {
    }

    @Test
    void getNext() {
    }

    @Test
    void getPrevious() {
    }
}