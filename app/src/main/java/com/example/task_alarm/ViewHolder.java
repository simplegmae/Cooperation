package com.example.task_alarm;

import static com.example.task_alarm.R.id.listcheckbox;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textView;
    public CheckBox checkbox;

    public ViewHolder(Context context, View itemView){
        super(itemView);

        textView= itemView.findViewById(R.id.listtext1);
        textView=itemView.findViewById(R.id.listtext2);
        checkbox=itemView.findViewById(R.id.listcheckbox);
        };
    }
