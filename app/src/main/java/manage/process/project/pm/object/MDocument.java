package manage.process.project.pm.object;

import java.io.Serializable;

/**
 * Created by Tuan on 08/10/2017.
 */

public class MDocument implements Serializable {
    private String nameDocument;
    private long numberOfDocument;//So luong
    private long numberOfPage;//So trang
    private long numberOfSubDocument;//So phu ban
    private long numberColorOut;//So luong ma   u in bia
    private long numberColorIn;//So luong mau in ruot
    private long numberColorSubDocument;//So mau in phu ban
    private String paperOut;//Giay in bia
    private String paperIn;//Giay in ruot
    private String paperSub;//Giay in phu ban
    private SizePaper sizePaper;//Kho in
    private String typePack;//Kieu dong

    public MDocument() {
    }

    public MDocument(String nameDocument, long numberOfDocument, long numberOfPage, long numberOfSubDocument, long numberColorOut, long numberColorIn, long numberColorSubDocument, String paperOut, String paperIn, String paperSub, SizePaper sizePaper, String typePack) {
        this.nameDocument = nameDocument;
        this.numberOfDocument = numberOfDocument;
        this.numberOfPage = numberOfPage;
        this.numberOfSubDocument = numberOfSubDocument;
        this.numberColorOut = numberColorOut;
        this.numberColorIn = numberColorIn;
        this.numberColorSubDocument = numberColorSubDocument;
        this.paperOut = paperOut;
        this.paperIn = paperIn;
        this.paperSub = paperSub;
        this.sizePaper = sizePaper;
        this.typePack = typePack;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public long getNumberOfDocument() {
        return numberOfDocument;
    }

    public void setNumberOfDocument(long numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
    }

    public long getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(long numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public long getNumberOfSubDocument() {
        return numberOfSubDocument;
    }

    public void setNumberOfSubDocument(long numberOfSubDocument) {
        this.numberOfSubDocument = numberOfSubDocument;
    }

    public long getNumberColorOut() {
        return numberColorOut;
    }

    public void setNumberColorOut(long numberColorOut) {
        this.numberColorOut = numberColorOut;
    }

    public long getNumberColorIn() {
        return numberColorIn;
    }

    public void setNumberColorIn(long numberColorIn) {
        this.numberColorIn = numberColorIn;
    }

    public long getNumberColorSubDocument() {
        return numberColorSubDocument;
    }

    public void setNumberColorSubDocument(long numberColorSubDocument) {
        this.numberColorSubDocument = numberColorSubDocument;
    }

    public String getPaperOut() {
        return paperOut;
    }

    public void setPaperOut(String paperOut) {
        this.paperOut = paperOut;
    }

    public String getPaperIn() {
        return paperIn;
    }

    public void setPaperIn(String paperIn) {
        this.paperIn = paperIn;
    }

    public String getPaperSub() {
        return paperSub;
    }

    public void setPaperSub(String paperSub) {
        this.paperSub = paperSub;
    }

    public SizePaper getSizePaper() {
        return sizePaper;
    }

    public void setSizePaper(SizePaper sizePaper) {
        this.sizePaper = sizePaper;
    }

    public String getTypePack() {
        return typePack;
    }

    public void setTypePack(String typePack) {
        this.typePack = typePack;
    }
}
