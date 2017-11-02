package manage.process.project.pm.object;

import java.io.Serializable;

/**
 * Created by Tuan on 08/10/2017.
 */

public class Member implements Serializable{
    String fullName;
    String urlImage;
    int roll;

    public Member() {
    }

    public Member(String fullName, String urlImage, int roll) {
        this.fullName = fullName;
        this.urlImage = urlImage;
        this.roll = roll;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
