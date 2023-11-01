// sealed key introdu for java 17. this class not inheritence all class it inhirentce only permits class



 //sealed class A permits B,C{

//}
 final class B extends A{// it will extends only final and non sealed class

}

/*non sealed*/ //non-sealed class C extends A{

//}
public class ExampleOfSealedJava17Feature {
}
