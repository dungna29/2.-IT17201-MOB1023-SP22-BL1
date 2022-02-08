/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI3_Collection_Map;


/**
 *
 * @author ACER
 */
public class Teacher extends Person implements Comparable<Teacher> {

    private String TeacherID;
    private double hours;

    public Teacher() {
    }

    public Teacher(String TeacherID, double hours, String _FirstName, String _MidleName, String _LastName, int _YearOfBird, String _Address) {
        super(_FirstName, _MidleName, _LastName, _YearOfBird, _Address);
        this.TeacherID = TeacherID;
        this.hours = hours;
    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String TeacherID) {
        this.TeacherID = TeacherID;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    String ValuatePerson() {
        if (hours < 100) {
            return "cần bổ sung giờ dạy";
        } else if (hours <= 300) {
            return "giờ dạy tốt ";
        } else if (hours < 500) {
            return "có giờ giảng dạy lớn hơn 300";
        } else {
            return "";
        }
    }

    @Override
    void OutputPerson() {
        System.out.printf("tên GV :  %s %s %s năm sinh GV: %d mã GV : %s số giờ giảng dạy : %f \n địa chỉ : %s\n", getFirstName(), getMidleName(), getLastName(), getYearOfBird(), getTeacherID(), getHours(), getAddress());
        System.out.println("------------------------------------------");
    }

    @Override
    void InputPerson() {
    }

    @Override
    public int compareTo(Teacher o) {
        return this.TeacherID.compareTo(o.getTeacherID());
    }

    void InputTeacher() {
    }

    void OutputTeacher() {
    }

    void ValuateTeacher() {
    }
}
