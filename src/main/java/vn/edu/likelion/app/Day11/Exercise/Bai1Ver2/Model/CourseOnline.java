package vn.edu.likelion.app.Day11.Exercise.Bai1Ver2.Model;

public class CourseOnline extends Course {
    private String netWorkingPlatform;
    private int courseDurationDates;

    public CourseOnline(){}

    public CourseOnline(int courseId, String courseName, String mentorName, int credit,  String netWorkingPlatform, int courseDuration) {
        super(courseId, courseName, mentorName, credit );
        this.netWorkingPlatform = netWorkingPlatform;
        this.courseDurationDates = courseDuration;
    }

    public String getNetWorkingPlatform() {
        return netWorkingPlatform;
    }

    public void setNetWorkingPlatform(String netWorkingPlatform) {
        this.netWorkingPlatform = netWorkingPlatform;
    }

    public int getCourseDurationDates() {
        return courseDurationDates;
    }

    public void setCourseDurationDates(int courseDurationDates) {
        this.courseDurationDates = courseDurationDates;
    }

    @Override
    public String toString(){
        return "CourseOnline:[courseId: " + super.getCourseId()
               + ", courseName: " + super.getCourseName()
               + ", mentorName: " + super.getMentorName()
               + ", credit: " + super.getCredit()
                + ", netWorkingPlatform: " + netWorkingPlatform
                + ", courseDurationDates: " + courseDurationDates + "]";
    }
}
