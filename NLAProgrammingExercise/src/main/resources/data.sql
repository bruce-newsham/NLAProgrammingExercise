DROP TABLE IF EXISTS borrowing;

CREATE TABLE borrowing (
  id BIGINT PRIMARY KEY,
  reader_id BIGINT NOT NULL,
  book_id BIGINT NOT NULL,
  borrowedDate DATE NOT NULL,
  returnedDate DATE 
);
  
INSERT INTO borrowing (id, reader_id, book_id, borrowedDate, returnedDate) VALUES
  	(1, '1' ,'1', '2009-02-02', '2009-02-12'),
	(2, '1' ,'2', '2010-05-12', '2010-07-12'),
	(3, '1' ,'3', '2009-02-02', '2009-02-12'),
	(4, '1' ,'4', '2009-02-02', '2009-02-12'),
	(5, '1' ,'5', '2009-02-02', '2009-02-12'),
	(6, '1' ,'6', '2009-02-02', '2009-02-12'),
	(7, '2' ,'7', '2009-02-02', '2009-02-12'),
	(8, '2' ,'8', '2009-02-02', '2009-02-12'),
	(9, '2' ,'9', '2009-02-02', '2009-02-12'),
	(10, '3' ,'10', '2009-02-02', '2009-02-12'),
	(11, '3' ,'11', '2009-02-02', '2009-02-12'),
	(12, '3' ,'12', '2009-02-02', '2009-02-12'),
	(13, '3' ,'13', '2009-02-02', '2009-02-12'),
	(14, '3' ,'14', '2009-02-02', '2009-02-12'),
	(15, '3' ,'15', '2009-02-02', '2009-02-12'),
	(16, '4' ,'16', '2009-02-02', '2009-02-12'),
	(17, '4' ,'17', '2009-02-02', '2009-02-12'),
	(18, '4' ,'18', '2009-02-02', '2009-02-12'),
	(19, '4' ,'19', '2009-02-02', '2009-02-12'),
	
	(21, '4' ,'21', '2009-02-02', '2009-02-12'),
	(22, '5' ,'22', '2009-02-02', '2009-02-12');

	INSERT INTO borrowing (id, reader_id, book_id, borrowedDate) VALUES
	(20, '4' ,'20', '2020-02-02'),
	(23, '5' ,'23', '2020-07-15');
  
DROP TABLE IF EXISTS book;
 
CREATE TABLE book (
  id BIGINT PRIMARY KEY,
  isbn VARCHAR(13) NOT NULL,
  title VARCHAR(250),
  author BIGINT NOT NULL
);

INSERT INTO book (id, isbn, title, author) VALUES
  	(1, '9781853268953' ,'The Complete Works of William Shakespeare', 1),
	(2, '048627067X' ,'A Midsummer Night''s Dream', 1),
	(3, '0486266869' ,'Sonnets', 1),
	(4, '9780486290973' ,'Othello', 1),
	(5, '1853260355' ,'Macbeth', 1),
	(6, '9781494821814' ,'The Complete Poems of Emily Dickinson', 2),
	(7, '0241251400' ,'My Life Had Stood a Loaded Gun', 2),
	(8, '9781423650980' ,'Hope is the Thing with Feathers', 2),
	(9, '9780575081567' ,'Necronomicon', 3),
	(10, '0241341310' ,'At the Mountains of Madness', 3),
	(11, '9781450562799' ,'The Shadow Over Innsmouth', 3),
	(12, '0143129457' ,'The Call of Cthulhu and Other Weird Stories', 3),
	(13, '0141199172' ,'The Hound of the Baskervilles', 4),
	(14, '9780141395524' ,'A Study in Scarlet', 4),
	(15, '0241952964' ,'The Sign of Four', 4),
	(16, '0241952972' ,'The Valley of Fear', 4),
	(17, '0241952921' ,'His Last Bow', 4),
	(18, '0486400603' ,'The Lost World', 4),
	(19, '9780241251768' ,'The Death of Ivan Ilyich', 5),
	(20, '0241265541' ,'War And Peace', 5),
	(21, '9780099540663' ,'Anna Karenina', 5),
	(22, '0141397268' ,'The Tell-Tale Heart', 6),
	(23, '0486266850' ,'The Raven', 6);
  
  
DROP TABLE IF EXISTS author;
 
CREATE TABLE author (
  id BIGINT PRIMARY KEY,
  firstName VARCHAR(250),
  lastName VARCHAR(250) NOT NULL
);
 
INSERT INTO author (id, firstName, lastName) VALUES
  	(1, 'William' ,'Shakespeare'),
	(2, 'Emily' ,'Dickinson'),
	(3, 'H.P.' ,'Lovecraft'),
	(4, 'Arthur Conan' ,'Doyle'),
	(5, 'Leo' ,'Tolstoy'),
	(6, 'Edgar Allan' ,'Poe');
	
	
DROP TABLE IF EXISTS reader;
 
CREATE TABLE reader (
  id BIGINT PRIMARY KEY,
  firstName VARCHAR(250),
  lastName VARCHAR(250) NOT NULL,
  email VARCHAR(250),
  phoneNumber VARCHAR(20) NOT NULL
);
 
INSERT INTO reader (id, firstName, lastName, email, phoneNumber) VALUES
  	(1, 'Barry' ,'Palmerston', 'barry.palmerston@someemail.com.au', '(02) 5555 7721'),
	(2, 'Jane' ,'Lyon', 'jane.lyonn@someemail.com.au', '(0455) 555 852'),
	(3, 'Simon' ,'Casey', 'simon.casey@someemail.com.au', '(07) 5555 1594'),
	(4, 'Leeanne' ,'Greenway', 'leeanne.greenway@someemail.com.au', '(0455) 555 753'),
	(5, 'Scott' ,'Dickson', 'scott.dickson@someemail.com.au', '(03) 5555 1874'),
	(6, 'Claudia' ,'Duffy', 'claudia.duffy@someemail.com.au', '(08) 5555 2953');
 
