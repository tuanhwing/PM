package manage.process.project.pm.object;

import java.io.Serializable;

/**
 * Created by Tuan on 08/10/2017.
 */

public class SizePaper implements Serializable {
    private int vetical;
    private int horizontal;

    public SizePaper() {
    }

    public SizePaper(int vetical, int horizontal) {
        this.vetical = vetical;
        this.horizontal = horizontal;
    }

    public int getVetical() {
        return vetical;
    }

    public void setVetical(int vetical) {
        this.vetical = vetical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void setHorizontal(int horizontal) {
        this.horizontal = horizontal;
    }
}
