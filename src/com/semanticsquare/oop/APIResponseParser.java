package com.semanticsquare.oop;

public class APIResponseParser {
    
    /**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
     * @param endRule2 
     * @param startRule 
	 * @return Book instance containing parsed data
	 */
    public static Book parse(String response, String startRule, String endRule) {
       Book book = new Book();
		String endRule1 = "<";
		
		String startRule1 = "<title>";		
		Book title = parse(response, startRule1, endRule1); 
	   // book.setTitle(title);
		
		// Your code
	   //int intType = Interger.parseInt(res)
	     
		return book;
    }
    
    // write overloaded parse method with the 3 parameters response, startRule, endRule
    
    public static void main(String[] args) {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parse(response);
	}
}