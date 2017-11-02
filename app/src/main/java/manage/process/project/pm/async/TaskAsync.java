package manage.process.project.pm.async;

import android.os.AsyncTask;
import android.os.SystemClock;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import manage.process.project.pm.callback.TaskResult;
import manage.process.project.pm.object.MDocument;
import manage.process.project.pm.object.MTask;
import manage.process.project.pm.object.Member;
import manage.process.project.pm.object.SizePaper;
import manage.process.project.pm.object.Team;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskAsync extends AsyncTask<Void, Integer, ArrayList<MTask>> {

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
    protected ArrayList<MTask> doInBackground(Void... params) {
        loadTasksFromServer();

        ArrayList<MTask> tasks = new ArrayList<>();
        for(int i=0;i<5;i++) {
            //nghỉ 1000 milisecond thì tiến hành update UI
            List<Member> members = new ArrayList<Member>();
            members.add(new Member(String.valueOf(i),"url",1));
            members.add(new Member("N V B","url",2));
            Team team1 = new Team(members);
            tasks.add(new MTask(
                    team1,
                    Calendar.getInstance().getTime(),
                    new MDocument("LOL1",123,4532,100450,1523400,543,13200,"LOL2","LOL3","LOL4",new SizePaper(12,30),"AAAA")));
            SystemClock.sleep(1000);
        }
        return tasks;
    }

    protected void onProgressUpdate(Integer... values) {
        // Executes whenever publishProgress is called from doInBackground
        // Used to update the progress indicator
//        progressBar.setProgress(values[0]);
    }

    protected void onPostExecute(ArrayList<MTask> tasks) {
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
//        MakeRequest.makingRequest(Utils.IP_SERVER + "api/task", Request.Method.GET, null, new RequestCallback() {
//
//            @Override
//            public void onGetSuccess(JSONArray result) {
//                Log.d("LOL_AAAA",String.valueOf(result));
//                for (int i =0; i<result.length();i++){
//                    try {
//                        JSONObject jresponse = result.getJSONObject(i);
//                        JSONObject infoDocument = jresponse.getJSONObject("info_document");
//                        String nameDocument = infoDocument.getString("name");
//                        Log.d("getJSON_AAAA",nameDocument);
//                    } catch (JSONException e) {
//                        e.printStackTrace();
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
    }
}
