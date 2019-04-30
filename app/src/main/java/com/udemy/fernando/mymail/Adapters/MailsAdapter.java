package com.udemy.fernando.mymail.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.udemy.fernando.mymail.Model.Email;
import com.udemy.fernando.mymail.R;

import java.util.List;

public class MailsAdapter extends BaseAdapter {

    private List<Email> emailList;
    private Context context;
    private int layout;

    public MailsAdapter(List<Email> emailList, Context context, int layout) {
        this.emailList = emailList;
        this.context = context;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return emailList.size();
    }

    @Override
    public Email getItem(int position) {
        return emailList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.senderDemo = convertView.findViewById(R.id.textViewSenderDemo);
            holder.messageDemo = convertView.findViewById(R.id.textViewMessageDemo);
            holder.subjectDemo = convertView.findViewById(R.id.textViewSubjectDemo);
            holder.date = convertView.findViewById(R.id.textViewDateDemo);
            holder.color = convertView.findViewById(R.id.imageViewColor);
            convertView.setTag(holder);
        }else
            holder = (ViewHolder) convertView.getTag();

        Email e = emailList.get(position);

        holder.color.setBackgroundColor(context.getResources().getColor(e.getColor()));
        holder.senderDemo.setText(e.getSender());
        holder.subjectDemo.setText(e.getSubject());
        holder.messageDemo.setText(e.getMessage().substring(0,77)+"...");
        holder.date.setText(e.getDate());

        return convertView;
    }

    private class ViewHolder{
        TextView senderDemo;
        TextView subjectDemo;
        TextView messageDemo;
        TextView date;
        ImageView color;
    }

}
