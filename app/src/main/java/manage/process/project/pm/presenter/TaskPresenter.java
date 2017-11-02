package manage.process.project.pm.presenter;

import java.util.ArrayList;

import manage.process.project.pm.callback.TaskResult;
import manage.process.project.pm.model.TaskHelper;
import manage.process.project.pm.object.MTask;
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

    public void addTask(MTask task) {
        view.addTask(task);
    }

    @Override
    public void startLoadTasks() {
        view.visibleProgressBar();
    }

    @Override
    public void loadTasksSuccess(ArrayList<MTask> tasks) {
        view.inVisibleProgressBar();
        view.showTasks(tasks);
    }


    @Override
    public void loadTasksError() {

    }
}
