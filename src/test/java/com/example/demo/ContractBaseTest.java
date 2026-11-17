package com.example.demo;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public abstract class ContractBaseTest {

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new AdditionController());
    }
}
