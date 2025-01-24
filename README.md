<h1>LIBRARY MANAGEMENT APP PLAN</h1>





<div>
<p>App Layers</p>	

	
 
			 /library
				/data
					/model
						Book.java -  storing all info for a book
							String title;
							String author;
							Date published;(?)
							Int isbn;
							boolean isAvailable()
							markAsCheckedOut()
							markAsReturned()
			
						Category.java - enum for storing types of books(Fantasy, Mystery, Sci-FI)
							enum Category {
								FANTASY,
								MYSTERY,
								SCI-FI
								}
					DataAccessException.java - custom exception thrown by repositories
					(Interface)BookRepository.java - interface defining CRUD operations for a book
						Book add()
						Book findByIsbn()
						boolean deleteById()
						List<Book> findAll()
						Book update()
					BookFileRepository.java - implement the methods from BookRepository, interacts with filesystem to save/load from file
						Book add()
						Book findByIsbn()
						boolean deleteById()
						List<Book> findAll()
						Book update()
			
				/domain
					BookService.java - validate user input before saving
						boolean validate(Book)
						Book update(Book)
						boolean isValidCategory()
						boolean isAvailable
				/ui
					View.java - handles all input/output operations
						Book getBookDetails()
						int getIsbn()
						Category getCategory()
						displayBook(Book)
						displayAllBooks(List)
					Controller.java - runs the application, manages operations
						addBook()
						updateBook()
						deleteBook()
						viewBooksByCategory()
						getBookByIsbn()
			
			Main.java
</div>
