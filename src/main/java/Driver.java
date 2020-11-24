import org.joda.time.DateTime;

public class Driver {

    // Disclaimer:
    // Following the assignment pdf each class can add at least one of each other class however
    // I chose to follow the structure of Course has modules has students. Since it meant I can implement a
    // nice easy to string method. Each course can print all modules and students, each module can print all students
    // each student can print all personal info.
    public static void main(String[] args) {
        DateTime startTime = new DateTime(2020, 9, 1, 15, 0);
        DateTime endTime = new DateTime(2021, 6, 1, 15, 0);

        // create fake students
        Student johnL = new Student("John Lennon", 1, 80, "9/10/1940");
        Student paulM = new Student("Paul McCartney", 2, 78, "18/06/1942");
        Student georgeH = new Student("George Harrison", 3, 77, "25/02/1943");
        Student ringoS = new Student("Ringo Star", 4, 80, "07/07/1940");
        Student axlR = new Student("Axl Rose", 5, 58, "06/02/1962");
        Student slash = new Student("Slash", 6, 55, "23/07/1965");
        Student duffM = new Student("Duff McKagan", 7, 56, "05/02/1964");
        Student izzyS = new Student("Izzy Stradlin", 8, 58, "08/04/1962");
        Student stevenA = new Student("Steven Adler", 9, 55, "22/01/1965");
        Student dizzyR = new Student("Dizzy Reed", 10, 57, "18/06/1963");

        // create fake modules
        Module guitar = new Module("Guitar for Dummies", 110);
        Module rockNRoll = new Module("How does one Rock and Roll?", 111);
        Module partying = new Module("Queen's guide to hosting a party", 112);
        Module otherInstruments = new Module("Why does everyone love guitars and singers?", 114);

        //create fake courses
        Course rockStar = new Course("BA Rock Star Science", startTime, endTime);
        Course music101 = new Course("BA Musical Musicness", startTime, endTime);

        //add students to modules
        guitar.addStudent(slash);
        guitar.addStudent(duffM);
        guitar.addStudent(georgeH);
        guitar.addStudent(paulM);

        rockNRoll.addStudent(johnL);
        rockNRoll.addStudent(axlR);
        rockNRoll.addStudent(slash);

        partying.addStudent(johnL);
        partying.addStudent(axlR);
        partying.addStudent(slash);
        partying.addStudent(izzyS);

        otherInstruments.addStudent(izzyS);
        otherInstruments.addStudent(ringoS);
        otherInstruments.addStudent(duffM);
        otherInstruments.addStudent(stevenA);
        otherInstruments.addStudent(dizzyR);

        //add modules to courses
        rockStar.addModule(rockNRoll);
        rockStar.addModule(partying);
        music101.addModule(guitar);
        music101.addModule(otherInstruments);

        System.out.println(rockStar.toString());
        System.out.println(music101.toString());
    }
}
