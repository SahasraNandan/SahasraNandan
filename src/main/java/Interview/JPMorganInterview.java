package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JPMorganInterview {
    /* 1.Diffrence bw @Component And @Bean
         it is more generic Stereotype  annotation to manage any component by Spring
 if want to represent any class .
 @Component is Class level
 @ Bean annotations is used to create custom objects by Ioc Container
 @Bean is Object level
when I should use suppose  spring security library
 this particular class available inside the library not available the com.pakage
 we not mention the @component because it is already create .then we IOC container
 Rest template, Spring Security, web client, authentication,
in side java class.

2.Java 8 drawbacks
    *
    *streams have (sometimes substantial) overhead, so need to pay attention when writing performance critical code, especially with collectors.
    *Stateless lambda expressions: If you are using parallel stream and lambda expressions are stateful, it can be result in random responses.
    Streams are most effective when dealing with large datasets or complex transformations.

     For simpler operations or scenarios where performance is critical, traditional loop constructs might be more suitable.
     Debugging stream operations can be challenging. Intermediate operations are lazily evaluated, and errors might not surface until a terminal operation is invoked.
      This delayed evaluation makes it harder to pinpoint issues during debugging


    3.Code review process
    1. description what is exactly functionalty

2. which files are changed. added new file and changes the existing file


3. I need chek out the pull request branch into my IDE.


4. if i need add any configratuion check pull request owner

5. runthe all automation  test scripts

7. check code reusable and duplicate varabile method or varabile added
8.if merage confictls

9.approved


4.  write program input in list values in accesding order
    */


    public static void main(String[] args) {


        //   JPB b =new JPB();
        // System.out.println(b.a);
        // Create an array of integers
        int[] numbers = {25, 23, 1, 8, 15, 36};

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted List: " + Arrays.toString(numbers));
        // stremAPI ascending order
        List<Integer> list = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
// // stremAPI descending order
//            List<Integer> list=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted List:  stremAPI  " + list);


    }

    //5. if we not mention the Static key word it will get the compile time error bcz, static methods  not allowed the non static  varaible
    // before class we mention static method no comile time error
    static class JPB {
        protected int a = 10, b = 30;

    }
}
         /* 6.  public RestultSet getResult(){
              dbconnection C= new DbConnection

             String query="abc";

            RestultSet result=C.excuteQuery(query);

}

    public class YourClassNameTest {

        @Test
        public void testGetResult() throws SQLException {
            // Create a mock DbConnection
            DbConnection dbConnection = mock(DbConnection.class);

            // Create a mock Connection
            Connection connection = mock(Connection.class);

            // Create a mock Statement
            Statement statement = mock(Statement.class);

            // Create a mock ResultSet
            ResultSet resultSet = mock(ResultSet.class);

            // Set up the mock behavior
            when(dbConnection.getConnection()).thenReturn(connection);
            when(connection.createStatement()).thenReturn(statement);
            when(statement.executeQuery(anyString())).thenReturn(resultSet);

            // Create an instance of the class under test
            YourClassName yourClass = new YourClassName();

            // Inject the mock DbConnection into the class
            // (you may need a setter method in YourClassName for this)
            // yourClass.setDbConnection(dbConnection);

            // Call the method under test
            ResultSet result = yourClass.getResult();

            // Verify that the query was executed and the result set is not null
            verify(statement).executeQuery(anyString());
            assertNotNull(result);

            // You can also further test the behavior with specific queries and expected results
            // For example: verify(statement).executeQuery("SELECT * FROM your_table");

            // Note: In a real-world scenario, you would need to handle exceptions and close resources
        }*/





