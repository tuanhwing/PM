package manage.process.project.pm.async;

import android.os.AsyncTask;
import android.os.SystemClock;
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

public class TaskAsync extends AsyncTask<Void, Integer, ArrayList<OTask>> {

    private TaskResult taskResult;

    public TaskAsync(){

    }

    public TaskAsync(TaskResult taskResult){
        this.taskResult = taskResult;
    }

    protected void onPreExecute() {
        // Runs on the UI thread before doInBackground
        // Good for toggling visibility of a progress indicator
        taskResult.startLoadTasks();
    }

    @Override
    protected ArrayList<OTask> doInBackground(Void... params) {
        loadTasksFromServer();

        ArrayList<OTask> tasks = new ArrayList<>();
//        MakeRequest.makingRequest(Utils.IP_SERVER + "api/task", Request.Method.GET, null, new RequestCallback() {
//
//            @Override
//            public void onGetSuccess(JSONArray result) {
//                Log.d("LOL_AAAA",String.valueOf(result));
//                Gson gson = new Gson();
//                for (int i =0; i<result.length();i++){
//                    try {
//                        JSONObject jresponse = result.getJSONObject(i);
//                        OTask temp = gson.fromJson(jresponse.toString(),OTask.class);
//                        Log.d("LOL_AAAA",jresponse.toString());
//                        Log.d("LOL_AAAA",temp.getName());
//                    } catch (JSONException e) {
//                        Log.d("LOL_AAAA",String.valueOf(e.getMessage()));
//                    }
//                }
//            }
//
//            @Override
//            public void onPostSuccess(JSONObject result) {
//                Log.d("LOL_AAAA",String.valueOf(result));
//            }
//
//            @Override
//            public void onPutSuccess(JSONObject result) {
//                Log.d("LOL_AAAA",String.valueOf(result));
//            }
//
//            @Override
//            public void onDeleteSuccess(JSONObject result) {
//                Log.d("LOL_AAAA",String.valueOf(result));
//            }
//
//            @Override
//            public void onError(VolleyError error) {
//                Log.d("LOL_AAAA",String.valueOf(error.getMessage()));
//            }
//        });
        for(int i=0;i<5;i++) {
            //nghỉ 1000 milisecond thì tiến hành update UI
            tasks.add(new OTask(i,"LOL1",123,"123","1234","12345","asd","qwe","zxc","rty","dfg","cvb","yui","dfg","ert","wer","ewras"));
            SystemClock.sleep(1000);
        }
        return tasks;
    }

    protected void onProgressUpdate(Integer... values) {
        // Executes whenever publishProgress is called from doInBackground
        // Used to update the progress indicator
//        progressBar.setProgress(values[0]);
    }

    protected void onPostExecute(ArrayList<OTask> tasks) {
        // This method is executed in the UIThread
        // with access to the result of the long running task
//        imageView.setImageBitmap(result);
        // Hide the progress bar
        taskResult.loadTasksSuccess(tasks);
    }

    /**
     * Load all tasks from server
     */
    private void loadTasksFromServer(){
        MakeRequest.makingRequest(Utils.IP_SERVER + "api/task", Request.Method.GET, null, new RequestCallback() {

            @Override
            public void onGetSuccess(JSONArray result) {
                Log.d("LOL_AAAA",String.valueOf(result));
                Gson gson = new Gson();
                for (int i =0; i<result.length();i++){
                    try {
                        JSONObject jresponse = result.getJSONObject(i);
                        OTask temp = gson.fromJson(jresponse.toString(),OTask.class);
                        Log.d("LOL_AAAA",jresponse.toString());
                        Log.d("LOL_AAAA",temp.getName());
                    } catch (JSONException e) {
                       Log.d("LOL_AAAA",String.valueOf(e.getMessage()));
                    }
                }
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
                Log.d("LOL_AAAA",String.valueOf(error.getMessage()));
            }
        });
    }
}
