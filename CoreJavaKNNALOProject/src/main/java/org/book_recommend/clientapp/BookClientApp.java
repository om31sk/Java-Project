package org.book_recommend.clientapp;
import java.util.*;

import org.book_recommend.model.AuthorModel;
import org.book_recommend.model.BookModel;
import org.book_recommend.model.CategoryModel;
import org.book_recommend.model.PublicationModel;
import org.book_recommend.service.AuthorService;
import org.book_recommend.service.AuthorServiceImpl;
import org.book_recommend.service.BookService;
import org.book_recommend.service.BookServiceImpl;
import org.book_recommend.service.CategoryService;
import org.book_recommend.service.CategoryServiceImpl;
import org.book_recommend.service.PubService;
import org.book_recommend.service.PubServiceImpl;
public class BookClientApp
{
    static  Scanner sc=new Scanner(System.in);
    static BookService bookService=new BookServiceImpl();
    static PubService pubService=new PubServiceImpl();
    static CategoryService catService=new CategoryServiceImpl();
    static AuthorService authService=new AuthorServiceImpl();
    static int ch,y=1;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       
        
        do 
        {
        	System.out.println("1: Book Master:");
        	System.out.println("2: Publication Master:");
        	System.out.println("3: Category Master:");
        	System.out.println("4: Author Master:");
        	System.out.println("5: User Master:");
        	System.out.println("6: User Review And Ratings:");
        	System.out.println("7: Recommendation Logics:");
        	System.out.println("8: Exist:");
        	System.out.println("Enter Your Choice");
        	ch=sc.nextInt();
        	switch(ch)
        	{
        	   case 1:
        		   bookMenu();
        		break;
        	   case 2:
        		   pubMenu();
        		break;
        	   case 3:
        		   catMenu();
        		break;
        	   case 4:
        		   authMenu();
        		break;
        	   case 5:
        		break;
        	   case 6:
        		break;
        	   case 7:
        		break;
        	   case 8:
        		   System.exit(0);
        		break;
        	   default:
        		   System.out.println("Invalid Input:");
        		 break;
        		
        	}
        	
        }while(y==1);
	}


	public static void bookMenu() 
	{
		 boolean flag=true;
		// TODO Auto-generated method stub
		do
		{
		   System.out.println("1:Add New Book:");
		   System.out.println("2:View All Books:");
		   System.out.println("3:Search Book:");
		   System.out.println("4:Delete Book by Name:");
		   System.out.println("5:Update Book by Name:");
		   System.out.println("6:Return to main Menu:");
		   
		   System.out.println("Enter Your Choice");
       	   ch=sc.nextInt();
		   
		   switch(ch)
		   {
		     case 1:
		    	 sc.nextLine();
		 		System.out.println("Enter book name price publish date and description");
		 		System.out.println("Enter Book Name:");
		 		String bname = sc.nextLine();
		 		System.out.println("Enter Book Price:");
		 		float price = sc.nextFloat();
		 		sc.nextLine();
		 		System.out.println("Enter Book Publish Date:");
		 		String date = sc.nextLine();
		 		System.out.println("Enter Book BriefDescription:");
		 		String briefDesc = sc.nextLine();
		 		BookModel bookModel = new BookModel(0, bname, price, date, briefDesc);
		 		boolean b = bookService.isAddNewBook(bookModel);
		 		if (b) 
		 		{
		 			System.out.println("Book Added In Database Table");
		 		} 
		 		else
		 		{
		 			System.out.println("Some problem is there.......");
		 		}
		      break;
		     case 2:
		    	 List<BookModel> list=bookService.getAllBooks();
		    	 if(list!=null)
		    	 {
		    		list.forEach((bk)->System.out.println(bk.getBid()+"\t"+bk.getBname()+"\t"+bk.getPrice()+"\t"+bk.getPyear()+"\t"+bk.getBriefdesc())); 
		    	 }
		    	 else
		    	 {
		    		 
		    	 }
		      break;
		     case 3:
		    	 sc.nextLine();
		    	 System.out.println("Enter book name for Search:");
		    	 bname=sc.nextLine();
		    	 BookModel ref=bookService.getBookByName(bname);
		    	 if(ref!=null)
		    	 {
		    		 System.out.println(ref.getBid()+"\t"+ref.getBname()+"\t"+ref.getPrice()+"\t"+ref.getPyear()+"\t"+ref.getBriefdesc());
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Book Not Found");
		    	 }
		      break;
		     case 4:
		      break;
		     case 5:
		    	 sc.nextLine();
		    	 System.out.println("Enter book name for Update Book:");
		    	 String bnameForSearch=sc.nextLine();
		    	 ref=bookService.getBookByName(bnameForSearch);
		    	 if(ref!=null)
		    	 {
		    		 System.out.println("Enter new data for book");
		    		 System.out.println("Enter Book Name:");
			    	 bname=sc.nextLine();
			    	 System.out.println("Enter Book Price:");
			    	 price=sc.nextFloat();
			    	 sc.nextLine();
			    	 System.out.println("Enter Book Publish Date:");
			    	 date=sc.nextLine();
			    	 System.out.println("Enter Book BriefDescription:");
			    	 briefDesc=sc.nextLine();
			    	 bookModel=new BookModel(0,bname,price,date,briefDesc);
		    		 b=bookService.isUpdateBook(bookModel,bnameForSearch);
		    		 if(b)
		    		 {
		    			System.out.println("Book Updated Successfully.........");
		    		 }
		    		 else
		    		 {
		    			 System.out.println("Some problem is there.......");
		    		 }
		    	 }
		    	 else
		    	 {
		    		 System.out.println("Book Not Found");
		    	 }
		      break;
		     case 6:
		    	 flag=false;
		      break;
		     default:
		    	 System.out.println("Wrong Choice:");
		       break;
		     
		   }
		 
		}while(flag);
	}
	
	public static void pubMenu()
	{
		 boolean flag=true;
	    do
	    {
		   System.out.println("1:Add New Publication:");
		   System.out.println("2:View All Publication:");
		   System.out.println("3:Search Publication:");
		   System.out.println("4:Delete Publication:");
		   System.out.println("5:Update Publication:");
		   System.out.println("6:Return to main Menu:");
		   
		   System.out.println("Enter Your Choice");
    	   ch=sc.nextInt();
		   
		   switch(ch)
		   {
		     case 1:
		    	  sc.nextLine();
		    	  System.out.println("Enter Publication Name:");
			      String pubName=sc.nextLine();
			      PublicationModel model=new PublicationModel(0,pubName);
			      boolean b=pubService.isAddNewPublication(model);
			      if(b)
			      {
			    	 System.out.println("Publication Added SuccessFully.......");
			      }
			      else
			      {
			    	 System.out.println("Some problem is there.......");
			      }
		      break;
		     case 2:
		    	
		      break;
		     case 3:
		    	
		      break;
		     case 4:
		      break;
		     case 5:
		    	 
		      break;
		     case 6:
		    	 flag=false;
		      break;
		     default:
		    	 System.out.println("Wrong Choice:");
		       break;
		     
		   }
		 
		}while(flag);
	}
	
	public static void catMenu()
	{
		 boolean flag=true;
		    do
		    {
			   System.out.println("1:Add New Category:");
			   System.out.println("2:View All Category:");
			   System.out.println("3:Search Category:");
			   System.out.println("4:Delete Category:");
			   System.out.println("5:Update Category:");
			   System.out.println("6:Return to main Menu:");
			   
			   System.out.println("Enter Your Choice");
	    	   ch=sc.nextInt();
			   
			   switch(ch)
			   {
			     case 1:
			    	  sc.nextLine();
			    	  System.out.println("Enter Category Name:");
				      String catName=sc.nextLine();
				      CategoryModel cmodel=new CategoryModel(0,catName);
				      boolean b=catService.isAddNewCategory(cmodel);
				      if(b)
				      {
				    	 System.out.println("Category Added SuccessFully.......");
				      }
				      else
				      {
				    	 System.out.println("Some problem is there.......");
				      }
			      break;
			     case 2:
			    	
			      break;
			     case 3:
			    	
			      break;
			     case 4:
			      break;
			     case 5:
			    	 
			      break;
			     case 6:
			    	 flag=false;
			      break;
			     default:
			    	 System.out.println("Wrong Choice:");
			       break;
			     
			   }
			 
			}while(flag);
	}
	
	public static void authMenu() 
	{
		boolean flag=true;
	    {
		   System.out.println("1:Add New Author:");
		   System.out.println("2:View All Author:");
		   System.out.println("3:Search Author:");
		   System.out.println("4:Delete Author:");
		   System.out.println("5:Update Author:");
		   System.out.println("6:Return to main Menu:");
		   
		   System.out.println("Enter Your Choice");
    	   ch=sc.nextInt();
		   
		   switch(ch)
		   {
		     case 1:
		    	  sc.nextLine();
		    	  System.out.println("Enter Author Name:");
			      String authName=sc.nextLine();
			      String qual="";
			      int age=0;
			      int result=authService.getAuthorId(authName);
			      if(result!=-1)
			      {
			    	 System.out.println("It Is Existing Author or consider as new");
			    	 String msg=sc.nextLine();
			    	 if(msg.equals("yes"))
			    	 {
			    		 System.out.println("No need to take existing author info"); 
			    	 }
			    	 else
			    	 {
			    		 System.out.println("Author qualification and age");
				    	 qual=sc.nextLine();
				    	 age=sc.nextInt(); 
			    	 }
			      }
			      else
			      {
			    	 System.out.println("Author qualification and age");
			    	 qual=sc.nextLine();
			    	 age=sc.nextInt();
			      }
			        sc.nextLine();
			 		System.out.println("Enter book name price publish date and description");
			 		System.out.println("Enter Book Name:");
			 		String bname = sc.nextLine();
			 		System.out.println("Enter Book Price:");
			 		float price = sc.nextFloat();
			 		sc.nextLine();
			 		System.out.println("Enter Book Publish Date:");
			 		String date = sc.nextLine();
			 		System.out.println("Enter Book BriefDescription:");
			 		String briefDesc = sc.nextLine();
			 		System.out.println("Select Book Category");
			 		
			 		BookModel bookModel = new BookModel(0, bname, price, date, briefDesc);
			 		boolean b = bookService.isAddNewBook(bookModel);
			 		if (b) 
			 		{
			 			System.out.println("Book Added In Database Table");
			 		} 
			 		else
			 		{
			 			System.out.println("Some problem is there.......");
			 		}
			      /*System.out.println("Enter Author Qualification:");
			      String qual=sc.nextLine();
			      System.out.println("Enter Author Experience:");
			      int exp=sc.nextInt();
			      AuthorModel authModel=new AuthorModel(0,authName,qual,exp);
			      boolean b=catService.isAddNewCategory(cmodel);
			      */
		      break;
		     case 2:
		    	
		      break;
		     case 3:
		    	
		      break;
		     case 4:
		      break;
		     case 5:
		    	 
		      break;
		     case 6:
		    	 flag=false;
		      break;
		     default:
		    	 System.out.println("Wrong Choice:");
		       break;
		     
		   }
		 
		}while(flag);
	   
	}

}
