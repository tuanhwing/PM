package manage.process.project.pm.model;

import manage.process.project.pm.async.TaskAsync;
import manage.process.project.pm.callback.TaskResult;

/**
 * Created by Tuan on 01/11/2017.
 */

public class TaskHelper {
    private TaskResult result;

    public void setOnMainResult(TaskResult result){
        this.result = result;
    }

    public void loadTasks(){
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
        TaskAsync myAsyncTask = new TaskAsync(result);
        myAsyncTask.execute();
//        result.loadTasksSuccess(tasks);
    }
}
