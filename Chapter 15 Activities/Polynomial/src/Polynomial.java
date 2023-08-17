import java.util.LinkedList;
import java.util.ListIterator;
/**
   A class to represent a polynomial.
*/
public class Polynomial
{
   . . .

   /**
      Constructs an empty polynomial
   */
   public Polynomial()
   {
      . . .
   }

   /**
      Constructs a new polynomial with the given term
      @param t the term to initialize the polynomial with
   */
   public Polynomial(Term t)
   {
      . . .
   }

   /**
      Adds the polynomial such that the terms are in sorted order
      from highest power to lowest
      @param p the polynomial to add
   */
   public void add(Polynomial p)
   {
      . . .


   }

   /**
      Multiplies the given polynomial with this one and returns the result
      @param p the polynomial to multiply
      @return this * p
   */
   public Polynomial multiply(Polynomial p)
   {
      . . .


   }

   /**
      Prints the polynomial "nicely" so that it reads
      from highest term to lowest and doesn't have a
      leading "+" if the first term is positive.
   */
   public void print()
   {
      . . .



   }
}
