package sample;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTest {

  @LocalServerPort private int port;

  @Autowired private TestRestTemplate restTemplate;

  @Test
  public void fish() {
    assertThat(
            restTemplate.getForObject("http://localhost:" + port + "/category/FISH", String.class))
        .contains("Angelfish");
  }

  @Test
  public void dogs() {
    assertThat(
            restTemplate.getForObject("http://localhost:" + port + "/category/DOGS", String.class))
            .contains("Chihuahua");
  }

  @Test
  public void cats() {
    assertThat(
            restTemplate.getForObject("http://localhost:" + port + "/category/CATS", String.class))
            .contains("Persian");
  }

  @Test
  public void birds() {
    assertThat(
            restTemplate.getForObject("http://localhost:" + port + "/category/BIRDS", String.class))
            .contains("Finch");
  }
}
