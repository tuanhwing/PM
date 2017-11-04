package manage.process.project.pm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import manage.process.project.pm.adapter.TaskAdapter;
import manage.process.project.pm.model.TaskHelper;
import manage.process.project.pm.object.OTask;
import manage.process.project.pm.presenter.TaskPresenter;
import manage.process.project.pm.socket.Singleton;
import manage.process.project.pm.view.TaskView;

import static manage.process.project.pm.R.id.recyclerView;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskFragment extends Fragment implements TaskView {

    private static final boolean GRID_LAYOUT = false;
    private static final int ITEM_COUNT = 2;

    //MVP
    private TaskPresenter taskPresenter;
    private TaskHelper taskHelper;

    @BindView(recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.searchView)
    SearchView searchView;

    @BindView(R.id.progress_bar)
    ProgressBar progressBar;

    TaskAdapter taskAdapter;

    List<OTask> items = new ArrayList<>();

    Singleton singleton;

    public static TaskFragment newInstance() {
        return new TaskFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("stateAAA_fragment","create");
        return inflater.inflate(R.layout.fragment_task, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        Log.d("stateAAA_fragment","viewCreated");

        if (savedInstanceState != null) {
            Log.d("state_aaaa","!null");
        } else {
            Log.d("state_aaaa","null");
        }
        if (taskPresenter == null) {
            if (taskHelper == null) {
                taskHelper = new TaskHelper();
            }
            taskPresenter = new TaskPresenter(this, taskHelper);
        }

        //temp
        singleton = Singleton.getInstance();
//        singleton.getSocket().on("new task", onNewTask);
//
//        for (int i = 0; i < ITEM_COUNT; ++i) {
//            items.add(new Temp("temp1","temp2"));
//        }


        //setup materialviewpager

        if (GRID_LAYOUT) {
            mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        } else {
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        //Use this now
//        mRecyclerView.addItemDecoration(new MaterialViewPagerHeaderDecorator());
//        taskAdapter = new TaskAdapter(items);
//        mRecyclerView.setAdapter(taskAdapter);


        taskPresenter.loadTasks();

        searchView.bringToFront();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                taskAdapter.getFilter().filter(newText);
                return false;
            }
        });
    }

    @Override
    public void visibleProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void inVisibleProgressBar() {
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showTasks(boolean error, ArrayList<OTask> tasks) {
        if(!error){
            items = tasks;
            taskAdapter = new TaskAdapter(tasks,getActivity());
            mRecyclerView.setAdapter(taskAdapter);
        } else Toast.makeText(getContext(),"Error connect server",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void addTask(OTask task) {
        items.add(task);
        taskAdapter.notifyDataSetChanged();
    }
}
