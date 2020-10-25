package bruce.newsham.NLAProgrammingExercise.entity;

import java.time.LocalDate;

/**
 * Entity for Borrowing table
 * 
 * @author Bruce Newsham
 * @date 25/10/2020
 * 
 */

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "borrowing")
//@NamedQuery(name = "Borrowing.findByReader",
//query = "select b from Borrowing b where b.reader.id = ?1")
public class Borrowing {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "reader_id", referencedColumnName = "id")
	private Reader reader;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id", referencedColumnName = "id")
	private Book book;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate borrowedDate;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private LocalDate  returnedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public LocalDate  getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(LocalDate  borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public LocalDate  getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(LocalDate returnedDate) {
		this.returnedDate = returnedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((borrowedDate == null) ? 0 : borrowedDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((reader == null) ? 0 : reader.hashCode());
		result = prime * result + ((returnedDate == null) ? 0 : returnedDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Borrowing other = (Borrowing) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (borrowedDate == null) {
			if (other.borrowedDate != null)
				return false;
		} else if (!borrowedDate.equals(other.borrowedDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (reader == null) {
			if (other.reader != null)
				return false;
		} else if (!reader.equals(other.reader))
			return false;
		if (returnedDate == null) {
			if (other.returnedDate != null)
				return false;
		} else if (!returnedDate.equals(other.returnedDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Borrowing [id=" + id + ", reader=" + reader + ", book=" + book + ", borrowedDate=" + borrowedDate
				+ ", returnedDate=" + returnedDate + "]";
	}
	
	
	
}