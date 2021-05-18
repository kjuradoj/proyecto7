package com.example.navegaciondrawer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OperacionesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OperacionesFragment extends Fragment {



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public OperacionesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OperacionesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OperacionesFragment newInstance(String param1, String param2) {
        OperacionesFragment fragment = new OperacionesFragment();
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

    private EditText txtnum1, txtnum2;
    private Button btnSumar,btnRestar, btnMultiplicar, btnDividir;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_operaciones, container, false);
        View view = inflater.inflate(R.layout.fragment_operaciones,container, false);


        txtnum1 = view.findViewById(R.id.nro1);
        txtnum2 = view.findViewById(R.id.nro2);
        btnSumar = view.findViewById(R.id.btnsuma);
        btnRestar = view.findViewById(R.id.btnresta);
        btnMultiplicar = view.findViewById(R.id.btnmultiplicar);
        btnDividir = view.findViewById(R.id.btndividir);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double  suma= numero1+numero2;
                Toast.makeText(getActivity(),"La suma es: " + suma,Toast.LENGTH_SHORT).show();

            }
        });
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double  resta= numero1-numero2;
                Toast.makeText(getActivity(),"La resta es: " + resta,Toast.LENGTH_SHORT).show();

            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double  multiplicacion= numero1*numero2;
                Toast.makeText(getActivity(),"La multiplicacion es: " + multiplicacion,Toast.LENGTH_SHORT).show();

            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                if(numero2 == 0){
                    Toast.makeText(getActivity(),"Error division entre 0: " ,Toast.LENGTH_SHORT).show();
                }
                else{
                    double  division= numero1/numero2;
                    Toast.makeText(getActivity(),"La Division es: " + division,Toast.LENGTH_SHORT).show();
                }




            }
        });return view;


    }


}