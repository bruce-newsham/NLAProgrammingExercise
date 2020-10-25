package bruce.newsham.NLAProgrammingExercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import bruce.newsham.NLAProgrammingExercise.rest.model.BorrowingSearchCriteria;

public class BorrowingControllerTest extends AbstractTest {
   @Override
   @Before
   public void setUp() {
      super.setUp();
   }

   @Test
   public void createProduct() throws Exception {
      String uri = "/borrowedBooksByReader";
      BorrowingSearchCriteria search = new BorrowingSearchCriteria();
      search.setReader(1l);
      String inputJson = super.mapToJson(search);
      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
         .contentType(MediaType.APPLICATION_JSON_VALUE)
         .content(inputJson)).andReturn();
      
      int status = mvcResult.getResponse().getStatus();
      assertEquals(201, status);
      String content = mvcResult.getResponse().getContentAsString();
      assertEquals(content, "Product is created successfully");
   }
   
}