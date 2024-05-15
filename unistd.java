import java.time.LocalDate;
import java.time.Period;

public class unistd {
    String Name;
    int indexNumber;
    String Department;
    String hallOfResidence;
    int yearOfBirth;
    double cwa;

    unistd (String newName, int newindexNumber, String newDepartment, String newhallOfResidence, int newyearOfBirth, double newcwa){
        Name = newName;
        indexNumber = newindexNumber;
        Department = newDepartment;
        hallOfResidence = newhallOfResidence;
        yearOfBirth = newyearOfBirth;
        cwa = newcwa;
    }
    unistd(String newName, int newindexNumber, double newcwa){
        Name = newName;
        indexNumber = newindexNumber;
        cwa = newcwa;
    }

    String getName(){
        return Name;
    }

    int getIndexNumber(){
        return indexNumber;
    }

    String getDepartment(){
        return Department;
    }

    String getHallOfResidence(){
        return hallOfResidence;
    }

    double getCwa(){
        return cwa;
    }

    int getYearOfBirth(){
        return yearOfBirth;
    }

    int getstdAge(int yearOfBirth){
        LocalDate Age = LocalDate.of( yearOfBirth,1,1);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(LocalDate.ofEpochDay(yearOfBirth), currentDate);
        return period.getYears();
    }
}

