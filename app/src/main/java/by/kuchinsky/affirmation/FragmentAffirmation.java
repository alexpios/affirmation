package by.kuchinsky.affirmation;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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
import by.kuchinsky.affirmation.Affirmation.Everyday;
import by.kuchinsky.affirmation.Affirmation.Girls;
import by.kuchinsky.affirmation.Affirmation.Guys;
import by.kuchinsky.affirmation.Affirmation.Love;
import by.kuchinsky.affirmation.Affirmation.Pohudenie;
import by.kuchinsky.affirmation.Affirmation.Udacha;
import by.kuchinsky.affirmation.Affirmation.Uspeh;
import by.kuchinsky.affirmation.Affirmation.Zdorovie;
import by.kuchinsky.affirmation.Affirmation.newUdacha;

public class FragmentAffirmation extends Fragment {
View view;
    public FragmentAffirmation(){}
    ImageView img_dostatok, img_udach, img_uspeh, udacha, img_zdorovie, img_love, img_pohudenie, img_everyday, img_girls, img_guys;
    TextView text_dostatok, text_udacha, text_uspeh,tudacha, text_zdorovie, text_love, text_pohudenie, text_everyday, text_girls, text_guys;

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

        img_zdorovie=(ImageView)view.findViewById(R.id.img_zdorovie);
        text_zdorovie=(TextView)view.findViewById(R.id.text_zdorovie);

        img_zdorovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zdorovie = new Intent(getActivity(), Zdorovie.class);
                startActivity(zdorovie);
            }
        });

        text_zdorovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zdorovie = new Intent(getActivity(), Zdorovie.class);
                startActivity(zdorovie);
            }
        });

        img_love=(ImageView)view.findViewById(R.id.img_love);
        text_love=(TextView)view.findViewById(R.id.text_love);
        img_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent Love = new Intent(getActivity(), by.kuchinsky.affirmation.Affirmation.Love.class);
            startActivity(Love);
            }
        });

        text_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Love = new Intent(getActivity(), by.kuchinsky.affirmation.Affirmation.Love.class);
                startActivity(Love);
            }
        });


        img_pohudenie=(ImageView)view.findViewById(R.id.img_pohudenie);
        text_pohudenie=(TextView)view.findViewById(R.id.text_pohudenie);

        img_pohudenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pohudenie = new Intent(getActivity(), Pohudenie.class);
                startActivity(pohudenie);
            }
        });

        text_pohudenie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pohudenie = new Intent(getActivity(), Pohudenie.class);
                startActivity(pohudenie);
            }
        });

        img_everyday=(ImageView)view.findViewById(R.id.img_everyday);
        text_everyday=(TextView)view.findViewById(R.id.text_everyday);

        img_everyday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent everyday = new Intent(getActivity(), Everyday.class);
                startActivity(everyday);
            }
        });
        text_everyday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent everyday = new Intent(getActivity(), Everyday.class);
                startActivity(everyday);
            }
        });

        img_girls=(ImageView)view.findViewById(R.id.img_girls);
        text_girls=(TextView)view.findViewById(R.id.text_girls);

        img_girls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent girls = new Intent(getActivity(), Girls.class);
            startActivity(girls);
            }
        });

        text_girls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent girls = new Intent(getActivity(), Girls.class);
                startActivity(girls);
            }
        });

        img_guys=(ImageView)view.findViewById(R.id.img_guys);
        text_guys=(TextView)view.findViewById(R.id.text_guys);

        img_guys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent guys = new Intent(getActivity(), Guys.class);
            startActivity(guys);
            }
        });
        text_guys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guys = new Intent(getActivity(), Guys.class);
                startActivity(guys);
            }
        });

      return view;
    }
}
