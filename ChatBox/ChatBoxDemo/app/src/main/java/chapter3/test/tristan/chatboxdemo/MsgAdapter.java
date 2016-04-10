package chapter3.test.tristan.chatboxdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Tristan on 2016/4/10.
 */
public class MsgAdapter extends ArrayAdapter<Msg> {
    private int resourceId = -1;
    public MsgAdapter(Context context, int textViewResourceId, List<Msg> objects){

        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Msg msg = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
            viewHolder  = new ViewHolder();
            viewHolder.leftLayout = (LinearLayout)view.findViewById(R.id.left_layout);
            viewHolder.rihtLayout = (LinearLayout)view.findViewById(R.id.right_layout);
            viewHolder.rightMsg = (TextView)view.findViewById(R.id.right_message);
            viewHolder.leftMsg = (TextView)view.findViewById(R.id.left_message);
            view.setTag(viewHolder);

        }else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        if (msg.getmType() == Msg.TYPE_RECEIVED){
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rihtLayout.setVisibility(View.GONE);
            viewHolder.leftMsg.setText(msg.getmContent());

        }else if(msg.getmType() == Msg.TYPE_SENT){
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rihtLayout.setVisibility(View.VISIBLE);
            viewHolder.rightMsg.setText(msg.getmContent());

        }

        return view;
    }

    class ViewHolder{
        LinearLayout leftLayout;
        LinearLayout rihtLayout;
        TextView leftMsg;
        TextView rightMsg;

    }
}
