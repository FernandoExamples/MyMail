package com.udemy.fernando.mymail.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.udemy.fernando.mymail.Adapters.MailsAdapter;
import com.udemy.fernando.mymail.Model.Email;
import com.udemy.fernando.mymail.Model.MyUtils;
import com.udemy.fernando.mymail.R;


public class MailsListFragment extends Fragment {

    private ListView listViewMails;
    private MailsAdapter adapter;
    private Context context;
    private OnFragmentInteractionListener callback;

    public MailsListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_mails, container, false);
        bindComponents(view);
        initComponents();
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
        if (context instanceof OnFragmentInteractionListener)
            callback = (OnFragmentInteractionListener) context;
        else
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    private void bindComponents(View view) {
        listViewMails = view.findViewById(R.id.listViewMails);
        listViewMails.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                callback.onClickItemMail(position, (Email) listViewMails.getAdapter().getItem(position));
            }
        });
    }

    private void initComponents() {
        adapter = new MailsAdapter(MyUtils.getDummyEmails(), context, R.layout.item_list_mails);
        listViewMails.setAdapter(adapter);
    }

    public interface OnFragmentInteractionListener {
        void onClickItemMail(int position, Email email);
    }

}
