package bruce.newsham.NLAProgrammingExercise;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import bruce.newsham.NLAProgrammingExercise.rest.model.BorrowingResponse;
import bruce.newsham.NLAProgrammingExercise.rest.model.BorrowingSearchCriteria;

@SpringBootTest
class NlaProgrammingExerciseApplicationTests extends AbstractTest {

	@BeforeEach
	public void setUp() {
		super.setUp();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void getBorrowing() throws Exception {
		String uri = "/borrowedBooksByReader";
		BorrowingSearchCriteria search = new BorrowingSearchCriteria();
		search.setReader(1l);
		String inputJson = super.mapToJson(search);
		MvcResult mvcResult = mvc.perform(
				MockMvcRequestBuilders.post(uri).contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson))
				.andReturn();

		int status = mvcResult.getResponse().getStatus();
		assertEquals(200, status);
		String content = mvcResult.getResponse().getContentAsString();
		BorrowingResponse borrowingResponse = super.mapFromJson(content, BorrowingResponse.class);
		assertTrue(borrowingResponse.getResult().size() > 0);
		assertEquals(borrowingResponse.getMsg(), "success");
	}
}
