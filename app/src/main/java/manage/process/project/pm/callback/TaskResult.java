package manage.process.project.pm.callback;

import java.util.ArrayList;

import manage.process.project.pm.object.OTask;

/**
 * Created by Tuan on 01/11/2017.
 */

public interface TaskResult {

    void startLoadTasks();
    void loadTasksSuccess(ArrayList<OTask> tasks);
    void loadTasksError();
}
