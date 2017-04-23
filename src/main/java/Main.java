public class Main {

        String name;

        Main(String name)
        {
            this.name = name;
        }

        protected void finalize() throws Throwable
        {
            System.out.println(name + " destroyed");
        }
    }

