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

import by.kuchinsky.affirmation.Affirmation.Dostatok;

public class FragmentAffirmation extends Fragment {
View view;
    public FragmentAffirmation(){}
    ImageView img_dostatok;
    TextView text_dostatok;

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




        return view;
    }
}
