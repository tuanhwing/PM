package manage.process.project.pm.object;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Tuan on 08/10/2017.
 */

public class MTask implements Serializable{
    private Team team;
    private Date deadline;
    private MDocument document;

    public MTask() {
    }

    public MTask(Team team, Date deadline, MDocument document) {
        this.team = team;
        this.deadline = deadline;
        this.document = document;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public MDocument getDocument() {
        return document;
    }

    public void setDocument(MDocument document) {
        this.document = document;
    }
}
