package com.example.navegaciondrawer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ResourceBusyException;
import android.media.SoundPool;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.Timer;
import java.util.TimerTask;
import androidx.appcompat.app.AppCompatActivity;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MusicaFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class MusicaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MusicaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MusicaFragment newInstance(String param1, String param2) {
        MusicaFragment fragment = new MusicaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public MusicaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private MediaPlayer mMP ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ////return  inflater.inflate(R.layout.fragment_musica, container, false);

        View view = inflater.inflate(R.layout.fragment_musica,container, false);


        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        //Reproducir
        mMP = MediaPlayer.create(getActivity(),R.raw.afuego);
        mMP.start();
    }

    @Override
    public void onPause() {
        super.onPause();

        if(mMP!= null){
            mMP.stop();
            mMP.release();
            mMP=null;
        }
    }

}