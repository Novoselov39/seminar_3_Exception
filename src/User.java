
public class User {

// фамилия, имя, отчество - строки
// датарождения - строка формата dd.mm.yyyy
// номертелефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.

private String secondName;
private String firstName;
private String lastName;
private String dateBirth;
private Long numberPhone;
private char gender; 



private User(String secondName, String firstName, String lastName, String dateBirth, Long numberPhone, char gender) {
    this.secondName = secondName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateBirth = dateBirth;
    this.numberPhone = numberPhone;
    this.gender = gender;
}

public static User Create(String secondName, String firstName, String lastName, String dateBirth, Long numberPhone, char gender){

    return new User(secondName, firstName, lastName, dateBirth, numberPhone, gender);

}






@Override
public String toString() {
    return "User [secondName=" + secondName + ", firstName=" + firstName + ", lastName=" + lastName + ", dateBirth="
            + dateBirth+ 
            ", numberPhone=" + numberPhone + ", gender=" + gender + "]";
}
public String toStringFile() {
    return "<" + secondName + "><" + firstName + "><" + lastName + "><"
            + dateBirth + 
            "><" + numberPhone + "><" + gender + ">\n";
}

public String getSecondName() {
    return secondName;
}
public void setSecondName(String secondName) {
    this.secondName = secondName;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getDateBirth() {
    return dateBirth;
}
public void setDateBirth(String dateBirth) {
    this.dateBirth = dateBirth;
}


public void setNumberPhone(Long numberPhone) {
    this.numberPhone = numberPhone;
}

public char getGender() {
    return gender;
}

public void setGender(char gender) {
    this.gender = gender;
}

public Long getNumberPhone() {
    return numberPhone;
}



    
}
