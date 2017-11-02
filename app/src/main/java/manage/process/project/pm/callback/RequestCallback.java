package manage.process.project.pm.callback;

import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Tuan on 17/10/2017.
 */

public interface RequestCallback {
    void onGetSuccess(JSONArray result);
    void onPostSuccess(JSONObject result);
    void onPutSuccess(JSONObject result);
    void onDeleteSuccess(JSONObject result);
    void onError(VolleyError error);
}
