package com.udemy.fernando.mymail.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udemy.fernando.mymail.Model.Email;
import com.udemy.fernando.mymail.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link EmailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class EmailFragment extends Fragment {

    TextView textViewSender;
    TextView textViewSubject;
    TextView textViewMessage;
    TextView textViewDate;

    private OnFragmentInteractionListener mListener;

    public EmailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_email, container, false);
        bindComponents(view);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    private void bindComponents(View view){
        textViewSender = view.findViewById(R.id.textViewSender);
        textViewSubject = view.findViewById(R.id.textViewSubject);
        textViewDate = view.findViewById(R.id.textViewDate);
        textViewMessage = view.findViewById(R.id.textViewMessage);
    }

    public void showEmail(Email email){
        textViewMessage.setText(email.getMessage());
        textViewSubject.setText(email.getSubject());
        textViewDate.setText(email.getDate());
        textViewSender.setText(email.getSender());
    }

    public interface OnFragmentInteractionListener {

    }
}
