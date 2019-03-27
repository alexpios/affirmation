package by.kuchinsky.affirmation;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import by.kuchinsky.affirmation.Affirmation.Dostatok;
import by.kuchinsky.affirmation.Affirmation.Udacha;
import by.kuchinsky.affirmation.Affirmation.Uspeh;
import by.kuchinsky.affirmation.Affirmation.newUdacha;

public class FragmentAffirmation extends Fragment {
View view;
    public FragmentAffirmation(){}
    ImageView img_dostatok, img_udach, img_uspeh, udacha;
    TextView text_dostatok, text_udacha, text_uspeh,tudacha;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.affirmation, container, false);


        img_dostatok=(ImageView)view.findViewById(R.id.img_dostatok);
        text_dostatok=(TextView)view.findViewById(R.id.text_dostatok);


        img_dostatok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dostatok = new Intent(getActivity(), Dostatok.class);
                startActivity(dostatok);
            }
        });

        text_dostatok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dostatok = new Intent(getActivity(), Dostatok.class);
                startActivity(dostatok);
            }
        });
    
        img_udach=(ImageView)view.findViewById(R.id.img_udacha);
        text_udacha=(TextView)view.findViewById(R.id.text_udacha);

        img_udach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent procvetanie = new Intent(getActivity(), Udacha.class);
            startActivity(procvetanie);

            }
        });

        text_udacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent procvetanie = new Intent(getActivity(), Udacha.class);
                startActivity(procvetanie);
            }
        });

        img_uspeh=(ImageView)view.findViewById(R.id.img_uspeh);
        text_uspeh=(TextView)view.findViewById(R.id.text_uspeh);

        img_uspeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent uspeh = new Intent(getActivity(), Uspeh.class);
            startActivity(uspeh);
            }
        });

        text_uspeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uspeh = new Intent(getActivity(), Uspeh.class);
                startActivity(uspeh);
            }});
        udacha=(ImageView)view.findViewById(R.id.udacha);
        tudacha=(TextView)view.findViewById(R.id.tUdacha);

        udacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nU = new Intent(getActivity(), newUdacha.class);
                startActivity(nU);
            }});


        tudacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nn = new Intent(getActivity(), newUdacha.class);
                startActivity(nn);
            }
        });






        return view;
    }
}
