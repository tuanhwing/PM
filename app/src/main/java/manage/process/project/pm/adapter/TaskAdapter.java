package manage.process.project.pm.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;

import manage.process.project.pm.AssignActivity;
import manage.process.project.pm.R;
import manage.process.project.pm.filter.TaskFilter;
import manage.process.project.pm.holder.TaskHolder;
import manage.process.project.pm.object.MTask;
import manage.process.project.pm.object.Member;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskAdapter extends  RecyclerView.Adapter<TaskHolder> implements Filterable{
    private ArrayList<MTask> tasks, filterList;
    private TaskFilter taskFilter;
    private Context context;

    public TaskAdapter(ArrayList<MTask> tasks,Context context) {
        this.tasks = tasks;
        this.filterList = tasks;
        this.context = context;
    }

    public void setTasks(ArrayList<MTask> tasks){
        this.tasks = tasks;
    }

    @Override
    public TaskHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.list_item_task,parent,false);
        return new TaskHolder(itemView,context);
    }


    @Override
    public void onBindViewHolder(TaskHolder holder, final int position) {
        holder.tvDeadline.setText(tasks.get(position).getDeadline().toString());
        holder.tvNameDocument.setText(tasks.get(position).getDocument().getNameDocument());
        //[START] add content members
        boolean temp = false;
        for (Member member: tasks.get(position).getTeam().getMembers()
                ) {
            if(!temp){
                holder.tvMembers.setText(member.getFullName());
                temp = true;
            } else holder.tvMembers.append("\n" + member.getFullName());

        }
        //[END] add content members
        holder.tvNumOfDoc.setText(String.valueOf(tasks.get(position).getDocument().getNumberOfDocument()));
        holder.tvNumOfPage.setText(String.valueOf(tasks.get(position).getDocument().getNumberOfPage()));
        holder.tvNumOfSub.setText(String.valueOf(tasks.get(position).getDocument().getNumberOfSubDocument()));
        holder.tvColorOut.setText(String.valueOf(tasks.get(position).getDocument().getNumberColorOut()));
        holder.tvColorIn.setText(String.valueOf(tasks.get(position).getDocument().getNumberColorOut()));
        holder.tvColorSub.setText(String.valueOf(tasks.get(position).getDocument().getNumberColorSubDocument()));
        holder.tvTypePaperOut.setText(String.valueOf(tasks.get(position).getDocument().getPaperOut()));
        holder.tvTypePaperIn.setText(String.valueOf(tasks.get(position).getDocument().getPaperIn()));
        holder.tvTypePaperSub.setText(String.valueOf(tasks.get(position).getDocument().getPaperSub()));
        holder.tvSize.setText(String.valueOf(tasks.get(position).getDocument().getSizePaper().getVetical())
                + "x" + String.valueOf(tasks.get(position).getDocument().getSizePaper().getHorizontal()) );
        holder.tvTypePack.setText(String.valueOf(tasks.get(position).getDocument().getTypePack()));
//        holder.temp1.setText(tasks.get(position).getTeam().getTeam().get(0).getFullName());
//        holder.temp2.setText(tasks.get(position).getDocument().getNameDocument());
//        holder.temp3.setText(tasks.get(position).getDeadline().toString());
        holder.btnDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AssignActivity.class);
                intent.putExtra("object", tasks.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    @Override
    public Filter getFilter() {
        if(taskFilter == null){
            taskFilter = new TaskFilter(this,filterList);
        }
        return taskFilter;
    }
}
