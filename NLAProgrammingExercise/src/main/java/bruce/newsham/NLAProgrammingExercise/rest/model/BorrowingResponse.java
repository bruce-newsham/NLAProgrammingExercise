package bruce.newsham.NLAProgrammingExercise.rest.model;

import java.util.List;

import bruce.newsham.NLAProgrammingExercise.entity.Borrowing;

public class BorrowingResponse {

	String msg;
	List<Borrowing> result;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Borrowing> getResult() {
		return result;
	}

	public void setResult(List<Borrowing> result) {
		this.result = result;
	}

}