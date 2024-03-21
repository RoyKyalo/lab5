public class hms {

    // Creating the custom checked exception
    static class InvalidAgeException extends Exception
    {
        public InvalidAgeException(String message)
        {
            super(message);
        }
    }

    // The patient class
    static class Patient
    {
        private int age;


        //set age function
        public void setAge(int age) throws InvalidAgeException
        {
            if (age < 0 || age > 130) {
                throw new InvalidAgeException("You have entered an invalid age of : " + age + ". Kindly not that the age must be between 0 and 130.");
            }
            this.age = age;
        }
        //Get age function
        public int getAge()
        {
            return age;
        }
    }

    // Main class that is intended to test the system functions
    public static class Main
    {
        public static void main(String[] args)
        {
            Patient patient = new Patient();


            //Try and catch method in use
            try
            {
                // Setting valid age
                patient.setAge(23);
                System.out.println("Successful age setting. Valid age of: " + patient.getAge());

                // Setting invalid age
                patient.setAge(155); // This will throw an InvalidAgeException
                System.out.println("This line will not be successfully executed.");
            }
            catch (InvalidAgeException e)
            {
                System.out.println("You have entered an invalid age (It is not within the age limit): " + e.getMessage());
            }
        }
    }
}