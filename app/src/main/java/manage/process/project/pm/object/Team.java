package manage.process.project.pm.object;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Tuan on 08/10/2017.
 */

public class Team implements Serializable {
    List<Member> members;

    public Team() {
    }

    public Team(List<Member> members) {
        this.members = members;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
