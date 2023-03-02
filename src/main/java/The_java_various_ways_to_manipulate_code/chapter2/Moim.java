package The_java_various_ways_to_manipulate_code.chapter2;

public class Moim {
    int maxNumberOfAttendees;
    int numberOfEnrollment;

    boolean isEnrollmentFull() {
        if (maxNumberOfAttendees == 0) {
            return false;
        }

        if (numberOfEnrollment < maxNumberOfAttendees) {
            return false;
        }
        return true;
    }
}
