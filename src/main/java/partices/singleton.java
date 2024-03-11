package partices;

public class singleton {


        private static  singleton singleton_val=null;
        String s;
        private singleton()
        {
            s="HI single";
        }
        public static  singleton getInstance()
        {
            if(singleton_val==null){
                singleton_val= new singleton();
            }


            return singleton_val;
        }
}

