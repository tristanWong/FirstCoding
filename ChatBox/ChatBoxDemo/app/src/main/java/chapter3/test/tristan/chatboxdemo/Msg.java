package chapter3.test.tristan.chatboxdemo;

/**
 * Created by Tristan on 2016/4/10.
 */
public class Msg {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT=1;

    private String mContent =null;
    private int mType = -1;

    public Msg(String content, int type){
        mContent = content;
        mType = type;

    }
    public String getmContent(){
        return mContent;
    }
    public int getmType(){
        return mType;
    }


}
