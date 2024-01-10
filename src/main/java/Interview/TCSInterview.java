package Interview;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class TCSInterview {

    public static void main(String[] args) {

        Integer n1= 100;
        Integer n2= 100;
        Integer n3= 500;
        Integer n4= 500;//-127 to 128
//Ans:n1==n2 and n3!==n4

        if(n1==n2){
            System.out.println("n1==n2");
        }
           else{
            System.out.println("n1!==n2");
        }
        if(n3==n4){
            System.out.println("n3==n4");
        }
        else{
            System.out.println("n3!==n4");
        }

        // display the gt>20 values in the list
        int[] numbers={23,14,56,0,8,34};
        List<Integer> list = Arrays.stream(numbers).boxed().filter(x->x>20)
                .collect(Collectors.toList());
        System.out.println(list);
    }

/*

iterator and listiterator

iterator to  any traversing the colloetion values- forward dirctionlistiterator
lis titerator to travesing only list interaffaces values-back and forword direction

hashtable and currenthashmap

hashtable and currentMap sycroztion.

hashtable is locked entire level

currenthashmap is segemment level(read)


hashMap:

it is bict 16. equal method

userdifine object?

employee pojo class
 varaiable create

 in Map <Employee>

i need to override tostring and  hash code




satatic class

we need not  create object. satic it load at the class. it copy of at one time.



failfast and failsafe

failFast: When travesring the itersing while we do modification.it will throw the cuurrent modification exception.
it is check the mod count. base on the exception will ocur example:ArrayList,HashMap
FailSafe: allow the modification of a clloection while iterting overit
They use copy of the orinal collection to traverse over the elements of the collection.
Ex ConCurrentHashMap.




compartor  : customzied sorting
it mulitilpe element compare()

and comparable: noramal sorting
it is single element use comparTo()


immutable

it is someintng can not be changes ex string str="abcd". it will not modifify the orginal memeory allocation

if we want to change update the values the refer of memory allocation is diff not update the original memory allocation

Immutable objects?
yes
customzied immutable ,private constorster,only getter only ,private varaible
singleton ?

it is design patteren.only one instance. springbean


create singleton class

create private constroctor
and call the getInstance menthod  to create the object
we create varible for staic class name obj=null;

how to break the sigleton?
usig refection and serization and clone we can break the singlton other instance

Serailaztion?

once we create class and oblecet and delete the object with out create the object we into call the class.

we convert the object in btye of steam and store the paratcailr location liket we pass objet into  database and network calls.when ever we want we des
object state and transfer the data thruogh network
=

whatis enum?

in side the enum diffrent type of Constant.
like type of Car Name and we can use any where use of Constant


abstart and en


ad:hidding of irrelative deatils form the user .if the user send the request. we do not want to show the logic  implemts of the detilas just show the resoponse like ATM.
En:warping about the single unit .example class.


what will happened class A singleton class  inside class B protetype?

what will happened class A protetype class  inside class B singleton? singleton



 */





}
