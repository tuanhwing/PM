package manage.process.project.pm.view;

import java.util.ArrayList;

import manage.process.project.pm.object.MTask;

/**
 * Created by Tuan on 01/11/2017.
 */

public interface TaskView {
    void visibleProgressBar();

    void inVisibleProgressBar();

    void showTasks(ArrayList<MTask> tasks);

    void addTask(MTask task);
}
