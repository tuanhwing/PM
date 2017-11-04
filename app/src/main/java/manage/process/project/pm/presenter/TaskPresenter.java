package manage.process.project.pm.presenter;

import java.util.ArrayList;

import manage.process.project.pm.callback.TaskResult;
import manage.process.project.pm.model.TaskHelper;
import manage.process.project.pm.object.OTask;
import manage.process.project.pm.view.TaskView;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskPresenter implements TaskResult{
    private TaskView view;
    private TaskHelper model;

    public TaskPresenter(TaskView view, TaskHelper model){
        this.view = view;
        this.model = model;
        this.model.setOnMainResult(this);
    }

    public void loadTasks(){
        model.loadTasks();
    }

    public void addTask(OTask task) {
        view.addTask(task);
    }

    @Override
    public void startLoadTasks() {
        view.visibleProgressBar();
    }

    @Override
    public void loadTasksSuccess(ArrayList<OTask> tasks) {
        view.inVisibleProgressBar();
        view.showTasks(false, tasks);
    }


    @Override
    public void loadTasksError() {
        view.inVisibleProgressBar();
        view.showTasks(true,null);
    }
}
