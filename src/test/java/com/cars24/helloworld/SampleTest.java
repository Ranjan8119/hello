package com.cars24.helloworld;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.JUnit4;
import org.mockito.internal.runners.JUnit45AndHigherRunnerImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.http.HttpStatus.OK;

@RunWith(BlockJUnit4ClassRunner.class)
public class SampleTest {

    @Test
    public void assertStatusCode() {

        String a = String.format("%s",3);
        Assert.assertThat(a,is("3"));
    }
}
