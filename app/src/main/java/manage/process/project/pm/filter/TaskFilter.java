package manage.process.project.pm.filter;

import android.widget.Filter;

import java.util.ArrayList;

import manage.process.project.pm.adapter.TaskAdapter;
import manage.process.project.pm.object.MTask;

/**
 * Created by Tuan on 31/10/2017.
 */

public class TaskFilter extends Filter {

    TaskAdapter taskAdapter;
    ArrayList<MTask> filterTask;

    public TaskFilter(TaskAdapter taskAdapter, ArrayList<MTask> filterTask) {
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
            ArrayList<MTask> filteredTask = new ArrayList<>();

            for(int i=0;i<filterTask.size();i++){
                //check
                if(filterTask.get(i).getTeam().getMembers().get(0).getFullName().toUpperCase().contains(constraint)){
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
        taskAdapter.setTasks((ArrayList<MTask>) results.values);

        //refresh
        taskAdapter.notifyDataSetChanged();
    }
}
