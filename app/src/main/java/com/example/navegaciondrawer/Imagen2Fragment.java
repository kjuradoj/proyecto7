package com.example.navegaciondrawer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.PersistableBundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Imagen2Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Imagen2Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Imagen2Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Imagen2Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Imagen2Fragment newInstance(String param1, String param2) {
        Imagen2Fragment fragment = new Imagen2Fragment();
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

    private View view;
    private ImageButton facebook,instagram,youtube,whatsapp,google;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_imagen2, container, false);
        View view = inflater.inflate(R.layout.fragment_imagen2, container, false);

        facebook = view.findViewById(R.id.btnFacebook);
        instagram = view.findViewById(R.id.btnInstagram);
        youtube = view.findViewById(R.id.btnYoutube);
        whatsapp = view.findViewById(R.id.btnWatsapp);
        google = view.findViewById(R.id.btnGoogle);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                try {

                    Intent facebook =getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                    startActivity(facebook);
                }catch (Exception e){
                    Toast.makeText(getActivity().getApplicationContext(), "No tienes instalado esta APP!!", Toast.LENGTH_SHORT).show();
                };
            }


        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Intent instagram = getActivity().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                    startActivity(instagram);
                }catch (Exception e){
                    Toast.makeText(getActivity().getApplicationContext(), "No tienes instalado esta APP!!", Toast.LENGTH_SHORT).show();
                };

            }
        });
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent youtube = getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                    startActivity(youtube);
                }catch (Exception e){
                    Toast.makeText(getActivity().getApplicationContext(), "No tienes instalado esta APP!!", Toast.LENGTH_SHORT).show();
                };
            }
        });
        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent whatsapp = getActivity().getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                    startActivity(whatsapp);
                }catch (Exception e){
                    Toast.makeText(getActivity().getApplicationContext(), "No tienes instalado esta APP!!", Toast.LENGTH_SHORT).show();
                };
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri google = Uri.parse("https://www.google.com/");
                Intent intent = new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });return view;

    }



}