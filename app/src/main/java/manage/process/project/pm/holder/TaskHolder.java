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

    public TextView tvTimeRequire;
//    public TextView tvMembers;
    public TextView tvName;
    public TextView tvCount, tvCopyCount;
//    public TextView tvNumOfDoc, tvNumOfPage,tvNumOfSub;
    public TextView tvCoverColor, tvPaperColor, tvCopyColor;
    public TextView tvCoverPaper, tvPaperType, tvCopyPaperType;
    public TextView tvSize;
    public TextView tvBookbindingType;
    public TextView tvOtherRequire;
    public Button btnAssign;
    public TaskHolder(View itemView, Context context) {
        super(itemView);
        this.context = context;
        tvTimeRequire = (TextView) itemView.findViewById(R.id.tv_time_require);
//        tvMembers = (TextView) itemView.findViewById(R.id.tv_members);
        tvName = (TextView) itemView.findViewById(R.id.tv_name_document);
        tvCount = (TextView) itemView.findViewById(R.id.tv_count);
        tvCopyCount = (TextView) itemView.findViewById(R.id.tv_copy_count);
//        tvNumOfSub = (TextView) itemView.findViewById(R.id.tv_num_of_sub);
        tvCoverColor = (TextView) itemView.findViewById(R.id.tv_cover_color);
        tvPaperColor = (TextView) itemView.findViewById(R.id.tv_paper_color);
        tvCopyColor = (TextView) itemView.findViewById(R.id.tv_copy_color);
        tvCoverPaper = (TextView) itemView.findViewById(R.id.tv_cover_paper);
        tvPaperType = (TextView) itemView.findViewById(R.id.tv_paper_type);
        tvCopyPaperType = (TextView) itemView.findViewById(R.id.tv_copy_paper_type);
        tvSize = (TextView) itemView.findViewById(R.id.tv_size);
        tvBookbindingType = (TextView) itemView.findViewById(R.id.tv_bookbinding_type);
        tvOtherRequire = (TextView) itemView.findViewById(R.id.tv_other_require);
        btnAssign = (Button) itemView.findViewById(R.id.btn_assign);
    }
}
