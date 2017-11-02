package manage.process.project.pm.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import manage.process.project.pm.R;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskHolder  extends RecyclerView.ViewHolder {
    private Context context;

    public TextView tvDeadline;
    public TextView tvMembers;
    public TextView tvNameDocument;
    public TextView tvNumOfDoc, tvNumOfPage,tvNumOfSub;
    public TextView tvColorOut, tvColorIn, tvColorSub;
    public TextView tvTypePaperOut, tvTypePaperIn, tvTypePaperSub;
    public TextView tvSize;
    public TextView tvTypePack;
    public Button btnDemo;
    public TaskHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        tvDeadline = (TextView) itemView.findViewById(R.id.tv_deadline);
        tvMembers = (TextView) itemView.findViewById(R.id.tv_members);
        tvNameDocument = (TextView) itemView.findViewById(R.id.tv_name_document);
        tvNumOfDoc = (TextView) itemView.findViewById(R.id.tv_num_of_doc);
        tvNumOfPage = (TextView) itemView.findViewById(R.id.tv_num_of_page);
        tvNumOfSub = (TextView) itemView.findViewById(R.id.tv_num_of_sub);
        tvColorOut = (TextView) itemView.findViewById(R.id.tv_color_of_out);
        tvColorIn = (TextView) itemView.findViewById(R.id.tv_color_of_in);
        tvColorSub = (TextView) itemView.findViewById(R.id.tv_color_of_sub);
        tvTypePaperOut = (TextView) itemView.findViewById(R.id.tv_type_paper_out);
        tvTypePaperIn = (TextView) itemView.findViewById(R.id.tv_type_paper_in);
        tvTypePaperSub = (TextView) itemView.findViewById(R.id.tv_type_paper_sub);
        tvSize = (TextView) itemView.findViewById(R.id.tv_size);
        tvTypePack = (TextView) itemView.findViewById(R.id.tv_type_pack);
        btnDemo = (Button) itemView.findViewById(R.id.btn_demo);
    }
}
