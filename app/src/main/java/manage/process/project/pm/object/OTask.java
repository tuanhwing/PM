package manage.process.project.pm.object;

/**
 * Created by Tuan on 02/11/2017.
 */

public class OTask {
    int id;
    String name;
    long count;
    String coverColor;
    String coverPaper;
    String size;
    String paperColor;
    String paperType;
    String bookbindingType;
    String copyCount;
    String copyColor;
    String copyPaperType;
    String otherRequire;
    String file;
    String timeRequire;
    String issue;
    String staff;

    public OTask() {
    }

    public OTask(int id, String name, long count, String coverColor,
                 String coverPaper, String size, String paperColor, String paperType,
                 String bookbindingType, String copyCount, String copyColor,
                 String copyPaperType, String otherRequire, String file,
                 String timeRequire, String issue, String staff) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.coverColor = coverColor;
        this.coverPaper = coverPaper;
        this.size = size;
        this.paperColor = paperColor;
        this.paperType = paperType;
        this.bookbindingType = bookbindingType;
        this.copyCount = copyCount;
        this.copyColor = copyColor;
        this.copyPaperType = copyPaperType;
        this.otherRequire = otherRequire;
        this.file = file;
        this.timeRequire = timeRequire;
        this.issue = issue;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getCoverPaper() {
        return coverPaper;
    }

    public void setCoverPaper(String coverPaper) {
        this.coverPaper = coverPaper;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPaperColor() {
        return paperColor;
    }

    public void setPaperColor(String paperColor) {
        this.paperColor = paperColor;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getBookbindingType() {
        return bookbindingType;
    }

    public void setBookbindingType(String bookbindingType) {
        this.bookbindingType = bookbindingType;
    }

    public String getCopyCount() {
        return copyCount;
    }

    public void setCopyCount(String copyCount) {
        this.copyCount = copyCount;
    }

    public String getCopyColor() {
        return copyColor;
    }

    public void setCopyColor(String copyColor) {
        this.copyColor = copyColor;
    }

    public String getCopyPaperType() {
        return copyPaperType;
    }

    public void setCopyPaperType(String copyPaperType) {
        this.copyPaperType = copyPaperType;
    }

    public String getOtherRequire() {
        return otherRequire;
    }

    public void setOtherRequire(String otherRequire) {
        this.otherRequire = otherRequire;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTimeRequire() {
        return timeRequire;
    }

    public void setTimeRequire(String timeRequire) {
        this.timeRequire = timeRequire;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }
}
