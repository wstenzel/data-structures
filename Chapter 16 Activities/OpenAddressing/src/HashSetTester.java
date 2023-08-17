public class HashSetTester
{
   public static void main(String[] args)
   {
      HashSet names = new HashSet(6);

      names.add("Harry");
      // This try to get into 4
      names.add("Romeo");
      // Both of these should try to get into bucket 3
      names.add("Susannah");
      names.add("Sarah");
      // This should try to get into bucket 5 (occupied)
      names.add("Adam");
      // Should try to go into 0 (occupied)
      names.add("Larry");
      System.out.println(names);
      System.out.println("Expected: [Adam, Larry, Harry, Susannah, Romeo, Sarah]");
      
      // Remove Susannah; should replace with Sarah
      // Entire probing sequence should be rehashed, so 
      // both Adam and Larry are moved.
      names.remove("Susannah");
      System.out.println(names);
      System.out.println("Expected: [Larry, null, Harry, Sarah, Romeo, Adam]");
      
      // Contains Adam?
      System.out.println(names.contains("Adam"));
      System.out.println("Expected: true");
   }
}
