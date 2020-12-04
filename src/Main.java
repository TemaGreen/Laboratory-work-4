import java.io.*;

public class Main
{
    public static void main(String[] args) throws DuplicateSubjectException, FileNotFoundException, IOException, ClassNotFoundException{
        Pupil boy = new Schoolboy("Хамидуллин", 3);
        boy.setMark(0,3);
        boy.setMark(1,4);
        boy.setMark(2,5);
        boy.setSubject(0, "Математика");
        boy.setSubject(1, "Русский");
        boy.setSubject(2, "Физика");

        System.out.println(boy.toString());
    }
}