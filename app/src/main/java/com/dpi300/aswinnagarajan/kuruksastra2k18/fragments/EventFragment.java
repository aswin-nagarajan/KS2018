package com.dpi300.aswinnagarajan.kuruksastra2k18.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dpi300.aswinnagarajan.kuruksastra2k18.R;
import com.dpi300.aswinnagarajan.kuruksastra2k18.adapters.EventsAdapter;
import com.dpi300.aswinnagarajan.kuruksastra2k18.classes.Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EventFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static RecyclerView recyclerView;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private static Context ctx;

    private OnFragmentInteractionListener mListener;

    public EventFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ELitsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EventFragment newInstance(String param1, String param2) {
        EventFragment fragment = new EventFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_elits, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.event_recycler);
        ctx = getContext();
        recyclerView.setAdapter(new EventsAdapter(getContext(),getEventsList("300dpi",getAllEvents())));
        return view;
    }

    public static List<Event> getEventsList(String cat, Map<String, List<Event>> map){
        List<Event> list = map.get(cat);

        return list;

    }

    public static Map<String, List<Event>> getAllEvents(){
        Map<String, List<Event>> map = new HashMap<>();
        List<Event> design = new ArrayList<>();
        List<Event> elits = new ArrayList<>();
        List<Event> hlits = new ArrayList<>();
        List<Event> tlits = new ArrayList<>();
        design.add(new Event("Design",2));
        elits.add(new Event("Design",2));
        hlits.add(new Event("Design",2));
        tlits.add(new Event("Design",2));
        map.put("300dpi",design);
        map.put("Tamizh Sangam",tlits);
        map.put("Hindi Lits",hlits);
        map.put("English Literary Society",elits);

        return map;
    }

    public static void change(String cat){
        recyclerView.setAdapter(new EventsAdapter(ctx,getEventsList(cat,getAllEvents())));
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
