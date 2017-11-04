package manage.process.project.pm.model;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import manage.process.project.pm.callback.RequestCallback;
import manage.process.project.pm.callback.TaskResult;
import manage.process.project.pm.object.OTask;
import manage.process.project.pm.request.MakeRequest;
import manage.process.project.pm.util.Utils;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskHelper {
    private TaskResult taskResult;

    public void setOnMainResult(TaskResult taskResult){
        this.taskResult = taskResult;
    }

    public void loadTasks(){
        MakeRequest.makingRequest(Utils.IP_SERVER + "api/task", Request.Method.GET, null, new RequestCallback() {

            @Override
            public void onGetSuccess(JSONArray result) {
                Log.d("LOL_AAAA",String.valueOf(result));
                Gson gson = new Gson();
                ArrayList<OTask> tasks = new ArrayList<>();
                for (int i =0; i<result.length();i++){
                    try {
                        JSONObject jresponse = result.getJSONObject(i);
                        OTask temp = gson.fromJson(jresponse.toString(),OTask.class);
                        tasks.add(temp);
                        Log.d("LOL_AAAA",jresponse.toString());
                        Log.d("LOL_AAAA",temp.getName());
                    } catch (JSONException e) {
                        Log.d("LOL_AAAA",String.valueOf(e.getMessage()));
                    }
                }
                taskResult.loadTasksSuccess(tasks);
            }

            @Override
            public void onPostSuccess(JSONObject result) {
                Log.d("LOL_AAAA",String.valueOf(result));
            }

            @Override
            public void onPutSuccess(JSONObject result) {
                Log.d("LOL_AAAA",String.valueOf(result));
            }

            @Override
            public void onDeleteSuccess(JSONObject result) {
                Log.d("LOL_AAAA",String.valueOf(result));
            }

            @Override
            public void onError(VolleyError error) {
                taskResult.loadTasksError();
                Log.d("LOL_AAAA",String.valueOf(error.getMessage()));
            }
        });


//        List<Member> members = new ArrayList<Member>();
//        members.add(new Member("N V A","url",1));
//        members.add(new Member("N V B","url",2));
//        members.add(new Member("N V C","url",3));
//        Team team1 = new Team(members);
//        List<MTask> tasks = new ArrayList<>();
////        tasks.add(new Temp("AAAAA","ASDASDASD"));
////        tasks.add(new Temp("AAAAA12","ASDASDASqweqweD"));
//        tasks.add(new MTask(
//                team1,
//                Calendar.getInstance().getTime(),
//                new MDocument("LOL1",100,1000,1000,100,100,100,"LOL2","LOL3","LOL4",new SizePaper(12,30),"AAAA")));
//        tasks.add(new MTask(
//                team1,
//                Calendar.getInstance().getTime(),
//                new MDocument("LOL5",100,1000,1000,100,100,100,"LOL123","LOL323","LOL421",new SizePaper(42,10),"AAADSASA")));
//        TaskAsync myAsyncTask = new TaskAsync(result);
//        myAsyncTask.execute();
//        result.loadTasksSuccess(tasks);
    }
}
