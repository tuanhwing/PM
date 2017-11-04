package manage.process.project.pm.filter;

import android.widget.Filter;

import java.util.ArrayList;

import manage.process.project.pm.adapter.TaskAdapter;
import manage.process.project.pm.object.OTask;

/**
 * Created by Tuan on 31/10/2017.
 */

public class TaskFilter extends Filter {

    TaskAdapter taskAdapter;
    ArrayList<OTask> filterTask;

    public TaskFilter(TaskAdapter taskAdapter, ArrayList<OTask> filterTask) {
        this.taskAdapter = taskAdapter;
        this.filterTask = filterTask;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults filterResults = new FilterResults();

        if(constraint != null  && constraint.length() > 0){
            //Change to upper
            constraint = constraint.toString().toUpperCase();
            //Store our filtered task
            ArrayList<OTask> filteredTask = new ArrayList<>();

            for(int i=0;i<filterTask.size();i++){
                //check
                if(filterTask.get(i).getName().contains(constraint)){
                    //add a task to filtered task
                    filteredTask.add(filterTask.get(i));
                }
            }
            filterResults.count = filteredTask.size();
            filterResults.values = filteredTask;
        } else {
            filterResults.count = filterTask.size();
            filterResults.values = filterTask;
        }

        return filterResults;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        taskAdapter.setTasks((ArrayList<OTask>) results.values);

        //refresh
        taskAdapter.notifyDataSetChanged();
    }
}
