public class HashSetTester
{
   public static void main(String[] args)
   {
      HashSet names = new HashSet(5);
      names.add("Harry");
      names.add("Sue");
      names.add("Nina");
      names.add("Susannah");
      names.add("Larry");
      System.out.println("5 names added: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 5/5");
      names.add("Eve");
      System.out.println("6 names added: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 6/10");
      names.add("Sarah");
      names.add("Adam");
      names.add("Tony");
      names.add("Katherine");
      System.out.println("10 names added: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 10/10");
      names.add("Juliet");
      System.out.println("11 names added: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 11/20");
      names.remove("Tony");
      System.out.println("1 name removed: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 10/20");
      names.remove("Juliet");
      System.out.println("1 name removed: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 9/10");
      names.remove("Adam");
      names.remove("Katherine");
      names.remove("Sarah");
      names.remove("Eve");
      System.out.println("4 names removed: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 5/10");
      names.remove("Sue");
      System.out.println("1 name removed: " + names.size() + "/" + names.getBucketsSize());
      System.out.println("Expected: 4/5");
   }
}
