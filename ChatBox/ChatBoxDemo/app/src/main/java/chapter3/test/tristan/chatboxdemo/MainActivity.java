package chapter3.test.tristan.chatboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView msgListView = null;
    private EditText inputText = null;
    private Button send = null;
    private MsgAdapter adapter;
    private List<Msg> msgList = new ArrayList<Msg>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);
        initMsgs();
        adapter = new MsgAdapter(MainActivity.this,R.layout.message_item,msgList);
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        msgListView = (ListView) findViewById(R.id.msg_list_view);
        msgListView.setAdapter(adapter);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String conent = inputText.getText().toString();
                if(!"".equals(conent)){
                    Msg msg  = new Msg(conent,Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapter.notifyDataSetChanged();
                    msgListView.setSelection(msgList.size());
                    inputText.setText("");


                }
            }
        });


    }
    private void initMsgs(){
        Msg msg1 = new Msg("Hello Guy",Msg.TYPE_RECEIVED);
        msgList.add(msg1);
        Msg msg2 = new Msg("Hello,Who is that ",Msg.TYPE_SENT);
        msgList.add(msg2);

        Msg msg3 = new Msg("This is Tom, Nice Talking to you ",Msg.TYPE_RECEIVED);
        msgList.add(msg3);

    }
}
