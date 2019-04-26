package ca.esdc.iteam.noc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusTest;
import com.consol.citrus.dsl.testng.TestNGCitrusTestRunner;
import com.consol.citrus.http.client.HttpClient;
import com.consol.citrus.message.MessageType;

@Test
public class NocPocTestIT extends TestNGCitrusTestRunner {
  
  @Autowired
  private HttpClient nocEndpoint;
  
  /**
   * Given a the endpoint 
   */
  @CitrusTest
  public void sanityTest() {
    http(request -> request
            .client(nocEndpoint)
            .send()
            .get());
    
    http(response -> response
            .client(nocEndpoint)
            .receive()
            .response(HttpStatus.OK)
            .messageType(MessageType.JSON)
            .jsonPath("boolean:$._links", false));
  }

}
