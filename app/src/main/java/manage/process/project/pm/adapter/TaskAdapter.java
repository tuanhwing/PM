package manage.process.project.pm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.Toast;

import java.util.ArrayList;

import manage.process.project.pm.R;
import manage.process.project.pm.filter.TaskFilter;
import manage.process.project.pm.holder.TaskHolder;
import manage.process.project.pm.object.OTask;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskAdapter extends  RecyclerView.Adapter<TaskHolder> implements Filterable{
    private ArrayList<OTask> tasks, filterList;
    private TaskFilter taskFilter;
    private Context context;

    public TaskAdapter(ArrayList<OTask> tasks,Context context) {
        this.tasks = tasks;
        this.filterList = tasks;
        this.context = context;
    }

    public void setTasks(ArrayList<OTask> tasks){
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
        holder.tvTimeRequire.setText(tasks.get(position).getTimeRequire());
        holder.tvName.setText(tasks.get(position).getName());
        //[START] add content members
        boolean temp = false;
//        for (Member member: tasks.get(position).getTeam().getMembers()
//                ) {
//            if(!temp){
//                holder.tvMembers.setText(member.getFullName());
//                temp = true;
//            } else holder.tvMembers.append("\n" + member.getFullName());
//
//        }
        //[END] add content members
        holder.tvCount.setText(String.valueOf(tasks.get(position).getCount()));
        holder.tvCopyCount.setText(String.valueOf(tasks.get(position).getCopyCount()));
        holder.tvCoverColor.setText(String.valueOf(tasks.get(position).getCoverColor()));
        holder.tvPaperColor.setText(String.valueOf(tasks.get(position).getPaperColor()));
        holder.tvCopyColor.setText(String.valueOf(tasks.get(position).getCopyColor()));
        holder.tvCoverPaper.setText(String.valueOf(tasks.get(position).getCoverPaper()));
        holder.tvPaperType.setText(String.valueOf(tasks.get(position).getPaperType()));
        holder.tvCopyPaperType.setText(String.valueOf(tasks.get(position).getCopyPaperType()));
//        holder.tvTypePaperSub.setText(String.valueOf(tasks.get(position).getDocument().getPaperSub()));
//        holder.tvSize.setText(String.valueOf(tasks.get(position).getDocument().getSizePaper().getVetical())
//                + "x" + String.valueOf(tasks.get(position).getDocument().getSizePaper().getHorizontal()) );
        holder.tvSize.setText(tasks.get(position).getSize());
        holder.tvBookbindingType.setText(String.valueOf(tasks.get(position).getBookbindingType()));
        holder.tvOtherRequire.setText(tasks.get(position).getOtherRequire());
//        holder.temp1.setText(tasks.get(position).getTeam().getTeam().get(0).getFullName());
//        holder.temp2.setText(tasks.get(position).getDocument().getNameDocument());
//        holder.temp3.setText(tasks.get(position).getDeadline().toString());
        holder.btnAssign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, AssignActivity.class);
//                intent.putExtra("object", tasks.get(position));
//                context.startActivity(intent);
                Toast.makeText(context,"click assign",Toast.LENGTH_SHORT).show();
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
